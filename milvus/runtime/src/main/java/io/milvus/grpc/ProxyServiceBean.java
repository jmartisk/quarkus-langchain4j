package io.milvus.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public class ProxyServiceBean extends MutinyProxyServiceGrpc.ProxyServiceImplBase implements BindableService, MutinyBean {

    private final ProxyService delegate;

    ProxyServiceBean(@GrpcService ProxyService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
            io.milvus.grpc.RegisterLinkRequest request) {
        try {
            return delegate.registerLink(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
