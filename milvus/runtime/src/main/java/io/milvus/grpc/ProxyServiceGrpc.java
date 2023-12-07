package io.milvus.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.0)", comments = "Source: milvus.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProxyServiceGrpc {

    private ProxyServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "milvus.proto.milvus.ProxyService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "RegisterLink", requestType = io.milvus.grpc.RegisterLinkRequest.class, responseType = io.milvus.grpc.RegisterLinkResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod;
        if ((getRegisterLinkMethod = ProxyServiceGrpc.getRegisterLinkMethod) == null) {
            synchronized (ProxyServiceGrpc.class) {
                if ((getRegisterLinkMethod = ProxyServiceGrpc.getRegisterLinkMethod) == null) {
                    ProxyServiceGrpc.getRegisterLinkMethod = getRegisterLinkMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterLink"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.RegisterLinkRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.RegisterLinkResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new ProxyServiceMethodDescriptorSupplier("RegisterLink")).build();
                }
            }
        }
        return getRegisterLinkMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static ProxyServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProxyServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceStub>() {

            @java.lang.Override
            public ProxyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProxyServiceStub(channel, callOptions);
            }
        };
        return ProxyServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static ProxyServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceBlockingStub>() {

            @java.lang.Override
            public ProxyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProxyServiceBlockingStub(channel, callOptions);
            }
        };
        return ProxyServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static ProxyServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<ProxyServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ProxyServiceFutureStub>() {

            @java.lang.Override
            public ProxyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new ProxyServiceFutureStub(channel, callOptions);
            }
        };
        return ProxyServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void registerLink(io.milvus.grpc.RegisterLinkRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterLinkMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service ProxyService.
     */
    public static abstract class ProxyServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return ProxyServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service ProxyService.
     */
    public static class ProxyServiceStub extends io.grpc.stub.AbstractAsyncStub<ProxyServiceStub> {

        private ProxyServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProxyServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProxyServiceStub(channel, callOptions);
        }

        /**
         */
        public void registerLink(io.milvus.grpc.RegisterLinkRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getRegisterLinkMethod(), getCallOptions()), request,
                    responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service ProxyService.
     */
    public static class ProxyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProxyServiceBlockingStub> {

        private ProxyServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProxyServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProxyServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public io.milvus.grpc.RegisterLinkResponse registerLink(io.milvus.grpc.RegisterLinkRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getRegisterLinkMethod(), getCallOptions(), request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service ProxyService.
     */
    public static class ProxyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProxyServiceFutureStub> {

        private ProxyServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected ProxyServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ProxyServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getRegisterLinkMethod(), getCallOptions()),
                    request);
        }
    }

    private static final int METHODID_REGISTER_LINK = 0;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final AsyncService serviceImpl;

        private final int methodId;

        MethodHandlers(AsyncService serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_REGISTER_LINK:
                    serviceImpl.registerLink((io.milvus.grpc.RegisterLinkRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse>) responseObserver);
                    break;
                default:
                    throw new AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new AssertionError();
            }
        }
    }

    public static io.grpc.ServerServiceDefinition bindService(AsyncService service) {
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor()).addMethod(getRegisterLinkMethod(),
                io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse>(service,
                                METHODID_REGISTER_LINK)))
                .build();
    }

    private static abstract class ProxyServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        ProxyServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return io.milvus.grpc.MilvusProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("ProxyService");
        }
    }

    private static final class ProxyServiceFileDescriptorSupplier extends ProxyServiceBaseDescriptorSupplier {

        ProxyServiceFileDescriptorSupplier() {
        }
    }

    private static final class ProxyServiceMethodDescriptorSupplier extends ProxyServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        ProxyServiceMethodDescriptorSupplier(java.lang.String methodName) {
            this.methodName = methodName;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(methodName);
        }
    }

    private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

    public static io.grpc.ServiceDescriptor getServiceDescriptor() {
        io.grpc.ServiceDescriptor result = serviceDescriptor;
        if (result == null) {
            synchronized (ProxyServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new ProxyServiceFileDescriptorSupplier()).addMethod(getRegisterLinkMethod())
                            .build();
                }
            }
        }
        return result;
    }
}
