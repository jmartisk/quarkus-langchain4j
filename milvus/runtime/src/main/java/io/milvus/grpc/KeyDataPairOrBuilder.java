// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto
package io.milvus.grpc;

public interface KeyDataPairOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.common.KeyDataPair)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string key = 1;</code>
     *
     * @return The key.
     */
    java.lang.String getKey();

    /**
     * <code>string key = 1;</code>
     *
     * @return The bytes for key.
     */
    com.google.protobuf.ByteString getKeyBytes();

    /**
     * <code>bytes data = 2;</code>
     *
     * @return The data.
     */
    com.google.protobuf.ByteString getData();
}
