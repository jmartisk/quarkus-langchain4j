// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface VectorsArrayOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.VectorsArray)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * vector ids
     * </pre>
     *
     * <code>.milvus.proto.milvus.VectorIDs id_array = 1;</code>
     *
     * @return Whether the idArray field is set.
     */
    boolean hasIdArray();

    /**
     * <pre>
     * vector ids
     * </pre>
     *
     * <code>.milvus.proto.milvus.VectorIDs id_array = 1;</code>
     *
     * @return The idArray.
     */
    io.milvus.grpc.VectorIDs getIdArray();

    /**
     * <pre>
     * vector ids
     * </pre>
     *
     * <code>.milvus.proto.milvus.VectorIDs id_array = 1;</code>
     */
    io.milvus.grpc.VectorIDsOrBuilder getIdArrayOrBuilder();

    /**
     * <pre>
     * vectors data
     * </pre>
     *
     * <code>.milvus.proto.schema.VectorField data_array = 2;</code>
     *
     * @return Whether the dataArray field is set.
     */
    boolean hasDataArray();

    /**
     * <pre>
     * vectors data
     * </pre>
     *
     * <code>.milvus.proto.schema.VectorField data_array = 2;</code>
     *
     * @return The dataArray.
     */
    io.milvus.grpc.VectorField getDataArray();

    /**
     * <pre>
     * vectors data
     * </pre>
     *
     * <code>.milvus.proto.schema.VectorField data_array = 2;</code>
     */
    io.milvus.grpc.VectorFieldOrBuilder getDataArrayOrBuilder();

    io.milvus.grpc.VectorsArray.ArrayCase getArrayCase();
}
