// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface DescribeCollectionResponseOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.DescribeCollectionResponse)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Contain error_code and reason
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    boolean hasStatus();

    /**
     * <pre>
     * Contain error_code and reason
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    io.milvus.grpc.Status getStatus();

    /**
     * <pre>
     * Contain error_code and reason
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    io.milvus.grpc.StatusOrBuilder getStatusOrBuilder();

    /**
     * <pre>
     * The schema param when you created collection.
     * </pre>
     *
     * <code>.milvus.proto.schema.CollectionSchema schema = 2;</code>
     *
     * @return Whether the schema field is set.
     */
    boolean hasSchema();

    /**
     * <pre>
     * The schema param when you created collection.
     * </pre>
     *
     * <code>.milvus.proto.schema.CollectionSchema schema = 2;</code>
     *
     * @return The schema.
     */
    io.milvus.grpc.CollectionSchema getSchema();

    /**
     * <pre>
     * The schema param when you created collection.
     * </pre>
     *
     * <code>.milvus.proto.schema.CollectionSchema schema = 2;</code>
     */
    io.milvus.grpc.CollectionSchemaOrBuilder getSchemaOrBuilder();

    /**
     * <pre>
     * The collection id
     * </pre>
     *
     * <code>int64 collectionID = 3;</code>
     *
     * @return The collectionID.
     */
    long getCollectionID();

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string virtual_channel_names = 4;</code>
     *
     * @return A list containing the virtualChannelNames.
     */
    java.util.List<java.lang.String> getVirtualChannelNamesList();

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string virtual_channel_names = 4;</code>
     *
     * @return The count of virtualChannelNames.
     */
    int getVirtualChannelNamesCount();

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string virtual_channel_names = 4;</code>
     *
     * @param index The index of the element to return.
     * @return The virtualChannelNames at the given index.
     */
    java.lang.String getVirtualChannelNames(int index);

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string virtual_channel_names = 4;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the virtualChannelNames at the given index.
     */
    com.google.protobuf.ByteString getVirtualChannelNamesBytes(int index);

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string physical_channel_names = 5;</code>
     *
     * @return A list containing the physicalChannelNames.
     */
    java.util.List<java.lang.String> getPhysicalChannelNamesList();

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string physical_channel_names = 5;</code>
     *
     * @return The count of physicalChannelNames.
     */
    int getPhysicalChannelNamesCount();

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string physical_channel_names = 5;</code>
     *
     * @param index The index of the element to return.
     * @return The physicalChannelNames at the given index.
     */
    java.lang.String getPhysicalChannelNames(int index);

    /**
     * <pre>
     * System design related, users should not perceive
     * </pre>
     *
     * <code>repeated string physical_channel_names = 5;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the physicalChannelNames at the given index.
     */
    com.google.protobuf.ByteString getPhysicalChannelNamesBytes(int index);

    /**
     * <pre>
     * Hybrid timestamp in milvus
     * </pre>
     *
     * <code>uint64 created_timestamp = 6;</code>
     *
     * @return The createdTimestamp.
     */
    long getCreatedTimestamp();

    /**
     * <pre>
     * The utc timestamp calculated by created_timestamp
     * </pre>
     *
     * <code>uint64 created_utc_timestamp = 7;</code>
     *
     * @return The createdUtcTimestamp.
     */
    long getCreatedUtcTimestamp();

    /**
     * <pre>
     * The shards number you set.
     * </pre>
     *
     * <code>int32 shards_num = 8;</code>
     *
     * @return The shardsNum.
     */
    int getShardsNum();

    /**
     * <pre>
     * The aliases of this collection
     * </pre>
     *
     * <code>repeated string aliases = 9;</code>
     *
     * @return A list containing the aliases.
     */
    java.util.List<java.lang.String> getAliasesList();

    /**
     * <pre>
     * The aliases of this collection
     * </pre>
     *
     * <code>repeated string aliases = 9;</code>
     *
     * @return The count of aliases.
     */
    int getAliasesCount();

    /**
     * <pre>
     * The aliases of this collection
     * </pre>
     *
     * <code>repeated string aliases = 9;</code>
     *
     * @param index The index of the element to return.
     * @return The aliases at the given index.
     */
    java.lang.String getAliases(int index);

    /**
     * <pre>
     * The aliases of this collection
     * </pre>
     *
     * <code>repeated string aliases = 9;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the aliases at the given index.
     */
    com.google.protobuf.ByteString getAliasesBytes(int index);

    /**
     * <pre>
     * The message ID/posititon when collection is created
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyDataPair start_positions = 10;</code>
     */
    java.util.List<io.milvus.grpc.KeyDataPair> getStartPositionsList();

    /**
     * <pre>
     * The message ID/posititon when collection is created
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyDataPair start_positions = 10;</code>
     */
    io.milvus.grpc.KeyDataPair getStartPositions(int index);

    /**
     * <pre>
     * The message ID/posititon when collection is created
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyDataPair start_positions = 10;</code>
     */
    int getStartPositionsCount();

    /**
     * <pre>
     * The message ID/posititon when collection is created
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyDataPair start_positions = 10;</code>
     */
    java.util.List<? extends io.milvus.grpc.KeyDataPairOrBuilder> getStartPositionsOrBuilderList();

    /**
     * <pre>
     * The message ID/posititon when collection is created
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyDataPair start_positions = 10;</code>
     */
    io.milvus.grpc.KeyDataPairOrBuilder getStartPositionsOrBuilder(int index);

    /**
     * <pre>
     * The consistency level that the collection used, modification is not supported now.
     * </pre>
     *
     * <code>.milvus.proto.common.ConsistencyLevel consistency_level = 11;</code>
     *
     * @return The enum numeric value on the wire for consistencyLevel.
     */
    int getConsistencyLevelValue();

    /**
     * <pre>
     * The consistency level that the collection used, modification is not supported now.
     * </pre>
     *
     * <code>.milvus.proto.common.ConsistencyLevel consistency_level = 11;</code>
     *
     * @return The consistencyLevel.
     */
    io.milvus.grpc.ConsistencyLevel getConsistencyLevel();

    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string collection_name = 12;</code>
     *
     * @return The collectionName.
     */
    java.lang.String getCollectionName();

    /**
     * <pre>
     * The collection name
     * </pre>
     *
     * <code>string collection_name = 12;</code>
     *
     * @return The bytes for collectionName.
     */
    com.google.protobuf.ByteString getCollectionNameBytes();

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair properties = 13;</code>
     */
    java.util.List<io.milvus.grpc.KeyValuePair> getPropertiesList();

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair properties = 13;</code>
     */
    io.milvus.grpc.KeyValuePair getProperties(int index);

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair properties = 13;</code>
     */
    int getPropertiesCount();

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair properties = 13;</code>
     */
    java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getPropertiesOrBuilderList();

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair properties = 13;</code>
     */
    io.milvus.grpc.KeyValuePairOrBuilder getPropertiesOrBuilder(int index);

    /**
     * <code>string db_name = 14;</code>
     *
     * @return The dbName.
     */
    java.lang.String getDbName();

    /**
     * <code>string db_name = 14;</code>
     *
     * @return The bytes for dbName.
     */
    com.google.protobuf.ByteString getDbNameBytes();

    /**
     * <code>int64 num_partitions = 15;</code>
     *
     * @return The numPartitions.
     */
    long getNumPartitions();
}
