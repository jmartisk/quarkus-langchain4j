// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.UserResult}
 */
public final class UserResult extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.UserResult)
        UserResultOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use UserResult.newBuilder() to construct.
    private UserResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private UserResult() {
        roles_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new UserResult();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_UserResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_UserResult_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.UserResult.class, io.milvus.grpc.UserResult.Builder.class);
    }

    private int bitField0_;

    public static final int USER_FIELD_NUMBER = 1;

    private io.milvus.grpc.UserEntity user_;

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     *
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     *
     * @return The user.
     */
    @java.lang.Override
    public io.milvus.grpc.UserEntity getUser() {
        return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
    }

    /**
     * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.UserEntityOrBuilder getUserOrBuilder() {
        return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
    }

    public static final int ROLES_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private java.util.List<io.milvus.grpc.RoleEntity> roles_;

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    @java.lang.Override
    public java.util.List<io.milvus.grpc.RoleEntity> getRolesList() {
        return roles_;
    }

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.milvus.grpc.RoleEntityOrBuilder> getRolesOrBuilderList() {
        return roles_;
    }

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    @java.lang.Override
    public int getRolesCount() {
        return roles_.size();
    }

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.RoleEntity getRoles(int index) {
        return roles_.get(index);
    }

    /**
     * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.RoleEntityOrBuilder getRolesOrBuilder(int index) {
        return roles_.get(index);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;
        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
            output.writeMessage(1, getUser());
        }
        for (int i = 0; i < roles_.size(); i++) {
            output.writeMessage(2, roles_.get(i));
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUser());
        }
        for (int i = 0; i < roles_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, roles_.get(i));
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof io.milvus.grpc.UserResult)) {
            return super.equals(obj);
        }
        io.milvus.grpc.UserResult other = (io.milvus.grpc.UserResult) obj;
        if (hasUser() != other.hasUser())
            return false;
        if (hasUser()) {
            if (!getUser().equals(other.getUser()))
                return false;
        }
        if (!getRolesList().equals(other.getRolesList()))
            return false;
        if (!getUnknownFields().equals(other.getUnknownFields()))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        if (getRolesCount() > 0) {
            hash = (37 * hash) + ROLES_FIELD_NUMBER;
            hash = (53 * hash) + getRolesList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.UserResult parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.UserResult parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.UserResult parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.UserResult parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.UserResult parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.UserResult parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.UserResult parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.UserResult parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.UserResult parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.UserResult parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.UserResult parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.UserResult parseFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(io.milvus.grpc.UserResult prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code milvus.proto.milvus.UserResult}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.UserResult)
            io.milvus.grpc.UserResultOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_UserResult_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_UserResult_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.UserResult.class, io.milvus.grpc.UserResult.Builder.class);
        }

        // Construct using io.milvus.grpc.UserResult.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                getUserFieldBuilder();
                getRolesFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            if (rolesBuilder_ == null) {
                roles_ = java.util.Collections.emptyList();
            } else {
                roles_ = null;
                rolesBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_UserResult_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.UserResult getDefaultInstanceForType() {
            return io.milvus.grpc.UserResult.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.UserResult build() {
            io.milvus.grpc.UserResult result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.UserResult buildPartial() {
            io.milvus.grpc.UserResult result = new io.milvus.grpc.UserResult(this);
            buildPartialRepeatedFields(result);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartialRepeatedFields(io.milvus.grpc.UserResult result) {
            if (rolesBuilder_ == null) {
                if (((bitField0_ & 0x00000002) != 0)) {
                    roles_ = java.util.Collections.unmodifiableList(roles_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.roles_ = roles_;
            } else {
                result.roles_ = rolesBuilder_.build();
            }
        }

        private void buildPartial0(io.milvus.grpc.UserResult result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.user_ = userBuilder_ == null ? user_ : userBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof io.milvus.grpc.UserResult) {
                return mergeFrom((io.milvus.grpc.UserResult) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.UserResult other) {
            if (other == io.milvus.grpc.UserResult.getDefaultInstance())
                return this;
            if (other.hasUser()) {
                mergeUser(other.getUser());
            }
            if (rolesBuilder_ == null) {
                if (!other.roles_.isEmpty()) {
                    if (roles_.isEmpty()) {
                        roles_ = other.roles_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureRolesIsMutable();
                        roles_.addAll(other.roles_);
                    }
                    onChanged();
                }
            } else {
                if (!other.roles_.isEmpty()) {
                    if (rolesBuilder_.isEmpty()) {
                        rolesBuilder_.dispose();
                        rolesBuilder_ = null;
                        roles_ = other.roles_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        rolesBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getRolesFieldBuilder()
                                : null;
                    } else {
                        rolesBuilder_.addAllMessages(other.roles_);
                    }
                }
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 10: {
                            input.readMessage(getUserFieldBuilder().getBuilder(), extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 10
                        case 18: {
                            io.milvus.grpc.RoleEntity m = input.readMessage(io.milvus.grpc.RoleEntity.parser(),
                                    extensionRegistry);
                            if (rolesBuilder_ == null) {
                                ensureRolesIsMutable();
                                roles_.add(m);
                            } else {
                                rolesBuilder_.addMessage(m);
                            }
                            break;
                        }
                        // case 18
                        default: {
                            if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                // was an endgroup tag
                                done = true;
                            }
                            break;
                        }
                    }
                    // switch (tag)
                }
                // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            }
            // finally
            return this;
        }

        private int bitField0_;

        private io.milvus.grpc.UserEntity user_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder> userBuilder_;

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         *
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         *
         * @return The user.
         */
        public io.milvus.grpc.UserEntity getUser() {
            if (userBuilder_ == null) {
                return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
            } else {
                return userBuilder_.getMessage();
            }
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public Builder setUser(io.milvus.grpc.UserEntity value) {
            if (userBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                user_ = value;
            } else {
                userBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public Builder setUser(io.milvus.grpc.UserEntity.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public Builder mergeUser(io.milvus.grpc.UserEntity value) {
            if (userBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) && user_ != null
                        && user_ != io.milvus.grpc.UserEntity.getDefaultInstance()) {
                    getUserBuilder().mergeFrom(value);
                } else {
                    user_ = value;
                }
            } else {
                userBuilder_.mergeFrom(value);
            }
            if (user_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public Builder clearUser() {
            bitField0_ = (bitField0_ & ~0x00000001);
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public io.milvus.grpc.UserEntity.Builder getUserBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        public io.milvus.grpc.UserEntityOrBuilder getUserOrBuilder() {
            if (userBuilder_ != null) {
                return userBuilder_.getMessageOrBuilder();
            } else {
                return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
            }
        }

        /**
         * <code>.milvus.proto.milvus.UserEntity user = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder> getUserFieldBuilder() {
            if (userBuilder_ == null) {
                userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder>(
                        getUser(), getParentForChildren(), isClean());
                user_ = null;
            }
            return userBuilder_;
        }

        private java.util.List<io.milvus.grpc.RoleEntity> roles_ = java.util.Collections.emptyList();

        private void ensureRolesIsMutable() {
            if (!((bitField0_ & 0x00000002) != 0)) {
                roles_ = new java.util.ArrayList<io.milvus.grpc.RoleEntity>(roles_);
                bitField0_ |= 0x00000002;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.RoleEntity, io.milvus.grpc.RoleEntity.Builder, io.milvus.grpc.RoleEntityOrBuilder> rolesBuilder_;

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public java.util.List<io.milvus.grpc.RoleEntity> getRolesList() {
            if (rolesBuilder_ == null) {
                return java.util.Collections.unmodifiableList(roles_);
            } else {
                return rolesBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public int getRolesCount() {
            if (rolesBuilder_ == null) {
                return roles_.size();
            } else {
                return rolesBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public io.milvus.grpc.RoleEntity getRoles(int index) {
            if (rolesBuilder_ == null) {
                return roles_.get(index);
            } else {
                return rolesBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder setRoles(int index, io.milvus.grpc.RoleEntity value) {
            if (rolesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureRolesIsMutable();
                roles_.set(index, value);
                onChanged();
            } else {
                rolesBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder setRoles(int index, io.milvus.grpc.RoleEntity.Builder builderForValue) {
            if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.set(index, builderForValue.build());
                onChanged();
            } else {
                rolesBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder addRoles(io.milvus.grpc.RoleEntity value) {
            if (rolesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureRolesIsMutable();
                roles_.add(value);
                onChanged();
            } else {
                rolesBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder addRoles(int index, io.milvus.grpc.RoleEntity value) {
            if (rolesBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureRolesIsMutable();
                roles_.add(index, value);
                onChanged();
            } else {
                rolesBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder addRoles(io.milvus.grpc.RoleEntity.Builder builderForValue) {
            if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.add(builderForValue.build());
                onChanged();
            } else {
                rolesBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder addRoles(int index, io.milvus.grpc.RoleEntity.Builder builderForValue) {
            if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.add(index, builderForValue.build());
                onChanged();
            } else {
                rolesBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder addAllRoles(java.lang.Iterable<? extends io.milvus.grpc.RoleEntity> values) {
            if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, roles_);
                onChanged();
            } else {
                rolesBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder clearRoles() {
            if (rolesBuilder_ == null) {
                roles_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                rolesBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public Builder removeRoles(int index) {
            if (rolesBuilder_ == null) {
                ensureRolesIsMutable();
                roles_.remove(index);
                onChanged();
            } else {
                rolesBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public io.milvus.grpc.RoleEntity.Builder getRolesBuilder(int index) {
            return getRolesFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public io.milvus.grpc.RoleEntityOrBuilder getRolesOrBuilder(int index) {
            if (rolesBuilder_ == null) {
                return roles_.get(index);
            } else {
                return rolesBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public java.util.List<? extends io.milvus.grpc.RoleEntityOrBuilder> getRolesOrBuilderList() {
            if (rolesBuilder_ != null) {
                return rolesBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(roles_);
            }
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public io.milvus.grpc.RoleEntity.Builder addRolesBuilder() {
            return getRolesFieldBuilder().addBuilder(io.milvus.grpc.RoleEntity.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public io.milvus.grpc.RoleEntity.Builder addRolesBuilder(int index) {
            return getRolesFieldBuilder().addBuilder(index, io.milvus.grpc.RoleEntity.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.milvus.RoleEntity roles = 2;</code>
         */
        public java.util.List<io.milvus.grpc.RoleEntity.Builder> getRolesBuilderList() {
            return getRolesFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.RoleEntity, io.milvus.grpc.RoleEntity.Builder, io.milvus.grpc.RoleEntityOrBuilder> getRolesFieldBuilder() {
            if (rolesBuilder_ == null) {
                rolesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.RoleEntity, io.milvus.grpc.RoleEntity.Builder, io.milvus.grpc.RoleEntityOrBuilder>(
                        roles_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
                roles_ = null;
            }
            return rolesBuilder_;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.UserResult)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.UserResult)
    private static final io.milvus.grpc.UserResult DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.UserResult();
    }

    public static io.milvus.grpc.UserResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserResult> PARSER = new com.google.protobuf.AbstractParser<UserResult>() {

        @java.lang.Override
        public UserResult parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            Builder builder = newBuilder();
            try {
                builder.mergeFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
            } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(builder.buildPartial());
            }
            return builder.buildPartial();
        }
    };

    public static com.google.protobuf.Parser<UserResult> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserResult> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.UserResult getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
