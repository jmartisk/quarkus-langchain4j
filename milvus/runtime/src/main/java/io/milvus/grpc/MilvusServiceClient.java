package io.milvus.grpc;

import java.util.function.BiFunction;

import io.quarkus.grpc.MutinyClient;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public class MilvusServiceClient implements MilvusService, MutinyClient<MutinyMilvusServiceGrpc.MutinyMilvusServiceStub> {

    private final MutinyMilvusServiceGrpc.MutinyMilvusServiceStub stub;

    public MilvusServiceClient(String name, io.grpc.Channel channel,
            BiFunction<String, MutinyMilvusServiceGrpc.MutinyMilvusServiceStub, MutinyMilvusServiceGrpc.MutinyMilvusServiceStub> stubConfigurator) {
        this.stub = stubConfigurator.apply(name, MutinyMilvusServiceGrpc.newMutinyStub(channel));
    }

    private MilvusServiceClient(MutinyMilvusServiceGrpc.MutinyMilvusServiceStub stub) {
        this.stub = stub;
    }

    public MilvusServiceClient newInstanceWithStub(MutinyMilvusServiceGrpc.MutinyMilvusServiceStub stub) {
        return new MilvusServiceClient(stub);
    }

    @Override
    public MutinyMilvusServiceGrpc.MutinyMilvusServiceStub getStub() {
        return stub;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCollection(io.milvus.grpc.CreateCollectionRequest request) {
        return stub.createCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropCollection(io.milvus.grpc.DropCollectionRequest request) {
        return stub.dropCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasCollection(io.milvus.grpc.HasCollectionRequest request) {
        return stub.hasCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadCollection(io.milvus.grpc.LoadCollectionRequest request) {
        return stub.loadCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request) {
        return stub.releaseCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
            io.milvus.grpc.DescribeCollectionRequest request) {
        return stub.describeCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
            io.milvus.grpc.GetCollectionStatisticsRequest request) {
        return stub.getCollectionStatistics(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowCollectionsResponse> showCollections(
            io.milvus.grpc.ShowCollectionsRequest request) {
        return stub.showCollections(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterCollection(io.milvus.grpc.AlterCollectionRequest request) {
        return stub.alterCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createPartition(io.milvus.grpc.CreatePartitionRequest request) {
        return stub.createPartition(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropPartition(io.milvus.grpc.DropPartitionRequest request) {
        return stub.dropPartition(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasPartition(io.milvus.grpc.HasPartitionRequest request) {
        return stub.hasPartition(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadPartitions(io.milvus.grpc.LoadPartitionsRequest request) {
        return stub.loadPartitions(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request) {
        return stub.releasePartitions(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
            io.milvus.grpc.GetPartitionStatisticsRequest request) {
        return stub.getPartitionStatistics(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowPartitionsResponse> showPartitions(
            io.milvus.grpc.ShowPartitionsRequest request) {
        return stub.showPartitions(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
            io.milvus.grpc.GetLoadingProgressRequest request) {
        return stub.getLoadingProgress(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadStateResponse> getLoadState(
            io.milvus.grpc.GetLoadStateRequest request) {
        return stub.getLoadState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createAlias(io.milvus.grpc.CreateAliasRequest request) {
        return stub.createAlias(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropAlias(io.milvus.grpc.DropAliasRequest request) {
        return stub.dropAlias(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterAlias(io.milvus.grpc.AlterAliasRequest request) {
        return stub.alterAlias(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeAliasResponse> describeAlias(
            io.milvus.grpc.DescribeAliasRequest request) {
        return stub.describeAlias(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListAliasesResponse> listAliases(io.milvus.grpc.ListAliasesRequest request) {
        return stub.listAliases(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createIndex(io.milvus.grpc.CreateIndexRequest request) {
        return stub.createIndex(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterIndex(io.milvus.grpc.AlterIndexRequest request) {
        return stub.alterIndex(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeIndexResponse> describeIndex(
            io.milvus.grpc.DescribeIndexRequest request) {
        return stub.describeIndex(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
            io.milvus.grpc.GetIndexStatisticsRequest request) {
        return stub.getIndexStatistics(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStateResponse> getIndexState(
            io.milvus.grpc.GetIndexStateRequest request) {
        return stub.getIndexState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
            io.milvus.grpc.GetIndexBuildProgressRequest request) {
        return stub.getIndexBuildProgress(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropIndex(io.milvus.grpc.DropIndexRequest request) {
        return stub.dropIndex(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> insert(io.milvus.grpc.InsertRequest request) {
        return stub.insert(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> delete(io.milvus.grpc.DeleteRequest request) {
        return stub.delete(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> upsert(io.milvus.grpc.UpsertRequest request) {
        return stub.upsert(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SearchResults> search(io.milvus.grpc.SearchRequest request) {
        return stub.search(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushResponse> flush(io.milvus.grpc.FlushRequest request) {
        return stub.flush(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.QueryResults> query(io.milvus.grpc.QueryRequest request) {
        return stub.query(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.CalcDistanceResults> calcDistance(io.milvus.grpc.CalcDistanceRequest request) {
        return stub.calcDistance(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushAllResponse> flushAll(io.milvus.grpc.FlushAllRequest request) {
        return stub.flushAll(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushStateResponse> getFlushState(
            io.milvus.grpc.GetFlushStateRequest request) {
        return stub.getFlushState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
            io.milvus.grpc.GetFlushAllStateRequest request) {
        return stub.getFlushAllState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
            io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
        return stub.getPersistentSegmentInfo(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
            io.milvus.grpc.GetQuerySegmentInfoRequest request) {
        return stub.getQuerySegmentInfo(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetReplicasResponse> getReplicas(io.milvus.grpc.GetReplicasRequest request) {
        return stub.getReplicas(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DummyResponse> dummy(io.milvus.grpc.DummyRequest request) {
        return stub.dummy(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
            io.milvus.grpc.RegisterLinkRequest request) {
        return stub.registerLink(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetMetricsResponse> getMetrics(io.milvus.grpc.GetMetricsRequest request) {
        return stub.getMetrics(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ComponentStates> getComponentStates(
            io.milvus.grpc.GetComponentStatesRequest request) {
        return stub.getComponentStates(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadBalance(io.milvus.grpc.LoadBalanceRequest request) {
        return stub.loadBalance(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
            io.milvus.grpc.GetCompactionStateRequest request) {
        return stub.getCompactionState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
            io.milvus.grpc.ManualCompactionRequest request) {
        return stub.manualCompaction(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
            io.milvus.grpc.GetCompactionPlansRequest request) {
        return stub.getCompactionStateWithPlans(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ImportResponse> import_(io.milvus.grpc.ImportRequest request) {
        return stub.import_(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetImportStateResponse> getImportState(
            io.milvus.grpc.GetImportStateRequest request) {
        return stub.getImportState(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
            io.milvus.grpc.ListImportTasksRequest request) {
        return stub.listImportTasks(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCredential(io.milvus.grpc.CreateCredentialRequest request) {
        return stub.createCredential(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> updateCredential(io.milvus.grpc.UpdateCredentialRequest request) {
        return stub.updateCredential(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> deleteCredential(io.milvus.grpc.DeleteCredentialRequest request) {
        return stub.deleteCredential(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListCredUsersResponse> listCredUsers(
            io.milvus.grpc.ListCredUsersRequest request) {
        return stub.listCredUsers(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createRole(io.milvus.grpc.CreateRoleRequest request) {
        return stub.createRole(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropRole(io.milvus.grpc.DropRoleRequest request) {
        return stub.dropRole(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operateUserRole(io.milvus.grpc.OperateUserRoleRequest request) {
        return stub.operateUserRole(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectRoleResponse> selectRole(io.milvus.grpc.SelectRoleRequest request) {
        return stub.selectRole(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectUserResponse> selectUser(io.milvus.grpc.SelectUserRequest request) {
        return stub.selectUser(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request) {
        return stub.operatePrivilege(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectGrantResponse> selectGrant(io.milvus.grpc.SelectGrantRequest request) {
        return stub.selectGrant(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetVersionResponse> getVersion(io.milvus.grpc.GetVersionRequest request) {
        return stub.getVersion(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.CheckHealthResponse> checkHealth(io.milvus.grpc.CheckHealthRequest request) {
        return stub.checkHealth(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createResourceGroup(
            io.milvus.grpc.CreateResourceGroupRequest request) {
        return stub.createResourceGroup(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request) {
        return stub.dropResourceGroup(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferNode(io.milvus.grpc.TransferNodeRequest request) {
        return stub.transferNode(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferReplica(io.milvus.grpc.TransferReplicaRequest request) {
        return stub.transferReplica(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
            io.milvus.grpc.ListResourceGroupsRequest request) {
        return stub.listResourceGroups(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
            io.milvus.grpc.DescribeResourceGroupRequest request) {
        return stub.describeResourceGroup(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> renameCollection(io.milvus.grpc.RenameCollectionRequest request) {
        return stub.renameCollection(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
            milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
        return stub.listIndexedSegment(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
            milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
        return stub.describeSegmentIndexData(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ConnectResponse> connect(io.milvus.grpc.ConnectRequest request) {
        return stub.connect(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(
            io.milvus.grpc.AllocTimestampRequest request) {
        return stub.allocTimestamp(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createDatabase(io.milvus.grpc.CreateDatabaseRequest request) {
        return stub.createDatabase(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropDatabase(io.milvus.grpc.DropDatabaseRequest request) {
        return stub.dropDatabase(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListDatabasesResponse> listDatabases(
            io.milvus.grpc.ListDatabasesRequest request) {
        return stub.listDatabases(request);
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
            io.milvus.grpc.ReplicateMessageRequest request) {
        return stub.replicateMessage(request);
    }
}
