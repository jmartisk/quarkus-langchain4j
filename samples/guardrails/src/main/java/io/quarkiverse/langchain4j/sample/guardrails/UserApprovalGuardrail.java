package io.quarkiverse.langchain4j.sample.guardrails;

import io.quarkiverse.langchain4j.guardrails.ToolInputGuardrail;
import io.quarkiverse.langchain4j.guardrails.ToolInputGuardrailRequest;
import io.quarkiverse.langchain4j.guardrails.ToolInputGuardrailResult;
import io.quarkus.logging.Log;
import io.smallrye.common.annotation.Blocking;

import java.util.Scanner;

@Blocking
public class UserApprovalGuardrail implements ToolInputGuardrail {

    @Override
    public ToolInputGuardrailResult validate(ToolInputGuardrailRequest toolRequest) {
        Log.info(String.format("⚠️ Please valid the tool usage: %s ⚠️%n", toolRequest.toolName()));
        Log.info("Please type 'ok' to confirm the use of the tool: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next()
                .equals("ok")) {
            Log.info(String.format("🔧 Using tool: %s",toolRequest.toolName()));
            return ToolInputGuardrailResult.success();
        } else {
            Log.info("⛔️ User did not validate the use of the tool ⛔️!");
            return ToolInputGuardrailResult.failure("⛔️ User did not validate the use of the tool ⛔️!");
        }

    }
}
