// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface GrantPrivilegeEntityOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.GrantPrivilegeEntity)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .milvus.proto.milvus.GrantorEntity entities = 1;</code>
     */
    java.util.List<io.milvus.grpc.GrantorEntity> getEntitiesList();

    /**
     * <code>repeated .milvus.proto.milvus.GrantorEntity entities = 1;</code>
     */
    io.milvus.grpc.GrantorEntity getEntities(int index);

    /**
     * <code>repeated .milvus.proto.milvus.GrantorEntity entities = 1;</code>
     */
    int getEntitiesCount();

    /**
     * <code>repeated .milvus.proto.milvus.GrantorEntity entities = 1;</code>
     */
    java.util.List<? extends io.milvus.grpc.GrantorEntityOrBuilder> getEntitiesOrBuilderList();

    /**
     * <code>repeated .milvus.proto.milvus.GrantorEntity entities = 1;</code>
     */
    io.milvus.grpc.GrantorEntityOrBuilder getEntitiesOrBuilder(int index);
}
