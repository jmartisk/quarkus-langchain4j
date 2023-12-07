// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * <pre>
 *
 * Describe alias response
 * </pre>
 *
 * Protobuf type {@code milvus.proto.milvus.DescribeAliasResponse}
 */
public final class DescribeAliasResponse extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.DescribeAliasResponse)
        DescribeAliasResponseOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use DescribeAliasResponse.newBuilder() to construct.
    private DescribeAliasResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private DescribeAliasResponse() {
        dbName_ = "";
        alias_ = "";
        collection_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new DescribeAliasResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_DescribeAliasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_DescribeAliasResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.DescribeAliasResponse.class,
                        io.milvus.grpc.DescribeAliasResponse.Builder.class);
    }

    private int bitField0_;

    public static final int STATUS_FIELD_NUMBER = 1;

    private io.milvus.grpc.Status status_;

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return Whether the status field is set.
     */
    @java.lang.Override
    public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public io.milvus.grpc.Status getStatus() {
        return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
    }

    /**
     * <pre>
     * Response status
     * </pre>
     *
     * <code>.milvus.proto.common.Status status = 1;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.StatusOrBuilder getStatusOrBuilder() {
        return status_ == null ? io.milvus.grpc.Status.getDefaultInstance() : status_;
    }

    public static final int DB_NAME_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private volatile java.lang.Object dbName_ = "";

    /**
     * <code>string db_name = 2;</code>
     *
     * @return The dbName.
     */
    @java.lang.Override
    public java.lang.String getDbName() {
        java.lang.Object ref = dbName_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            dbName_ = s;
            return s;
        }
    }

    /**
     * <code>string db_name = 2;</code>
     *
     * @return The bytes for dbName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDbNameBytes() {
        java.lang.Object ref = dbName_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            dbName_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int ALIAS_FIELD_NUMBER = 3;

    @SuppressWarnings("serial")
    private volatile java.lang.Object alias_ = "";

    /**
     * <code>string alias = 3;</code>
     *
     * @return The alias.
     */
    @java.lang.Override
    public java.lang.String getAlias() {
        java.lang.Object ref = alias_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            alias_ = s;
            return s;
        }
    }

    /**
     * <code>string alias = 3;</code>
     *
     * @return The bytes for alias.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getAliasBytes() {
        java.lang.Object ref = alias_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            alias_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int COLLECTION_FIELD_NUMBER = 4;

    @SuppressWarnings("serial")
    private volatile java.lang.Object collection_ = "";

    /**
     * <code>string collection = 4;</code>
     *
     * @return The collection.
     */
    @java.lang.Override
    public java.lang.String getCollection() {
        java.lang.Object ref = collection_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            collection_ = s;
            return s;
        }
    }

    /**
     * <code>string collection = 4;</code>
     *
     * @return The bytes for collection.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCollectionBytes() {
        java.lang.Object ref = collection_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            collection_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dbName_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, alias_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collection_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 4, collection_);
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dbName_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, alias_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collection_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, collection_);
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
        if (!(obj instanceof io.milvus.grpc.DescribeAliasResponse)) {
            return super.equals(obj);
        }
        io.milvus.grpc.DescribeAliasResponse other = (io.milvus.grpc.DescribeAliasResponse) obj;
        if (hasStatus() != other.hasStatus())
            return false;
        if (hasStatus()) {
            if (!getStatus().equals(other.getStatus()))
                return false;
        }
        if (!getDbName().equals(other.getDbName()))
            return false;
        if (!getAlias().equals(other.getAlias()))
            return false;
        if (!getCollection().equals(other.getCollection()))
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
        hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getDbName().hashCode();
        hash = (37 * hash) + ALIAS_FIELD_NUMBER;
        hash = (53 * hash) + getAlias().hashCode();
        hash = (37 * hash) + COLLECTION_FIELD_NUMBER;
        hash = (53 * hash) + getCollection().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.DescribeAliasResponse parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.DescribeAliasResponse prototype) {
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
     * <pre>
     *
     * Describe alias response
     * </pre>
     *
     * Protobuf type {@code milvus.proto.milvus.DescribeAliasResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.DescribeAliasResponse)
            io.milvus.grpc.DescribeAliasResponseOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_DescribeAliasResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_DescribeAliasResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.DescribeAliasResponse.class,
                            io.milvus.grpc.DescribeAliasResponse.Builder.class);
        }

        // Construct using io.milvus.grpc.DescribeAliasResponse.newBuilder()
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
            dbName_ = "";
            alias_ = "";
            collection_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_DescribeAliasResponse_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.DescribeAliasResponse getDefaultInstanceForType() {
            return io.milvus.grpc.DescribeAliasResponse.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.DescribeAliasResponse build() {
            io.milvus.grpc.DescribeAliasResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.DescribeAliasResponse buildPartial() {
            io.milvus.grpc.DescribeAliasResponse result = new io.milvus.grpc.DescribeAliasResponse(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.DescribeAliasResponse result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.dbName_ = dbName_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.alias_ = alias_;
            }
            if (((from_bitField0_ & 0x00000008) != 0)) {
                result.collection_ = collection_;
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
            if (other instanceof io.milvus.grpc.DescribeAliasResponse) {
                return mergeFrom((io.milvus.grpc.DescribeAliasResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.DescribeAliasResponse other) {
            if (other == io.milvus.grpc.DescribeAliasResponse.getDefaultInstance())
                return this;
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
            }
            if (!other.getDbName().isEmpty()) {
                dbName_ = other.dbName_;
                bitField0_ |= 0x00000002;
                onChanged();
            }
            if (!other.getAlias().isEmpty()) {
                alias_ = other.alias_;
                bitField0_ |= 0x00000004;
                onChanged();
            }
            if (!other.getCollection().isEmpty()) {
                collection_ = other.collection_;
                bitField0_ |= 0x00000008;
                onChanged();
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
                        case 18: {
                            dbName_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 18
                        case 26: {
                            alias_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        // case 26
                        case 34: {
                            collection_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000008;
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

        private io.milvus.grpc.Status status_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.Status, io.milvus.grpc.Status.Builder, io.milvus.grpc.StatusOrBuilder> statusBuilder_;

        /**
         * <pre>
         * Response status
         * </pre>
         *
         * <code>.milvus.proto.common.Status status = 1;</code>
         *
         * @return Whether the status field is set.
         */
        public boolean hasStatus() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
         * <code>.milvus.proto.common.Status status = 1;</code>
         */
        public io.milvus.grpc.Status.Builder getStatusBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getStatusFieldBuilder().getBuilder();
        }

        /**
         * <pre>
         * Response status
         * </pre>
         *
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
         * <pre>
         * Response status
         * </pre>
         *
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

        private java.lang.Object dbName_ = "";

        /**
         * <code>string db_name = 2;</code>
         *
         * @return The dbName.
         */
        public java.lang.String getDbName() {
            java.lang.Object ref = dbName_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                dbName_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string db_name = 2;</code>
         *
         * @return The bytes for dbName.
         */
        public com.google.protobuf.ByteString getDbNameBytes() {
            java.lang.Object ref = dbName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                dbName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string db_name = 2;</code>
         *
         * @param value The dbName to set.
         * @return This builder for chaining.
         */
        public Builder setDbName(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            dbName_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>string db_name = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDbName() {
            dbName_ = getDefaultInstance().getDbName();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
            return this;
        }

        /**
         * <code>string db_name = 2;</code>
         *
         * @param value The bytes for dbName to set.
         * @return This builder for chaining.
         */
        public Builder setDbNameBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            dbName_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        private java.lang.Object alias_ = "";

        /**
         * <code>string alias = 3;</code>
         *
         * @return The alias.
         */
        public java.lang.String getAlias() {
            java.lang.Object ref = alias_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                alias_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string alias = 3;</code>
         *
         * @return The bytes for alias.
         */
        public com.google.protobuf.ByteString getAliasBytes() {
            java.lang.Object ref = alias_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                alias_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string alias = 3;</code>
         *
         * @param value The alias to set.
         * @return This builder for chaining.
         */
        public Builder setAlias(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            alias_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>string alias = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearAlias() {
            alias_ = getDefaultInstance().getAlias();
            bitField0_ = (bitField0_ & ~0x00000004);
            onChanged();
            return this;
        }

        /**
         * <code>string alias = 3;</code>
         *
         * @param value The bytes for alias to set.
         * @return This builder for chaining.
         */
        public Builder setAliasBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            alias_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        private java.lang.Object collection_ = "";

        /**
         * <code>string collection = 4;</code>
         *
         * @return The collection.
         */
        public java.lang.String getCollection() {
            java.lang.Object ref = collection_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                collection_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>string collection = 4;</code>
         *
         * @return The bytes for collection.
         */
        public com.google.protobuf.ByteString getCollectionBytes() {
            java.lang.Object ref = collection_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                collection_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string collection = 4;</code>
         *
         * @param value The collection to set.
         * @return This builder for chaining.
         */
        public Builder setCollection(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            collection_ = value;
            bitField0_ |= 0x00000008;
            onChanged();
            return this;
        }

        /**
         * <code>string collection = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCollection() {
            collection_ = getDefaultInstance().getCollection();
            bitField0_ = (bitField0_ & ~0x00000008);
            onChanged();
            return this;
        }

        /**
         * <code>string collection = 4;</code>
         *
         * @param value The bytes for collection to set.
         * @return This builder for chaining.
         */
        public Builder setCollectionBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            collection_ = value;
            bitField0_ |= 0x00000008;
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
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.DescribeAliasResponse)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.DescribeAliasResponse)
    private static final io.milvus.grpc.DescribeAliasResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.DescribeAliasResponse();
    }

    public static io.milvus.grpc.DescribeAliasResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DescribeAliasResponse> PARSER = new com.google.protobuf.AbstractParser<DescribeAliasResponse>() {

        @java.lang.Override
        public DescribeAliasResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<DescribeAliasResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DescribeAliasResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.DescribeAliasResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
