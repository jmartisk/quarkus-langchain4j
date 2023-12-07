// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface MutationResultOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.MutationResult)
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
     * <pre>
     * required for insert, delete, upsert
     * </pre>
     *
     * <code>.milvus.proto.schema.IDs IDs = 2;</code>
     *
     * @return Whether the iDs field is set.
     */
    boolean hasIDs();

    /**
     * <pre>
     * required for insert, delete, upsert
     * </pre>
     *
     * <code>.milvus.proto.schema.IDs IDs = 2;</code>
     *
     * @return The iDs.
     */
    io.milvus.grpc.IDs getIDs();

    /**
     * <pre>
     * required for insert, delete, upsert
     * </pre>
     *
     * <code>.milvus.proto.schema.IDs IDs = 2;</code>
     */
    io.milvus.grpc.IDsOrBuilder getIDsOrBuilder();

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 succ_index = 3;</code>
     *
     * @return A list containing the succIndex.
     */
    java.util.List<java.lang.Integer> getSuccIndexList();

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 succ_index = 3;</code>
     *
     * @return The count of succIndex.
     */
    int getSuccIndexCount();

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 succ_index = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The succIndex at the given index.
     */
    int getSuccIndex(int index);

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 err_index = 4;</code>
     *
     * @return A list containing the errIndex.
     */
    java.util.List<java.lang.Integer> getErrIndexList();

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 err_index = 4;</code>
     *
     * @return The count of errIndex.
     */
    int getErrIndexCount();

    /**
     * <pre>
     * error indexes indicate
     * </pre>
     *
     * <code>repeated uint32 err_index = 4;</code>
     *
     * @param index The index of the element to return.
     * @return The errIndex at the given index.
     */
    int getErrIndex(int index);

    /**
     * <code>bool acknowledged = 5;</code>
     *
     * @return The acknowledged.
     */
    boolean getAcknowledged();

    /**
     * <code>int64 insert_cnt = 6;</code>
     *
     * @return The insertCnt.
     */
    long getInsertCnt();

    /**
     * <code>int64 delete_cnt = 7;</code>
     *
     * @return The deleteCnt.
     */
    long getDeleteCnt();

    /**
     * <code>int64 upsert_cnt = 8;</code>
     *
     * @return The upsertCnt.
     */
    long getUpsertCnt();

    /**
     * <code>uint64 timestamp = 9;</code>
     *
     * @return The timestamp.
     */
    long getTimestamp();
}
