package io.milvus.grpc;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public class ProxyServiceClient implements ProxyService, MutinyClient<MutinyProxyServiceGrpc.MutinyProxyServiceStub> {

    private final MutinyProxyServiceGrpc.MutinyProxyServiceStub stub;

    public ProxyServiceClient(String name, io.grpc.Channel channel,
            BiFunction<String, MutinyProxyServiceGrpc.MutinyProxyServiceStub, MutinyProxyServiceGrpc.MutinyProxyServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyProxyServiceGrpc.newMutinyStub(channel));
    }

    private ProxyServiceClient(MutinyProxyServiceGrpc.MutinyProxyServiceStub stub) {
        this.stub = stub;
    }

    public ProxyServiceClient newInstanceWithStub(MutinyProxyServiceGrpc.MutinyProxyServiceStub stub) {
        return new ProxyServiceClient(stub);
    }

    @Override
    public MutinyProxyServiceGrpc.MutinyProxyServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
            io.milvus.grpc.RegisterLinkRequest request) {
        return stub.registerLink(request);
    }
}
