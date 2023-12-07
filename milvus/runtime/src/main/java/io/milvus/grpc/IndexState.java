// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto
package io.milvus.grpc;

/**
 * Protobuf enum {@code milvus.proto.common.IndexState}
 */
public enum IndexState implements com.google.protobuf.ProtocolMessageEnum {

    /**
     * <code>IndexStateNone = 0;</code>
     */
    IndexStateNone(0),
    /**
     * <code>Unissued = 1;</code>
     */
    Unissued(1),
    /**
     * <code>InProgress = 2;</code>
     */
    InProgress(2),
    /**
     * <code>Finished = 3;</code>
     */
    Finished(3),
    /**
     * <code>Failed = 4;</code>
     */
    Failed(4),
    /**
     * <code>Retry = 5;</code>
     */
    Retry(5),
    UNRECOGNIZED(-1);

    /**
     * <code>IndexStateNone = 0;</code>
     */
    public static final int IndexStateNone_VALUE = 0;

    /**
     * <code>Unissued = 1;</code>
     */
    public static final int Unissued_VALUE = 1;

    /**
     * <code>InProgress = 2;</code>
     */
    public static final int InProgress_VALUE = 2;

    /**
     * <code>Finished = 3;</code>
     */
    public static final int Finished_VALUE = 3;

    /**
     * <code>Failed = 4;</code>
     */
    public static final int Failed_VALUE = 4;

    /**
     * <code>Retry = 5;</code>
     */
    public static final int Retry_VALUE = 5;

    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IndexState valueOf(int value) {
        return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IndexState forNumber(int value) {
        switch (value) {
            case 0:
                return IndexStateNone;
            case 1:
                return Unissued;
            case 2:
                return InProgress;
            case 3:
                return Finished;
            case 4:
                return Failed;
            case 5:
                return Retry;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IndexState> internalGetValueMap() {
        return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<IndexState> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<IndexState>() {

        public IndexState findValueByNumber(int number) {
            return IndexState.forNumber(number);
        }
    };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            throw new java.lang.IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return io.milvus.grpc.CommonProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final IndexState[] VALUES = values();

    public static IndexState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
    }

    private final int value;

    private IndexState(int value) {
        this.value = value;
    }
}
