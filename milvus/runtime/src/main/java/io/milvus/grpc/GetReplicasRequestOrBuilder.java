// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface GetReplicasRequestOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.GetReplicasRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return Whether the base field is set.
     */
    boolean hasBase();

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return The base.
     */
    io.milvus.grpc.MsgBase getBase();

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     */
    io.milvus.grpc.MsgBaseOrBuilder getBaseOrBuilder();

    /**
     * <code>int64 collectionID = 2;</code>
     *
     * @return The collectionID.
     */
    long getCollectionID();

    /**
     * <code>bool with_shard_nodes = 3;</code>
     *
     * @return The withShardNodes.
     */
    boolean getWithShardNodes();

    /**
     * <code>string collection_name = 4;</code>
     *
     * @return The collectionName.
     */
    java.lang.String getCollectionName();

    /**
     * <code>string collection_name = 4;</code>
     *
     * @return The bytes for collectionName.
     */
    com.google.protobuf.ByteString getCollectionNameBytes();

    /**
     * <code>string db_name = 5;</code>
     *
     * @return The dbName.
     */
    java.lang.String getDbName();

    /**
     * <code>string db_name = 5;</code>
     *
     * @return The bytes for dbName.
     */
    com.google.protobuf.ByteString getDbNameBytes();
}
