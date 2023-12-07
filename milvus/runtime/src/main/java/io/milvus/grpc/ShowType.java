// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

/**
 * <pre>
 * Deprecated: use GetLoadingProgress rpc instead
 * </pre>
 *
 * Protobuf enum {@code milvus.proto.milvus.ShowType}
 */
@java.lang.Deprecated
public enum ShowType implements com.google.protobuf.ProtocolMessageEnum {

    /**
     * <pre>
     * Will return all collections
     * </pre>
     *
     * <code>All = 0;</code>
     */
    All(0),
    /**
     * <pre>
     * Will return loaded collections with their inMemory_percentages
     * </pre>
     *
     * <code>InMemory = 1;</code>
     */
    InMemory(1),
    UNRECOGNIZED(-1);

    /**
     * <pre>
     * Will return all collections
     * </pre>
     *
     * <code>All = 0;</code>
     */
    public static final int All_VALUE = 0;

    /**
     * <pre>
     * Will return loaded collections with their inMemory_percentages
     * </pre>
     *
     * <code>InMemory = 1;</code>
     */
    public static final int InMemory_VALUE = 1;

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
    public static ShowType valueOf(int value) {
        return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ShowType forNumber(int value) {
        switch (value) {
            case 0:
                return All;
            case 1:
                return InMemory;
            default:
                return null;
        }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShowType> internalGetValueMap() {
        return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ShowType> internalValueMap = new com.google.protobuf.Internal.EnumLiteMap<ShowType>() {

        public ShowType findValueByNumber(int number) {
            return ShowType.forNumber(number);
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
        return io.milvus.grpc.MilvusProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShowType[] VALUES = values();

    public static ShowType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
    }

    private final int value;

    private ShowType(int value) {
        this.value = value;
    }
}
