// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milvus.proto
package io.milvus.grpc;

public interface ResourceGroupOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.milvus.ResourceGroup)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    java.lang.String getName();

    /**
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString getNameBytes();

    /**
     * <code>int32 capacity = 2;</code>
     *
     * @return The capacity.
     */
    int getCapacity();

    /**
     * <code>int32 num_available_node = 3;</code>
     *
     * @return The numAvailableNode.
     */
    int getNumAvailableNode();

    /**
     * <pre>
     * collection name -&gt; loaded replica num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_loaded_replica = 4;</code>
     */
    int getNumLoadedReplicaCount();

    /**
     * <pre>
     * collection name -&gt; loaded replica num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_loaded_replica = 4;</code>
     */
    boolean containsNumLoadedReplica(java.lang.String key);

    /**
     * Use {@link #getNumLoadedReplicaMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Integer> getNumLoadedReplica();

    /**
     * <pre>
     * collection name -&gt; loaded replica num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_loaded_replica = 4;</code>
     */
    java.util.Map<java.lang.String, java.lang.Integer> getNumLoadedReplicaMap();

    /**
     * <pre>
     * collection name -&gt; loaded replica num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_loaded_replica = 4;</code>
     */
    int getNumLoadedReplicaOrDefault(java.lang.String key, int defaultValue);

    /**
     * <pre>
     * collection name -&gt; loaded replica num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_loaded_replica = 4;</code>
     */
    int getNumLoadedReplicaOrThrow(java.lang.String key);

    /**
     * <pre>
     * collection name -&gt; accessed other rg's node num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_outgoing_node = 5;</code>
     */
    int getNumOutgoingNodeCount();

    /**
     * <pre>
     * collection name -&gt; accessed other rg's node num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_outgoing_node = 5;</code>
     */
    boolean containsNumOutgoingNode(java.lang.String key);

    /**
     * Use {@link #getNumOutgoingNodeMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Integer> getNumOutgoingNode();

    /**
     * <pre>
     * collection name -&gt; accessed other rg's node num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_outgoing_node = 5;</code>
     */
    java.util.Map<java.lang.String, java.lang.Integer> getNumOutgoingNodeMap();

    /**
     * <pre>
     * collection name -&gt; accessed other rg's node num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_outgoing_node = 5;</code>
     */
    int getNumOutgoingNodeOrDefault(java.lang.String key, int defaultValue);

    /**
     * <pre>
     * collection name -&gt; accessed other rg's node num
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_outgoing_node = 5;</code>
     */
    int getNumOutgoingNodeOrThrow(java.lang.String key);

    /**
     * <pre>
     * collection name -&gt; be accessed node num by other rg
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_incoming_node = 6;</code>
     */
    int getNumIncomingNodeCount();

    /**
     * <pre>
     * collection name -&gt; be accessed node num by other rg
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_incoming_node = 6;</code>
     */
    boolean containsNumIncomingNode(java.lang.String key);

    /**
     * Use {@link #getNumIncomingNodeMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.Integer> getNumIncomingNode();

    /**
     * <pre>
     * collection name -&gt; be accessed node num by other rg
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_incoming_node = 6;</code>
     */
    java.util.Map<java.lang.String, java.lang.Integer> getNumIncomingNodeMap();

    /**
     * <pre>
     * collection name -&gt; be accessed node num by other rg
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_incoming_node = 6;</code>
     */
    int getNumIncomingNodeOrDefault(java.lang.String key, int defaultValue);

    /**
     * <pre>
     * collection name -&gt; be accessed node num by other rg
     * </pre>
     *
     * <code>map&lt;string, int32&gt; num_incoming_node = 6;</code>
     */
    int getNumIncomingNodeOrThrow(java.lang.String key);
}
