// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface UserResultOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.UserResult)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     *
     * @return Whether the user field is set.
     */
    boolean hasUser();

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     *
     * @return The user.
     */
    io.milvus.grpc.UserEntity getUser();

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     */
    io.milvus.grpc.UserEntityOrBuilder getUserOrBuilder();

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    java.util.List<io.milvus.grpc.RoleEntity> getRolesList();

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    io.milvus.grpc.RoleEntity getRoles(int index);

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    int getRolesCount();

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    java.util.List<? extends io.milvus.grpc.RoleEntityOrBuilder> getRolesOrBuilderList();

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    io.milvus.grpc.RoleEntityOrBuilder getRolesOrBuilder(int index);
}
