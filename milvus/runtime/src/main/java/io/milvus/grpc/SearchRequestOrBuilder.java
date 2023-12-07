// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface SearchRequestOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.SearchRequest)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return Whether the base field is set.
     */
    boolean hasBase();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return The base.
     */
    io.milvus.grpc.MsgBase getBase();

    /**
     * <pre>
     * must
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
     * must
     * </pre>
     *
     * <code>string collection_name = 3;</code>
     *
     * @return The collectionName.
     */
    java.lang.String getCollectionName();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>string collection_name = 3;</code>
     *
     * @return The bytes for collectionName.
     */
    com.google.protobuf.ByteString getCollectionNameBytes();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated string partition_names = 4;</code>
     *
     * @return A list containing the partitionNames.
     */
    java.util.List<java.lang.String> getPartitionNamesList();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated string partition_names = 4;</code>
     *
     * @return The count of partitionNames.
     */
    int getPartitionNamesCount();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated string partition_names = 4;</code>
     *
     * @param index The index of the element to return.
     * @return The partitionNames at the given index.
     */
    java.lang.String getPartitionNames(int index);

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated string partition_names = 4;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the partitionNames at the given index.
     */
    com.google.protobuf.ByteString getPartitionNamesBytes(int index);

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>string dsl = 5;</code>
     *
     * @return The dsl.
     */
    java.lang.String getDsl();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>string dsl = 5;</code>
     *
     * @return The bytes for dsl.
     */
    com.google.protobuf.ByteString getDslBytes();

    /**
     * <pre>
     * serialized `PlaceholderGroup`
     * </pre>
     *
     * <code>bytes placeholder_group = 6;</code>
     *
     * @return The placeholderGroup.
     */
    com.google.protobuf.ByteString getPlaceholderGroup();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>.milvus.proto.common.DslType dsl_type = 7;</code>
     *
     * @return The enum numeric value on the wire for dslType.
     */
    int getDslTypeValue();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>.milvus.proto.common.DslType dsl_type = 7;</code>
     *
     * @return The dslType.
     */
    io.milvus.grpc.DslType getDslType();

    /**
     * <code>repeated string output_fields = 8;</code>
     *
     * @return A list containing the outputFields.
     */
    java.util.List<java.lang.String> getOutputFieldsList();

    /**
     * <code>repeated string output_fields = 8;</code>
     *
     * @return The count of outputFields.
     */
    int getOutputFieldsCount();

    /**
     * <code>repeated string output_fields = 8;</code>
     *
     * @param index The index of the element to return.
     * @return The outputFields at the given index.
     */
    java.lang.String getOutputFields(int index);

    /**
     * <code>repeated string output_fields = 8;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the outputFields at the given index.
     */
    com.google.protobuf.ByteString getOutputFieldsBytes(int index);

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyValuePair search_params = 9;</code>
     */
    java.util.List<io.milvus.grpc.KeyValuePair> getSearchParamsList();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyValuePair search_params = 9;</code>
     */
    io.milvus.grpc.KeyValuePair getSearchParams(int index);

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyValuePair search_params = 9;</code>
     */
    int getSearchParamsCount();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyValuePair search_params = 9;</code>
     */
    java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getSearchParamsOrBuilderList();

    /**
     * <pre>
     * must
     * </pre>
     *
     * <code>repeated .milvus.proto.common.KeyValuePair search_params = 9;</code>
     */
    io.milvus.grpc.KeyValuePairOrBuilder getSearchParamsOrBuilder(int index);

    /**
     * <code>uint64 travel_timestamp = 10;</code>
     *
     * @return The travelTimestamp.
     */
    long getTravelTimestamp();

    /**
     * <pre>
     * guarantee_timestamp
     * </pre>
     *
     * <code>uint64 guarantee_timestamp = 11;</code>
     *
     * @return The guaranteeTimestamp.
     */
    long getGuaranteeTimestamp();

    /**
     * <code>int64 nq = 12;</code>
     *
     * @return The nq.
     */
    long getNq();

    /**
     * <code>bool not_return_all_meta = 13;</code>
     *
     * @return The notReturnAllMeta.
     */
    boolean getNotReturnAllMeta();

    /**
     * <code>.milvus.proto.common.ConsistencyLevel consistency_level = 14;</code>
     *
     * @return The enum numeric value on the wire for consistencyLevel.
     */
    int getConsistencyLevelValue();

    /**
     * <code>.milvus.proto.common.ConsistencyLevel consistency_level = 14;</code>
     *
     * @return The consistencyLevel.
     */
    io.milvus.grpc.ConsistencyLevel getConsistencyLevel();

    /**
     * <code>bool use_default_consistency = 15;</code>
     *
     * @return The useDefaultConsistency.
     */
    boolean getUseDefaultConsistency();

    /**
     * <code>bool search_by_primary_keys = 16;</code>
     *
     * @return The searchByPrimaryKeys.
     */
    boolean getSearchByPrimaryKeys();
}
