// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface DescribeResourceGroupResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.DescribeResourceGroupResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    boolean hasStatus();

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    io.milvus.grpc.Status getStatus();

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    io.milvus.grpc.StatusOrBuilder getStatusOrBuilder();

    /**
     * <code>.milvus.proto.milvus.ResourceGroup resource_group = 2;</code>
     *
     * @return Whether the resourceGroup field is set.
     */
    boolean hasResourceGroup();

    /**
     * <code>.milvus.proto.milvus.ResourceGroup resource_group = 2;</code>
     *
     * @return The resourceGroup.
     */
    io.milvus.grpc.ResourceGroup getResourceGroup();

    /**
     * <code>.milvus.proto.milvus.ResourceGroup resource_group = 2;</code>
     */
    io.milvus.grpc.ResourceGroupOrBuilder getResourceGroupOrBuilder();
}
