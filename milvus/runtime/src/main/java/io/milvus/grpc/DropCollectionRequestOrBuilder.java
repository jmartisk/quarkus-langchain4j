// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface DropCollectionRequestOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.DropCollectionRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return Whether the base field is set.
     */
    boolean hasBase();

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return The base.
     */
    io.milvus.grpc.MsgBase getBase();

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     */
    io.milvus.grpc.MsgBaseOrBuilder getBaseOrBuilder();

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
     * <pre>
     * The unique collection name in milvus.(Required)
     * </pre>
     *
     * <code>string collection_name = 3;</code>
     *
     * @return The collectionName.
     */
    java.lang.String getCollectionName();

    /**
     * <pre>
     * The unique collection name in milvus.(Required)
     * </pre>
     *
     * <code>string collection_name = 3;</code>
     *
     * @return The bytes for collectionName.
     */
    com.google.protobuf.ByteString getCollectionNameBytes();
}
