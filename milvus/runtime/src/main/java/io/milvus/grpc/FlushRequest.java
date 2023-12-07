// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.FlushRequest}
 */
public final class FlushRequest extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.FlushRequest)
        FlushRequestOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use FlushRequest.newBuilder() to construct.
    private FlushRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private FlushRequest() {
        dbName_ = "";
        collectionNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new FlushRequest();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_FlushRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_FlushRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.FlushRequest.class, io.milvus.grpc.FlushRequest.Builder.class);
    }

    private int bitField0_;

    public static final int BASE_FIELD_NUMBER = 1;

    private io.milvus.grpc.MsgBase base_;

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return Whether the base field is set.
     */
    @java.lang.Override
    public boolean hasBase() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     *
     * @return The base.
     */
    @java.lang.Override
    public io.milvus.grpc.MsgBase getBase() {
        return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
    }

    /**
     * <code>.milvus.proto.common.MsgBase base = 1;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.MsgBaseOrBuilder getBaseOrBuilder() {
        return base_ == null ? io.milvus.grpc.MsgBase.getDefaultInstance() : base_;
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

    public static final int COLLECTION_NAMES_FIELD_NUMBER = 3;

    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList collectionNames_ = com.google.protobuf.LazyStringArrayList.emptyList();

    /**
     * <code>repeated string collection_names = 3;</code>
     *
     * @return A list containing the collectionNames.
     */
    public com.google.protobuf.ProtocolStringList getCollectionNamesList() {
        return collectionNames_;
    }

    /**
     * <code>repeated string collection_names = 3;</code>
     *
     * @return The count of collectionNames.
     */
    public int getCollectionNamesCount() {
        return collectionNames_.size();
    }

    /**
     * <code>repeated string collection_names = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The collectionNames at the given index.
     */
    public java.lang.String getCollectionNames(int index) {
        return collectionNames_.get(index);
    }

    /**
     * <code>repeated string collection_names = 3;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the collectionNames at the given index.
     */
    public com.google.protobuf.ByteString getCollectionNamesBytes(int index) {
        return collectionNames_.getByteString(index);
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dbName_);
        }
        for (int i = 0; i < collectionNames_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, collectionNames_.getRaw(i));
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
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dbName_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < collectionNames_.size(); i++) {
                dataSize += computeStringSizeNoTag(collectionNames_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getCollectionNamesList().size();
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
        if (!(obj instanceof io.milvus.grpc.FlushRequest)) {
            return super.equals(obj);
        }
        io.milvus.grpc.FlushRequest other = (io.milvus.grpc.FlushRequest) obj;
        if (hasBase() != other.hasBase())
            return false;
        if (hasBase()) {
            if (!getBase().equals(other.getBase()))
                return false;
        }
        if (!getDbName().equals(other.getDbName()))
            return false;
        if (!getCollectionNamesList().equals(other.getCollectionNamesList()))
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
        hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getDbName().hashCode();
        if (getCollectionNamesCount() > 0) {
            hash = (37 * hash) + COLLECTION_NAMES_FIELD_NUMBER;
            hash = (53 * hash) + getCollectionNamesList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.FlushRequest parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.FlushRequest parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.FlushRequest parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.FlushRequest parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.FlushRequest prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.FlushRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.FlushRequest)
            io.milvus.grpc.FlushRequestOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_FlushRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_FlushRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.FlushRequest.class,
                            io.milvus.grpc.FlushRequest.Builder.class);
        }

        // Construct using io.milvus.grpc.FlushRequest.newBuilder()
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
            dbName_ = "";
            collectionNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_FlushRequest_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.FlushRequest getDefaultInstanceForType() {
            return io.milvus.grpc.FlushRequest.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.FlushRequest build() {
            io.milvus.grpc.FlushRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.FlushRequest buildPartial() {
            io.milvus.grpc.FlushRequest result = new io.milvus.grpc.FlushRequest(this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(io.milvus.grpc.FlushRequest result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.base_ = baseBuilder_ == null ? base_ : baseBuilder_.build();
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.dbName_ = dbName_;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                collectionNames_.makeImmutable();
                result.collectionNames_ = collectionNames_;
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
            if (other instanceof io.milvus.grpc.FlushRequest) {
                return mergeFrom((io.milvus.grpc.FlushRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.FlushRequest other) {
            if (other == io.milvus.grpc.FlushRequest.getDefaultInstance())
                return this;
            if (other.hasBase()) {
                mergeBase(other.getBase());
            }
            if (!other.getDbName().isEmpty()) {
                dbName_ = other.dbName_;
                bitField0_ |= 0x00000002;
                onChanged();
            }
            if (!other.collectionNames_.isEmpty()) {
                if (collectionNames_.isEmpty()) {
                    collectionNames_ = other.collectionNames_;
                    bitField0_ |= 0x00000004;
                } else {
                    ensureCollectionNamesIsMutable();
                    collectionNames_.addAll(other.collectionNames_);
                }
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
                            input.readMessage(getBaseFieldBuilder().getBuilder(), extensionRegistry);
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
                            java.lang.String s = input.readStringRequireUtf8();
                            ensureCollectionNamesIsMutable();
                            collectionNames_.add(s);
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

        private io.milvus.grpc.MsgBase base_;

        private com.google.protobuf.SingleFieldBuilderV3<io.milvus.grpc.MsgBase, io.milvus.grpc.MsgBase.Builder, io.milvus.grpc.MsgBaseOrBuilder> baseBuilder_;

        /**
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         *
         * @return Whether the base field is set.
         */
        public boolean hasBase() {
            return ((bitField0_ & 0x00000001) != 0);
        }

        /**
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
         * <code>.milvus.proto.common.MsgBase base = 1;</code>
         */
        public io.milvus.grpc.MsgBase.Builder getBaseBuilder() {
            bitField0_ |= 0x00000001;
            onChanged();
            return getBaseFieldBuilder().getBuilder();
        }

        /**
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

        private com.google.protobuf.LazyStringArrayList collectionNames_ = com.google.protobuf.LazyStringArrayList.emptyList();

        private void ensureCollectionNamesIsMutable() {
            if (!collectionNames_.isModifiable()) {
                collectionNames_ = new com.google.protobuf.LazyStringArrayList(collectionNames_);
            }
            bitField0_ |= 0x00000004;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @return A list containing the collectionNames.
         */
        public com.google.protobuf.ProtocolStringList getCollectionNamesList() {
            collectionNames_.makeImmutable();
            return collectionNames_;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @return The count of collectionNames.
         */
        public int getCollectionNamesCount() {
            return collectionNames_.size();
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param index The index of the element to return.
         * @return The collectionNames at the given index.
         */
        public java.lang.String getCollectionNames(int index) {
            return collectionNames_.get(index);
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param index The index of the value to return.
         * @return The bytes of the collectionNames at the given index.
         */
        public com.google.protobuf.ByteString getCollectionNamesBytes(int index) {
            return collectionNames_.getByteString(index);
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param index The index to set the value at.
         * @param value The collectionNames to set.
         * @return This builder for chaining.
         */
        public Builder setCollectionNames(int index, java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureCollectionNamesIsMutable();
            collectionNames_.set(index, value);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param value The collectionNames to add.
         * @return This builder for chaining.
         */
        public Builder addCollectionNames(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureCollectionNamesIsMutable();
            collectionNames_.add(value);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param values The collectionNames to add.
         * @return This builder for chaining.
         */
        public Builder addAllCollectionNames(java.lang.Iterable<java.lang.String> values) {
            ensureCollectionNamesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, collectionNames_);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCollectionNames() {
            collectionNames_ = com.google.protobuf.LazyStringArrayList.emptyList();
            bitField0_ = (bitField0_ & ~0x00000004);
            ;
            onChanged();
            return this;
        }

        /**
         * <code>repeated string collection_names = 3;</code>
         *
         * @param value The bytes of the collectionNames to add.
         * @return This builder for chaining.
         */
        public Builder addCollectionNamesBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureCollectionNamesIsMutable();
            collectionNames_.add(value);
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
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.FlushRequest)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.FlushRequest)
    private static final io.milvus.grpc.FlushRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.FlushRequest();
    }

    public static io.milvus.grpc.FlushRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FlushRequest> PARSER = new com.google.protobuf.AbstractParser<FlushRequest>() {

        @java.lang.Override
        public FlushRequest parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<FlushRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FlushRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.FlushRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
