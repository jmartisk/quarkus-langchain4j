package io.milvus.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.quarkus.Generated(value = "by gRPC proto compiler (version 1.59.0)", comments = "Source: milvus.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MilvusServiceGrpc {

    private MilvusServiceGrpc() {
    }

    public static final java.lang.String SERVICE_NAME = "milvus.proto.milvus.MilvusService";

    // Static method descriptors that strictly reflect the proto.
    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status> getCreateCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateCollection", requestType = io.milvus.grpc.CreateCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status> getCreateCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status> getCreateCollectionMethod;
        if ((getCreateCollectionMethod = MilvusServiceGrpc.getCreateCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateCollectionMethod = MilvusServiceGrpc.getCreateCollectionMethod) == null) {
                    MilvusServiceGrpc.getCreateCollectionMethod = getCreateCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateCollection")).build();
                }
            }
        }
        return getCreateCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status> getDropCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropCollection", requestType = io.milvus.grpc.DropCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status> getDropCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status> getDropCollectionMethod;
        if ((getDropCollectionMethod = MilvusServiceGrpc.getDropCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropCollectionMethod = MilvusServiceGrpc.getDropCollectionMethod) == null) {
                    MilvusServiceGrpc.getDropCollectionMethod = getDropCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropCollection")).build();
                }
            }
        }
        return getDropCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse> getHasCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "HasCollection", requestType = io.milvus.grpc.HasCollectionRequest.class, responseType = io.milvus.grpc.BoolResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse> getHasCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse> getHasCollectionMethod;
        if ((getHasCollectionMethod = MilvusServiceGrpc.getHasCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getHasCollectionMethod = MilvusServiceGrpc.getHasCollectionMethod) == null) {
                    MilvusServiceGrpc.getHasCollectionMethod = getHasCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.HasCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.BoolResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("HasCollection")).build();
                }
            }
        }
        return getHasCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status> getLoadCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "LoadCollection", requestType = io.milvus.grpc.LoadCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status> getLoadCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status> getLoadCollectionMethod;
        if ((getLoadCollectionMethod = MilvusServiceGrpc.getLoadCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getLoadCollectionMethod = MilvusServiceGrpc.getLoadCollectionMethod) == null) {
                    MilvusServiceGrpc.getLoadCollectionMethod = getLoadCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.LoadCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("LoadCollection")).build();
                }
            }
        }
        return getLoadCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status> getReleaseCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ReleaseCollection", requestType = io.milvus.grpc.ReleaseCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status> getReleaseCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status> getReleaseCollectionMethod;
        if ((getReleaseCollectionMethod = MilvusServiceGrpc.getReleaseCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getReleaseCollectionMethod = MilvusServiceGrpc.getReleaseCollectionMethod) == null) {
                    MilvusServiceGrpc.getReleaseCollectionMethod = getReleaseCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ReleaseCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ReleaseCollection")).build();
                }
            }
        }
        return getReleaseCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse> getDescribeCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DescribeCollection", requestType = io.milvus.grpc.DescribeCollectionRequest.class, responseType = io.milvus.grpc.DescribeCollectionResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse> getDescribeCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse> getDescribeCollectionMethod;
        if ((getDescribeCollectionMethod = MilvusServiceGrpc.getDescribeCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDescribeCollectionMethod = MilvusServiceGrpc.getDescribeCollectionMethod) == null) {
                    MilvusServiceGrpc.getDescribeCollectionMethod = getDescribeCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeCollectionResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DescribeCollection")).build();
                }
            }
        }
        return getDescribeCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse> getGetCollectionStatisticsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetCollectionStatistics", requestType = io.milvus.grpc.GetCollectionStatisticsRequest.class, responseType = io.milvus.grpc.GetCollectionStatisticsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse> getGetCollectionStatisticsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse> getGetCollectionStatisticsMethod;
        if ((getGetCollectionStatisticsMethod = MilvusServiceGrpc.getGetCollectionStatisticsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetCollectionStatisticsMethod = MilvusServiceGrpc.getGetCollectionStatisticsMethod) == null) {
                    MilvusServiceGrpc.getGetCollectionStatisticsMethod = getGetCollectionStatisticsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCollectionStatistics"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCollectionStatisticsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCollectionStatisticsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetCollectionStatistics")).build();
                }
            }
        }
        return getGetCollectionStatisticsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse> getShowCollectionsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ShowCollections", requestType = io.milvus.grpc.ShowCollectionsRequest.class, responseType = io.milvus.grpc.ShowCollectionsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse> getShowCollectionsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse> getShowCollectionsMethod;
        if ((getShowCollectionsMethod = MilvusServiceGrpc.getShowCollectionsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getShowCollectionsMethod = MilvusServiceGrpc.getShowCollectionsMethod) == null) {
                    MilvusServiceGrpc.getShowCollectionsMethod = getShowCollectionsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowCollections"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ShowCollectionsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ShowCollectionsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ShowCollections")).build();
                }
            }
        }
        return getShowCollectionsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status> getAlterCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "AlterCollection", requestType = io.milvus.grpc.AlterCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status> getAlterCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status> getAlterCollectionMethod;
        if ((getAlterCollectionMethod = MilvusServiceGrpc.getAlterCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getAlterCollectionMethod = MilvusServiceGrpc.getAlterCollectionMethod) == null) {
                    MilvusServiceGrpc.getAlterCollectionMethod = getAlterCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlterCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.AlterCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("AlterCollection")).build();
                }
            }
        }
        return getAlterCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status> getCreatePartitionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreatePartition", requestType = io.milvus.grpc.CreatePartitionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status> getCreatePartitionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status> getCreatePartitionMethod;
        if ((getCreatePartitionMethod = MilvusServiceGrpc.getCreatePartitionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreatePartitionMethod = MilvusServiceGrpc.getCreatePartitionMethod) == null) {
                    MilvusServiceGrpc.getCreatePartitionMethod = getCreatePartitionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePartition"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreatePartitionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreatePartition")).build();
                }
            }
        }
        return getCreatePartitionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status> getDropPartitionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropPartition", requestType = io.milvus.grpc.DropPartitionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status> getDropPartitionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status> getDropPartitionMethod;
        if ((getDropPartitionMethod = MilvusServiceGrpc.getDropPartitionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropPartitionMethod = MilvusServiceGrpc.getDropPartitionMethod) == null) {
                    MilvusServiceGrpc.getDropPartitionMethod = getDropPartitionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropPartition"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropPartitionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropPartition")).build();
                }
            }
        }
        return getDropPartitionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse> getHasPartitionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "HasPartition", requestType = io.milvus.grpc.HasPartitionRequest.class, responseType = io.milvus.grpc.BoolResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse> getHasPartitionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse> getHasPartitionMethod;
        if ((getHasPartitionMethod = MilvusServiceGrpc.getHasPartitionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getHasPartitionMethod = MilvusServiceGrpc.getHasPartitionMethod) == null) {
                    MilvusServiceGrpc.getHasPartitionMethod = getHasPartitionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HasPartition"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.HasPartitionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.BoolResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("HasPartition")).build();
                }
            }
        }
        return getHasPartitionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status> getLoadPartitionsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "LoadPartitions", requestType = io.milvus.grpc.LoadPartitionsRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status> getLoadPartitionsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status> getLoadPartitionsMethod;
        if ((getLoadPartitionsMethod = MilvusServiceGrpc.getLoadPartitionsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getLoadPartitionsMethod = MilvusServiceGrpc.getLoadPartitionsMethod) == null) {
                    MilvusServiceGrpc.getLoadPartitionsMethod = getLoadPartitionsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadPartitions"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.LoadPartitionsRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("LoadPartitions")).build();
                }
            }
        }
        return getLoadPartitionsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status> getReleasePartitionsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ReleasePartitions", requestType = io.milvus.grpc.ReleasePartitionsRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status> getReleasePartitionsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status> getReleasePartitionsMethod;
        if ((getReleasePartitionsMethod = MilvusServiceGrpc.getReleasePartitionsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getReleasePartitionsMethod = MilvusServiceGrpc.getReleasePartitionsMethod) == null) {
                    MilvusServiceGrpc.getReleasePartitionsMethod = getReleasePartitionsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleasePartitions"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ReleasePartitionsRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ReleasePartitions")).build();
                }
            }
        }
        return getReleasePartitionsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse> getGetPartitionStatisticsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetPartitionStatistics", requestType = io.milvus.grpc.GetPartitionStatisticsRequest.class, responseType = io.milvus.grpc.GetPartitionStatisticsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse> getGetPartitionStatisticsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse> getGetPartitionStatisticsMethod;
        if ((getGetPartitionStatisticsMethod = MilvusServiceGrpc.getGetPartitionStatisticsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetPartitionStatisticsMethod = MilvusServiceGrpc.getGetPartitionStatisticsMethod) == null) {
                    MilvusServiceGrpc.getGetPartitionStatisticsMethod = getGetPartitionStatisticsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPartitionStatistics"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetPartitionStatisticsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetPartitionStatisticsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetPartitionStatistics")).build();
                }
            }
        }
        return getGetPartitionStatisticsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse> getShowPartitionsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ShowPartitions", requestType = io.milvus.grpc.ShowPartitionsRequest.class, responseType = io.milvus.grpc.ShowPartitionsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse> getShowPartitionsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse> getShowPartitionsMethod;
        if ((getShowPartitionsMethod = MilvusServiceGrpc.getShowPartitionsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getShowPartitionsMethod = MilvusServiceGrpc.getShowPartitionsMethod) == null) {
                    MilvusServiceGrpc.getShowPartitionsMethod = getShowPartitionsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ShowPartitions"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ShowPartitionsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ShowPartitionsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ShowPartitions")).build();
                }
            }
        }
        return getShowPartitionsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse> getGetLoadingProgressMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetLoadingProgress", requestType = io.milvus.grpc.GetLoadingProgressRequest.class, responseType = io.milvus.grpc.GetLoadingProgressResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse> getGetLoadingProgressMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse> getGetLoadingProgressMethod;
        if ((getGetLoadingProgressMethod = MilvusServiceGrpc.getGetLoadingProgressMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetLoadingProgressMethod = MilvusServiceGrpc.getGetLoadingProgressMethod) == null) {
                    MilvusServiceGrpc.getGetLoadingProgressMethod = getGetLoadingProgressMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLoadingProgress"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetLoadingProgressRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetLoadingProgressResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetLoadingProgress")).build();
                }
            }
        }
        return getGetLoadingProgressMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse> getGetLoadStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetLoadState", requestType = io.milvus.grpc.GetLoadStateRequest.class, responseType = io.milvus.grpc.GetLoadStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse> getGetLoadStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse> getGetLoadStateMethod;
        if ((getGetLoadStateMethod = MilvusServiceGrpc.getGetLoadStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetLoadStateMethod = MilvusServiceGrpc.getGetLoadStateMethod) == null) {
                    MilvusServiceGrpc.getGetLoadStateMethod = getGetLoadStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLoadState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetLoadStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetLoadStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetLoadState")).build();
                }
            }
        }
        return getGetLoadStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status> getCreateAliasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateAlias", requestType = io.milvus.grpc.CreateAliasRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status> getCreateAliasMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status> getCreateAliasMethod;
        if ((getCreateAliasMethod = MilvusServiceGrpc.getCreateAliasMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateAliasMethod = MilvusServiceGrpc.getCreateAliasMethod) == null) {
                    MilvusServiceGrpc.getCreateAliasMethod = getCreateAliasMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAlias"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateAliasRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateAlias")).build();
                }
            }
        }
        return getCreateAliasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status> getDropAliasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropAlias", requestType = io.milvus.grpc.DropAliasRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status> getDropAliasMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status> getDropAliasMethod;
        if ((getDropAliasMethod = MilvusServiceGrpc.getDropAliasMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropAliasMethod = MilvusServiceGrpc.getDropAliasMethod) == null) {
                    MilvusServiceGrpc.getDropAliasMethod = getDropAliasMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropAlias")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropAliasRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropAlias")).build();
                }
            }
        }
        return getDropAliasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status> getAlterAliasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "AlterAlias", requestType = io.milvus.grpc.AlterAliasRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status> getAlterAliasMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status> getAlterAliasMethod;
        if ((getAlterAliasMethod = MilvusServiceGrpc.getAlterAliasMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getAlterAliasMethod = MilvusServiceGrpc.getAlterAliasMethod) == null) {
                    MilvusServiceGrpc.getAlterAliasMethod = getAlterAliasMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlterAlias"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.AlterAliasRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("AlterAlias")).build();
                }
            }
        }
        return getAlterAliasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse> getDescribeAliasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DescribeAlias", requestType = io.milvus.grpc.DescribeAliasRequest.class, responseType = io.milvus.grpc.DescribeAliasResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse> getDescribeAliasMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse> getDescribeAliasMethod;
        if ((getDescribeAliasMethod = MilvusServiceGrpc.getDescribeAliasMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDescribeAliasMethod = MilvusServiceGrpc.getDescribeAliasMethod) == null) {
                    MilvusServiceGrpc.getDescribeAliasMethod = getDescribeAliasMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAlias"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeAliasRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeAliasResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DescribeAlias")).build();
                }
            }
        }
        return getDescribeAliasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse> getListAliasesMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListAliases", requestType = io.milvus.grpc.ListAliasesRequest.class, responseType = io.milvus.grpc.ListAliasesResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse> getListAliasesMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse> getListAliasesMethod;
        if ((getListAliasesMethod = MilvusServiceGrpc.getListAliasesMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListAliasesMethod = MilvusServiceGrpc.getListAliasesMethod) == null) {
                    MilvusServiceGrpc.getListAliasesMethod = getListAliasesMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAliases"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListAliasesRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListAliasesResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListAliases")).build();
                }
            }
        }
        return getListAliasesMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status> getCreateIndexMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateIndex", requestType = io.milvus.grpc.CreateIndexRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status> getCreateIndexMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status> getCreateIndexMethod;
        if ((getCreateIndexMethod = MilvusServiceGrpc.getCreateIndexMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateIndexMethod = MilvusServiceGrpc.getCreateIndexMethod) == null) {
                    MilvusServiceGrpc.getCreateIndexMethod = getCreateIndexMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateIndex"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateIndexRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateIndex")).build();
                }
            }
        }
        return getCreateIndexMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status> getAlterIndexMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "AlterIndex", requestType = io.milvus.grpc.AlterIndexRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status> getAlterIndexMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status> getAlterIndexMethod;
        if ((getAlterIndexMethod = MilvusServiceGrpc.getAlterIndexMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getAlterIndexMethod = MilvusServiceGrpc.getAlterIndexMethod) == null) {
                    MilvusServiceGrpc.getAlterIndexMethod = getAlterIndexMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlterIndex"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.AlterIndexRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("AlterIndex")).build();
                }
            }
        }
        return getAlterIndexMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse> getDescribeIndexMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DescribeIndex", requestType = io.milvus.grpc.DescribeIndexRequest.class, responseType = io.milvus.grpc.DescribeIndexResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse> getDescribeIndexMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse> getDescribeIndexMethod;
        if ((getDescribeIndexMethod = MilvusServiceGrpc.getDescribeIndexMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDescribeIndexMethod = MilvusServiceGrpc.getDescribeIndexMethod) == null) {
                    MilvusServiceGrpc.getDescribeIndexMethod = getDescribeIndexMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeIndex"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeIndexRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeIndexResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DescribeIndex")).build();
                }
            }
        }
        return getDescribeIndexMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse> getGetIndexStatisticsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetIndexStatistics", requestType = io.milvus.grpc.GetIndexStatisticsRequest.class, responseType = io.milvus.grpc.GetIndexStatisticsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse> getGetIndexStatisticsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse> getGetIndexStatisticsMethod;
        if ((getGetIndexStatisticsMethod = MilvusServiceGrpc.getGetIndexStatisticsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetIndexStatisticsMethod = MilvusServiceGrpc.getGetIndexStatisticsMethod) == null) {
                    MilvusServiceGrpc.getGetIndexStatisticsMethod = getGetIndexStatisticsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIndexStatistics"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexStatisticsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexStatisticsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetIndexStatistics")).build();
                }
            }
        }
        return getGetIndexStatisticsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse> getGetIndexStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetIndexState", requestType = io.milvus.grpc.GetIndexStateRequest.class, responseType = io.milvus.grpc.GetIndexStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse> getGetIndexStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse> getGetIndexStateMethod;
        if ((getGetIndexStateMethod = MilvusServiceGrpc.getGetIndexStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetIndexStateMethod = MilvusServiceGrpc.getGetIndexStateMethod) == null) {
                    MilvusServiceGrpc.getGetIndexStateMethod = getGetIndexStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIndexState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetIndexState")).build();
                }
            }
        }
        return getGetIndexStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse> getGetIndexBuildProgressMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetIndexBuildProgress", requestType = io.milvus.grpc.GetIndexBuildProgressRequest.class, responseType = io.milvus.grpc.GetIndexBuildProgressResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse> getGetIndexBuildProgressMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse> getGetIndexBuildProgressMethod;
        if ((getGetIndexBuildProgressMethod = MilvusServiceGrpc.getGetIndexBuildProgressMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetIndexBuildProgressMethod = MilvusServiceGrpc.getGetIndexBuildProgressMethod) == null) {
                    MilvusServiceGrpc.getGetIndexBuildProgressMethod = getGetIndexBuildProgressMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIndexBuildProgress"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexBuildProgressRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetIndexBuildProgressResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetIndexBuildProgress")).build();
                }
            }
        }
        return getGetIndexBuildProgressMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status> getDropIndexMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropIndex", requestType = io.milvus.grpc.DropIndexRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status> getDropIndexMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status> getDropIndexMethod;
        if ((getDropIndexMethod = MilvusServiceGrpc.getDropIndexMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropIndexMethod = MilvusServiceGrpc.getDropIndexMethod) == null) {
                    MilvusServiceGrpc.getDropIndexMethod = getDropIndexMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropIndex")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropIndexRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropIndex")).build();
                }
            }
        }
        return getDropIndexMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult> getInsertMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Insert", requestType = io.milvus.grpc.InsertRequest.class, responseType = io.milvus.grpc.MutationResult.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult> getInsertMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult> getInsertMethod;
        if ((getInsertMethod = MilvusServiceGrpc.getInsertMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getInsertMethod = MilvusServiceGrpc.getInsertMethod) == null) {
                    MilvusServiceGrpc.getInsertMethod = getInsertMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.InsertRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.MutationResult.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Insert")).build();
                }
            }
        }
        return getInsertMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult> getDeleteMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Delete", requestType = io.milvus.grpc.DeleteRequest.class, responseType = io.milvus.grpc.MutationResult.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult> getDeleteMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult> getDeleteMethod;
        if ((getDeleteMethod = MilvusServiceGrpc.getDeleteMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDeleteMethod = MilvusServiceGrpc.getDeleteMethod) == null) {
                    MilvusServiceGrpc.getDeleteMethod = getDeleteMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.DeleteRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.MutationResult.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Delete")).build();
                }
            }
        }
        return getDeleteMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult> getUpsertMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Upsert", requestType = io.milvus.grpc.UpsertRequest.class, responseType = io.milvus.grpc.MutationResult.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult> getUpsertMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult> getUpsertMethod;
        if ((getUpsertMethod = MilvusServiceGrpc.getUpsertMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getUpsertMethod = MilvusServiceGrpc.getUpsertMethod) == null) {
                    MilvusServiceGrpc.getUpsertMethod = getUpsertMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Upsert")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.UpsertRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.MutationResult.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Upsert")).build();
                }
            }
        }
        return getUpsertMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults> getSearchMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Search", requestType = io.milvus.grpc.SearchRequest.class, responseType = io.milvus.grpc.SearchResults.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults> getSearchMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults> getSearchMethod;
        if ((getSearchMethod = MilvusServiceGrpc.getSearchMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getSearchMethod = MilvusServiceGrpc.getSearchMethod) == null) {
                    MilvusServiceGrpc.getSearchMethod = getSearchMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Search")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.SearchRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.SearchResults.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Search")).build();
                }
            }
        }
        return getSearchMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse> getFlushMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Flush", requestType = io.milvus.grpc.FlushRequest.class, responseType = io.milvus.grpc.FlushResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse> getFlushMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse> getFlushMethod;
        if ((getFlushMethod = MilvusServiceGrpc.getFlushMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getFlushMethod = MilvusServiceGrpc.getFlushMethod) == null) {
                    MilvusServiceGrpc.getFlushMethod = getFlushMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flush")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.FlushRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.FlushResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Flush")).build();
                }
            }
        }
        return getFlushMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults> getQueryMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Query", requestType = io.milvus.grpc.QueryRequest.class, responseType = io.milvus.grpc.QueryResults.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults> getQueryMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults> getQueryMethod;
        if ((getQueryMethod = MilvusServiceGrpc.getQueryMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getQueryMethod = MilvusServiceGrpc.getQueryMethod) == null) {
                    MilvusServiceGrpc.getQueryMethod = getQueryMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.QueryRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.QueryResults.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Query")).build();
                }
            }
        }
        return getQueryMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults> getCalcDistanceMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CalcDistance", requestType = io.milvus.grpc.CalcDistanceRequest.class, responseType = io.milvus.grpc.CalcDistanceResults.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults> getCalcDistanceMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults> getCalcDistanceMethod;
        if ((getCalcDistanceMethod = MilvusServiceGrpc.getCalcDistanceMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCalcDistanceMethod = MilvusServiceGrpc.getCalcDistanceMethod) == null) {
                    MilvusServiceGrpc.getCalcDistanceMethod = getCalcDistanceMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalcDistance"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CalcDistanceRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CalcDistanceResults.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CalcDistance")).build();
                }
            }
        }
        return getCalcDistanceMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse> getFlushAllMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "FlushAll", requestType = io.milvus.grpc.FlushAllRequest.class, responseType = io.milvus.grpc.FlushAllResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse> getFlushAllMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse> getFlushAllMethod;
        if ((getFlushAllMethod = MilvusServiceGrpc.getFlushAllMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getFlushAllMethod = MilvusServiceGrpc.getFlushAllMethod) == null) {
                    MilvusServiceGrpc.getFlushAllMethod = getFlushAllMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FlushAll")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.FlushAllRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.FlushAllResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("FlushAll")).build();
                }
            }
        }
        return getFlushAllMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse> getGetFlushStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetFlushState", requestType = io.milvus.grpc.GetFlushStateRequest.class, responseType = io.milvus.grpc.GetFlushStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse> getGetFlushStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse> getGetFlushStateMethod;
        if ((getGetFlushStateMethod = MilvusServiceGrpc.getGetFlushStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetFlushStateMethod = MilvusServiceGrpc.getGetFlushStateMethod) == null) {
                    MilvusServiceGrpc.getGetFlushStateMethod = getGetFlushStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlushState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetFlushStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetFlushStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetFlushState")).build();
                }
            }
        }
        return getGetFlushStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse> getGetFlushAllStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetFlushAllState", requestType = io.milvus.grpc.GetFlushAllStateRequest.class, responseType = io.milvus.grpc.GetFlushAllStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse> getGetFlushAllStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse> getGetFlushAllStateMethod;
        if ((getGetFlushAllStateMethod = MilvusServiceGrpc.getGetFlushAllStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetFlushAllStateMethod = MilvusServiceGrpc.getGetFlushAllStateMethod) == null) {
                    MilvusServiceGrpc.getGetFlushAllStateMethod = getGetFlushAllStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlushAllState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetFlushAllStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetFlushAllStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetFlushAllState")).build();
                }
            }
        }
        return getGetFlushAllStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse> getGetPersistentSegmentInfoMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetPersistentSegmentInfo", requestType = io.milvus.grpc.GetPersistentSegmentInfoRequest.class, responseType = io.milvus.grpc.GetPersistentSegmentInfoResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse> getGetPersistentSegmentInfoMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse> getGetPersistentSegmentInfoMethod;
        if ((getGetPersistentSegmentInfoMethod = MilvusServiceGrpc.getGetPersistentSegmentInfoMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetPersistentSegmentInfoMethod = MilvusServiceGrpc.getGetPersistentSegmentInfoMethod) == null) {
                    MilvusServiceGrpc.getGetPersistentSegmentInfoMethod = getGetPersistentSegmentInfoMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPersistentSegmentInfo"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetPersistentSegmentInfoRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetPersistentSegmentInfoResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetPersistentSegmentInfo")).build();
                }
            }
        }
        return getGetPersistentSegmentInfoMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse> getGetQuerySegmentInfoMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetQuerySegmentInfo", requestType = io.milvus.grpc.GetQuerySegmentInfoRequest.class, responseType = io.milvus.grpc.GetQuerySegmentInfoResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse> getGetQuerySegmentInfoMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse> getGetQuerySegmentInfoMethod;
        if ((getGetQuerySegmentInfoMethod = MilvusServiceGrpc.getGetQuerySegmentInfoMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetQuerySegmentInfoMethod = MilvusServiceGrpc.getGetQuerySegmentInfoMethod) == null) {
                    MilvusServiceGrpc.getGetQuerySegmentInfoMethod = getGetQuerySegmentInfoMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuerySegmentInfo"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetQuerySegmentInfoRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetQuerySegmentInfoResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetQuerySegmentInfo")).build();
                }
            }
        }
        return getGetQuerySegmentInfoMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse> getGetReplicasMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetReplicas", requestType = io.milvus.grpc.GetReplicasRequest.class, responseType = io.milvus.grpc.GetReplicasResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse> getGetReplicasMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse> getGetReplicasMethod;
        if ((getGetReplicasMethod = MilvusServiceGrpc.getGetReplicasMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetReplicasMethod = MilvusServiceGrpc.getGetReplicasMethod) == null) {
                    MilvusServiceGrpc.getGetReplicasMethod = getGetReplicasMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReplicas"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetReplicasRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetReplicasResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetReplicas")).build();
                }
            }
        }
        return getGetReplicasMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse> getDummyMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Dummy", requestType = io.milvus.grpc.DummyRequest.class, responseType = io.milvus.grpc.DummyResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse> getDummyMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse> getDummyMethod;
        if ((getDummyMethod = MilvusServiceGrpc.getDummyMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDummyMethod = MilvusServiceGrpc.getDummyMethod) == null) {
                    MilvusServiceGrpc.getDummyMethod = getDummyMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Dummy")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.DummyRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.DummyResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Dummy")).build();
                }
            }
        }
        return getDummyMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "RegisterLink", requestType = io.milvus.grpc.RegisterLinkRequest.class, responseType = io.milvus.grpc.RegisterLinkResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> getRegisterLinkMethod;
        if ((getRegisterLinkMethod = MilvusServiceGrpc.getRegisterLinkMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getRegisterLinkMethod = MilvusServiceGrpc.getRegisterLinkMethod) == null) {
                    MilvusServiceGrpc.getRegisterLinkMethod = getRegisterLinkMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterLink"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.RegisterLinkRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.RegisterLinkResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("RegisterLink")).build();
                }
            }
        }
        return getRegisterLinkMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse> getGetMetricsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetMetrics", requestType = io.milvus.grpc.GetMetricsRequest.class, responseType = io.milvus.grpc.GetMetricsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse> getGetMetricsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse> getGetMetricsMethod;
        if ((getGetMetricsMethod = MilvusServiceGrpc.getGetMetricsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetMetricsMethod = MilvusServiceGrpc.getGetMetricsMethod) == null) {
                    MilvusServiceGrpc.getGetMetricsMethod = getGetMetricsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMetrics"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetMetricsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetMetricsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetMetrics")).build();
                }
            }
        }
        return getGetMetricsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates> getGetComponentStatesMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetComponentStates", requestType = io.milvus.grpc.GetComponentStatesRequest.class, responseType = io.milvus.grpc.ComponentStates.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates> getGetComponentStatesMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates> getGetComponentStatesMethod;
        if ((getGetComponentStatesMethod = MilvusServiceGrpc.getGetComponentStatesMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetComponentStatesMethod = MilvusServiceGrpc.getGetComponentStatesMethod) == null) {
                    MilvusServiceGrpc.getGetComponentStatesMethod = getGetComponentStatesMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComponentStates"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetComponentStatesRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.ComponentStates.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetComponentStates")).build();
                }
            }
        }
        return getGetComponentStatesMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status> getLoadBalanceMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "LoadBalance", requestType = io.milvus.grpc.LoadBalanceRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status> getLoadBalanceMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status> getLoadBalanceMethod;
        if ((getLoadBalanceMethod = MilvusServiceGrpc.getLoadBalanceMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getLoadBalanceMethod = MilvusServiceGrpc.getLoadBalanceMethod) == null) {
                    MilvusServiceGrpc.getLoadBalanceMethod = getLoadBalanceMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadBalance"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.LoadBalanceRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("LoadBalance")).build();
                }
            }
        }
        return getLoadBalanceMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse> getGetCompactionStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetCompactionState", requestType = io.milvus.grpc.GetCompactionStateRequest.class, responseType = io.milvus.grpc.GetCompactionStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse> getGetCompactionStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse> getGetCompactionStateMethod;
        if ((getGetCompactionStateMethod = MilvusServiceGrpc.getGetCompactionStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetCompactionStateMethod = MilvusServiceGrpc.getGetCompactionStateMethod) == null) {
                    MilvusServiceGrpc.getGetCompactionStateMethod = getGetCompactionStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompactionState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCompactionStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCompactionStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetCompactionState")).build();
                }
            }
        }
        return getGetCompactionStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse> getManualCompactionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ManualCompaction", requestType = io.milvus.grpc.ManualCompactionRequest.class, responseType = io.milvus.grpc.ManualCompactionResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse> getManualCompactionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse> getManualCompactionMethod;
        if ((getManualCompactionMethod = MilvusServiceGrpc.getManualCompactionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getManualCompactionMethod = MilvusServiceGrpc.getManualCompactionMethod) == null) {
                    MilvusServiceGrpc.getManualCompactionMethod = getManualCompactionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ManualCompaction"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ManualCompactionRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ManualCompactionResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ManualCompaction")).build();
                }
            }
        }
        return getManualCompactionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse> getGetCompactionStateWithPlansMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetCompactionStateWithPlans", requestType = io.milvus.grpc.GetCompactionPlansRequest.class, responseType = io.milvus.grpc.GetCompactionPlansResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse> getGetCompactionStateWithPlansMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse> getGetCompactionStateWithPlansMethod;
        if ((getGetCompactionStateWithPlansMethod = MilvusServiceGrpc.getGetCompactionStateWithPlansMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetCompactionStateWithPlansMethod = MilvusServiceGrpc.getGetCompactionStateWithPlansMethod) == null) {
                    MilvusServiceGrpc.getGetCompactionStateWithPlansMethod = getGetCompactionStateWithPlansMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCompactionStateWithPlans"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCompactionPlansRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetCompactionPlansResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetCompactionStateWithPlans"))
                            .build();
                }
            }
        }
        return getGetCompactionStateWithPlansMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse> getImportMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Import", requestType = io.milvus.grpc.ImportRequest.class, responseType = io.milvus.grpc.ImportResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse> getImportMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse> getImportMethod;
        if ((getImportMethod = MilvusServiceGrpc.getImportMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getImportMethod = MilvusServiceGrpc.getImportMethod) == null) {
                    MilvusServiceGrpc.getImportMethod = getImportMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Import")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.ImportRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.ImportResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Import")).build();
                }
            }
        }
        return getImportMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse> getGetImportStateMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetImportState", requestType = io.milvus.grpc.GetImportStateRequest.class, responseType = io.milvus.grpc.GetImportStateResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse> getGetImportStateMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse> getGetImportStateMethod;
        if ((getGetImportStateMethod = MilvusServiceGrpc.getGetImportStateMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetImportStateMethod = MilvusServiceGrpc.getGetImportStateMethod) == null) {
                    MilvusServiceGrpc.getGetImportStateMethod = getGetImportStateMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImportState"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetImportStateRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetImportStateResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetImportState")).build();
                }
            }
        }
        return getGetImportStateMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse> getListImportTasksMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListImportTasks", requestType = io.milvus.grpc.ListImportTasksRequest.class, responseType = io.milvus.grpc.ListImportTasksResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse> getListImportTasksMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse> getListImportTasksMethod;
        if ((getListImportTasksMethod = MilvusServiceGrpc.getListImportTasksMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListImportTasksMethod = MilvusServiceGrpc.getListImportTasksMethod) == null) {
                    MilvusServiceGrpc.getListImportTasksMethod = getListImportTasksMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListImportTasks"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListImportTasksRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListImportTasksResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListImportTasks")).build();
                }
            }
        }
        return getListImportTasksMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status> getCreateCredentialMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateCredential", requestType = io.milvus.grpc.CreateCredentialRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status> getCreateCredentialMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status> getCreateCredentialMethod;
        if ((getCreateCredentialMethod = MilvusServiceGrpc.getCreateCredentialMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateCredentialMethod = MilvusServiceGrpc.getCreateCredentialMethod) == null) {
                    MilvusServiceGrpc.getCreateCredentialMethod = getCreateCredentialMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCredential"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateCredentialRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateCredential")).build();
                }
            }
        }
        return getCreateCredentialMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status> getUpdateCredentialMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "UpdateCredential", requestType = io.milvus.grpc.UpdateCredentialRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status> getUpdateCredentialMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status> getUpdateCredentialMethod;
        if ((getUpdateCredentialMethod = MilvusServiceGrpc.getUpdateCredentialMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getUpdateCredentialMethod = MilvusServiceGrpc.getUpdateCredentialMethod) == null) {
                    MilvusServiceGrpc.getUpdateCredentialMethod = getUpdateCredentialMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateCredential"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.UpdateCredentialRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("UpdateCredential")).build();
                }
            }
        }
        return getUpdateCredentialMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status> getDeleteCredentialMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DeleteCredential", requestType = io.milvus.grpc.DeleteCredentialRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status> getDeleteCredentialMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status> getDeleteCredentialMethod;
        if ((getDeleteCredentialMethod = MilvusServiceGrpc.getDeleteCredentialMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDeleteCredentialMethod = MilvusServiceGrpc.getDeleteCredentialMethod) == null) {
                    MilvusServiceGrpc.getDeleteCredentialMethod = getDeleteCredentialMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCredential"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DeleteCredentialRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DeleteCredential")).build();
                }
            }
        }
        return getDeleteCredentialMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse> getListCredUsersMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListCredUsers", requestType = io.milvus.grpc.ListCredUsersRequest.class, responseType = io.milvus.grpc.ListCredUsersResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse> getListCredUsersMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse> getListCredUsersMethod;
        if ((getListCredUsersMethod = MilvusServiceGrpc.getListCredUsersMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListCredUsersMethod = MilvusServiceGrpc.getListCredUsersMethod) == null) {
                    MilvusServiceGrpc.getListCredUsersMethod = getListCredUsersMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListCredUsers"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListCredUsersRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListCredUsersResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListCredUsers")).build();
                }
            }
        }
        return getListCredUsersMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status> getCreateRoleMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateRole", requestType = io.milvus.grpc.CreateRoleRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status> getCreateRoleMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status> getCreateRoleMethod;
        if ((getCreateRoleMethod = MilvusServiceGrpc.getCreateRoleMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateRoleMethod = MilvusServiceGrpc.getCreateRoleMethod) == null) {
                    MilvusServiceGrpc.getCreateRoleMethod = getCreateRoleMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRole"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateRoleRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateRole")).build();
                }
            }
        }
        return getCreateRoleMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status> getDropRoleMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropRole", requestType = io.milvus.grpc.DropRoleRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status> getDropRoleMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status> getDropRoleMethod;
        if ((getDropRoleMethod = MilvusServiceGrpc.getDropRoleMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropRoleMethod = MilvusServiceGrpc.getDropRoleMethod) == null) {
                    MilvusServiceGrpc.getDropRoleMethod = getDropRoleMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropRole")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.DropRoleRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropRole")).build();
                }
            }
        }
        return getDropRoleMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status> getOperateUserRoleMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "OperateUserRole", requestType = io.milvus.grpc.OperateUserRoleRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status> getOperateUserRoleMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status> getOperateUserRoleMethod;
        if ((getOperateUserRoleMethod = MilvusServiceGrpc.getOperateUserRoleMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getOperateUserRoleMethod = MilvusServiceGrpc.getOperateUserRoleMethod) == null) {
                    MilvusServiceGrpc.getOperateUserRoleMethod = getOperateUserRoleMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperateUserRole"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.OperateUserRoleRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("OperateUserRole")).build();
                }
            }
        }
        return getOperateUserRoleMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse> getSelectRoleMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "SelectRole", requestType = io.milvus.grpc.SelectRoleRequest.class, responseType = io.milvus.grpc.SelectRoleResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse> getSelectRoleMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse> getSelectRoleMethod;
        if ((getSelectRoleMethod = MilvusServiceGrpc.getSelectRoleMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getSelectRoleMethod = MilvusServiceGrpc.getSelectRoleMethod) == null) {
                    MilvusServiceGrpc.getSelectRoleMethod = getSelectRoleMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectRole"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectRoleRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectRoleResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("SelectRole")).build();
                }
            }
        }
        return getSelectRoleMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse> getSelectUserMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "SelectUser", requestType = io.milvus.grpc.SelectUserRequest.class, responseType = io.milvus.grpc.SelectUserResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse> getSelectUserMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse> getSelectUserMethod;
        if ((getSelectUserMethod = MilvusServiceGrpc.getSelectUserMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getSelectUserMethod = MilvusServiceGrpc.getSelectUserMethod) == null) {
                    MilvusServiceGrpc.getSelectUserMethod = getSelectUserMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectUser"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectUserRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectUserResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("SelectUser")).build();
                }
            }
        }
        return getSelectUserMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status> getOperatePrivilegeMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "OperatePrivilege", requestType = io.milvus.grpc.OperatePrivilegeRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status> getOperatePrivilegeMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status> getOperatePrivilegeMethod;
        if ((getOperatePrivilegeMethod = MilvusServiceGrpc.getOperatePrivilegeMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getOperatePrivilegeMethod = MilvusServiceGrpc.getOperatePrivilegeMethod) == null) {
                    MilvusServiceGrpc.getOperatePrivilegeMethod = getOperatePrivilegeMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OperatePrivilege"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.OperatePrivilegeRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("OperatePrivilege")).build();
                }
            }
        }
        return getOperatePrivilegeMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse> getSelectGrantMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "SelectGrant", requestType = io.milvus.grpc.SelectGrantRequest.class, responseType = io.milvus.grpc.SelectGrantResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse> getSelectGrantMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse> getSelectGrantMethod;
        if ((getSelectGrantMethod = MilvusServiceGrpc.getSelectGrantMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getSelectGrantMethod = MilvusServiceGrpc.getSelectGrantMethod) == null) {
                    MilvusServiceGrpc.getSelectGrantMethod = getSelectGrantMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SelectGrant"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectGrantRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.SelectGrantResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("SelectGrant")).build();
                }
            }
        }
        return getSelectGrantMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse> getGetVersionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "GetVersion", requestType = io.milvus.grpc.GetVersionRequest.class, responseType = io.milvus.grpc.GetVersionResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse> getGetVersionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse> getGetVersionMethod;
        if ((getGetVersionMethod = MilvusServiceGrpc.getGetVersionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getGetVersionMethod = MilvusServiceGrpc.getGetVersionMethod) == null) {
                    MilvusServiceGrpc.getGetVersionMethod = getGetVersionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVersion"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetVersionRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.GetVersionResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("GetVersion")).build();
                }
            }
        }
        return getGetVersionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse> getCheckHealthMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CheckHealth", requestType = io.milvus.grpc.CheckHealthRequest.class, responseType = io.milvus.grpc.CheckHealthResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse> getCheckHealthMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse> getCheckHealthMethod;
        if ((getCheckHealthMethod = MilvusServiceGrpc.getCheckHealthMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCheckHealthMethod = MilvusServiceGrpc.getCheckHealthMethod) == null) {
                    MilvusServiceGrpc.getCheckHealthMethod = getCheckHealthMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckHealth"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CheckHealthRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CheckHealthResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CheckHealth")).build();
                }
            }
        }
        return getCheckHealthMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status> getCreateResourceGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateResourceGroup", requestType = io.milvus.grpc.CreateResourceGroupRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status> getCreateResourceGroupMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status> getCreateResourceGroupMethod;
        if ((getCreateResourceGroupMethod = MilvusServiceGrpc.getCreateResourceGroupMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateResourceGroupMethod = MilvusServiceGrpc.getCreateResourceGroupMethod) == null) {
                    MilvusServiceGrpc.getCreateResourceGroupMethod = getCreateResourceGroupMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateResourceGroup"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateResourceGroupRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateResourceGroup")).build();
                }
            }
        }
        return getCreateResourceGroupMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status> getDropResourceGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropResourceGroup", requestType = io.milvus.grpc.DropResourceGroupRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status> getDropResourceGroupMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status> getDropResourceGroupMethod;
        if ((getDropResourceGroupMethod = MilvusServiceGrpc.getDropResourceGroupMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropResourceGroupMethod = MilvusServiceGrpc.getDropResourceGroupMethod) == null) {
                    MilvusServiceGrpc.getDropResourceGroupMethod = getDropResourceGroupMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropResourceGroup"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropResourceGroupRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropResourceGroup")).build();
                }
            }
        }
        return getDropResourceGroupMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status> getTransferNodeMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "TransferNode", requestType = io.milvus.grpc.TransferNodeRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status> getTransferNodeMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status> getTransferNodeMethod;
        if ((getTransferNodeMethod = MilvusServiceGrpc.getTransferNodeMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getTransferNodeMethod = MilvusServiceGrpc.getTransferNodeMethod) == null) {
                    MilvusServiceGrpc.getTransferNodeMethod = getTransferNodeMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferNode"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.TransferNodeRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("TransferNode")).build();
                }
            }
        }
        return getTransferNodeMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status> getTransferReplicaMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "TransferReplica", requestType = io.milvus.grpc.TransferReplicaRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status> getTransferReplicaMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status> getTransferReplicaMethod;
        if ((getTransferReplicaMethod = MilvusServiceGrpc.getTransferReplicaMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getTransferReplicaMethod = MilvusServiceGrpc.getTransferReplicaMethod) == null) {
                    MilvusServiceGrpc.getTransferReplicaMethod = getTransferReplicaMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TransferReplica"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.TransferReplicaRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("TransferReplica")).build();
                }
            }
        }
        return getTransferReplicaMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse> getListResourceGroupsMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListResourceGroups", requestType = io.milvus.grpc.ListResourceGroupsRequest.class, responseType = io.milvus.grpc.ListResourceGroupsResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse> getListResourceGroupsMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse> getListResourceGroupsMethod;
        if ((getListResourceGroupsMethod = MilvusServiceGrpc.getListResourceGroupsMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListResourceGroupsMethod = MilvusServiceGrpc.getListResourceGroupsMethod) == null) {
                    MilvusServiceGrpc.getListResourceGroupsMethod = getListResourceGroupsMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResourceGroups"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListResourceGroupsRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListResourceGroupsResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListResourceGroups")).build();
                }
            }
        }
        return getListResourceGroupsMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse> getDescribeResourceGroupMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DescribeResourceGroup", requestType = io.milvus.grpc.DescribeResourceGroupRequest.class, responseType = io.milvus.grpc.DescribeResourceGroupResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse> getDescribeResourceGroupMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse> getDescribeResourceGroupMethod;
        if ((getDescribeResourceGroupMethod = MilvusServiceGrpc.getDescribeResourceGroupMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDescribeResourceGroupMethod = MilvusServiceGrpc.getDescribeResourceGroupMethod) == null) {
                    MilvusServiceGrpc.getDescribeResourceGroupMethod = getDescribeResourceGroupMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeResourceGroup"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeResourceGroupRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DescribeResourceGroupResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DescribeResourceGroup")).build();
                }
            }
        }
        return getDescribeResourceGroupMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status> getRenameCollectionMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "RenameCollection", requestType = io.milvus.grpc.RenameCollectionRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status> getRenameCollectionMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status> getRenameCollectionMethod;
        if ((getRenameCollectionMethod = MilvusServiceGrpc.getRenameCollectionMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getRenameCollectionMethod = MilvusServiceGrpc.getRenameCollectionMethod) == null) {
                    MilvusServiceGrpc.getRenameCollectionMethod = getRenameCollectionMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameCollection"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.RenameCollectionRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("RenameCollection")).build();
                }
            }
        }
        return getRenameCollectionMethod;
    }

    private static volatile io.grpc.MethodDescriptor<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse> getListIndexedSegmentMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListIndexedSegment", requestType = milvus.proto.feder.Feder.ListIndexedSegmentRequest.class, responseType = milvus.proto.feder.Feder.ListIndexedSegmentResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse> getListIndexedSegmentMethod() {
        io.grpc.MethodDescriptor<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse> getListIndexedSegmentMethod;
        if ((getListIndexedSegmentMethod = MilvusServiceGrpc.getListIndexedSegmentMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListIndexedSegmentMethod = MilvusServiceGrpc.getListIndexedSegmentMethod) == null) {
                    MilvusServiceGrpc.getListIndexedSegmentMethod = getListIndexedSegmentMethod = io.grpc.MethodDescriptor.<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIndexedSegment"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(milvus.proto.feder.Feder.ListIndexedSegmentRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(milvus.proto.feder.Feder.ListIndexedSegmentResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListIndexedSegment")).build();
                }
            }
        }
        return getListIndexedSegmentMethod;
    }

    private static volatile io.grpc.MethodDescriptor<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> getDescribeSegmentIndexDataMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DescribeSegmentIndexData", requestType = milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest.class, responseType = milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> getDescribeSegmentIndexDataMethod() {
        io.grpc.MethodDescriptor<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> getDescribeSegmentIndexDataMethod;
        if ((getDescribeSegmentIndexDataMethod = MilvusServiceGrpc.getDescribeSegmentIndexDataMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDescribeSegmentIndexDataMethod = MilvusServiceGrpc.getDescribeSegmentIndexDataMethod) == null) {
                    MilvusServiceGrpc.getDescribeSegmentIndexDataMethod = getDescribeSegmentIndexDataMethod = io.grpc.MethodDescriptor.<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSegmentIndexData"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DescribeSegmentIndexData")).build();
                }
            }
        }
        return getDescribeSegmentIndexDataMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse> getConnectMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "Connect", requestType = io.milvus.grpc.ConnectRequest.class, responseType = io.milvus.grpc.ConnectResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse> getConnectMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse> getConnectMethod;
        if ((getConnectMethod = MilvusServiceGrpc.getConnectMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getConnectMethod = MilvusServiceGrpc.getConnectMethod) == null) {
                    MilvusServiceGrpc.getConnectMethod = getConnectMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Connect")).setSampledToLocalTracing(true)
                            .setRequestMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.ConnectRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.ConnectResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("Connect")).build();
                }
            }
        }
        return getConnectMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse> getAllocTimestampMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "AllocTimestamp", requestType = io.milvus.grpc.AllocTimestampRequest.class, responseType = io.milvus.grpc.AllocTimestampResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse> getAllocTimestampMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse> getAllocTimestampMethod;
        if ((getAllocTimestampMethod = MilvusServiceGrpc.getAllocTimestampMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getAllocTimestampMethod = MilvusServiceGrpc.getAllocTimestampMethod) == null) {
                    MilvusServiceGrpc.getAllocTimestampMethod = getAllocTimestampMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AllocTimestamp"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.AllocTimestampRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.AllocTimestampResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("AllocTimestamp")).build();
                }
            }
        }
        return getAllocTimestampMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status> getCreateDatabaseMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "CreateDatabase", requestType = io.milvus.grpc.CreateDatabaseRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status> getCreateDatabaseMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status> getCreateDatabaseMethod;
        if ((getCreateDatabaseMethod = MilvusServiceGrpc.getCreateDatabaseMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getCreateDatabaseMethod = MilvusServiceGrpc.getCreateDatabaseMethod) == null) {
                    MilvusServiceGrpc.getCreateDatabaseMethod = getCreateDatabaseMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDatabase"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.CreateDatabaseRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("CreateDatabase")).build();
                }
            }
        }
        return getCreateDatabaseMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status> getDropDatabaseMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "DropDatabase", requestType = io.milvus.grpc.DropDatabaseRequest.class, responseType = io.milvus.grpc.Status.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status> getDropDatabaseMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status> getDropDatabaseMethod;
        if ((getDropDatabaseMethod = MilvusServiceGrpc.getDropDatabaseMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getDropDatabaseMethod = MilvusServiceGrpc.getDropDatabaseMethod) == null) {
                    MilvusServiceGrpc.getDropDatabaseMethod = getDropDatabaseMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DropDatabase"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.DropDatabaseRequest.getDefaultInstance()))
                            .setResponseMarshaller(
                                    io.grpc.protobuf.ProtoUtils.marshaller(io.milvus.grpc.Status.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("DropDatabase")).build();
                }
            }
        }
        return getDropDatabaseMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse> getListDatabasesMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ListDatabases", requestType = io.milvus.grpc.ListDatabasesRequest.class, responseType = io.milvus.grpc.ListDatabasesResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse> getListDatabasesMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse> getListDatabasesMethod;
        if ((getListDatabasesMethod = MilvusServiceGrpc.getListDatabasesMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getListDatabasesMethod = MilvusServiceGrpc.getListDatabasesMethod) == null) {
                    MilvusServiceGrpc.getListDatabasesMethod = getListDatabasesMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDatabases"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListDatabasesRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ListDatabasesResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ListDatabases")).build();
                }
            }
        }
        return getListDatabasesMethod;
    }

    private static volatile io.grpc.MethodDescriptor<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse> getReplicateMessageMethod;

    @io.grpc.stub.annotations.RpcMethod(fullMethodName = SERVICE_NAME + '/'
            + "ReplicateMessage", requestType = io.milvus.grpc.ReplicateMessageRequest.class, responseType = io.milvus.grpc.ReplicateMessageResponse.class, methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
    public static io.grpc.MethodDescriptor<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse> getReplicateMessageMethod() {
        io.grpc.MethodDescriptor<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse> getReplicateMessageMethod;
        if ((getReplicateMessageMethod = MilvusServiceGrpc.getReplicateMessageMethod) == null) {
            synchronized (MilvusServiceGrpc.class) {
                if ((getReplicateMessageMethod = MilvusServiceGrpc.getReplicateMessageMethod) == null) {
                    MilvusServiceGrpc.getReplicateMessageMethod = getReplicateMessageMethod = io.grpc.MethodDescriptor.<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse> newBuilder()
                            .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                            .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplicateMessage"))
                            .setSampledToLocalTracing(true)
                            .setRequestMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ReplicateMessageRequest.getDefaultInstance()))
                            .setResponseMarshaller(io.grpc.protobuf.ProtoUtils
                                    .marshaller(io.milvus.grpc.ReplicateMessageResponse.getDefaultInstance()))
                            .setSchemaDescriptor(new MilvusServiceMethodDescriptorSupplier("ReplicateMessage")).build();
                }
            }
        }
        return getReplicateMessageMethod;
    }

    /**
     * Creates a new async stub that supports all call types for the service
     */
    public static MilvusServiceStub newStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MilvusServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MilvusServiceStub>() {

            @java.lang.Override
            public MilvusServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MilvusServiceStub(channel, callOptions);
            }
        };
        return MilvusServiceStub.newStub(factory, channel);
    }

    /**
     * Creates a new blocking-style stub that supports unary and streaming output calls on the service
     */
    public static MilvusServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MilvusServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MilvusServiceBlockingStub>() {

            @java.lang.Override
            public MilvusServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MilvusServiceBlockingStub(channel, callOptions);
            }
        };
        return MilvusServiceBlockingStub.newStub(factory, channel);
    }

    /**
     * Creates a new ListenableFuture-style stub that supports unary calls on the service
     */
    public static MilvusServiceFutureStub newFutureStub(io.grpc.Channel channel) {
        io.grpc.stub.AbstractStub.StubFactory<MilvusServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MilvusServiceFutureStub>() {

            @java.lang.Override
            public MilvusServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new MilvusServiceFutureStub(channel, callOptions);
            }
        };
        return MilvusServiceFutureStub.newStub(factory, channel);
    }

    /**
     */
    public interface AsyncService {

        /**
         */
        default void createCollection(io.milvus.grpc.CreateCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCollectionMethod(), responseObserver);
        }

        /**
         */
        default void dropCollection(io.milvus.grpc.DropCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropCollectionMethod(), responseObserver);
        }

        /**
         */
        default void hasCollection(io.milvus.grpc.HasCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasCollectionMethod(), responseObserver);
        }

        /**
         */
        default void loadCollection(io.milvus.grpc.LoadCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadCollectionMethod(), responseObserver);
        }

        /**
         */
        default void releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseCollectionMethod(), responseObserver);
        }

        /**
         */
        default void describeCollection(io.milvus.grpc.DescribeCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeCollectionResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeCollectionMethod(), responseObserver);
        }

        /**
         */
        default void getCollectionStatistics(io.milvus.grpc.GetCollectionStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCollectionStatisticsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCollectionStatisticsMethod(), responseObserver);
        }

        /**
         */
        default void showCollections(io.milvus.grpc.ShowCollectionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ShowCollectionsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowCollectionsMethod(), responseObserver);
        }

        /**
         */
        default void alterCollection(io.milvus.grpc.AlterCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlterCollectionMethod(), responseObserver);
        }

        /**
         */
        default void createPartition(io.milvus.grpc.CreatePartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePartitionMethod(), responseObserver);
        }

        /**
         */
        default void dropPartition(io.milvus.grpc.DropPartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropPartitionMethod(), responseObserver);
        }

        /**
         */
        default void hasPartition(io.milvus.grpc.HasPartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHasPartitionMethod(), responseObserver);
        }

        /**
         */
        default void loadPartitions(io.milvus.grpc.LoadPartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadPartitionsMethod(), responseObserver);
        }

        /**
         */
        default void releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleasePartitionsMethod(), responseObserver);
        }

        /**
         */
        default void getPartitionStatistics(io.milvus.grpc.GetPartitionStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetPartitionStatisticsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPartitionStatisticsMethod(), responseObserver);
        }

        /**
         */
        default void showPartitions(io.milvus.grpc.ShowPartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ShowPartitionsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowPartitionsMethod(), responseObserver);
        }

        /**
         */
        default void getLoadingProgress(io.milvus.grpc.GetLoadingProgressRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadingProgressResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLoadingProgressMethod(), responseObserver);
        }

        /**
         */
        default void getLoadState(io.milvus.grpc.GetLoadStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLoadStateMethod(), responseObserver);
        }

        /**
         */
        default void createAlias(io.milvus.grpc.CreateAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAliasMethod(), responseObserver);
        }

        /**
         */
        default void dropAlias(io.milvus.grpc.DropAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropAliasMethod(), responseObserver);
        }

        /**
         */
        default void alterAlias(io.milvus.grpc.AlterAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlterAliasMethod(), responseObserver);
        }

        /**
         */
        default void describeAlias(io.milvus.grpc.DescribeAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeAliasResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAliasMethod(), responseObserver);
        }

        /**
         */
        default void listAliases(io.milvus.grpc.ListAliasesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListAliasesResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAliasesMethod(), responseObserver);
        }

        /**
         */
        default void createIndex(io.milvus.grpc.CreateIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIndexMethod(), responseObserver);
        }

        /**
         */
        default void alterIndex(io.milvus.grpc.AlterIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlterIndexMethod(), responseObserver);
        }

        /**
         */
        default void describeIndex(io.milvus.grpc.DescribeIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeIndexResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeIndexMethod(), responseObserver);
        }

        /**
         */
        default void getIndexStatistics(io.milvus.grpc.GetIndexStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStatisticsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIndexStatisticsMethod(), responseObserver);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        default void getIndexState(io.milvus.grpc.GetIndexStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIndexStateMethod(), responseObserver);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        default void getIndexBuildProgress(io.milvus.grpc.GetIndexBuildProgressRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexBuildProgressResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIndexBuildProgressMethod(), responseObserver);
        }

        /**
         */
        default void dropIndex(io.milvus.grpc.DropIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropIndexMethod(), responseObserver);
        }

        /**
         */
        default void insert(io.milvus.grpc.InsertRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
        }

        /**
         */
        default void delete(io.milvus.grpc.DeleteRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
        }

        /**
         */
        default void upsert(io.milvus.grpc.UpsertRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertMethod(), responseObserver);
        }

        /**
         */
        default void search(io.milvus.grpc.SearchRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SearchResults> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
        }

        /**
         */
        default void flush(io.milvus.grpc.FlushRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.FlushResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
        }

        /**
         */
        default void query(io.milvus.grpc.QueryRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.QueryResults> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
        }

        /**
         */
        default void calcDistance(io.milvus.grpc.CalcDistanceRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.CalcDistanceResults> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalcDistanceMethod(), responseObserver);
        }

        /**
         */
        default void flushAll(io.milvus.grpc.FlushAllRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.FlushAllResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushAllMethod(), responseObserver);
        }

        /**
         */
        default void getFlushState(io.milvus.grpc.GetFlushStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlushStateMethod(), responseObserver);
        }

        /**
         */
        default void getFlushAllState(io.milvus.grpc.GetFlushAllStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushAllStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlushAllStateMethod(), responseObserver);
        }

        /**
         */
        default void getPersistentSegmentInfo(io.milvus.grpc.GetPersistentSegmentInfoRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetPersistentSegmentInfoResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPersistentSegmentInfoMethod(), responseObserver);
        }

        /**
         */
        default void getQuerySegmentInfo(io.milvus.grpc.GetQuerySegmentInfoRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetQuerySegmentInfoResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuerySegmentInfoMethod(), responseObserver);
        }

        /**
         */
        default void getReplicas(io.milvus.grpc.GetReplicasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetReplicasResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReplicasMethod(), responseObserver);
        }

        /**
         */
        default void dummy(io.milvus.grpc.DummyRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DummyResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDummyMethod(), responseObserver);
        }

        /**
         * <pre>
         * TODO: remove
         * </pre>
         */
        default void registerLink(io.milvus.grpc.RegisterLinkRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterLinkMethod(), responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        default void getMetrics(io.milvus.grpc.GetMetricsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetMetricsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetricsMethod(), responseObserver);
        }

        /**
         */
        default void getComponentStates(io.milvus.grpc.GetComponentStatesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ComponentStates> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetComponentStatesMethod(), responseObserver);
        }

        /**
         */
        default void loadBalance(io.milvus.grpc.LoadBalanceRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadBalanceMethod(), responseObserver);
        }

        /**
         */
        default void getCompactionState(io.milvus.grpc.GetCompactionStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompactionStateMethod(), responseObserver);
        }

        /**
         */
        default void manualCompaction(io.milvus.grpc.ManualCompactionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ManualCompactionResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getManualCompactionMethod(), responseObserver);
        }

        /**
         */
        default void getCompactionStateWithPlans(io.milvus.grpc.GetCompactionPlansRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionPlansResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCompactionStateWithPlansMethod(), responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        default void import_(io.milvus.grpc.ImportRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ImportResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportMethod(), responseObserver);
        }

        /**
         */
        default void getImportState(io.milvus.grpc.GetImportStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetImportStateResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImportStateMethod(), responseObserver);
        }

        /**
         */
        default void listImportTasks(io.milvus.grpc.ListImportTasksRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListImportTasksResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImportTasksMethod(), responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        default void createCredential(io.milvus.grpc.CreateCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCredentialMethod(), responseObserver);
        }

        /**
         */
        default void updateCredential(io.milvus.grpc.UpdateCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCredentialMethod(), responseObserver);
        }

        /**
         */
        default void deleteCredential(io.milvus.grpc.DeleteCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCredentialMethod(), responseObserver);
        }

        /**
         */
        default void listCredUsers(io.milvus.grpc.ListCredUsersRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListCredUsersResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListCredUsersMethod(), responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        default void createRole(io.milvus.grpc.CreateRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
        }

        /**
         */
        default void dropRole(io.milvus.grpc.DropRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropRoleMethod(), responseObserver);
        }

        /**
         */
        default void operateUserRole(io.milvus.grpc.OperateUserRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperateUserRoleMethod(), responseObserver);
        }

        /**
         */
        default void selectRole(io.milvus.grpc.SelectRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectRoleResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectRoleMethod(), responseObserver);
        }

        /**
         */
        default void selectUser(io.milvus.grpc.SelectUserRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectUserResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectUserMethod(), responseObserver);
        }

        /**
         */
        default void operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOperatePrivilegeMethod(), responseObserver);
        }

        /**
         */
        default void selectGrant(io.milvus.grpc.SelectGrantRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectGrantResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSelectGrantMethod(), responseObserver);
        }

        /**
         */
        default void getVersion(io.milvus.grpc.GetVersionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetVersionResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVersionMethod(), responseObserver);
        }

        /**
         */
        default void checkHealth(io.milvus.grpc.CheckHealthRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.CheckHealthResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckHealthMethod(), responseObserver);
        }

        /**
         */
        default void createResourceGroup(io.milvus.grpc.CreateResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateResourceGroupMethod(), responseObserver);
        }

        /**
         */
        default void dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropResourceGroupMethod(), responseObserver);
        }

        /**
         */
        default void transferNode(io.milvus.grpc.TransferNodeRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferNodeMethod(), responseObserver);
        }

        /**
         */
        default void transferReplica(io.milvus.grpc.TransferReplicaRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferReplicaMethod(), responseObserver);
        }

        /**
         */
        default void listResourceGroups(io.milvus.grpc.ListResourceGroupsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListResourceGroupsResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourceGroupsMethod(), responseObserver);
        }

        /**
         */
        default void describeResourceGroup(io.milvus.grpc.DescribeResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeResourceGroupResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeResourceGroupMethod(), responseObserver);
        }

        /**
         */
        default void renameCollection(io.milvus.grpc.RenameCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameCollectionMethod(), responseObserver);
        }

        /**
         */
        default void listIndexedSegment(milvus.proto.feder.Feder.ListIndexedSegmentRequest request,
                io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.ListIndexedSegmentResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIndexedSegmentMethod(), responseObserver);
        }

        /**
         */
        default void describeSegmentIndexData(milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request,
                io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSegmentIndexDataMethod(), responseObserver);
        }

        /**
         */
        default void connect(io.milvus.grpc.ConnectRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ConnectResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
        }

        /**
         */
        default void allocTimestamp(io.milvus.grpc.AllocTimestampRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.AllocTimestampResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAllocTimestampMethod(), responseObserver);
        }

        /**
         */
        default void createDatabase(io.milvus.grpc.CreateDatabaseRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDatabaseMethod(), responseObserver);
        }

        /**
         */
        default void dropDatabase(io.milvus.grpc.DropDatabaseRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDropDatabaseMethod(), responseObserver);
        }

        /**
         */
        default void listDatabases(io.milvus.grpc.ListDatabasesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListDatabasesResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDatabasesMethod(), responseObserver);
        }

        /**
         */
        default void replicateMessage(io.milvus.grpc.ReplicateMessageRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ReplicateMessageResponse> responseObserver) {
            io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplicateMessageMethod(), responseObserver);
        }
    }

    /**
     * Base class for the server implementation of the service MilvusService.
     */
    public static abstract class MilvusServiceImplBase implements io.grpc.BindableService, AsyncService {

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return MilvusServiceGrpc.bindService(this);
        }
    }

    /**
     * A stub to allow clients to do asynchronous rpc calls to service MilvusService.
     */
    public static class MilvusServiceStub extends io.grpc.stub.AbstractAsyncStub<MilvusServiceStub> {

        private MilvusServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MilvusServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MilvusServiceStub(channel, callOptions);
        }

        /**
         */
        public void createCollection(io.milvus.grpc.CreateCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateCollectionMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void dropCollection(io.milvus.grpc.DropCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropCollectionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void hasCollection(io.milvus.grpc.HasCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getHasCollectionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void loadCollection(io.milvus.grpc.LoadCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getLoadCollectionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getReleaseCollectionMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void describeCollection(io.milvus.grpc.DescribeCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeCollectionResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDescribeCollectionMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getCollectionStatistics(io.milvus.grpc.GetCollectionStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCollectionStatisticsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetCollectionStatisticsMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void showCollections(io.milvus.grpc.ShowCollectionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ShowCollectionsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getShowCollectionsMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void alterCollection(io.milvus.grpc.AlterCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAlterCollectionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void createPartition(io.milvus.grpc.CreatePartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreatePartitionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void dropPartition(io.milvus.grpc.DropPartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropPartitionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void hasPartition(io.milvus.grpc.HasPartitionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getHasPartitionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void loadPartitions(io.milvus.grpc.LoadPartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getLoadPartitionsMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getReleasePartitionsMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getPartitionStatistics(io.milvus.grpc.GetPartitionStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetPartitionStatisticsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPartitionStatisticsMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void showPartitions(io.milvus.grpc.ShowPartitionsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ShowPartitionsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getShowPartitionsMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getLoadingProgress(io.milvus.grpc.GetLoadingProgressRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadingProgressResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetLoadingProgressMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getLoadState(io.milvus.grpc.GetLoadStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetLoadStateMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void createAlias(io.milvus.grpc.CreateAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateAliasMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void dropAlias(io.milvus.grpc.DropAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropAliasMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void alterAlias(io.milvus.grpc.AlterAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAlterAliasMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void describeAlias(io.milvus.grpc.DescribeAliasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeAliasResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDescribeAliasMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void listAliases(io.milvus.grpc.ListAliasesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListAliasesResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListAliasesMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void createIndex(io.milvus.grpc.CreateIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateIndexMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void alterIndex(io.milvus.grpc.AlterIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAlterIndexMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void describeIndex(io.milvus.grpc.DescribeIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeIndexResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDescribeIndexMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getIndexStatistics(io.milvus.grpc.GetIndexStatisticsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStatisticsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetIndexStatisticsMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public void getIndexState(io.milvus.grpc.GetIndexStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetIndexStateMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public void getIndexBuildProgress(io.milvus.grpc.GetIndexBuildProgressRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexBuildProgressResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetIndexBuildProgressMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void dropIndex(io.milvus.grpc.DropIndexRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropIndexMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void insert(io.milvus.grpc.InsertRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getInsertMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void delete(io.milvus.grpc.DeleteRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeleteMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void upsert(io.milvus.grpc.UpsertRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUpsertMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void search(io.milvus.grpc.SearchRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SearchResults> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSearchMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void flush(io.milvus.grpc.FlushRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.FlushResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFlushMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void query(io.milvus.grpc.QueryRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.QueryResults> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getQueryMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void calcDistance(io.milvus.grpc.CalcDistanceRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.CalcDistanceResults> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCalcDistanceMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void flushAll(io.milvus.grpc.FlushAllRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.FlushAllResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getFlushAllMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getFlushState(io.milvus.grpc.GetFlushStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetFlushStateMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getFlushAllState(io.milvus.grpc.GetFlushAllStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushAllStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetFlushAllStateMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getPersistentSegmentInfo(io.milvus.grpc.GetPersistentSegmentInfoRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetPersistentSegmentInfoResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetPersistentSegmentInfoMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getQuerySegmentInfo(io.milvus.grpc.GetQuerySegmentInfoRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetQuerySegmentInfoResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetQuerySegmentInfoMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getReplicas(io.milvus.grpc.GetReplicasRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetReplicasResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetReplicasMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void dummy(io.milvus.grpc.DummyRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DummyResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDummyMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         * <pre>
         * TODO: remove
         * </pre>
         */
        public void registerLink(io.milvus.grpc.RegisterLinkRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getRegisterLinkMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        public void getMetrics(io.milvus.grpc.GetMetricsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetMetricsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetMetricsMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getComponentStates(io.milvus.grpc.GetComponentStatesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ComponentStates> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetComponentStatesMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void loadBalance(io.milvus.grpc.LoadBalanceRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getLoadBalanceMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getCompactionState(io.milvus.grpc.GetCompactionStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetCompactionStateMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void manualCompaction(io.milvus.grpc.ManualCompactionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ManualCompactionResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getManualCompactionMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void getCompactionStateWithPlans(io.milvus.grpc.GetCompactionPlansRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionPlansResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(
                    getChannel().newCall(getGetCompactionStateWithPlansMethod(), getCallOptions()), request, responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        public void import_(io.milvus.grpc.ImportRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ImportResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getImportMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getImportState(io.milvus.grpc.GetImportStateRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetImportStateResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetImportStateMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void listImportTasks(io.milvus.grpc.ListImportTasksRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListImportTasksResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListImportTasksMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        public void createCredential(io.milvus.grpc.CreateCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateCredentialMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void updateCredential(io.milvus.grpc.UpdateCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void deleteCredential(io.milvus.grpc.DeleteCredentialRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void listCredUsers(io.milvus.grpc.ListCredUsersRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListCredUsersResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListCredUsersMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        public void createRole(io.milvus.grpc.CreateRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void dropRole(io.milvus.grpc.DropRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropRoleMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void operateUserRole(io.milvus.grpc.OperateUserRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getOperateUserRoleMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void selectRole(io.milvus.grpc.SelectRoleRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectRoleResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSelectRoleMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void selectUser(io.milvus.grpc.SelectUserRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectUserResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSelectUserMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getOperatePrivilegeMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void selectGrant(io.milvus.grpc.SelectGrantRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.SelectGrantResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getSelectGrantMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void getVersion(io.milvus.grpc.GetVersionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.GetVersionResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getGetVersionMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void checkHealth(io.milvus.grpc.CheckHealthRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.CheckHealthResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCheckHealthMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void createResourceGroup(io.milvus.grpc.CreateResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateResourceGroupMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropResourceGroupMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void transferNode(io.milvus.grpc.TransferNodeRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getTransferNodeMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void transferReplica(io.milvus.grpc.TransferReplicaRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getTransferReplicaMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void listResourceGroups(io.milvus.grpc.ListResourceGroupsRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListResourceGroupsResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListResourceGroupsMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void describeResourceGroup(io.milvus.grpc.DescribeResourceGroupRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeResourceGroupResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDescribeResourceGroupMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void renameCollection(io.milvus.grpc.RenameCollectionRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getRenameCollectionMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void listIndexedSegment(milvus.proto.feder.Feder.ListIndexedSegmentRequest request,
                io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.ListIndexedSegmentResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListIndexedSegmentMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void describeSegmentIndexData(milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request,
                io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDescribeSegmentIndexDataMethod(), getCallOptions()),
                    request, responseObserver);
        }

        /**
         */
        public void connect(io.milvus.grpc.ConnectRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ConnectResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getConnectMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void allocTimestamp(io.milvus.grpc.AllocTimestampRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.AllocTimestampResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getAllocTimestampMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void createDatabase(io.milvus.grpc.CreateDatabaseRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getCreateDatabaseMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void dropDatabase(io.milvus.grpc.DropDatabaseRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.Status> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getDropDatabaseMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void listDatabases(io.milvus.grpc.ListDatabasesRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ListDatabasesResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getListDatabasesMethod(), getCallOptions()), request,
                    responseObserver);
        }

        /**
         */
        public void replicateMessage(io.milvus.grpc.ReplicateMessageRequest request,
                io.grpc.stub.StreamObserver<io.milvus.grpc.ReplicateMessageResponse> responseObserver) {
            io.grpc.stub.ClientCalls.asyncUnaryCall(getChannel().newCall(getReplicateMessageMethod(), getCallOptions()),
                    request, responseObserver);
        }
    }

    /**
     * A stub to allow clients to do synchronous rpc calls to service MilvusService.
     */
    public static class MilvusServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MilvusServiceBlockingStub> {

        private MilvusServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MilvusServiceBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MilvusServiceBlockingStub(channel, callOptions);
        }

        /**
         */
        public io.milvus.grpc.Status createCollection(io.milvus.grpc.CreateCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status dropCollection(io.milvus.grpc.DropCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.BoolResponse hasCollection(io.milvus.grpc.HasCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getHasCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status loadCollection(io.milvus.grpc.LoadCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getLoadCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getReleaseCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.DescribeCollectionResponse describeCollection(io.milvus.grpc.DescribeCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDescribeCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetCollectionStatisticsResponse getCollectionStatistics(
                io.milvus.grpc.GetCollectionStatisticsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetCollectionStatisticsMethod(),
                    getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.ShowCollectionsResponse showCollections(io.milvus.grpc.ShowCollectionsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getShowCollectionsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status alterCollection(io.milvus.grpc.AlterCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAlterCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status createPartition(io.milvus.grpc.CreatePartitionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreatePartitionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status dropPartition(io.milvus.grpc.DropPartitionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropPartitionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.BoolResponse hasPartition(io.milvus.grpc.HasPartitionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getHasPartitionMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status loadPartitions(io.milvus.grpc.LoadPartitionsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getLoadPartitionsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getReleasePartitionsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetPartitionStatisticsResponse getPartitionStatistics(
                io.milvus.grpc.GetPartitionStatisticsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPartitionStatisticsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ShowPartitionsResponse showPartitions(io.milvus.grpc.ShowPartitionsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getShowPartitionsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetLoadingProgressResponse getLoadingProgress(io.milvus.grpc.GetLoadingProgressRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetLoadingProgressMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetLoadStateResponse getLoadState(io.milvus.grpc.GetLoadStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetLoadStateMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status createAlias(io.milvus.grpc.CreateAliasRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateAliasMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status dropAlias(io.milvus.grpc.DropAliasRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropAliasMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status alterAlias(io.milvus.grpc.AlterAliasRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAlterAliasMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.DescribeAliasResponse describeAlias(io.milvus.grpc.DescribeAliasRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDescribeAliasMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ListAliasesResponse listAliases(io.milvus.grpc.ListAliasesRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListAliasesMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status createIndex(io.milvus.grpc.CreateIndexRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateIndexMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status alterIndex(io.milvus.grpc.AlterIndexRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAlterIndexMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.DescribeIndexResponse describeIndex(io.milvus.grpc.DescribeIndexRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDescribeIndexMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetIndexStatisticsResponse getIndexStatistics(io.milvus.grpc.GetIndexStatisticsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetIndexStatisticsMethod(), getCallOptions(),
                    request);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public io.milvus.grpc.GetIndexStateResponse getIndexState(io.milvus.grpc.GetIndexStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetIndexStateMethod(), getCallOptions(),
                    request);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public io.milvus.grpc.GetIndexBuildProgressResponse getIndexBuildProgress(
                io.milvus.grpc.GetIndexBuildProgressRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetIndexBuildProgressMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status dropIndex(io.milvus.grpc.DropIndexRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropIndexMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.MutationResult insert(io.milvus.grpc.InsertRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getInsertMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.MutationResult delete(io.milvus.grpc.DeleteRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeleteMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.MutationResult upsert(io.milvus.grpc.UpsertRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUpsertMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.SearchResults search(io.milvus.grpc.SearchRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSearchMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.FlushResponse flush(io.milvus.grpc.FlushRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFlushMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.QueryResults query(io.milvus.grpc.QueryRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getQueryMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.CalcDistanceResults calcDistance(io.milvus.grpc.CalcDistanceRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCalcDistanceMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.FlushAllResponse flushAll(io.milvus.grpc.FlushAllRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getFlushAllMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.GetFlushStateResponse getFlushState(io.milvus.grpc.GetFlushStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetFlushStateMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetFlushAllStateResponse getFlushAllState(io.milvus.grpc.GetFlushAllStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetFlushAllStateMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetPersistentSegmentInfoResponse getPersistentSegmentInfo(
                io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetPersistentSegmentInfoMethod(),
                    getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.GetQuerySegmentInfoResponse getQuerySegmentInfo(
                io.milvus.grpc.GetQuerySegmentInfoRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetQuerySegmentInfoMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetReplicasResponse getReplicas(io.milvus.grpc.GetReplicasRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetReplicasMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.DummyResponse dummy(io.milvus.grpc.DummyRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDummyMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * TODO: remove
         * </pre>
         */
        public io.milvus.grpc.RegisterLinkResponse registerLink(io.milvus.grpc.RegisterLinkRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getRegisterLinkMethod(), getCallOptions(), request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        public io.milvus.grpc.GetMetricsResponse getMetrics(io.milvus.grpc.GetMetricsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetMetricsMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.ComponentStates getComponentStates(io.milvus.grpc.GetComponentStatesRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetComponentStatesMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status loadBalance(io.milvus.grpc.LoadBalanceRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getLoadBalanceMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.GetCompactionStateResponse getCompactionState(io.milvus.grpc.GetCompactionStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetCompactionStateMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ManualCompactionResponse manualCompaction(io.milvus.grpc.ManualCompactionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getManualCompactionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.GetCompactionPlansResponse getCompactionStateWithPlans(
                io.milvus.grpc.GetCompactionPlansRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetCompactionStateWithPlansMethod(),
                    getCallOptions(), request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        public io.milvus.grpc.ImportResponse import_(io.milvus.grpc.ImportRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getImportMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.GetImportStateResponse getImportState(io.milvus.grpc.GetImportStateRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetImportStateMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ListImportTasksResponse listImportTasks(io.milvus.grpc.ListImportTasksRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListImportTasksMethod(), getCallOptions(),
                    request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        public io.milvus.grpc.Status createCredential(io.milvus.grpc.CreateCredentialRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateCredentialMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status updateCredential(io.milvus.grpc.UpdateCredentialRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUpdateCredentialMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status deleteCredential(io.milvus.grpc.DeleteCredentialRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDeleteCredentialMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ListCredUsersResponse listCredUsers(io.milvus.grpc.ListCredUsersRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListCredUsersMethod(), getCallOptions(),
                    request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        public io.milvus.grpc.Status createRole(io.milvus.grpc.CreateRoleRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateRoleMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status dropRole(io.milvus.grpc.DropRoleRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropRoleMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status operateUserRole(io.milvus.grpc.OperateUserRoleRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getOperateUserRoleMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.SelectRoleResponse selectRole(io.milvus.grpc.SelectRoleRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSelectRoleMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.SelectUserResponse selectUser(io.milvus.grpc.SelectUserRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSelectUserMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getOperatePrivilegeMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.SelectGrantResponse selectGrant(io.milvus.grpc.SelectGrantRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getSelectGrantMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.GetVersionResponse getVersion(io.milvus.grpc.GetVersionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getGetVersionMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.CheckHealthResponse checkHealth(io.milvus.grpc.CheckHealthRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCheckHealthMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status createResourceGroup(io.milvus.grpc.CreateResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateResourceGroupMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropResourceGroupMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status transferNode(io.milvus.grpc.TransferNodeRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getTransferNodeMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.Status transferReplica(io.milvus.grpc.TransferReplicaRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getTransferReplicaMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ListResourceGroupsResponse listResourceGroups(io.milvus.grpc.ListResourceGroupsRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListResourceGroupsMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.DescribeResourceGroupResponse describeResourceGroup(
                io.milvus.grpc.DescribeResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDescribeResourceGroupMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status renameCollection(io.milvus.grpc.RenameCollectionRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getRenameCollectionMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public milvus.proto.feder.Feder.ListIndexedSegmentResponse listIndexedSegment(
                milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListIndexedSegmentMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse describeSegmentIndexData(
                milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDescribeSegmentIndexDataMethod(),
                    getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.ConnectResponse connect(io.milvus.grpc.ConnectRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getConnectMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.AllocTimestampResponse allocTimestamp(io.milvus.grpc.AllocTimestampRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getAllocTimestampMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status createDatabase(io.milvus.grpc.CreateDatabaseRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getCreateDatabaseMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.Status dropDatabase(io.milvus.grpc.DropDatabaseRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getDropDatabaseMethod(), getCallOptions(), request);
        }

        /**
         */
        public io.milvus.grpc.ListDatabasesResponse listDatabases(io.milvus.grpc.ListDatabasesRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getListDatabasesMethod(), getCallOptions(),
                    request);
        }

        /**
         */
        public io.milvus.grpc.ReplicateMessageResponse replicateMessage(io.milvus.grpc.ReplicateMessageRequest request) {
            return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getReplicateMessageMethod(), getCallOptions(),
                    request);
        }
    }

    /**
     * A stub to allow clients to do ListenableFuture-style rpc calls to service MilvusService.
     */
    public static class MilvusServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MilvusServiceFutureStub> {

        private MilvusServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
        }

        @java.lang.Override
        protected MilvusServiceFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MilvusServiceFutureStub(channel, callOptions);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createCollection(
                io.milvus.grpc.CreateCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropCollection(
                io.milvus.grpc.DropCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.BoolResponse> hasCollection(
                io.milvus.grpc.HasCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getHasCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> loadCollection(
                io.milvus.grpc.LoadCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getLoadCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> releaseCollection(
                io.milvus.grpc.ReleaseCollectionRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getReleaseCollectionMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
                io.milvus.grpc.DescribeCollectionRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getDescribeCollectionMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
                io.milvus.grpc.GetCollectionStatisticsRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetCollectionStatisticsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ShowCollectionsResponse> showCollections(
                io.milvus.grpc.ShowCollectionsRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getShowCollectionsMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> alterCollection(
                io.milvus.grpc.AlterCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAlterCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createPartition(
                io.milvus.grpc.CreatePartitionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreatePartitionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropPartition(
                io.milvus.grpc.DropPartitionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropPartitionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.BoolResponse> hasPartition(
                io.milvus.grpc.HasPartitionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getHasPartitionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> loadPartitions(
                io.milvus.grpc.LoadPartitionsRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getLoadPartitionsMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> releasePartitions(
                io.milvus.grpc.ReleasePartitionsRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getReleasePartitionsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
                io.milvus.grpc.GetPartitionStatisticsRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetPartitionStatisticsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ShowPartitionsResponse> showPartitions(
                io.milvus.grpc.ShowPartitionsRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getShowPartitionsMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
                io.milvus.grpc.GetLoadingProgressRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetLoadingProgressMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetLoadStateResponse> getLoadState(
                io.milvus.grpc.GetLoadStateRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetLoadStateMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createAlias(
                io.milvus.grpc.CreateAliasRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateAliasMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropAlias(
                io.milvus.grpc.DropAliasRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropAliasMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> alterAlias(
                io.milvus.grpc.AlterAliasRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAlterAliasMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.DescribeAliasResponse> describeAlias(
                io.milvus.grpc.DescribeAliasRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDescribeAliasMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ListAliasesResponse> listAliases(
                io.milvus.grpc.ListAliasesRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getListAliasesMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createIndex(
                io.milvus.grpc.CreateIndexRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateIndexMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> alterIndex(
                io.milvus.grpc.AlterIndexRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAlterIndexMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.DescribeIndexResponse> describeIndex(
                io.milvus.grpc.DescribeIndexRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDescribeIndexMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
                io.milvus.grpc.GetIndexStatisticsRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetIndexStatisticsMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetIndexStateResponse> getIndexState(
                io.milvus.grpc.GetIndexStateRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetIndexStateMethod(), getCallOptions()),
                    request);
        }

        /**
         * <pre>
         * Deprecated: use DescribeIndex instead
         * </pre>
         */
        @java.lang.Deprecated
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
                io.milvus.grpc.GetIndexBuildProgressRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetIndexBuildProgressMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropIndex(
                io.milvus.grpc.DropIndexRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropIndexMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.MutationResult> insert(
                io.milvus.grpc.InsertRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getInsertMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.MutationResult> delete(
                io.milvus.grpc.DeleteRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.MutationResult> upsert(
                io.milvus.grpc.UpsertRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUpsertMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.SearchResults> search(
                io.milvus.grpc.SearchRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSearchMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.FlushResponse> flush(
                io.milvus.grpc.FlushRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFlushMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.QueryResults> query(
                io.milvus.grpc.QueryRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getQueryMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.CalcDistanceResults> calcDistance(
                io.milvus.grpc.CalcDistanceRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCalcDistanceMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.FlushAllResponse> flushAll(
                io.milvus.grpc.FlushAllRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getFlushAllMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetFlushStateResponse> getFlushState(
                io.milvus.grpc.GetFlushStateRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetFlushStateMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
                io.milvus.grpc.GetFlushAllStateRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetFlushAllStateMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
                io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetPersistentSegmentInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
                io.milvus.grpc.GetQuerySegmentInfoRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetQuerySegmentInfoMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetReplicasResponse> getReplicas(
                io.milvus.grpc.GetReplicasRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetReplicasMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.DummyResponse> dummy(
                io.milvus.grpc.DummyRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDummyMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * TODO: remove
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getRegisterLinkMethod(), getCallOptions()),
                    request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetMetricsResponse> getMetrics(
                io.milvus.grpc.GetMetricsRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetMetricsMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ComponentStates> getComponentStates(
                io.milvus.grpc.GetComponentStatesRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetComponentStatesMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> loadBalance(
                io.milvus.grpc.LoadBalanceRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getLoadBalanceMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
                io.milvus.grpc.GetCompactionStateRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetCompactionStateMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
                io.milvus.grpc.ManualCompactionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getManualCompactionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
                io.milvus.grpc.GetCompactionPlansRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getGetCompactionStateWithPlansMethod(), getCallOptions()), request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ImportResponse> import_(
                io.milvus.grpc.ImportRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getImportMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetImportStateResponse> getImportState(
                io.milvus.grpc.GetImportStateRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetImportStateMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
                io.milvus.grpc.ListImportTasksRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getListImportTasksMethod(), getCallOptions()),
                    request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createCredential(
                io.milvus.grpc.CreateCredentialRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateCredentialMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> updateCredential(
                io.milvus.grpc.UpdateCredentialRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUpdateCredentialMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> deleteCredential(
                io.milvus.grpc.DeleteCredentialRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDeleteCredentialMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ListCredUsersResponse> listCredUsers(
                io.milvus.grpc.ListCredUsersRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getListCredUsersMethod(), getCallOptions()),
                    request);
        }

        /**
         * <pre>
         * https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createRole(
                io.milvus.grpc.CreateRoleRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateRoleMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropRole(
                io.milvus.grpc.DropRoleRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropRoleMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> operateUserRole(
                io.milvus.grpc.OperateUserRoleRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getOperateUserRoleMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.SelectRoleResponse> selectRole(
                io.milvus.grpc.SelectRoleRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSelectRoleMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.SelectUserResponse> selectUser(
                io.milvus.grpc.SelectUserRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSelectUserMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> operatePrivilege(
                io.milvus.grpc.OperatePrivilegeRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getOperatePrivilegeMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.SelectGrantResponse> selectGrant(
                io.milvus.grpc.SelectGrantRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getSelectGrantMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.GetVersionResponse> getVersion(
                io.milvus.grpc.GetVersionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getGetVersionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.CheckHealthResponse> checkHealth(
                io.milvus.grpc.CheckHealthRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCheckHealthMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createResourceGroup(
                io.milvus.grpc.CreateResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getCreateResourceGroupMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropResourceGroup(
                io.milvus.grpc.DropResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getDropResourceGroupMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> transferNode(
                io.milvus.grpc.TransferNodeRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getTransferNodeMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> transferReplica(
                io.milvus.grpc.TransferReplicaRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getTransferReplicaMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
                io.milvus.grpc.ListResourceGroupsRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getListResourceGroupsMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
                io.milvus.grpc.DescribeResourceGroupRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getDescribeResourceGroupMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> renameCollection(
                io.milvus.grpc.RenameCollectionRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getRenameCollectionMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
                milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getListIndexedSegmentMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
                milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
            return io.grpc.stub.ClientCalls
                    .futureUnaryCall(getChannel().newCall(getDescribeSegmentIndexDataMethod(), getCallOptions()), request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ConnectResponse> connect(
                io.milvus.grpc.ConnectRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getConnectMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(
                io.milvus.grpc.AllocTimestampRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getAllocTimestampMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> createDatabase(
                io.milvus.grpc.CreateDatabaseRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getCreateDatabaseMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.Status> dropDatabase(
                io.milvus.grpc.DropDatabaseRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getDropDatabaseMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ListDatabasesResponse> listDatabases(
                io.milvus.grpc.ListDatabasesRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getListDatabasesMethod(), getCallOptions()),
                    request);
        }

        /**
         */
        public com.google.common.util.concurrent.ListenableFuture<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
                io.milvus.grpc.ReplicateMessageRequest request) {
            return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getReplicateMessageMethod(), getCallOptions()),
                    request);
        }
    }

    private static final int METHODID_CREATE_COLLECTION = 0;

    private static final int METHODID_DROP_COLLECTION = 1;

    private static final int METHODID_HAS_COLLECTION = 2;

    private static final int METHODID_LOAD_COLLECTION = 3;

    private static final int METHODID_RELEASE_COLLECTION = 4;

    private static final int METHODID_DESCRIBE_COLLECTION = 5;

    private static final int METHODID_GET_COLLECTION_STATISTICS = 6;

    private static final int METHODID_SHOW_COLLECTIONS = 7;

    private static final int METHODID_ALTER_COLLECTION = 8;

    private static final int METHODID_CREATE_PARTITION = 9;

    private static final int METHODID_DROP_PARTITION = 10;

    private static final int METHODID_HAS_PARTITION = 11;

    private static final int METHODID_LOAD_PARTITIONS = 12;

    private static final int METHODID_RELEASE_PARTITIONS = 13;

    private static final int METHODID_GET_PARTITION_STATISTICS = 14;

    private static final int METHODID_SHOW_PARTITIONS = 15;

    private static final int METHODID_GET_LOADING_PROGRESS = 16;

    private static final int METHODID_GET_LOAD_STATE = 17;

    private static final int METHODID_CREATE_ALIAS = 18;

    private static final int METHODID_DROP_ALIAS = 19;

    private static final int METHODID_ALTER_ALIAS = 20;

    private static final int METHODID_DESCRIBE_ALIAS = 21;

    private static final int METHODID_LIST_ALIASES = 22;

    private static final int METHODID_CREATE_INDEX = 23;

    private static final int METHODID_ALTER_INDEX = 24;

    private static final int METHODID_DESCRIBE_INDEX = 25;

    private static final int METHODID_GET_INDEX_STATISTICS = 26;

    private static final int METHODID_GET_INDEX_STATE = 27;

    private static final int METHODID_GET_INDEX_BUILD_PROGRESS = 28;

    private static final int METHODID_DROP_INDEX = 29;

    private static final int METHODID_INSERT = 30;

    private static final int METHODID_DELETE = 31;

    private static final int METHODID_UPSERT = 32;

    private static final int METHODID_SEARCH = 33;

    private static final int METHODID_FLUSH = 34;

    private static final int METHODID_QUERY = 35;

    private static final int METHODID_CALC_DISTANCE = 36;

    private static final int METHODID_FLUSH_ALL = 37;

    private static final int METHODID_GET_FLUSH_STATE = 38;

    private static final int METHODID_GET_FLUSH_ALL_STATE = 39;

    private static final int METHODID_GET_PERSISTENT_SEGMENT_INFO = 40;

    private static final int METHODID_GET_QUERY_SEGMENT_INFO = 41;

    private static final int METHODID_GET_REPLICAS = 42;

    private static final int METHODID_DUMMY = 43;

    private static final int METHODID_REGISTER_LINK = 44;

    private static final int METHODID_GET_METRICS = 45;

    private static final int METHODID_GET_COMPONENT_STATES = 46;

    private static final int METHODID_LOAD_BALANCE = 47;

    private static final int METHODID_GET_COMPACTION_STATE = 48;

    private static final int METHODID_MANUAL_COMPACTION = 49;

    private static final int METHODID_GET_COMPACTION_STATE_WITH_PLANS = 50;

    private static final int METHODID_IMPORT = 51;

    private static final int METHODID_GET_IMPORT_STATE = 52;

    private static final int METHODID_LIST_IMPORT_TASKS = 53;

    private static final int METHODID_CREATE_CREDENTIAL = 54;

    private static final int METHODID_UPDATE_CREDENTIAL = 55;

    private static final int METHODID_DELETE_CREDENTIAL = 56;

    private static final int METHODID_LIST_CRED_USERS = 57;

    private static final int METHODID_CREATE_ROLE = 58;

    private static final int METHODID_DROP_ROLE = 59;

    private static final int METHODID_OPERATE_USER_ROLE = 60;

    private static final int METHODID_SELECT_ROLE = 61;

    private static final int METHODID_SELECT_USER = 62;

    private static final int METHODID_OPERATE_PRIVILEGE = 63;

    private static final int METHODID_SELECT_GRANT = 64;

    private static final int METHODID_GET_VERSION = 65;

    private static final int METHODID_CHECK_HEALTH = 66;

    private static final int METHODID_CREATE_RESOURCE_GROUP = 67;

    private static final int METHODID_DROP_RESOURCE_GROUP = 68;

    private static final int METHODID_TRANSFER_NODE = 69;

    private static final int METHODID_TRANSFER_REPLICA = 70;

    private static final int METHODID_LIST_RESOURCE_GROUPS = 71;

    private static final int METHODID_DESCRIBE_RESOURCE_GROUP = 72;

    private static final int METHODID_RENAME_COLLECTION = 73;

    private static final int METHODID_LIST_INDEXED_SEGMENT = 74;

    private static final int METHODID_DESCRIBE_SEGMENT_INDEX_DATA = 75;

    private static final int METHODID_CONNECT = 76;

    private static final int METHODID_ALLOC_TIMESTAMP = 77;

    private static final int METHODID_CREATE_DATABASE = 78;

    private static final int METHODID_DROP_DATABASE = 79;

    private static final int METHODID_LIST_DATABASES = 80;

    private static final int METHODID_REPLICATE_MESSAGE = 81;

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
                case METHODID_CREATE_COLLECTION:
                    serviceImpl.createCollection((io.milvus.grpc.CreateCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_COLLECTION:
                    serviceImpl.dropCollection((io.milvus.grpc.DropCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_HAS_COLLECTION:
                    serviceImpl.hasCollection((io.milvus.grpc.HasCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse>) responseObserver);
                    break;
                case METHODID_LOAD_COLLECTION:
                    serviceImpl.loadCollection((io.milvus.grpc.LoadCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_RELEASE_COLLECTION:
                    serviceImpl.releaseCollection((io.milvus.grpc.ReleaseCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DESCRIBE_COLLECTION:
                    serviceImpl.describeCollection((io.milvus.grpc.DescribeCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeCollectionResponse>) responseObserver);
                    break;
                case METHODID_GET_COLLECTION_STATISTICS:
                    serviceImpl.getCollectionStatistics((io.milvus.grpc.GetCollectionStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCollectionStatisticsResponse>) responseObserver);
                    break;
                case METHODID_SHOW_COLLECTIONS:
                    serviceImpl.showCollections((io.milvus.grpc.ShowCollectionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ShowCollectionsResponse>) responseObserver);
                    break;
                case METHODID_ALTER_COLLECTION:
                    serviceImpl.alterCollection((io.milvus.grpc.AlterCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_CREATE_PARTITION:
                    serviceImpl.createPartition((io.milvus.grpc.CreatePartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_PARTITION:
                    serviceImpl.dropPartition((io.milvus.grpc.DropPartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_HAS_PARTITION:
                    serviceImpl.hasPartition((io.milvus.grpc.HasPartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse>) responseObserver);
                    break;
                case METHODID_LOAD_PARTITIONS:
                    serviceImpl.loadPartitions((io.milvus.grpc.LoadPartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_RELEASE_PARTITIONS:
                    serviceImpl.releasePartitions((io.milvus.grpc.ReleasePartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_GET_PARTITION_STATISTICS:
                    serviceImpl.getPartitionStatistics((io.milvus.grpc.GetPartitionStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetPartitionStatisticsResponse>) responseObserver);
                    break;
                case METHODID_SHOW_PARTITIONS:
                    serviceImpl.showPartitions((io.milvus.grpc.ShowPartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ShowPartitionsResponse>) responseObserver);
                    break;
                case METHODID_GET_LOADING_PROGRESS:
                    serviceImpl.getLoadingProgress((io.milvus.grpc.GetLoadingProgressRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadingProgressResponse>) responseObserver);
                    break;
                case METHODID_GET_LOAD_STATE:
                    serviceImpl.getLoadState((io.milvus.grpc.GetLoadStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadStateResponse>) responseObserver);
                    break;
                case METHODID_CREATE_ALIAS:
                    serviceImpl.createAlias((io.milvus.grpc.CreateAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_ALIAS:
                    serviceImpl.dropAlias((io.milvus.grpc.DropAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_ALTER_ALIAS:
                    serviceImpl.alterAlias((io.milvus.grpc.AlterAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DESCRIBE_ALIAS:
                    serviceImpl.describeAlias((io.milvus.grpc.DescribeAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeAliasResponse>) responseObserver);
                    break;
                case METHODID_LIST_ALIASES:
                    serviceImpl.listAliases((io.milvus.grpc.ListAliasesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListAliasesResponse>) responseObserver);
                    break;
                case METHODID_CREATE_INDEX:
                    serviceImpl.createIndex((io.milvus.grpc.CreateIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_ALTER_INDEX:
                    serviceImpl.alterIndex((io.milvus.grpc.AlterIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DESCRIBE_INDEX:
                    serviceImpl.describeIndex((io.milvus.grpc.DescribeIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeIndexResponse>) responseObserver);
                    break;
                case METHODID_GET_INDEX_STATISTICS:
                    serviceImpl.getIndexStatistics((io.milvus.grpc.GetIndexStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStatisticsResponse>) responseObserver);
                    break;
                case METHODID_GET_INDEX_STATE:
                    serviceImpl.getIndexState((io.milvus.grpc.GetIndexStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStateResponse>) responseObserver);
                    break;
                case METHODID_GET_INDEX_BUILD_PROGRESS:
                    serviceImpl.getIndexBuildProgress((io.milvus.grpc.GetIndexBuildProgressRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexBuildProgressResponse>) responseObserver);
                    break;
                case METHODID_DROP_INDEX:
                    serviceImpl.dropIndex((io.milvus.grpc.DropIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_INSERT:
                    serviceImpl.insert((io.milvus.grpc.InsertRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver);
                    break;
                case METHODID_DELETE:
                    serviceImpl.delete((io.milvus.grpc.DeleteRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver);
                    break;
                case METHODID_UPSERT:
                    serviceImpl.upsert((io.milvus.grpc.UpsertRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver);
                    break;
                case METHODID_SEARCH:
                    serviceImpl.search((io.milvus.grpc.SearchRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SearchResults>) responseObserver);
                    break;
                case METHODID_FLUSH:
                    serviceImpl.flush((io.milvus.grpc.FlushRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.FlushResponse>) responseObserver);
                    break;
                case METHODID_QUERY:
                    serviceImpl.query((io.milvus.grpc.QueryRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.QueryResults>) responseObserver);
                    break;
                case METHODID_CALC_DISTANCE:
                    serviceImpl.calcDistance((io.milvus.grpc.CalcDistanceRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.CalcDistanceResults>) responseObserver);
                    break;
                case METHODID_FLUSH_ALL:
                    serviceImpl.flushAll((io.milvus.grpc.FlushAllRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.FlushAllResponse>) responseObserver);
                    break;
                case METHODID_GET_FLUSH_STATE:
                    serviceImpl.getFlushState((io.milvus.grpc.GetFlushStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushStateResponse>) responseObserver);
                    break;
                case METHODID_GET_FLUSH_ALL_STATE:
                    serviceImpl.getFlushAllState((io.milvus.grpc.GetFlushAllStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushAllStateResponse>) responseObserver);
                    break;
                case METHODID_GET_PERSISTENT_SEGMENT_INFO:
                    serviceImpl.getPersistentSegmentInfo((io.milvus.grpc.GetPersistentSegmentInfoRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetPersistentSegmentInfoResponse>) responseObserver);
                    break;
                case METHODID_GET_QUERY_SEGMENT_INFO:
                    serviceImpl.getQuerySegmentInfo((io.milvus.grpc.GetQuerySegmentInfoRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetQuerySegmentInfoResponse>) responseObserver);
                    break;
                case METHODID_GET_REPLICAS:
                    serviceImpl.getReplicas((io.milvus.grpc.GetReplicasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetReplicasResponse>) responseObserver);
                    break;
                case METHODID_DUMMY:
                    serviceImpl.dummy((io.milvus.grpc.DummyRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DummyResponse>) responseObserver);
                    break;
                case METHODID_REGISTER_LINK:
                    serviceImpl.registerLink((io.milvus.grpc.RegisterLinkRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse>) responseObserver);
                    break;
                case METHODID_GET_METRICS:
                    serviceImpl.getMetrics((io.milvus.grpc.GetMetricsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetMetricsResponse>) responseObserver);
                    break;
                case METHODID_GET_COMPONENT_STATES:
                    serviceImpl.getComponentStates((io.milvus.grpc.GetComponentStatesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ComponentStates>) responseObserver);
                    break;
                case METHODID_LOAD_BALANCE:
                    serviceImpl.loadBalance((io.milvus.grpc.LoadBalanceRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_GET_COMPACTION_STATE:
                    serviceImpl.getCompactionState((io.milvus.grpc.GetCompactionStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionStateResponse>) responseObserver);
                    break;
                case METHODID_MANUAL_COMPACTION:
                    serviceImpl.manualCompaction((io.milvus.grpc.ManualCompactionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ManualCompactionResponse>) responseObserver);
                    break;
                case METHODID_GET_COMPACTION_STATE_WITH_PLANS:
                    serviceImpl.getCompactionStateWithPlans((io.milvus.grpc.GetCompactionPlansRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionPlansResponse>) responseObserver);
                    break;
                case METHODID_IMPORT:
                    serviceImpl.import_((io.milvus.grpc.ImportRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ImportResponse>) responseObserver);
                    break;
                case METHODID_GET_IMPORT_STATE:
                    serviceImpl.getImportState((io.milvus.grpc.GetImportStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetImportStateResponse>) responseObserver);
                    break;
                case METHODID_LIST_IMPORT_TASKS:
                    serviceImpl.listImportTasks((io.milvus.grpc.ListImportTasksRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListImportTasksResponse>) responseObserver);
                    break;
                case METHODID_CREATE_CREDENTIAL:
                    serviceImpl.createCredential((io.milvus.grpc.CreateCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_UPDATE_CREDENTIAL:
                    serviceImpl.updateCredential((io.milvus.grpc.UpdateCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DELETE_CREDENTIAL:
                    serviceImpl.deleteCredential((io.milvus.grpc.DeleteCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_LIST_CRED_USERS:
                    serviceImpl.listCredUsers((io.milvus.grpc.ListCredUsersRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListCredUsersResponse>) responseObserver);
                    break;
                case METHODID_CREATE_ROLE:
                    serviceImpl.createRole((io.milvus.grpc.CreateRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_ROLE:
                    serviceImpl.dropRole((io.milvus.grpc.DropRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_OPERATE_USER_ROLE:
                    serviceImpl.operateUserRole((io.milvus.grpc.OperateUserRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_SELECT_ROLE:
                    serviceImpl.selectRole((io.milvus.grpc.SelectRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectRoleResponse>) responseObserver);
                    break;
                case METHODID_SELECT_USER:
                    serviceImpl.selectUser((io.milvus.grpc.SelectUserRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectUserResponse>) responseObserver);
                    break;
                case METHODID_OPERATE_PRIVILEGE:
                    serviceImpl.operatePrivilege((io.milvus.grpc.OperatePrivilegeRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_SELECT_GRANT:
                    serviceImpl.selectGrant((io.milvus.grpc.SelectGrantRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectGrantResponse>) responseObserver);
                    break;
                case METHODID_GET_VERSION:
                    serviceImpl.getVersion((io.milvus.grpc.GetVersionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetVersionResponse>) responseObserver);
                    break;
                case METHODID_CHECK_HEALTH:
                    serviceImpl.checkHealth((io.milvus.grpc.CheckHealthRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.CheckHealthResponse>) responseObserver);
                    break;
                case METHODID_CREATE_RESOURCE_GROUP:
                    serviceImpl.createResourceGroup((io.milvus.grpc.CreateResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_RESOURCE_GROUP:
                    serviceImpl.dropResourceGroup((io.milvus.grpc.DropResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_TRANSFER_NODE:
                    serviceImpl.transferNode((io.milvus.grpc.TransferNodeRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_TRANSFER_REPLICA:
                    serviceImpl.transferReplica((io.milvus.grpc.TransferReplicaRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_LIST_RESOURCE_GROUPS:
                    serviceImpl.listResourceGroups((io.milvus.grpc.ListResourceGroupsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListResourceGroupsResponse>) responseObserver);
                    break;
                case METHODID_DESCRIBE_RESOURCE_GROUP:
                    serviceImpl.describeResourceGroup((io.milvus.grpc.DescribeResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeResourceGroupResponse>) responseObserver);
                    break;
                case METHODID_RENAME_COLLECTION:
                    serviceImpl.renameCollection((io.milvus.grpc.RenameCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_LIST_INDEXED_SEGMENT:
                    serviceImpl.listIndexedSegment((milvus.proto.feder.Feder.ListIndexedSegmentRequest) request,
                            (io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.ListIndexedSegmentResponse>) responseObserver);
                    break;
                case METHODID_DESCRIBE_SEGMENT_INDEX_DATA:
                    serviceImpl.describeSegmentIndexData((milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest) request,
                            (io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse>) responseObserver);
                    break;
                case METHODID_CONNECT:
                    serviceImpl.connect((io.milvus.grpc.ConnectRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ConnectResponse>) responseObserver);
                    break;
                case METHODID_ALLOC_TIMESTAMP:
                    serviceImpl.allocTimestamp((io.milvus.grpc.AllocTimestampRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.AllocTimestampResponse>) responseObserver);
                    break;
                case METHODID_CREATE_DATABASE:
                    serviceImpl.createDatabase((io.milvus.grpc.CreateDatabaseRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_DROP_DATABASE:
                    serviceImpl.dropDatabase((io.milvus.grpc.DropDatabaseRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver);
                    break;
                case METHODID_LIST_DATABASES:
                    serviceImpl.listDatabases((io.milvus.grpc.ListDatabasesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListDatabasesResponse>) responseObserver);
                    break;
                case METHODID_REPLICATE_MESSAGE:
                    serviceImpl.replicateMessage((io.milvus.grpc.ReplicateMessageRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ReplicateMessageResponse>) responseObserver);
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
        return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                .addMethod(getCreateCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_COLLECTION)))
                .addMethod(getDropCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_COLLECTION)))
                .addMethod(getHasCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse>(service,
                                        METHODID_HAS_COLLECTION)))
                .addMethod(getLoadCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_LOAD_COLLECTION)))
                .addMethod(getReleaseCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_RELEASE_COLLECTION)))
                .addMethod(getDescribeCollectionMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse>(
                                service, METHODID_DESCRIBE_COLLECTION)))
                .addMethod(getGetCollectionStatisticsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse>(
                                service, METHODID_GET_COLLECTION_STATISTICS)))
                .addMethod(getShowCollectionsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse>(
                                service, METHODID_SHOW_COLLECTIONS)))
                .addMethod(getAlterCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_ALTER_COLLECTION)))
                .addMethod(getCreatePartitionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_PARTITION)))
                .addMethod(getDropPartitionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_PARTITION)))
                .addMethod(getHasPartitionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse>(service,
                                        METHODID_HAS_PARTITION)))
                .addMethod(getLoadPartitionsMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status>(service,
                                        METHODID_LOAD_PARTITIONS)))
                .addMethod(getReleasePartitionsMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status>(service,
                                        METHODID_RELEASE_PARTITIONS)))
                .addMethod(getGetPartitionStatisticsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse>(
                                service, METHODID_GET_PARTITION_STATISTICS)))
                .addMethod(getShowPartitionsMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse>(
                                        service, METHODID_SHOW_PARTITIONS)))
                .addMethod(getGetLoadingProgressMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse>(
                                service, METHODID_GET_LOADING_PROGRESS)))
                .addMethod(getGetLoadStateMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse>(
                                        service, METHODID_GET_LOAD_STATE)))
                .addMethod(getCreateAliasMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_ALIAS)))
                .addMethod(getDropAliasMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_ALIAS)))
                .addMethod(getAlterAliasMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status>(service,
                                        METHODID_ALTER_ALIAS)))
                .addMethod(getDescribeAliasMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse>(
                                        service, METHODID_DESCRIBE_ALIAS)))
                .addMethod(getListAliasesMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse>(
                                        service, METHODID_LIST_ALIASES)))
                .addMethod(getCreateIndexMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_INDEX)))
                .addMethod(getAlterIndexMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status>(service,
                                        METHODID_ALTER_INDEX)))
                .addMethod(getDescribeIndexMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse>(
                                        service, METHODID_DESCRIBE_INDEX)))
                .addMethod(getGetIndexStatisticsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse>(
                                service, METHODID_GET_INDEX_STATISTICS)))
                .addMethod(getGetIndexStateMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse>(
                                        service, METHODID_GET_INDEX_STATE)))
                .addMethod(getGetIndexBuildProgressMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse>(
                                service, METHODID_GET_INDEX_BUILD_PROGRESS)))
                .addMethod(getDropIndexMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_INDEX)))
                .addMethod(getInsertMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult>(service,
                                        METHODID_INSERT)))
                .addMethod(getDeleteMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult>(service,
                                        METHODID_DELETE)))
                .addMethod(getUpsertMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult>(service,
                                        METHODID_UPSERT)))
                .addMethod(getSearchMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults>(service,
                                        METHODID_SEARCH)))
                .addMethod(getFlushMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse>(service, METHODID_FLUSH)))
                .addMethod(getQueryMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults>(service, METHODID_QUERY)))
                .addMethod(getCalcDistanceMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults>(
                                        service, METHODID_CALC_DISTANCE)))
                .addMethod(getFlushAllMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse>(service,
                                        METHODID_FLUSH_ALL)))
                .addMethod(getGetFlushStateMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse>(
                                        service, METHODID_GET_FLUSH_STATE)))
                .addMethod(getGetFlushAllStateMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse>(
                                service, METHODID_GET_FLUSH_ALL_STATE)))
                .addMethod(getGetPersistentSegmentInfoMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse>(
                                service, METHODID_GET_PERSISTENT_SEGMENT_INFO)))
                .addMethod(getGetQuerySegmentInfoMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse>(
                                service, METHODID_GET_QUERY_SEGMENT_INFO)))
                .addMethod(getGetReplicasMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse>(
                                        service, METHODID_GET_REPLICAS)))
                .addMethod(getDummyMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse>(service, METHODID_DUMMY)))
                .addMethod(getRegisterLinkMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse>(
                                        service, METHODID_REGISTER_LINK)))
                .addMethod(getGetMetricsMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse>(service,
                                        METHODID_GET_METRICS)))
                .addMethod(getGetComponentStatesMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates>(
                                        service, METHODID_GET_COMPONENT_STATES)))
                .addMethod(getLoadBalanceMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status>(service,
                                        METHODID_LOAD_BALANCE)))
                .addMethod(getGetCompactionStateMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse>(
                                service, METHODID_GET_COMPACTION_STATE)))
                .addMethod(getManualCompactionMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse>(
                                service, METHODID_MANUAL_COMPACTION)))
                .addMethod(getGetCompactionStateWithPlansMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse>(
                                service, METHODID_GET_COMPACTION_STATE_WITH_PLANS)))
                .addMethod(getImportMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse>(service,
                                        METHODID_IMPORT)))
                .addMethod(getGetImportStateMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse>(
                                        service, METHODID_GET_IMPORT_STATE)))
                .addMethod(getListImportTasksMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse>(
                                service, METHODID_LIST_IMPORT_TASKS)))
                .addMethod(getCreateCredentialMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_CREDENTIAL)))
                .addMethod(getUpdateCredentialMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status>(service,
                                        METHODID_UPDATE_CREDENTIAL)))
                .addMethod(getDeleteCredentialMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DELETE_CREDENTIAL)))
                .addMethod(getListCredUsersMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse>(
                                        service, METHODID_LIST_CRED_USERS)))
                .addMethod(getCreateRoleMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_ROLE)))
                .addMethod(getDropRoleMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status>(service, METHODID_DROP_ROLE)))
                .addMethod(getOperateUserRoleMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status>(service,
                                        METHODID_OPERATE_USER_ROLE)))
                .addMethod(getSelectRoleMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse>(service,
                                        METHODID_SELECT_ROLE)))
                .addMethod(getSelectUserMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse>(service,
                                        METHODID_SELECT_USER)))
                .addMethod(getOperatePrivilegeMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status>(service,
                                        METHODID_OPERATE_PRIVILEGE)))
                .addMethod(getSelectGrantMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse>(
                                        service, METHODID_SELECT_GRANT)))
                .addMethod(getGetVersionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse>(service,
                                        METHODID_GET_VERSION)))
                .addMethod(getCheckHealthMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse>(
                                        service, METHODID_CHECK_HEALTH)))
                .addMethod(getCreateResourceGroupMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_RESOURCE_GROUP)))
                .addMethod(getDropResourceGroupMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_RESOURCE_GROUP)))
                .addMethod(getTransferNodeMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status>(service,
                                        METHODID_TRANSFER_NODE)))
                .addMethod(getTransferReplicaMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status>(service,
                                        METHODID_TRANSFER_REPLICA)))
                .addMethod(getListResourceGroupsMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse>(
                                service, METHODID_LIST_RESOURCE_GROUPS)))
                .addMethod(getDescribeResourceGroupMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse>(
                                service, METHODID_DESCRIBE_RESOURCE_GROUP)))
                .addMethod(getRenameCollectionMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status>(service,
                                        METHODID_RENAME_COLLECTION)))
                .addMethod(getListIndexedSegmentMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse>(
                                service, METHODID_LIST_INDEXED_SEGMENT)))
                .addMethod(getDescribeSegmentIndexDataMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse>(
                                service, METHODID_DESCRIBE_SEGMENT_INDEX_DATA)))
                .addMethod(getConnectMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse>(service,
                                        METHODID_CONNECT)))
                .addMethod(getAllocTimestampMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse>(
                                        service, METHODID_ALLOC_TIMESTAMP)))
                .addMethod(getCreateDatabaseMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status>(service,
                                        METHODID_CREATE_DATABASE)))
                .addMethod(getDropDatabaseMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status>(service,
                                        METHODID_DROP_DATABASE)))
                .addMethod(getListDatabasesMethod(),
                        io.grpc.stub.ServerCalls.asyncUnaryCall(
                                new MethodHandlers<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse>(
                                        service, METHODID_LIST_DATABASES)))
                .addMethod(getReplicateMessageMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(
                        new MethodHandlers<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse>(
                                service, METHODID_REPLICATE_MESSAGE)))
                .build();
    }

    private static abstract class MilvusServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

        MilvusServiceBaseDescriptorSupplier() {
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
            return io.milvus.grpc.MilvusProto.getDescriptor();
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("MilvusService");
        }
    }

    private static final class MilvusServiceFileDescriptorSupplier extends MilvusServiceBaseDescriptorSupplier {

        MilvusServiceFileDescriptorSupplier() {
        }
    }

    private static final class MilvusServiceMethodDescriptorSupplier extends MilvusServiceBaseDescriptorSupplier
            implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

        private final java.lang.String methodName;

        MilvusServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
            synchronized (MilvusServiceGrpc.class) {
                result = serviceDescriptor;
                if (result == null) {
                    serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                            .setSchemaDescriptor(new MilvusServiceFileDescriptorSupplier())
                            .addMethod(getCreateCollectionMethod()).addMethod(getDropCollectionMethod())
                            .addMethod(getHasCollectionMethod()).addMethod(getLoadCollectionMethod())
                            .addMethod(getReleaseCollectionMethod()).addMethod(getDescribeCollectionMethod())
                            .addMethod(getGetCollectionStatisticsMethod()).addMethod(getShowCollectionsMethod())
                            .addMethod(getAlterCollectionMethod()).addMethod(getCreatePartitionMethod())
                            .addMethod(getDropPartitionMethod()).addMethod(getHasPartitionMethod())
                            .addMethod(getLoadPartitionsMethod()).addMethod(getReleasePartitionsMethod())
                            .addMethod(getGetPartitionStatisticsMethod()).addMethod(getShowPartitionsMethod())
                            .addMethod(getGetLoadingProgressMethod()).addMethod(getGetLoadStateMethod())
                            .addMethod(getCreateAliasMethod()).addMethod(getDropAliasMethod()).addMethod(getAlterAliasMethod())
                            .addMethod(getDescribeAliasMethod()).addMethod(getListAliasesMethod())
                            .addMethod(getCreateIndexMethod()).addMethod(getAlterIndexMethod())
                            .addMethod(getDescribeIndexMethod()).addMethod(getGetIndexStatisticsMethod())
                            .addMethod(getGetIndexStateMethod()).addMethod(getGetIndexBuildProgressMethod())
                            .addMethod(getDropIndexMethod()).addMethod(getInsertMethod()).addMethod(getDeleteMethod())
                            .addMethod(getUpsertMethod()).addMethod(getSearchMethod()).addMethod(getFlushMethod())
                            .addMethod(getQueryMethod()).addMethod(getCalcDistanceMethod()).addMethod(getFlushAllMethod())
                            .addMethod(getGetFlushStateMethod()).addMethod(getGetFlushAllStateMethod())
                            .addMethod(getGetPersistentSegmentInfoMethod()).addMethod(getGetQuerySegmentInfoMethod())
                            .addMethod(getGetReplicasMethod()).addMethod(getDummyMethod()).addMethod(getRegisterLinkMethod())
                            .addMethod(getGetMetricsMethod()).addMethod(getGetComponentStatesMethod())
                            .addMethod(getLoadBalanceMethod()).addMethod(getGetCompactionStateMethod())
                            .addMethod(getManualCompactionMethod()).addMethod(getGetCompactionStateWithPlansMethod())
                            .addMethod(getImportMethod()).addMethod(getGetImportStateMethod())
                            .addMethod(getListImportTasksMethod()).addMethod(getCreateCredentialMethod())
                            .addMethod(getUpdateCredentialMethod()).addMethod(getDeleteCredentialMethod())
                            .addMethod(getListCredUsersMethod()).addMethod(getCreateRoleMethod()).addMethod(getDropRoleMethod())
                            .addMethod(getOperateUserRoleMethod()).addMethod(getSelectRoleMethod())
                            .addMethod(getSelectUserMethod()).addMethod(getOperatePrivilegeMethod())
                            .addMethod(getSelectGrantMethod()).addMethod(getGetVersionMethod())
                            .addMethod(getCheckHealthMethod()).addMethod(getCreateResourceGroupMethod())
                            .addMethod(getDropResourceGroupMethod()).addMethod(getTransferNodeMethod())
                            .addMethod(getTransferReplicaMethod()).addMethod(getListResourceGroupsMethod())
                            .addMethod(getDescribeResourceGroupMethod()).addMethod(getRenameCollectionMethod())
                            .addMethod(getListIndexedSegmentMethod()).addMethod(getDescribeSegmentIndexDataMethod())
                            .addMethod(getConnectMethod()).addMethod(getAllocTimestampMethod())
                            .addMethod(getCreateDatabaseMethod()).addMethod(getDropDatabaseMethod())
                            .addMethod(getListDatabasesMethod()).addMethod(getReplicateMessageMethod()).build();
                }
            }
        }
        return result;
    }
}
