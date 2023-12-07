// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.SelectUserRequest}
 */
public final class SelectUserRequest extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.SelectUserRequest)
        SelectUserRequestOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use SelectUserRequest.newBuilder() to construct.
    private SelectUserRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private SelectUserRequest() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new SelectUserRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_SelectUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_SelectUserRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.SelectUserRequest.class,
                        io.milvus.grpc.SelectUserRequest.Builder.class);
    }

    private int bitField0_;

    public static final int BASE_FIELD_NUMBER = 1;

    private io.milvus.grpc.MsgBase base_;

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return Whether the base field is set.
     */
    @java.lang.Override
    public boolean hasBase() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return The base.
     */
    @java.lang.Override
    public io.milvus.grpc.MsgBase getBase() {
        return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
    }

    /**
     * <pre>
     * Not useful for now
     * </pre>
     *
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.MsgBaseOrBuilder getBaseOrBuilder() {
        return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
    }

    public static final int USER_FIELD_NUMBER = 2;

    private io.milvus.grpc.UserEntity user_;

    /**
     * <pre>
     * user
     * </pre>
     *
     * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
     *
     * @return Whether the user field is set.
     */
    @java.lang.Override
    public boolean hasUser() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <pre>
     * user
     * </pre>
     *
     * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
     *
     * @return The user.
     */
    @java.lang.Override
    public io.milvus.grpc.UserEntity getUser() {
        return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
    }

    /**
     * <pre>
     * user
     * </pre>
     *
     * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.UserEntityOrBuilder getUserOrBuilder() {
        return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
    }

    public static final int INCLUDE_ROLE_INFO_FIELD_NUMBER = 3;

    private boolean includeRoleInfo_ = false;

    /**
     * <pre>
     * include user info
     * </pre>
     *
     * <code>bool include_role_info = 3;</code>
     *
     * @return The includeRoleInfo.
     */
    @java.lang.Override
    public boolean getIncludeRoleInfo() {
        return includeRoleInfo_;
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
            output.writeMessage(1, getBase());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            output.writeMessage(2, getUser());
        }
        if (includeRoleInfo_ != false) {
            output.writeBool(3, includeRoleInfo_);
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
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getBase());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUser());
        }
        if (includeRoleInfo_ != false) {
            size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, includeRoleInfo_);
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
        if (!(obj instanceof io.milvus.grpc.SelectUserRequest)) {
            return super.equals(obj);
        }
        io.milvus.grpc.SelectUserRequest other = (io.milvus.grpc.SelectUserRequest) obj;
        if (hasBase() != other.hasBase())
            return false;
        if (hasBase()) {
            if (!getBase().equals(other.getBase()))
                return false;
        }
        if (hasUser() != other.hasUser())
            return false;
        if (hasUser()) {
            if (!getUser().equals(other.getUser()))
                return false;
        }
        if (getIncludeRoleInfo() != other.getIncludeRoleInfo())
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
        if (hasBase()) {
            hash = (37 * hash) + BASE_FIELD_NUMBER;
            hash = (53 * hash) + getBase().hashCode();
        }
        if (hasUser()) {
            hash = (37 * hash) + USER_FIELD_NUMBER;
            hash = (53 * hash) + getUser().hashCode();
        }
        hash = (37 * hash) + INCLUDE_ROLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIncludeRoleInfo());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.SelectUserRequest parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.SelectUserRequest parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.SelectUserRequest parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.SelectUserRequest prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.SelectUserRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.SelectUserRequest)
            io.milvus.grpc.SelectUserRequestOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_SelectUserRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_SelectUserRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.SelectUserRequest.class,
                            io.milvus.grpc.SelectUserRequest.Builder.class);
        }

        // Construct using io.milvus.grpc.SelectUserRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                getBaseFieldBuilder();
                getUserFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            base_ = null;
            if (baseBuilder_ != null) {
                baseBuilder_.dispose();
                baseBuilder_ = null;
            }
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            includeRoleInfo_ = false;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_SelectUserRequest_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.SelectUserRequest getDefaultInstanceForType() {
            return io.milvus.grpc.SelectUserRequest.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.SelectUserRequest build() {
            io.milvus.grpc.SelectUserRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.SelectUserRequest buildPartial() {
            io.milvus.grpc.SelectUserRequest result = new io.milvus.grpc.SelectUserRequest(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.SelectUserRequest result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.base_ = baseBuilder_ == null ? base_ : baseBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.user_ = userBuilder_ == null ? user_ : userBuilder_.build();
                to_bitField0_ |= 0x00000002;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.includeRoleInfo_ = includeRoleInfo_;
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
            if (other instanceof io.milvus.grpc.SelectUserRequest) {
                return mergeFrom((io.milvus.grpc.SelectUserRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.SelectUserRequest other) {
            if (other == io.milvus.grpc.SelectUserRequest.getDefaultInstance())
                return this;
            if (other.hasBase()) {
                mergeBase(other.getBase());
            }
            if (other.hasUser()) {
                mergeUser(other.getUser());
            }
            if (other.getIncludeRoleInfo() != false) {
                setIncludeRoleInfo(other.getIncludeRoleInfo());
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
                            input.readMessage(getBaseFieldBuilder().getBuilder(), extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 10
                        case 18: {
                            input.readMessage(getUserFieldBuilder().getBuilder(), extensionRegistry);
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 18
                        case 24: {
                            includeRoleInfo_ = input.readBool();
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        // case 24
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

        private io.milvus.grpc.MsgBase base_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.MsgBase, io.milvus.grpc.MsgBase.Builder, io.milvus.grpc.MsgBaseOrBuilder> baseBuilder_;

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         *
         * @return Whether the base field is set.
         */
        public boolean hasBase() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         *
         * @return The base.
         */
        public io.milvus.grpc.MsgBase getBase() {
            if (baseBuilder_ == null) {
                return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
            } else {
                return baseBuilder_.getMessage();
            }
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public Builder setBase(io.milvus.grpc.MsgBase value) {
            if (baseBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                base_ = value;
            } else {
                baseBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public Builder setBase(io.milvus.grpc.MsgBase.Builder builderForValue) {
            if (baseBuilder_ == null) {
                base_ = builderForValue.build();
            } else {
                baseBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public Builder mergeBase(io.milvus.grpc.MsgBase value) {
            if (baseBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) && base_ != null && base_ != io.milvus.grpc.MsgBase.getDefaultInstance()) {
                    getBaseBuilder().mergeFrom(value);
                } else {
                    base_ = value;
                }
            } else {
                baseBuilder_.mergeFrom(value);
            }
            if (base_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public Builder clearBase() {
            bitField0_ = (bitField0_ & ~0x00000001);
            base_ = null;
            if (baseBuilder_ != null) {
                baseBuilder_.dispose();
                baseBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public io.milvus.grpc.MsgBase.Builder getBaseBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getBaseFieldBuilder().getBuilder();
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public io.milvus.grpc.MsgBaseOrBuilder getBaseOrBuilder() {
            if (baseBuilder_ != null) {
                return baseBuilder_.getMessageOrBuilder();
            } else {
                return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
            }
        }

        /**
         * <pre>
         * Not useful for now
         * </pre>
         *
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.MsgBase, io.milvus.grpc.MsgBase.Builder, io.milvus.grpc.MsgBaseOrBuilder> getBaseFieldBuilder() {
            if (baseBuilder_ == null) {
                baseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.MsgBase, io.milvus.grpc.MsgBase.Builder, io.milvus.grpc.MsgBaseOrBuilder>(
                        getBase(), getParentForChildren(), isClean());
                base_ = null;
            }
            return baseBuilder_;
        }

        private io.milvus.grpc.UserEntity user_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder> userBuilder_;

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         *
         * @return Whether the user field is set.
         */
        public boolean hasUser() {
            return ((bitField0_ & 0x00000002) != 0);
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
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
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
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
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        public Builder setUser(io.milvus.grpc.UserEntity.Builder builderForValue) {
            if (userBuilder_ == null) {
                user_ = builderForValue.build();
            } else {
                userBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        public Builder mergeUser(io.milvus.grpc.UserEntity value) {
            if (userBuilder_ == null) {
                if (((bitField0_ & 0x00000002) != 0) && user_ != null
                        && user_ != io.milvus.grpc.UserEntity.getDefaultInstance()) {
                    getUserBuilder().mergeFrom(value);
                } else {
                    user_ = value;
                }
            } else {
                userBuilder_.mergeFrom(value);
            }
            if (user_ != null) {
                bitField0_ |= 0x00000002;
                onChanged();
            }
            return this;
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        public Builder clearUser() {
            bitField0_ = (bitField0_ & ~0x00000002);
            user_ = null;
            if (userBuilder_ != null) {
                userBuilder_.dispose();
                userBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        public io.milvus.grpc.UserEntity.Builder getUserBuilder() {
            bitField0_ |= 0x00000002;
            onChanged();
            return getUserFieldBuilder().getBuilder();
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        public io.milvus.grpc.UserEntityOrBuilder getUserOrBuilder() {
            if (userBuilder_ != null) {
                return userBuilder_.getMessageOrBuilder();
            } else {
                return user_ == null ? io.milvus.grpc.UserEntity.getDefaultInstance() : user_;
            }
        }

        /**
         * <pre>
         * user
         * </pre>
         *
         * <code>.milvus.proto.milvus.UserEntity user = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder> getUserFieldBuilder() {
            if (userBuilder_ == null) {
                userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.UserEntity, io.milvus.grpc.UserEntity.Builder, io.milvus.grpc.UserEntityOrBuilder>(
                        getUser(), getParentForChildren(), isClean());
                user_ = null;
            }
            return userBuilder_;
        }

        private boolean includeRoleInfo_;

        /**
         * <pre>
         * include user info
         * </pre>
         *
         * <code>bool include_role_info = 3;</code>
         *
         * @return The includeRoleInfo.
         */
        @java.lang.Override
        public boolean getIncludeRoleInfo() {
            return includeRoleInfo_;
        }

        /**
         * <pre>
         * include user info
         * </pre>
         *
         * <code>bool include_role_info = 3;</code>
         *
         * @param value The includeRoleInfo to set.
         * @return This builder for chaining.
         */
        public Builder setIncludeRoleInfo(boolean value) {
            includeRoleInfo_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * include user info
         * </pre>
         *
         * <code>bool include_role_info = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIncludeRoleInfo() {
            bitField0_ = (bitField0_ & ~0x00000004);
            includeRoleInfo_ = false;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.SelectUserRequest)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.SelectUserRequest)
    private static final io.milvus.grpc.SelectUserRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.SelectUserRequest();
    }

    public static io.milvus.grpc.SelectUserRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectUserRequest> PARSER = new com.google.protobuf.AbstractParser<SelectUserRequest>() {

        @java.lang.Override
        public SelectUserRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<SelectUserRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectUserRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.SelectUserRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
