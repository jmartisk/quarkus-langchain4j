// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface ListAliasesResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.ListAliasesResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    boolean hasStatus();

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    io.milvus.grpc.Status getStatus();

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    io.milvus.grpc.StatusOrBuilder getStatusOrBuilder();

    /**
     * <code>string db_name = 2;</code>
     *
     * @return The dbName.
     */
    java.lang.String getDbName();

    /**
     * <code>string db_name = 2;</code>
     *
     * @return The bytes for dbName.
     */
    com.google.protobuf.ByteString getDbNameBytes();

    /**
     * <code>string collection_name = 3;</code>
     *
     * @return The collectionName.
     */
    java.lang.String getCollectionName();

    /**
     * <code>string collection_name = 3;</code>
     *
     * @return The bytes for collectionName.
     */
    com.google.protobuf.ByteString getCollectionNameBytes();

    /**
     * <code>repeated string aliases = 4;</code>
     *
     * @return A list containing the aliases.
     */
    java.util.List<java.lang.String> getAliasesList();

    /**
     * <code>repeated string aliases = 4;</code>
     *
     * @return The count of aliases.
     */
    int getAliasesCount();

    /**
     * <code>repeated string aliases = 4;</code>
     *
     * @param index The index of the element to return.
     * @return The aliases at the given index.
     */
    java.lang.String getAliases(int index);

    /**
     * <code>repeated string aliases = 4;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the aliases at the given index.
     */
    com.google.protobuf.ByteString getAliasesBytes(int index);
}
