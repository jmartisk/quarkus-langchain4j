// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.GetIndexBuildProgressResponse}
 */
public final class GetIndexBuildProgressResponse extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.GetIndexBuildProgressResponse)
        GetIndexBuildProgressResponseOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use GetIndexBuildProgressResponse.newBuilder() to construct.
    private GetIndexBuildProgressResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetIndexBuildProgressResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GetIndexBuildProgressResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetIndexBuildProgressResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetIndexBuildProgressResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.GetIndexBuildProgressResponse.class,
                        io.milvus.grpc.GetIndexBuildProgressResponse.Builder.class);
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

    public static final int INDEXED_ROWS_FIELD_NUMBER = 2;

    private long indexedRows_ = 0L;

    /**
     * <code>int64 indexed_rows = 2;</code>
     *
     * @return The indexedRows.
     */
    @java.lang.Override
    public long getIndexedRows() {
        return indexedRows_;
    }

    public static final int TOTAL_ROWS_FIELD_NUMBER = 3;

    private long totalRows_ = 0L;

    /**
     * <code>int64 total_rows = 3;</code>
     *
     * @return The totalRows.
     */
    @java.lang.Override
    public long getTotalRows() {
        return totalRows_;
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
        if (indexedRows_ != 0L) {
            output.writeInt64(2, indexedRows_);
        }
        if (totalRows_ != 0L) {
            output.writeInt64(3, totalRows_);
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
        if (indexedRows_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, indexedRows_);
        }
        if (totalRows_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, totalRows_);
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
        if (!(obj instanceof io.milvus.grpc.GetIndexBuildProgressResponse)) {
            return super.equals(obj);
        }
        io.milvus.grpc.GetIndexBuildProgressResponse other = (io.milvus.grpc.GetIndexBuildProgressResponse) obj;
        if (hasStatus() != other.hasStatus())
            return false;
        if (hasStatus()) {
            if (!getStatus().equals(other.getStatus()))
                return false;
        }
        if (getIndexedRows() != other.getIndexedRows())
            return false;
        if (getTotalRows() != other.getTotalRows())
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
        hash = (37 * hash) + INDEXED_ROWS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getIndexedRows());
        hash = (37 * hash) + TOTAL_ROWS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTotalRows());
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.GetIndexBuildProgressResponse prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.GetIndexBuildProgressResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.GetIndexBuildProgressResponse)
            io.milvus.grpc.GetIndexBuildProgressResponseOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetIndexBuildProgressResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetIndexBuildProgressResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.GetIndexBuildProgressResponse.class,
                            io.milvus.grpc.GetIndexBuildProgressResponse.Builder.class);
        }

        // Construct using io.milvus.grpc.GetIndexBuildProgressResponse.newBuilder()
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
            indexedRows_ = 0L;
            totalRows_ = 0L;
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetIndexBuildProgressResponse_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.GetIndexBuildProgressResponse getDefaultInstanceForType() {
            return io.milvus.grpc.GetIndexBuildProgressResponse.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.GetIndexBuildProgressResponse build() {
            io.milvus.grpc.GetIndexBuildProgressResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.GetIndexBuildProgressResponse buildPartial() {
            io.milvus.grpc.GetIndexBuildProgressResponse result = new io.milvus.grpc.GetIndexBuildProgressResponse(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.GetIndexBuildProgressResponse result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.indexedRows_ = indexedRows_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.totalRows_ = totalRows_;
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
            if (other instanceof io.milvus.grpc.GetIndexBuildProgressResponse) {
                return mergeFrom((io.milvus.grpc.GetIndexBuildProgressResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.GetIndexBuildProgressResponse other) {
            if (other == io.milvus.grpc.GetIndexBuildProgressResponse.getDefaultInstance())
                return this;
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
            }
            if (other.getIndexedRows() != 0L) {
                setIndexedRows(other.getIndexedRows());
            }
            if (other.getTotalRows() != 0L) {
                setTotalRows(other.getTotalRows());
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
                            indexedRows_ = input.readInt64();
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 16
                        case 24: {
                            totalRows_ = input.readInt64();
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

        private long indexedRows_;

        /**
         * <code>int64 indexed_rows = 2;</code>
         *
         * @return The indexedRows.
         */
        @java.lang.Override
        public long getIndexedRows() {
            return indexedRows_;
        }

        /**
         * <code>int64 indexed_rows = 2;</code>
         *
         * @param value The indexedRows to set.
         * @return This builder for chaining.
         */
        public Builder setIndexedRows(long value) {
            indexedRows_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>int64 indexed_rows = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIndexedRows() {
            bitField0_ = (bitField0_ & ~0x00000002);
            indexedRows_ = 0L;
            onChanged();
            return this;
        }

        private long totalRows_;

        /**
         * <code>int64 total_rows = 3;</code>
         *
         * @return The totalRows.
         */
        @java.lang.Override
        public long getTotalRows() {
            return totalRows_;
        }

        /**
         * <code>int64 total_rows = 3;</code>
         *
         * @param value The totalRows to set.
         * @return This builder for chaining.
         */
        public Builder setTotalRows(long value) {
            totalRows_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>int64 total_rows = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearTotalRows() {
            bitField0_ = (bitField0_ & ~0x00000004);
            totalRows_ = 0L;
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
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.GetIndexBuildProgressResponse)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.GetIndexBuildProgressResponse)
    private static final io.milvus.grpc.GetIndexBuildProgressResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.GetIndexBuildProgressResponse();
    }

    public static io.milvus.grpc.GetIndexBuildProgressResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetIndexBuildProgressResponse> PARSER = new com.google.protobuf.AbstractParser<GetIndexBuildProgressResponse>() {

        @java.lang.Override
        public GetIndexBuildProgressResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<GetIndexBuildProgressResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetIndexBuildProgressResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.GetIndexBuildProgressResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
