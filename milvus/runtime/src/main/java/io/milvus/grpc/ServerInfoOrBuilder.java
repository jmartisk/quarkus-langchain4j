// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto
package io.milvus.grpc;

public interface ServerInfoOrBuilder extends // @@protoc_insertion_point(interface_extends:milvus.proto.common.ServerInfo)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string build_tags = 1;</code>
     *
     * @return The buildTags.
     */
    java.lang.String getBuildTags();

    /**
     * <code>string build_tags = 1;</code>
     *
     * @return The bytes for buildTags.
     */
    com.google.protobuf.ByteString getBuildTagsBytes();

    /**
     * <code>string build_time = 2;</code>
     *
     * @return The buildTime.
     */
    java.lang.String getBuildTime();

    /**
     * <code>string build_time = 2;</code>
     *
     * @return The bytes for buildTime.
     */
    com.google.protobuf.ByteString getBuildTimeBytes();

    /**
     * <code>string git_commit = 3;</code>
     *
     * @return The gitCommit.
     */
    java.lang.String getGitCommit();

    /**
     * <code>string git_commit = 3;</code>
     *
     * @return The bytes for gitCommit.
     */
    com.google.protobuf.ByteString getGitCommitBytes();

    /**
     * <code>string go_version = 4;</code>
     *
     * @return The goVersion.
     */
    java.lang.String getGoVersion();

    /**
     * <code>string go_version = 4;</code>
     *
     * @return The bytes for goVersion.
     */
    com.google.protobuf.ByteString getGoVersionBytes();

    /**
     * <code>string deploy_mode = 5;</code>
     *
     * @return The deployMode.
     */
    java.lang.String getDeployMode();

    /**
     * <code>string deploy_mode = 5;</code>
     *
     * @return The bytes for deployMode.
     */
    com.google.protobuf.ByteString getDeployModeBytes();

    /**
     * <pre>
     * reserved for newly-added feature if necessary.
     * </pre>
     *
     * <code>map&lt;string, string&gt; reserved = 6;</code>
     */
    int getReservedCount();

    /**
     * <pre>
     * reserved for newly-added feature if necessary.
     * </pre>
     *
     * <code>map&lt;string, string&gt; reserved = 6;</code>
     */
    boolean containsReserved(java.lang.String key);

    /**
     * Use {@link #getReservedMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.String, java.lang.String> getReserved();

    /**
     * <pre>
     * reserved for newly-added feature if necessary.
     * </pre>
     *
     * <code>map&lt;string, string&gt; reserved = 6;</code>
     */
    java.util.Map<java.lang.String, java.lang.String> getReservedMap();

    /**
     * <pre>
     * reserved for newly-added feature if necessary.
     * </pre>
     *
     * <code>map&lt;string, string&gt; reserved = 6;</code>
     */
    /* nullable */
    java.lang.String getReservedOrDefault(java.lang.String key, /* nullable */
            java.lang.String defaultValue);

    /**
     * <pre>
     * reserved for newly-added feature if necessary.
     * </pre>
     *
     * <code>map&lt;string, string&gt; reserved = 6;</code>
     */
    java.lang.String getReservedOrThrow(java.lang.String key);
}
