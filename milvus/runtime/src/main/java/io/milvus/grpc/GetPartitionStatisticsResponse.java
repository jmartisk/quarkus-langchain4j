// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * Protobuf type {@code milvus.proto.milvus.GetPartitionStatisticsResponse}
 */
public final class GetPartitionStatisticsResponse extends com.google.protobuf.GeneratedMessageV3 implements // @@protoc_insertion_point(message_implements:milvus.proto.milvus.GetPartitionStatisticsResponse)
        GetPartitionStatisticsResponseOrBuilder {

    private static final long serialVersionUID = 0L;

    // Use GetPartitionStatisticsResponse.newBuilder() to construct.
    private GetPartitionStatisticsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GetPartitionStatisticsResponse() {
        stats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GetPartitionStatisticsResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetPartitionStatisticsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetPartitionStatisticsResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(io.milvus.grpc.GetPartitionStatisticsResponse.class,
                        io.milvus.grpc.GetPartitionStatisticsResponse.Builder.class);
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

    public static final int STATS_FIELD_NUMBER = 2;

    @SuppressWarnings("serial")
    private java.util.List<io.milvus.grpc.KeyValuePair> stats_;

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
     */
    @java.lang.Override
    public java.util.List<io.milvus.grpc.KeyValuePair> getStatsList() {
        return stats_;
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getStatsOrBuilderList() {
        return stats_;
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
     */
    @java.lang.Override
    public int getStatsCount() {
        return stats_.size();
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.KeyValuePair getStats(int index) {
        return stats_.get(index);
    }

    /**
     * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
     */
    @java.lang.Override
    public io.milvus.grpc.KeyValuePairOrBuilder getStatsOrBuilder(int index) {
        return stats_.get(index);
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
        for (int i = 0; i < stats_.size(); i++) {
            output.writeMessage(2, stats_.get(i));
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
        for (int i = 0; i < stats_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, stats_.get(i));
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
        if (!(obj instanceof io.milvus.grpc.GetPartitionStatisticsResponse)) {
            return super.equals(obj);
        }
        io.milvus.grpc.GetPartitionStatisticsResponse other = (io.milvus.grpc.GetPartitionStatisticsResponse) obj;
        if (hasStatus() != other.hasStatus())
            return false;
        if (hasStatus()) {
            if (!getStatus().equals(other.getStatus()))
                return false;
        }
        if (!getStatsList().equals(other.getStatsList()))
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
        if (getStatsCount() > 0) {
            hash = (37 * hash) + STATS_FIELD_NUMBER;
            hash = (53 * hash) + getStatsList().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse parseFrom(com.google.protobuf.CodedInputStream input,
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

    public static Builder newBuilder(io.milvus.grpc.GetPartitionStatisticsResponse prototype) {
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
     * Protobuf type {@code milvus.proto.milvus.GetPartitionStatisticsResponse}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements // @@protoc_insertion_point(builder_implements:milvus.proto.milvus.GetPartitionStatisticsResponse)
            io.milvus.grpc.GetPartitionStatisticsResponseOrBuilder {

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetPartitionStatisticsResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetPartitionStatisticsResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(io.milvus.grpc.GetPartitionStatisticsResponse.class,
                            io.milvus.grpc.GetPartitionStatisticsResponse.Builder.class);
        }

        // Construct using io.milvus.grpc.GetPartitionStatisticsResponse.newBuilder()
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
                getStatsFieldBuilder();
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
            if (statsBuilder_ == null) {
                stats_ = java.util.Collections.emptyList();
            } else {
                stats_ = null;
                statsBuilder_.clear();
            }
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return io.milvus.grpc.MilvusProto.internal_static_milvus_proto_milvus_GetPartitionStatisticsResponse_descriptor;
        }

        @java.lang.Override
        public io.milvus.grpc.GetPartitionStatisticsResponse getDefaultInstanceForType() {
            return io.milvus.grpc.GetPartitionStatisticsResponse.getDefaultInstance();
        }

        @java.lang.Override
        public io.milvus.grpc.GetPartitionStatisticsResponse build() {
            io.milvus.grpc.GetPartitionStatisticsResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public io.milvus.grpc.GetPartitionStatisticsResponse buildPartial() {
            io.milvus.grpc.GetPartitionStatisticsResponse result = new io.milvus.grpc.GetPartitionStatisticsResponse(this);
            buildPartialRepeatedFields(result);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartialRepeatedFields(io.milvus.grpc.GetPartitionStatisticsResponse result) {
            if (statsBuilder_ == null) {
                if (((bitField0_ & 0x00000002) != 0)) {
                    stats_ = java.util.Collections.unmodifiableList(stats_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.stats_ = stats_;
            } else {
                result.stats_ = statsBuilder_.build();
            }
        }

        private void buildPartial0(io.milvus.grpc.GetPartitionStatisticsResponse result) {
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                result.status_ = statusBuilder_ == null ? status_ : statusBuilder_.build();
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
            if (other instanceof io.milvus.grpc.GetPartitionStatisticsResponse) {
                return mergeFrom((io.milvus.grpc.GetPartitionStatisticsResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(io.milvus.grpc.GetPartitionStatisticsResponse other) {
            if (other == io.milvus.grpc.GetPartitionStatisticsResponse.getDefaultInstance())
                return this;
            if (other.hasStatus()) {
                mergeStatus(other.getStatus());
            }
            if (statsBuilder_ == null) {
                if (!other.stats_.isEmpty()) {
                    if (stats_.isEmpty()) {
                        stats_ = other.stats_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureStatsIsMutable();
                        stats_.addAll(other.stats_);
                    }
                    onChanged();
                }
            } else {
                if (!other.stats_.isEmpty()) {
                    if (statsBuilder_.isEmpty()) {
                        statsBuilder_.dispose();
                        statsBuilder_ = null;
                        stats_ = other.stats_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        statsBuilder_ = com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ? getStatsFieldBuilder()
                                : null;
                    } else {
                        statsBuilder_.addAllMessages(other.stats_);
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
                            input.readMessage(getStatusFieldBuilder().getBuilder(), extensionRegistry);
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        // case 10
                        case 18: {
                            io.milvus.grpc.KeyValuePair m = input.readMessage(io.milvus.grpc.KeyValuePair.parser(),
                                    extensionRegistry);
                            if (statsBuilder_ == null) {
                                ensureStatsIsMutable();
                                stats_.add(m);
                            } else {
                                statsBuilder_.addMessage(m);
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

        private java.util.List<io.milvus.grpc.KeyValuePair> stats_ = java.util.Collections.emptyList();

        private void ensureStatsIsMutable() {
            if (!((bitField0_ & 0x00000002) != 0)) {
                stats_ = new java.util.ArrayList<io.milvus.grpc.KeyValuePair>(stats_);
                bitField0_ |= 0x00000002;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder> statsBuilder_;

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public java.util.List<io.milvus.grpc.KeyValuePair> getStatsList() {
            if (statsBuilder_ == null) {
                return java.util.Collections.unmodifiableList(stats_);
            } else {
                return statsBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public int getStatsCount() {
            if (statsBuilder_ == null) {
                return stats_.size();
            } else {
                return statsBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public io.milvus.grpc.KeyValuePair getStats(int index) {
            if (statsBuilder_ == null) {
                return stats_.get(index);
            } else {
                return statsBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder setStats(int index, io.milvus.grpc.KeyValuePair value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.set(index, value);
                onChanged();
            } else {
                statsBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder setStats(int index, io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.set(index, builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder addStats(io.milvus.grpc.KeyValuePair value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.add(value);
                onChanged();
            } else {
                statsBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder addStats(int index, io.milvus.grpc.KeyValuePair value) {
            if (statsBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureStatsIsMutable();
                stats_.add(index, value);
                onChanged();
            } else {
                statsBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder addStats(io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.add(builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder addStats(int index, io.milvus.grpc.KeyValuePair.Builder builderForValue) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.add(index, builderForValue.build());
                onChanged();
            } else {
                statsBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder addAllStats(java.lang.Iterable<? extends io.milvus.grpc.KeyValuePair> values) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, stats_);
                onChanged();
            } else {
                statsBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder clearStats() {
            if (statsBuilder_ == null) {
                stats_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                statsBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public Builder removeStats(int index) {
            if (statsBuilder_ == null) {
                ensureStatsIsMutable();
                stats_.remove(index);
                onChanged();
            } else {
                statsBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder getStatsBuilder(int index) {
            return getStatsFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public io.milvus.grpc.KeyValuePairOrBuilder getStatsOrBuilder(int index) {
            if (statsBuilder_ == null) {
                return stats_.get(index);
            } else {
                return statsBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public java.util.List<? extends io.milvus.grpc.KeyValuePairOrBuilder> getStatsOrBuilderList() {
            if (statsBuilder_ != null) {
                return statsBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(stats_);
            }
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder addStatsBuilder() {
            return getStatsFieldBuilder().addBuilder(io.milvus.grpc.KeyValuePair.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public io.milvus.grpc.KeyValuePair.Builder addStatsBuilder(int index) {
            return getStatsFieldBuilder().addBuilder(index, io.milvus.grpc.KeyValuePair.getDefaultInstance());
        }

        /**
         * <code>repeated .milvus.proto.common.KeyValuePair stats = 2;</code>
         */
        public java.util.List<io.milvus.grpc.KeyValuePair.Builder> getStatsBuilderList() {
            return getStatsFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder> getStatsFieldBuilder() {
            if (statsBuilder_ == null) {
                statsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<io.milvus.grpc.KeyValuePair, io.milvus.grpc.KeyValuePair.Builder, io.milvus.grpc.KeyValuePairOrBuilder>(
                        stats_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
                stats_ = null;
            }
            return statsBuilder_;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }
        // @@protoc_insertion_point(builder_scope:milvus.proto.milvus.GetPartitionStatisticsResponse)
    }

    // @@protoc_insertion_point(class_scope:milvus.proto.milvus.GetPartitionStatisticsResponse)
    private static final io.milvus.grpc.GetPartitionStatisticsResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new io.milvus.grpc.GetPartitionStatisticsResponse();
    }

    public static io.milvus.grpc.GetPartitionStatisticsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetPartitionStatisticsResponse> PARSER = new com.google.protobuf.AbstractParser<GetPartitionStatisticsResponse>() {

        @java.lang.Override
        public GetPartitionStatisticsResponse parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<GetPartitionStatisticsResponse> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetPartitionStatisticsResponse> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public io.milvus.grpc.GetPartitionStatisticsResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
