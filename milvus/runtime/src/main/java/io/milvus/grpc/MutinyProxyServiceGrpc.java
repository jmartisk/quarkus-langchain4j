package io.milvus.grpc;

import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.milvus.grpc.ProxyServiceGrpc.getServiceDescriptor;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public final class MutinyProxyServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyProxyServiceGrpc() {
    }

    public static MutinyProxyServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyProxyServiceStub(channel);
    }

    public static class MutinyProxyServiceStub extends io.grpc.stub.AbstractStub<MutinyProxyServiceStub>
            implements io.quarkus.grpc.MutinyStub {

        private ProxyServiceGrpc.ProxyServiceStub delegateStub;

        private MutinyProxyServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = ProxyServiceGrpc.newStub(channel);
        }

        private MutinyProxyServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = ProxyServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyProxyServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyProxyServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::registerLink);
        }
    }

    public static abstract class ProxyServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public ProxyServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(io.milvus.grpc.ProxyServiceGrpc.getRegisterLinkMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse>(
                                            this, METHODID_REGISTER_LINK, compression)))
                    .build();
        }
    }

    private static final int METHODID_REGISTER_LINK = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final ProxyServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(ProxyServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_REGISTER_LINK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.RegisterLinkRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse>) responseObserver, compression,
                            serviceImpl::registerLink);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
