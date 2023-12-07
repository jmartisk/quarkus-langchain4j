// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.ListImportTasksRequest}
 */
public final class ListImportTasksRequest extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.ListImportTasksRequest)
        ListImportTasksRequestOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use ListImportTasksRequest.newBuilder() to construct.
    private ListImportTasksRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ListImportTasksRequest() {
        collectionName_ = "";
        dbName_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new ListImportTasksRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ListImportTasksRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ListImportTasksRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.ListImportTasksRequest.class,
                        io.milvus.grpc.ListImportTasksRequest.Builder.class);
    }

    public static final int COLLECTION_NAME_FIELD_NUMBER = 1;

    @SuppressWarnings("serial")
    private volatile java.lang.Object collectionName_ = "";

    /**
     * <pre>
     * target collection, list all tasks if the name is empty
     * </pre>
     *
     * <code>string collection_name = 1;</code>
     *
     * @return The collectionName.
     */
    @java.lang.Override
    public java.lang.String getCollectionName() {
        java.lang.Object ref = collectionName_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            collectionName_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * target collection, list all tasks if the name is empty
     * </pre>
     *
     * <code>string collection_name = 1;</code>
     *
     * @return The bytes for collectionName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCollectionNameBytes() {
        java.lang.Object ref = collectionName_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            collectionName_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int LIMIT_FIELD_NUMBER = 2;

    private long limit_ = 0L;

    /**
     * <pre>
     * maximum number of tasks returned, list all tasks if the value is 0
     * </pre>
     *
     * <code>int64 limit = 2;</code>
     *
     * @return The limit.
     */
    @java.lang.Override
    public long getLimit() {
        return limit_;
    }

    public static final int DB_NAME_FIELD_NUMBER = 3;

    @SuppressWarnings("serial")
    private volatile java.lang.Object dbName_ = "";

    /**
     * <code>string db_name = 3;</code>
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
     * <code>string db_name = 3;</code>
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionName_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collectionName_);
        }
        if (limit_ != 0L) {
            output.writeInt64(2, limit_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dbName_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;
        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionName_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, collectionName_);
        }
        if (limit_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, limit_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dbName_);
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
        if (!(obj instanceof io.milvus.grpc.ListImportTasksRequest)) {
            return super.equals(obj);
        }
        io.milvus.grpc.ListImportTasksRequest other = (io.milvus.grpc.ListImportTasksRequest) obj;
        if (!getCollectionName().equals(other.getCollectionName()))
            return false;
        if (getLimit() != other.getLimit())
            return false;
        if (!getDbName().equals(other.getDbName()))
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
        hash = (37 * hash) + COLLECTION_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getCollectionName().hashCode();
        hash = (37 * hash) + LIMIT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLimit());
        hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getDbName().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.ListImportTasksRequest parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.ListImportTasksRequest prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.ListImportTasksRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.ListImportTasksRequest)
            io.milvus.grpc.ListImportTasksRequestOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ListImportTasksRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ListImportTasksRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.ListImportTasksRequest.class,
                            io.milvus.grpc.ListImportTasksRequest.Builder.class);
        }

        // Construct using io.milvus.grpc.ListImportTasksRequest.newBuilder()
        private Builder() {
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            collectionName_ = "";
            limit_ = 0L;
            dbName_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_ListImportTasksRequest_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.ListImportTasksRequest getDefaultInstanceForType() {
            return io.milvus.grpc.ListImportTasksRequest.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.ListImportTasksRequest build() {
            io.milvus.grpc.ListImportTasksRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.ListImportTasksRequest buildPartial() {
            io.milvus.grpc.ListImportTasksRequest result = new io.milvus.grpc.ListImportTasksRequest(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.ListImportTasksRequest result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.collectionName_ = collectionName_;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.limit_ = limit_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                result.dbName_ = dbName_;
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
            if (other instanceof io.milvus.grpc.ListImportTasksRequest) {
                return mergeFrom((io.milvus.grpc.ListImportTasksRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.ListImportTasksRequest other) {
            if (other == io.milvus.grpc.ListImportTasksRequest.getDefaultInstance())
                return this;
            if (!other.getCollectionName().isEmpty()) {
                collectionName_ = other.collectionName_;
                bitField0_ |= 0x00000001;
                onChanged();
            }
            if (other.getLimit() != 0L) {
                setLimit(other.getLimit());
            }
            if (!other.getDbName().isEmpty()) {
                dbName_ = other.dbName_;
                bitField0_ |= 0x00000004;
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
                            collectionName_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 10
                        case 16: {
                            limit_ = input.readInt64();
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        // case 16
                        case 26: {
                            dbName_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        // case 26
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

        private java.lang.Object collectionName_ = "";

        /**
         * <pre>
         * target collection, list all tasks if the name is empty
         * </pre>
         *
         * <code>string collection_name = 1;</code>
         *
         * @return The collectionName.
         */
        public java.lang.String getCollectionName() {
            java.lang.Object ref = collectionName_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                collectionName_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * target collection, list all tasks if the name is empty
         * </pre>
         *
         * <code>string collection_name = 1;</code>
         *
         * @return The bytes for collectionName.
         */
        public com.google.protobuf.ByteString getCollectionNameBytes() {
            java.lang.Object ref = collectionName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                collectionName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * target collection, list all tasks if the name is empty
         * </pre>
         *
         * <code>string collection_name = 1;</code>
         *
         * @param value The collectionName to set.
         * @return This builder for chaining.
         */
        public Builder setCollectionName(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            collectionName_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * target collection, list all tasks if the name is empty
         * </pre>
         *
         * <code>string collection_name = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCollectionName() {
            collectionName_ = getDefaultInstance().getCollectionName();
            bitField0_ = (bitField0_ & ~0x00000001);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * target collection, list all tasks if the name is empty
         * </pre>
         *
         * <code>string collection_name = 1;</code>
         *
         * @param value The bytes for collectionName to set.
         * @return This builder for chaining.
         */
        public Builder setCollectionNameBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            collectionName_ = value;
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        private long limit_;

        /**
         * <pre>
         * maximum number of tasks returned, list all tasks if the value is 0
         * </pre>
         *
         * <code>int64 limit = 2;</code>
         *
         * @return The limit.
         */
        @java.lang.Override
        public long getLimit() {
            return limit_;
        }

        /**
         * <pre>
         * maximum number of tasks returned, list all tasks if the value is 0
         * </pre>
         *
         * <code>int64 limit = 2;</code>
         *
         * @param value The limit to set.
         * @return This builder for chaining.
         */
        public Builder setLimit(long value) {
            limit_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * maximum number of tasks returned, list all tasks if the value is 0
         * </pre>
         *
         * <code>int64 limit = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLimit() {
            bitField0_ = (bitField0_ & ~0x00000002);
            limit_ = 0L;
            onChanged();
            return this;
        }

        private java.lang.Object dbName_ = "";

        /**
         * <code>string db_name = 3;</code>
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
         * <code>string db_name = 3;</code>
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
         * <code>string db_name = 3;</code>
         *
         * @param value The dbName to set.
         * @return This builder for chaining.
         */
        public Builder setDbName(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            dbName_ = value;
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>string db_name = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearDbName() {
            dbName_ = getDefaultInstance().getDbName();
            bitField0_ = (bitField0_ & ~0x00000004);
            onChanged();
            return this;
        }

        /**
         * <code>string db_name = 3;</code>
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
            bitField0_ |= 0x00000004;
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
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.ListImportTasksRequest)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.ListImportTasksRequest)
    private static final io.milvus.grpc.ListImportTasksRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.ListImportTasksRequest();
    }

    public static io.milvus.grpc.ListImportTasksRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ListImportTasksRequest> PARSER = new com.google.protobuf.AbstractParser<ListImportTasksRequest>() {

        @java.lang.Override
        public ListImportTasksRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<ListImportTasksRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ListImportTasksRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.ListImportTasksRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
