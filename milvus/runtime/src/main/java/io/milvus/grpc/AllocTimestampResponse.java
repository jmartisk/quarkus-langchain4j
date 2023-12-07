// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.AllocTimestampResponse}
 */
public final class AllocTimestampResponse extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.AllocTimestampResponse)
        AllocTimestampResponseOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use AllocTimestampResponse.newBuilder() to construct.
    private AllocTimestampResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private AllocTimestampResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new AllocTimestampResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_AllocTimestampResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_AllocTimestampResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.AllocTimestampResponse.class,
                        io.milvus.grpc.AllocTimestampResponse.Builder.class);
    }

    private int bitField0_;

    public static final int STATUS_FIELD_NUMBER = 1;

    private io.milvus.grpc.Status status_;

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    @java.lang.Override
    public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public io.milvus.grpc.Status getStatus() {
        return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
    }

    /**
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.StatusOrBuilder getStatusOrBuilder() {
        return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 2;

    private long timestamp_ = 0L;

    /**
     * <code>uint64 timestamp = 2;</code>
     *
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
        return timestamp_;
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
            output.writeMessage(1, getStatus());
        }
        if (timestamp_ != 0L) {
            output.writeUInt64(2, timestamp_);
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
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStatus());
        }
        if (timestamp_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeUInt64Size(2, timestamp_);
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
        if (!(obj instanceof io.milvus.grpc.AllocTimestampResponse)) {
            return super.equals(obj);
        }
        io.milvus.grpc.AllocTimestampResponse other = (io.milvus.grpc.AllocTimestampResponse) obj;
        if (hasStatus() != other.hasStatus())
            return false;
        if (hasStatus()) {
            if (!getStatus().equals(other.getStatus()))
                return false;
        }
        if (getTimestamp() != other.getTimestamp())
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
        if (hasStatus()) {
            hash = (37 * hash) + STATUS_FIELD_NUMBER;
            hash = (53 * hash) + getStatus().hashCode();
        }
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTimestamp());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.AllocTimestampResponse parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.AllocTimestampResponse prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.AllocTimestampResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.AllocTimestampResponse)
            io.milvus.grpc.AllocTimestampResponseOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_AllocTimestampResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_AllocTimestampResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.AllocTimestampResponse.class,
                            io.milvus.grpc.AllocTimestampResponse.Builder.class);
        }

        // Construct using io.milvus.grpc.AllocTimestampResponse.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
                getStatusFieldBuilder();
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            status_ = null;
            if (statusBuilder_ != null) {
                statusBuilder_.dispose();
                statusBuilder_ = null;
            }
            timestamp_ = 0L;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_AllocTimestampResponse_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.AllocTimestampResponse getDefaultInstanceForType() {
            return io.milvus.grpc.AllocTimestampResponse.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.AllocTimestampResponse build() {
            io.milvus.grpc.AllocTimestampResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.AllocTimestampResponse buildPartial() {
            io.milvus.grpc.AllocTimestampResponse result = new io.milvus.grpc.AllocTimestampResponse(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.AllocTimestampResponse result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.timestamp_ = timestamp_;
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
            if (other instanceof io.milvus.grpc.AllocTimestampResponse) {
                return mergeFrom((io.milvus.grpc.AllocTimestampResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.AllocTimestampResponse other) {
            if (other == io.milvus.grpc.AllocTimestampResponse.getDefaultInstance())
                return this;
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
            }
            if (other.getTimestamp() != 0L) {
                setTimestamp(other.getTimestamp());
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
                            input.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 10
                        case 16: {
                            timestamp_ = input.readUInt64();
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 16
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

        private io.milvus.grpc.Status status_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.Status, io.milvus.grpc.Status.Builder, io.milvus.grpc.StatusOrBuilder> statusBuilder_;

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         *
         * @return Whether the status field is set.
         */
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         *
         * @return The status.
         */
        public io.milvus.grpc.Status getStatus() {
            if (statusBuilder_ == null) {
                return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
            } else {
                return statusBuilder_.getMessage();
            }
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public Builder setStatus(io.milvus.grpc.Status value) {
            if (statusBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                status_ = value;
            } else {
                statusBuilder_.setMessage(value);
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public Builder setStatus(io.milvus.grpc.Status.Builder builderForValue) {
            if (statusBuilder_ == null) {
                status_ = builderForValue.build();
            } else {
                statusBuilder_.setMessage(builderForValue.build());
            }
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public Builder mergeStatus(io.milvus.grpc.Status value) {
            if (statusBuilder_ == null) {
                if (((bitField0_ & 0x00000001) != 0) && status_ != null
                        && status_ != io.milvus.grpc.Status.getDefaultInstance()) {
                    getStatusBuilder().mergeFrom(value);
                } else {
                    status_ = value;
                }
            } else {
                statusBuilder_.mergeFrom(value);
            }
            if (status_ != null) {
                bitField0_ |= 0x00000001;
                onChanged();
            }
            return this;
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public Builder clearStatus() {
            bitField0_ = (bitField0_ & ~0x00000001);
            status_ = null;
            if (statusBuilder_ != null) {
                statusBuilder_.dispose();
                statusBuilder_ = null;
            }
            onChanged();
            return this;
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public io.milvus.grpc.Status.Builder getStatusBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getStatusFieldBuilder().getBuilder();
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public io.milvus.grpc.StatusOrBuilder getStatusOrBuilder() {
            if (statusBuilder_ != null) {
                return statusBuilder_.getMessageOrBuilder();
            } else {
                return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
            }
        }

        /**
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.Status, io.milvus.grpc.Status.Builder, io.milvus.grpc.StatusOrBuilder> getStatusFieldBuilder() {
            if (statusBuilder_ == null) {
                statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.Status, io.milvus.grpc.Status.Builder, io.milvus.grpc.StatusOrBuilder>(
                        getStatus(), getParentForChildren(), isClean());
                status_ = null;
            }
            return statusBuilder_;
        }

        private long timestamp_;

        /**
         * <code>uint64 timestamp = 2;</code>
         *
         * @return The timestamp.
         */
        @java.lang.Override
        public long getTimestamp() {
            return timestamp_;
        }

        /**
         * <code>uint64 timestamp = 2;</code>
         *
         * @param value The timestamp to set.
         * @return This builder for chaining.
         */
        public Builder setTimestamp(long value) {
            timestamp_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>uint64 timestamp = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearTimestamp() {
            bitField0_ = (bitField0_ & ~0x00000002);
            timestamp_ = 0L;
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
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.AllocTimestampResponse)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.AllocTimestampResponse)
    private static final io.milvus.grpc.AllocTimestampResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.AllocTimestampResponse();
    }

    public static io.milvus.grpc.AllocTimestampResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AllocTimestampResponse> PARSER = new com.google.protobuf.AbstractParser<AllocTimestampResponse>() {

        @java.lang.Override
        public AllocTimestampResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<AllocTimestampResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AllocTimestampResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.AllocTimestampResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
