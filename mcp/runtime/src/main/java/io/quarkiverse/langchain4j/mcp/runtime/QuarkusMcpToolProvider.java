package io.quarkiverse.langchain4j.mcp.runtime;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

import jakarta.enterprise.inject.Instance;

import org.jboss.logging.Logger;

import dev.langchain4j.agent.tool.ToolExecutionRequest;
import dev.langchain4j.agent.tool.ToolSpecification;
import dev.langchain4j.invocation.InvocationContext;
import dev.langchain4j.mcp.McpToolProvider;
import dev.langchain4j.mcp.client.McpClient;
import dev.langchain4j.mcp.resourcesastools.DefaultMcpResourcesAsToolsPresenter;
import dev.langchain4j.service.tool.ToolExecutionResult;
import dev.langchain4j.service.tool.ToolExecutor;
import dev.langchain4j.service.tool.ToolProviderRequest;
import dev.langchain4j.service.tool.ToolProviderResult;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import io.quarkiverse.langchain4j.runtime.aiservice.QuarkusToolProviderRequest;
import io.quarkiverse.langchain4j.runtime.tool.guardrails.ToolGuardrailService;

public class QuarkusMcpToolProvider extends McpToolProvider {

    QuarkusMcpToolProvider(List<McpClient> mcpClients, Instance<Tracer> tracerInstance,
            Instance<ToolGuardrailService> toolGuardrailService,
            boolean exposeResourcesAsTools) {
        super(mcpClients, false,
                AlwaysTrueMcpClientToolSpecificationBiPredicate.INSTANCE,
                determineToolWrapper(tracerInstance, toolGuardrailService),
                exposeResourcesAsTools ? DefaultMcpResourcesAsToolsPresenter.builder().build() : null,
                null, null);
    }

    private static Function<ToolExecutor, ToolExecutor> determineToolWrapper(Instance<Tracer> tracerInstance,
            Instance<ToolGuardrailService> toolGuardrailServiceInstance) {
        Function<ToolExecutor, ToolExecutor> fn = Function.identity();
        if (tracerInstance.isResolvable()) {
            fn = fn.compose(new SpanToolExecutor(tracerInstance));
        }
        if (toolGuardrailServiceInstance.isResolvable()) {
            fn = fn.compose(new ToolGuardrailExecutor(toolGuardrailServiceInstance));
        }
        return fn;
    }

    @Override
    public ToolProviderResult provideTools(ToolProviderRequest request) {
        return provideTools(request, getMcpClientsFilter(request));
    }

    private BiPredicate<McpClient, ToolSpecification> getMcpClientsFilter(ToolProviderRequest request) {
        if (request instanceof QuarkusToolProviderRequest quarkusRequest) {
            return new McpClientKeyFilter(quarkusRequest.getMcpClientNames());
        }
        return AlwaysTrueMcpClientToolSpecificationBiPredicate.INSTANCE;
    }

    private static class McpClientKeyFilter implements BiPredicate<McpClient, ToolSpecification> {
        private final List<String> keys;

        private McpClientKeyFilter(List<String> keys) {
            this.keys = keys;
        }

        @Override
        public boolean test(McpClient mcpClient, ToolSpecification tool) {
            // keys == null means no McpToolBox annotation, so no MCP clients, whereas
            // keys.size() == 0 means all MCP clients
            return keys != null
                    && (keys.isEmpty() || keys.stream().anyMatch(name -> name.equals(mcpClient.key())));
        }
    }

    private static class AlwaysTrueMcpClientToolSpecificationBiPredicate
            implements BiPredicate<McpClient, ToolSpecification> {

        private static final AlwaysTrueMcpClientToolSpecificationBiPredicate INSTANCE = new AlwaysTrueMcpClientToolSpecificationBiPredicate();

        private AlwaysTrueMcpClientToolSpecificationBiPredicate() {
        }

        @Override
        public boolean test(McpClient mcpClient, ToolSpecification toolSpecification) {
            return true;
        }
    }

    private static class SpanToolExecutor implements Function<ToolExecutor, ToolExecutor> {
        private final Instance<Tracer> tracerInstance;

        public SpanToolExecutor(Instance<Tracer> tracerInstance) {
            this.tracerInstance = tracerInstance;
        }

        @Override
        public ToolExecutor apply(ToolExecutor toolExecutor) {
            return new ToolExecutor() {
                @Override
                public String execute(ToolExecutionRequest toolExecutionRequest, Object memoryId) {
                    Span span = tracerInstance.get().spanBuilder("langchain4j.mcp-tools." + toolExecutionRequest.name())
                            .startSpan();
                    try (Scope scope = span.makeCurrent()) {
                        return toolExecutor.execute(toolExecutionRequest, memoryId);
                    } catch (Throwable t) {
                        span.recordException(t);
                        throw t;
                    } finally {
                        span.end();
                    }
                }
            };
        }
    }

