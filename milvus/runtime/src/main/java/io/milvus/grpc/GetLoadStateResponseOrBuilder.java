// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface GetLoadStateResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.GetLoadStateResponse)
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
     * <code>.milvus.proto.common.LoadState state = 2;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();

    /**
     * <code>.milvus.proto.common.LoadState state = 2;</code>
     *
     * @return The state.
     */
    io.milvus.grpc.LoadState getState();
}
