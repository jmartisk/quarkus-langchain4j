// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema.proto
package io.milvus.grpc;

public interface ArrayArrayOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.schema.ArrayArray)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .milvus.proto.schema.ScalarField data = 1;</code>
     */
    java.util.List<io.milvus.grpc.ScalarField> getDataList();

    /**
     * <code>repeated .milvus.proto.schema.ScalarField data = 1;</code>
     */
    io.milvus.grpc.ScalarField getData(int index);

    /**
     * <code>repeated .milvus.proto.schema.ScalarField data = 1;</code>
     */
    int getDataCount();

    /**
     * <code>repeated .milvus.proto.schema.ScalarField data = 1;</code>
     */
    java.util.List<? extends io.milvus.grpc.ScalarFieldOrBuilder> getDataOrBuilderList();

    /**
     * <code>repeated .milvus.proto.schema.ScalarField data = 1;</code>
     */
    io.milvus.grpc.ScalarFieldOrBuilder getDataOrBuilder(int index);

    /**
     * <code>.milvus.proto.schema.DataType element_type = 2;</code>
     *
     * @return The enum numeric value on the wire for elementType.
     */
    int getElementTypeValue();

    /**
     * <code>.milvus.proto.schema.DataType element_type = 2;</code>
     *
     * @return The elementType.
     */
    io.milvus.grpc.DataType getElementType();
}