    private static class ToolGuardrailExecutor implements Function<ToolExecutor, ToolExecutor> {
        private final Instance<ToolGuardrailService> toolGuardrailService;

        private Logger log = Logger.getLogger(QuarkusMcpToolProvider.class);

        public ToolGuardrailExecutor(Instance<ToolGuardrailService> toolGuardrailServiceInstance) {
            this.toolGuardrailService = toolGuardrailServiceInstance;
        }

        @Override
        public ToolExecutor apply(ToolExecutor toolExecutor) {
            ToolGuardrailService guardrailService = toolGuardrailService.get(); // FIXME why is this called multiple times?
            return new ToolExecutor() {
                @Override
                public String execute(ToolExecutionRequest toolExecutionRequest, Object o) {
                    throw new UnsupportedOperationException();
                }

                @Override
                public ToolExecutionResult executeWithContext(ToolExecutionRequest toolExecutionRequest,
                        InvocationContext invocationContext) {
                    System.out.println("MCP GUARDRAIL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    return toolExecutor.executeWithContext(toolExecutionRequest, invocationContext);
                    //                    // Create invocation context for guardrails
                    //                    ToolInvocationContext context = new ToolInvocationContext(invocationContext);
                    //                    AiServiceMethodCreateInfo methodCreateInfo = null;
                    //                    // Execute input guardrails (if any)
                    //                    ToolExecutionRequest processedRequest = toolExecutionRequest;
                    //                    if (guardrailService.hasInputGuardrails(methodCreateInfo)) {
                    //                        try {
                    //                            processedRequest = guardrailService.executeInputGuardrails(
                    //                                    toolExecutionRequest,
                    //                                    methodCreateInfo,
                    //                                    context);
                    //
                    //                            if (log.isDebugEnabled() && processedRequest != toolExecutionRequest) {
                    //                                log.debugv("Input guardrails modified the request for tool {0}", toolExecutionRequest.name());
                    //                            }
                    //                        } catch (ToolGuardrailException e) {
                    //                            // Check if this is a fatal failure (has a cause)
                    //                            if (e.isFatal()) {
                    //                                // Fatal failure - re-throw to stop execution
                    //                                log.errorv("Input guardrail failed fatally for tool {0}: {1}",
                    //                                        toolExecutionRequest.name(), e.getMessage());
                    //                                throw e;
                    //                            }
                    //
                    //                            // Non-fatal failure - return error result to LLM
                    //                            log.warnv("Input guardrail failed for tool {0}: {1}", toolExecutionRequest.name(), e.getMessage());
                    //                            return ToolExecutionResult.builder()
                    //                                    .isError(true)
                    //                                    .resultText("Input validation failed: " + e.getMessage())
                    //                                    .build();
                    //                        }
                    //                    }
                    //
                    //                    // Execute the actual tool
                    //                    ToolExecutionResult result;
                    //                    try {
                    //                        result = toolExecutor.executeWithContext(processedRequest, invocationContext);
                    //                    } catch (Exception e) {
                    //                        // Tool execution failed - let it propagate or return error
                    //                        // No need to run output guardrails on errors
                    //                        if (log.isDebugEnabled() && processedRequest != toolExecutionRequest) {
                    //                            log.debugv("Tool {0} failed after input guardrail modifications. " +
                    //                                            "Original arguments: {1}, Modified arguments: {2}",
                    //                                    toolExecutionRequest.name(),
                    //                                    toolExecutionRequest.arguments(),
                    //                                    processedRequest.arguments());
                    //                        }
                    //                        throw e;
                    //                    }
                    //
                    //                    // Execute output guardrails (if any)
                    //                    if (guardrailService.hasOutputGuardrails(methodCreateInfo)) {
                    //                        try {
                    //                            result = guardrailService.executeOutputGuardrails(
                    //                                    result,
                    //                                    processedRequest,
                    //                                    methodCreateInfo,
                    //                                    context);
                    //
                    //                            if (log.isDebugEnabled()) {
                    //                                log.debugv("Output guardrails processed result for tool {0}", toolExecutionRequest.name());
                    //                            }
                    //                        } catch (ToolGuardrailException e) {
                    //                            // Check if this is a fatal failure (has a cause)
                    //                            if (e.isFatal()) {
                    //                                // Fatal failure - re-throw to stop execution
                    //                                log.errorv("Output guardrail failed fatally for tool {0}: {1}",
                    //                                        toolExecutionRequest.name(), e.getMessage());
                    //                                throw e;
                    //                            }
                    //
                    //                            // Non-fatal failure - return error result
                    //                            log.warnv("Output guardrail failed for tool {0}: {1}",
                    //                                    toolExecutionRequest.name(), e.getMessage());
                    //                            return ToolExecutionResult.builder()
                    //                                    .isError(true)
                    //                                    .resultText("Output validation failed: " + e.getMessage())
                    //                                    .build();
                    //                        }
                    //                    }
                    //
                    //                    return result;
                }
            };
        }
    }
}
