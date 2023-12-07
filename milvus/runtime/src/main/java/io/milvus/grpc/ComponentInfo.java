// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.ComponentInfo}
 */
public final class ComponentInfo extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.ComponentInfo)
        ComponentInfoOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use ComponentInfo.newBuilder() to construct.
    private ComponentInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ComponentInfo() {
        role_ = "";
        stateCode_ = 0;
        extraInfo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new ComponentInfo();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ComponentInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ComponentInfo_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.ComponentInfo.class,
                        io.milvus.grpc.ComponentInfo.Builder.class);
    }

    public static final int NODEID_FIELD_NUMBER = 1;

    private long nodeID_ = 0L;

    /**
     * <code>int64 nodeID = 1;</code>
     *
     * @return The nodeID.
     */
    @java.lang.Override
    public long getNodeID() {
        return nodeID_;
    }

    public static final int ROLE_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private volatile java.lang.Object role_ = "";

    /**
     * <code>string role = 2;</code>
     *
     * @return The role.
     */
    @java.lang.Override
    public java.lang.String getRole() {
        java.lang.Object ref = role_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            role_ = s;
            return s;
        }
    }

    /**
     * <code>string role = 2;</code>
     *
     * @return The bytes for role.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRoleBytes() {
        java.lang.Object ref = role_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            role_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int STATE_CODE_FIELD_NUMBER = 3;

    private int stateCode_ = 0;

    /**
     * <code>.milvus.proto.common.StateCode state_code = 3;</code>
     *
     * @return The enum numeric value on the wire for stateCode.
     */
    @java.lang.Override
    public int getStateCodeValue() {
        return stateCode_;
    }

    /**
     * <code>.milvus.proto.common.StateCode state_code = 3;</code>
     *
     * @return The stateCode.
     */
    @java.lang.Override
    public io.milvus.grpc.StateCode getStateCode() {
        io.milvus.grpc.StateCode result = io.milvus.grpc.StateCode.forNumber(stateCode_);
        return result == null ? io.milvus.grpc.StateCode.UNRECOGNIZED : result;
    }

    public static final int EXTRA_INFO_FIELD_NUMBER = 4;

    @SuppressWarnings("serial")
    private java.util.List<io.milvus.grpc.KeyValuePair> extraInfo_;

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
     */
    @java.lang.Override
    public java.util.List<io.milvus.grpc.KeyValuePair> getExtraInfoList() {
        return extraInfo_;
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getExtraInfoOrBuilderList() {
        return extraInfo_;
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
     */
    @java.lang.Override
    public int getExtraInfoCount() {
        return extraInfo_.size();
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.KeyValuePair getExtraInfo(int index) {
        return extraInfo_.get(index);
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.KeyValuePairOrBuilder getExtraInfoOrBuilder(int index) {
        return extraInfo_.get(index);
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
        if (nodeID_ != 0L) {
            output.writeInt64(1, nodeID_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, role_);
        }
        if (stateCode_ != io.milvus.grpc.StateCode.Initializing.getNumber()) {
            output.writeEnum(3, stateCode_);
        }
        for (int i = 0; i < extraInfo_.size(); i++) {
            output.writeMessage(4, extraInfo_.get(i));
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (nodeID_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, nodeID_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(role_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, role_);
        }
        if (stateCode_ != io.milvus.grpc.StateCode.Initializing.getNumber()) {
            size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, stateCode_);
        }
        for (int i = 0; i < extraInfo_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, extraInfo_.get(i));
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
        if (!(obj instanceof io.milvus.grpc.ComponentInfo)) {
            return super.equals(obj);
        }
        io.milvus.grpc.ComponentInfo other = (io.milvus.grpc.ComponentInfo) obj;
        if (getNodeID() != other.getNodeID())
            return false;
        if (!getRole().equals(other.getRole()))
            return false;
        if (stateCode_ != other.stateCode_)
            return false;
        if (!getExtraInfoList().equals(other.getExtraInfoList()))
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
        hash = (37 * hash) + NODEID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getNodeID());
        hash = (37 * hash) + ROLE_FIELD_NUMBER;
        hash = (53 * hash) + getRole().hashCode();
        hash = (37 * hash) + STATE_CODE_FIELD_NUMBER;
        hash = (53 * hash) + stateCode_;
        if (getExtraInfoCount() > 0) {
            hash = (37 * hash) + EXTRA_INFO_FIELD_NUMBER;
            hash = (53 * hash) + getExtraInfoList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.ComponentInfo parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ComponentInfo parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ComponentInfo parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.ComponentInfo prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.ComponentInfo}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.ComponentInfo)
            io.milvus.grpc.ComponentInfoOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ComponentInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ComponentInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.ComponentInfo.class,
                            io.milvus.grpc.ComponentInfo.Builder.class);
        }

        // Construct using io.milvus.grpc.ComponentInfo.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            nodeID_ = 0L;
            role_ = "";
            stateCode_ = 0;
            if (extraInfoBuilder_ == null) {
                extraInfo_ = java.util.Collections.emptyList();
            } else {
                extraInfo_ = null;
                extraInfoBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000008);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ComponentInfo_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.ComponentInfo getDefaultInstanceForType() {
            return io.milvus.grpc.ComponentInfo.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.ComponentInfo build() {
            io.milvus.grpc.ComponentInfo result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.ComponentInfo buildPartial() {
            io.milvus.grpc.ComponentInfo result = new io.milvus.grpc.ComponentInfo(this);
            buildPartialRepeatedFields(result);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartialRepeatedFields(io.milvus.grpc.ComponentInfo result) {
            if (extraInfoBuilder_ == null) {
                if (((bitField0_ & 0x00000008) != 0)) {
                    extraInfo_ = java.util.Collections.unmodifiableList(extraInfo_);
                    bitField0_ = (bitField0_ & ~0x00000008);
                }
                result.extraInfo_ = extraInfo_;
            } else {
                result.extraInfo_ = extraInfoBuilder_.build();
            }
        }

        private void buildPartial0(io.milvus.grpc.ComponentInfo result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.nodeID_ = nodeID_;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.role_ = role_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.stateCode_ = stateCode_;
            }
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
            if (other instanceof io.milvus.grpc.ComponentInfo) {
                return mergeFrom((io.milvus.grpc.ComponentInfo) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.ComponentInfo other) {
            if (other == io.milvus.grpc.ComponentInfo.getDefaultInstance())
                return this;
            if (other.getNodeID() != 0L) {
                setNodeID(other.getNodeID());
            }
            if (!other.getRole().isEmpty()) {
                role_ = other.role_;
                bitField0_ |= 0x00000002;
                onChanged();
            }
            if (other.stateCode_ != 0) {
                setStateCodeValue(other.getStateCodeValue());
            }
            if (extraInfoBuilder_ == null) {
                if (!other.extraInfo_.isEmpty()) {
                    if (extraInfo_.isEmpty()) {
                        extraInfo_ = other.extraInfo_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                    } else {
                        ensureExtraInfoIsMutable();
                        extraInfo_.addAll(other.extraInfo_);
                    }
                    onChanged();
                }
            } else {
                if (!other.extraInfo_.isEmpty()) {
                    if (extraInfoBuilder_.isEmpty()) {
                        extraInfoBuilder_.dispose();
                        extraInfoBuilder_ = null;
                        extraInfo_ = other.extraInfo_;
                        bitField0_ = (bitField0_ & ~0x00000008);
                        extraInfoBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                                ? getExtraInfoFieldBuilder()
                                : null;
                    } else {
                        extraInfoBuilder_.addAllMessages(other.extraInfo_);
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
                        case 8: {
                            nodeID_ = input.readInt64();
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 8
                        case 18: {
                            role_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 18
                        case 24: {
                            stateCode_ = input.readEnum();
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        // case 24
                        case 34: {
                            io.milvus.grpc.KeyValuePair m = input.readMessage(io.milvus.grpc.KeyValuePair.parser(),
                                    extensionRegistry);
                            if (extraInfoBuilder_ == null) {
                                ensureExtraInfoIsMutable();
                                extraInfo_.add(m);
                            } else {
                                extraInfoBuilder_.addMessage(m);
                            }
                            break;
                        }
                        // case 34
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

        private long nodeID_;

        /**
         * <code>int64 nodeID = 1;</code>
         *
         * @return The nodeID.
         */
        @java.lang.Override
        public long getNodeID() {
            return nodeID_;
        }

        /**
         * <code>int64 nodeID = 1;</code>
         *
         * @param value The nodeID to set.
         * @return This builder for chaining.
         */
        public Builder setNodeID(long value) {
            nodeID_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>int64 nodeID = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearNodeID() {
            bitField0_ = (bitField0_ & ~0x00000001);
            nodeID_ = 0L;
            onChanged();
            return this;
        }

        private java.lang.Object role_ = "";

        /**
         * <code>string role = 2;</code>
         *
         * @return The role.
         */
        public java.lang.String getRole() {
            java.lang.Object ref = role_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                role_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string role = 2;</code>
         *
         * @return The bytes for role.
         */
        public com.google.protobuf.ByteString getRoleBytes() {
            java.lang.Object ref = role_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                role_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string role = 2;</code>
         *
         * @param value The role to set.
         * @return This builder for chaining.
         */
        public Builder setRole(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            role_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>string role = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearRole() {
            role_ = getDefaultInstance().getRole();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
            return this;
        }

        /**
         * <code>string role = 2;</code>
         *
         * @param value The bytes for role to set.
         * @return This builder for chaining.
         */
        public Builder setRoleBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            role_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        private int stateCode_ = 0;

        /**
         * <code>.milvus.proto.common.StateCode state_code = 3;</code>
         *
         * @return The enum numeric value on the wire for stateCode.
         */
        @java.lang.Override
        public int getStateCodeValue() {
            return stateCode_;
        }

        /**
         * <code>.milvus.proto.common.StateCode state_code = 3;</code>
         *
         * @param value The enum numeric value on the wire for stateCode to set.
         * @return This builder for chaining.
         */
        public Builder setStateCodeValue(int value) {
            stateCode_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.common.StateCode state_code = 3;</code>
         *
         * @return The stateCode.
         */
        @java.lang.Override
        public io.milvus.grpc.StateCode getStateCode() {
            io.milvus.grpc.StateCode result = io.milvus.grpc.StateCode.forNumber(stateCode_);
            return result == null ? io.milvus.grpc.StateCode.UNRECOGNIZED : result;
        }

        /**
         * <code>.milvus.proto.common.StateCode state_code = 3;</code>
         *
         * @param value The stateCode to set.
         * @return This builder for chaining.
         */
        public Builder setStateCode(io.milvus.grpc.StateCode value) {
            if (value == null) {
                throw new NullPointerException();
            }
            bitField0_ |= 0x00000004;
            stateCode_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.common.StateCode state_code = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearStateCode() {
            bitField0_ = (bitField0_ & ~0x00000004);
            stateCode_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<io.milvus.grpc.KeyValuePair> extraInfo_ = java.util.Collections.emptyList();

        private void ensureExtraInfoIsMutable() {
            if (!((bitField0_ & 0x00000008) != 0)) {
                extraInfo_ = new java.util.ArrayList<io.milvus.grpc.KeyValuePair>(extraInfo_);
                bitField0_ |= 0x00000008;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder> extraInfoBuilder_;

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public java.util.List<io.milvus.grpc.KeyValuePair> getExtraInfoList() {
            if (extraInfoBuilder_ == null) {
                return java.util.Collections.unmodifiableList(extraInfo_);
            } else {
                return extraInfoBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public int getExtraInfoCount() {
            if (extraInfoBuilder_ == null) {
                return extraInfo_.size();
            } else {
                return extraInfoBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public io.milvus.grpc.KeyValuePair getExtraInfo(int index) {
            if (extraInfoBuilder_ == null) {
                return extraInfo_.get(index);
            } else {
                return extraInfoBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder setExtraInfo(int index, io.milvus.grpc.KeyValuePair value) {
            if (extraInfoBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExtraInfoIsMutable();
                extraInfo_.set(index, value);
                onChanged();
            } else {
                extraInfoBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder setExtraInfo(int index, io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (extraInfoBuilder_ == null) {
                ensureExtraInfoIsMutable();
                extraInfo_.set(index, builderForValue.build());
                onChanged();
            } else {
                extraInfoBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder addExtraInfo(io.milvus.grpc.KeyValuePair value) {
            if (extraInfoBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExtraInfoIsMutable();
                extraInfo_.add(value);
                onChanged();
            } else {
                extraInfoBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder addExtraInfo(int index, io.milvus.grpc.KeyValuePair value) {
            if (extraInfoBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureExtraInfoIsMutable();
                extraInfo_.add(index, value);
                onChanged();
            } else {
                extraInfoBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder addExtraInfo(io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (extraInfoBuilder_ == null) {
                ensureExtraInfoIsMutable();
                extraInfo_.add(builderForValue.build());
                onChanged();
            } else {
                extraInfoBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder addExtraInfo(int index, io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (extraInfoBuilder_ == null) {
                ensureExtraInfoIsMutable();
                extraInfo_.add(index, builderForValue.build());
                onChanged();
            } else {
                extraInfoBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder addAllExtraInfo(java.lang.Iterable<? extends io.milvus.grpc.KeyValuePair> values) {
            if (extraInfoBuilder_ == null) {
                ensureExtraInfoIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, extraInfo_);
                onChanged();
            } else {
                extraInfoBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder clearExtraInfo() {
            if (extraInfoBuilder_ == null) {
                extraInfo_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000008);
                onChanged();
            } else {
                extraInfoBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public Builder removeExtraInfo(int index) {
            if (extraInfoBuilder_ == null) {
                ensureExtraInfoIsMutable();
                extraInfo_.remove(index);
                onChanged();
            } else {
                extraInfoBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder getExtraInfoBuilder(int index) {
            return getExtraInfoFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public io.milvus.grpc.KeyValuePairOrBuilder getExtraInfoOrBuilder(int index) {
            if (extraInfoBuilder_ == null) {
                return extraInfo_.get(index);
            } else {
                return extraInfoBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getExtraInfoOrBuilderList() {
            if (extraInfoBuilder_ != null) {
                return extraInfoBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(extraInfo_);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder addExtraInfoBuilder() {
            return getExtraInfoFieldBuilder().addBuilder(io.milvus.grpc.KeyValuePair.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder addExtraInfoBuilder(int index) {
            return getExtraInfoFieldBuilder().addBuilder(index, io.milvus.grpc.KeyValuePair.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair extra_info = 4;</code>
         */
        public java.util.List<io.milvus.grpc.KeyValuePair.Builder> getExtraInfoBuilderList() {
            return getExtraInfoFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder> getExtraInfoFieldBuilder() {
            if (extraInfoBuilder_ == null) {
                extraInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder>(
                        extraInfo_, ((bitField0_ & 0x00000008) != 0), getParentForChildren(), isClean());
                extraInfo_ = null;
            }
            return extraInfoBuilder_;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.ComponentInfo)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.ComponentInfo)
    private static final io.milvus.grpc.ComponentInfo DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.ComponentInfo();
    }

    public static io.milvus.grpc.ComponentInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ComponentInfo> PARSER = new com.google.protobuf.AbstractParser<ComponentInfo>() {

        @java.lang.Override
        public ComponentInfo parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<ComponentInfo> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ComponentInfo> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.ComponentInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
