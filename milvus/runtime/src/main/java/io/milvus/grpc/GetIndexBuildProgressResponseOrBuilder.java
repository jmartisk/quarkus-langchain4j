// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface GetIndexBuildProgressResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.GetIndexBuildProgressResponse)
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
     * <code>int64 indexed_rows = 2;</code>
     *
     * @return The indexedRows.
     */
    long getIndexedRows();

    /**
     * <code>int64 total_rows = 3;</code>
     *
     * @return The totalRows.
     */
    long getTotalRows();
}
