// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface SelectUserResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.SelectUserResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    boolean hasStatus();

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    io.milvus.grpc.Status getStatus();

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    io.milvus.grpc.StatusOrBuilder getStatusOrBuilder();

    /**
     * <pre>
     * user result array
     * </pre>
     *
     * <code>repeated .milvus.proto.milvus.UserResult results = 2;</code>
     */
    java.util.List<io.milvus.grpc.UserResult> getResultsList();

    /**
     * <pre>
     * user result array
     * </pre>
     *
     * <code>repeated .milvus.proto.milvus.UserResult results = 2;</code>
     */
    io.milvus.grpc.UserResult getResults(int index);

    /**
     * <pre>
     * user result array
     * </pre>
     *
     * <code>repeated .milvus.proto.milvus.UserResult results = 2;</code>
     */
    int getResultsCount();

    /**
     * <pre>
     * user result array
     * </pre>
     *
     * <code>repeated .milvus.proto.milvus.UserResult results = 2;</code>
     */
    java.util.List<? extends io.milvus.grpc.UserResultOrBuilder> getResultsOrBuilderList();

    /**
     * <pre>
     * user result array
     * </pre>
     *
     * <code>repeated .milvus.proto.milvus.UserResult results = 2;</code>
     */
    io.milvus.grpc.UserResultOrBuilder getResultsOrBuilder(int index);
}
