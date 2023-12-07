package io.milvus.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public interface MilvusService extends MutinyService {

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCollection(io.milvus.grpc.CreateCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropCollection(io.milvus.grpc.DropCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasCollection(io.milvus.grpc.HasCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadCollection(io.milvus.grpc.LoadCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
            io.milvus.grpc.DescribeCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
            io.milvus.grpc.GetCollectionStatisticsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ShowCollectionsResponse> showCollections(
            io.milvus.grpc.ShowCollectionsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterCollection(io.milvus.grpc.AlterCollectionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createPartition(io.milvus.grpc.CreatePartitionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropPartition(io.milvus.grpc.DropPartitionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasPartition(io.milvus.grpc.HasPartitionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadPartitions(io.milvus.grpc.LoadPartitionsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
            io.milvus.grpc.GetPartitionStatisticsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ShowPartitionsResponse> showPartitions(io.milvus.grpc.ShowPartitionsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
            io.milvus.grpc.GetLoadingProgressRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadStateResponse> getLoadState(io.milvus.grpc.GetLoadStateRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createAlias(io.milvus.grpc.CreateAliasRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropAlias(io.milvus.grpc.DropAliasRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterAlias(io.milvus.grpc.AlterAliasRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeAliasResponse> describeAlias(io.milvus.grpc.DescribeAliasRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ListAliasesResponse> listAliases(io.milvus.grpc.ListAliasesRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createIndex(io.milvus.grpc.CreateIndexRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterIndex(io.milvus.grpc.AlterIndexRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeIndexResponse> describeIndex(io.milvus.grpc.DescribeIndexRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
            io.milvus.grpc.GetIndexStatisticsRequest request);

    /**
     * <pre>
     *  Deprecated: use DescribeIndex instead
     * </pre>
     */
    @Deprecated
    io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStateResponse> getIndexState(io.milvus.grpc.GetIndexStateRequest request);

    /**
     * <pre>
     *  Deprecated: use DescribeIndex instead
     * </pre>
     */
    @Deprecated
    io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
            io.milvus.grpc.GetIndexBuildProgressRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropIndex(io.milvus.grpc.DropIndexRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> insert(io.milvus.grpc.InsertRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> delete(io.milvus.grpc.DeleteRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> upsert(io.milvus.grpc.UpsertRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.SearchResults> search(io.milvus.grpc.SearchRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.FlushResponse> flush(io.milvus.grpc.FlushRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.QueryResults> query(io.milvus.grpc.QueryRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.CalcDistanceResults> calcDistance(io.milvus.grpc.CalcDistanceRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.FlushAllResponse> flushAll(io.milvus.grpc.FlushAllRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushStateResponse> getFlushState(io.milvus.grpc.GetFlushStateRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
            io.milvus.grpc.GetFlushAllStateRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
            io.milvus.grpc.GetPersistentSegmentInfoRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
            io.milvus.grpc.GetQuerySegmentInfoRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetReplicasResponse> getReplicas(io.milvus.grpc.GetReplicasRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.DummyResponse> dummy(io.milvus.grpc.DummyRequest request);

    /**
     * <pre>
     *  TODO: remove
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(io.milvus.grpc.RegisterLinkRequest request);

    /**
     * <pre>
     *  https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.milvus.grpc.GetMetricsResponse> getMetrics(io.milvus.grpc.GetMetricsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ComponentStates> getComponentStates(io.milvus.grpc.GetComponentStatesRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadBalance(io.milvus.grpc.LoadBalanceRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
            io.milvus.grpc.GetCompactionStateRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
            io.milvus.grpc.ManualCompactionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
            io.milvus.grpc.GetCompactionPlansRequest request);

    /**
     * <pre>
     *  https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.milvus.grpc.ImportResponse> import_(io.milvus.grpc.ImportRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetImportStateResponse> getImportState(io.milvus.grpc.GetImportStateRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
            io.milvus.grpc.ListImportTasksRequest request);

    /**
     * <pre>
     *  https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCredential(io.milvus.grpc.CreateCredentialRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> updateCredential(io.milvus.grpc.UpdateCredentialRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> deleteCredential(io.milvus.grpc.DeleteCredentialRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ListCredUsersResponse> listCredUsers(io.milvus.grpc.ListCredUsersRequest request);

    /**
     * <pre>
     *  https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
     * </pre>
     */
    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createRole(io.milvus.grpc.CreateRoleRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropRole(io.milvus.grpc.DropRoleRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operateUserRole(io.milvus.grpc.OperateUserRoleRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.SelectRoleResponse> selectRole(io.milvus.grpc.SelectRoleRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.SelectUserResponse> selectUser(io.milvus.grpc.SelectUserRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.SelectGrantResponse> selectGrant(io.milvus.grpc.SelectGrantRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.GetVersionResponse> getVersion(io.milvus.grpc.GetVersionRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.CheckHealthResponse> checkHealth(io.milvus.grpc.CheckHealthRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createResourceGroup(io.milvus.grpc.CreateResourceGroupRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferNode(io.milvus.grpc.TransferNodeRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferReplica(io.milvus.grpc.TransferReplicaRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
            io.milvus.grpc.ListResourceGroupsRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
            io.milvus.grpc.DescribeResourceGroupRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> renameCollection(io.milvus.grpc.RenameCollectionRequest request);

    io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
            milvus.proto.feder.Feder.ListIndexedSegmentRequest request);

    io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
            milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ConnectResponse> connect(io.milvus.grpc.ConnectRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(io.milvus.grpc.AllocTimestampRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createDatabase(io.milvus.grpc.CreateDatabaseRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropDatabase(io.milvus.grpc.DropDatabaseRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ListDatabasesResponse> listDatabases(io.milvus.grpc.ListDatabasesRequest request);

    io.smallrye.mutiny.Uni<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
            io.milvus.grpc.ReplicateMessageRequest request);
}
