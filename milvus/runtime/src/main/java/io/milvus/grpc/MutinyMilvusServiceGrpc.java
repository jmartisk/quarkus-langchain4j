package io.milvus.grpc;

import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.milvus.grpc.MilvusServiceGrpc.getServiceDescriptor;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public final class MutinyMilvusServiceGrpc implements io.quarkus.grpc.MutinyGrpc {

    private MutinyMilvusServiceGrpc() {
    }

    public static MutinyMilvusServiceStub newMutinyStub(io.grpc.Channel channel) {
        return new MutinyMilvusServiceStub(channel);
    }

    public static class MutinyMilvusServiceStub extends io.grpc.stub.AbstractStub<MutinyMilvusServiceStub>
            implements io.quarkus.grpc.MutinyStub {

        private MilvusServiceGrpc.MilvusServiceStub delegateStub;

        private MutinyMilvusServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = MilvusServiceGrpc.newStub(channel);
        }

        private MutinyMilvusServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = MilvusServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected MutinyMilvusServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MutinyMilvusServiceStub(channel, callOptions);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCollection(io.milvus.grpc.CreateCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropCollection(io.milvus.grpc.DropCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasCollection(io.milvus.grpc.HasCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::hasCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadCollection(io.milvus.grpc.LoadCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::loadCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releaseCollection(
                io.milvus.grpc.ReleaseCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::releaseCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
                io.milvus.grpc.DescribeCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::describeCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
                io.milvus.grpc.GetCollectionStatisticsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getCollectionStatistics);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowCollectionsResponse> showCollections(
                io.milvus.grpc.ShowCollectionsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::showCollections);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterCollection(io.milvus.grpc.AlterCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::alterCollection);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createPartition(io.milvus.grpc.CreatePartitionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createPartition);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropPartition(io.milvus.grpc.DropPartitionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropPartition);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasPartition(io.milvus.grpc.HasPartitionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::hasPartition);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadPartitions(io.milvus.grpc.LoadPartitionsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::loadPartitions);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releasePartitions(
                io.milvus.grpc.ReleasePartitionsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::releasePartitions);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
                io.milvus.grpc.GetPartitionStatisticsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getPartitionStatistics);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowPartitionsResponse> showPartitions(
                io.milvus.grpc.ShowPartitionsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::showPartitions);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
                io.milvus.grpc.GetLoadingProgressRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getLoadingProgress);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadStateResponse> getLoadState(
                io.milvus.grpc.GetLoadStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getLoadState);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createAlias(io.milvus.grpc.CreateAliasRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createAlias);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropAlias(io.milvus.grpc.DropAliasRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropAlias);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterAlias(io.milvus.grpc.AlterAliasRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::alterAlias);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeAliasResponse> describeAlias(
                io.milvus.grpc.DescribeAliasRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::describeAlias);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListAliasesResponse> listAliases(
                io.milvus.grpc.ListAliasesRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listAliases);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createIndex(io.milvus.grpc.CreateIndexRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createIndex);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterIndex(io.milvus.grpc.AlterIndexRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::alterIndex);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeIndexResponse> describeIndex(
                io.milvus.grpc.DescribeIndexRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::describeIndex);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
                io.milvus.grpc.GetIndexStatisticsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getIndexStatistics);
        }

        /**
         * <pre>
         *  Deprecated: use DescribeIndex instead
         * </pre>
         */
        @Deprecated
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStateResponse> getIndexState(
                io.milvus.grpc.GetIndexStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getIndexState);
        }

        /**
         * <pre>
         *  Deprecated: use DescribeIndex instead
         * </pre>
         */
        @Deprecated
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
                io.milvus.grpc.GetIndexBuildProgressRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getIndexBuildProgress);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropIndex(io.milvus.grpc.DropIndexRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropIndex);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> insert(io.milvus.grpc.InsertRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::insert);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> delete(io.milvus.grpc.DeleteRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::delete);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> upsert(io.milvus.grpc.UpsertRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::upsert);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SearchResults> search(io.milvus.grpc.SearchRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::search);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushResponse> flush(io.milvus.grpc.FlushRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::flush);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.QueryResults> query(io.milvus.grpc.QueryRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::query);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.CalcDistanceResults> calcDistance(
                io.milvus.grpc.CalcDistanceRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::calcDistance);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushAllResponse> flushAll(io.milvus.grpc.FlushAllRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::flushAll);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushStateResponse> getFlushState(
                io.milvus.grpc.GetFlushStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getFlushState);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
                io.milvus.grpc.GetFlushAllStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getFlushAllState);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
                io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getPersistentSegmentInfo);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
                io.milvus.grpc.GetQuerySegmentInfoRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getQuerySegmentInfo);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetReplicasResponse> getReplicas(
                io.milvus.grpc.GetReplicasRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getReplicas);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DummyResponse> dummy(io.milvus.grpc.DummyRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dummy);
        }

        /**
         * <pre>
         *  TODO: remove
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::registerLink);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetMetricsResponse> getMetrics(io.milvus.grpc.GetMetricsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getMetrics);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ComponentStates> getComponentStates(
                io.milvus.grpc.GetComponentStatesRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getComponentStates);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadBalance(io.milvus.grpc.LoadBalanceRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::loadBalance);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
                io.milvus.grpc.GetCompactionStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getCompactionState);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
                io.milvus.grpc.ManualCompactionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::manualCompaction);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
                io.milvus.grpc.GetCompactionPlansRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getCompactionStateWithPlans);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.ImportResponse> import_(io.milvus.grpc.ImportRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::import_);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetImportStateResponse> getImportState(
                io.milvus.grpc.GetImportStateRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getImportState);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
                io.milvus.grpc.ListImportTasksRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listImportTasks);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCredential(io.milvus.grpc.CreateCredentialRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createCredential);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> updateCredential(io.milvus.grpc.UpdateCredentialRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::updateCredential);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> deleteCredential(io.milvus.grpc.DeleteCredentialRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::deleteCredential);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListCredUsersResponse> listCredUsers(
                io.milvus.grpc.ListCredUsersRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listCredUsers);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createRole(io.milvus.grpc.CreateRoleRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createRole);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropRole(io.milvus.grpc.DropRoleRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropRole);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operateUserRole(io.milvus.grpc.OperateUserRoleRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::operateUserRole);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectRoleResponse> selectRole(io.milvus.grpc.SelectRoleRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::selectRole);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectUserResponse> selectUser(io.milvus.grpc.SelectUserRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::selectUser);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::operatePrivilege);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectGrantResponse> selectGrant(
                io.milvus.grpc.SelectGrantRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::selectGrant);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetVersionResponse> getVersion(io.milvus.grpc.GetVersionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::getVersion);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.CheckHealthResponse> checkHealth(
                io.milvus.grpc.CheckHealthRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::checkHealth);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createResourceGroup(
                io.milvus.grpc.CreateResourceGroupRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createResourceGroup);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropResourceGroup(
                io.milvus.grpc.DropResourceGroupRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropResourceGroup);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferNode(io.milvus.grpc.TransferNodeRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::transferNode);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferReplica(io.milvus.grpc.TransferReplicaRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::transferReplica);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
                io.milvus.grpc.ListResourceGroupsRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listResourceGroups);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
                io.milvus.grpc.DescribeResourceGroupRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::describeResourceGroup);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> renameCollection(io.milvus.grpc.RenameCollectionRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::renameCollection);
        }

        public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
                milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listIndexedSegment);
        }

        public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
                milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::describeSegmentIndexData);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ConnectResponse> connect(io.milvus.grpc.ConnectRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::connect);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(
                io.milvus.grpc.AllocTimestampRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::allocTimestamp);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createDatabase(io.milvus.grpc.CreateDatabaseRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::createDatabase);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropDatabase(io.milvus.grpc.DropDatabaseRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::dropDatabase);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListDatabasesResponse> listDatabases(
                io.milvus.grpc.ListDatabasesRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::listDatabases);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
                io.milvus.grpc.ReplicateMessageRequest request) {
            return io.quarkus.grpc.stubs.ClientCalls.oneToOne(request, delegateStub::replicateMessage);
        }
    }

    public static abstract class MilvusServiceImplBase implements io.grpc.BindableService {

        private String compression;

        /**
         * Set whether the server will try to use a compressed response.
         *
         * @param compression the compression, e.g {@code gzip}
         */
        public MilvusServiceImplBase withCompression(String compression) {
            this.compression = compression;
            return this;
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCollection(io.milvus.grpc.CreateCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropCollection(io.milvus.grpc.DropCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasCollection(io.milvus.grpc.HasCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadCollection(io.milvus.grpc.LoadCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releaseCollection(
                io.milvus.grpc.ReleaseCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
                io.milvus.grpc.DescribeCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
                io.milvus.grpc.GetCollectionStatisticsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowCollectionsResponse> showCollections(
                io.milvus.grpc.ShowCollectionsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterCollection(io.milvus.grpc.AlterCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createPartition(io.milvus.grpc.CreatePartitionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropPartition(io.milvus.grpc.DropPartitionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasPartition(io.milvus.grpc.HasPartitionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadPartitions(io.milvus.grpc.LoadPartitionsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releasePartitions(
                io.milvus.grpc.ReleasePartitionsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
                io.milvus.grpc.GetPartitionStatisticsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowPartitionsResponse> showPartitions(
                io.milvus.grpc.ShowPartitionsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
                io.milvus.grpc.GetLoadingProgressRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadStateResponse> getLoadState(
                io.milvus.grpc.GetLoadStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createAlias(io.milvus.grpc.CreateAliasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropAlias(io.milvus.grpc.DropAliasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterAlias(io.milvus.grpc.AlterAliasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeAliasResponse> describeAlias(
                io.milvus.grpc.DescribeAliasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListAliasesResponse> listAliases(
                io.milvus.grpc.ListAliasesRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createIndex(io.milvus.grpc.CreateIndexRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterIndex(io.milvus.grpc.AlterIndexRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeIndexResponse> describeIndex(
                io.milvus.grpc.DescribeIndexRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
                io.milvus.grpc.GetIndexStatisticsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Deprecated: use DescribeIndex instead
         * </pre>
         */
        @Deprecated
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStateResponse> getIndexState(
                io.milvus.grpc.GetIndexStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  Deprecated: use DescribeIndex instead
         * </pre>
         */
        @Deprecated
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
                io.milvus.grpc.GetIndexBuildProgressRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropIndex(io.milvus.grpc.DropIndexRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> insert(io.milvus.grpc.InsertRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> delete(io.milvus.grpc.DeleteRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> upsert(io.milvus.grpc.UpsertRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SearchResults> search(io.milvus.grpc.SearchRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushResponse> flush(io.milvus.grpc.FlushRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.QueryResults> query(io.milvus.grpc.QueryRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.CalcDistanceResults> calcDistance(
                io.milvus.grpc.CalcDistanceRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushAllResponse> flushAll(io.milvus.grpc.FlushAllRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushStateResponse> getFlushState(
                io.milvus.grpc.GetFlushStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
                io.milvus.grpc.GetFlushAllStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
                io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
                io.milvus.grpc.GetQuerySegmentInfoRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetReplicasResponse> getReplicas(
                io.milvus.grpc.GetReplicasRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DummyResponse> dummy(io.milvus.grpc.DummyRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  TODO: remove
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
                io.milvus.grpc.RegisterLinkRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+8+--+Add+metrics+for+proxy
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetMetricsResponse> getMetrics(io.milvus.grpc.GetMetricsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ComponentStates> getComponentStates(
                io.milvus.grpc.GetComponentStatesRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadBalance(io.milvus.grpc.LoadBalanceRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
                io.milvus.grpc.GetCompactionStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
                io.milvus.grpc.ManualCompactionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
                io.milvus.grpc.GetCompactionPlansRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+24+--+Support+bulk+load
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.ImportResponse> import_(io.milvus.grpc.ImportRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetImportStateResponse> getImportState(
                io.milvus.grpc.GetImportStateRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
                io.milvus.grpc.ListImportTasksRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+27+--+Support+Basic+Authentication
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCredential(io.milvus.grpc.CreateCredentialRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> updateCredential(io.milvus.grpc.UpdateCredentialRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> deleteCredential(io.milvus.grpc.DeleteCredentialRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListCredUsersResponse> listCredUsers(
                io.milvus.grpc.ListCredUsersRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        /**
         * <pre>
         *  https://wiki.lfaidata.foundation/display/MIL/MEP+29+--+Support+Role-Based+Access+Control
         * </pre>
         */
        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createRole(io.milvus.grpc.CreateRoleRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropRole(io.milvus.grpc.DropRoleRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operateUserRole(io.milvus.grpc.OperateUserRoleRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectRoleResponse> selectRole(io.milvus.grpc.SelectRoleRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectUserResponse> selectUser(io.milvus.grpc.SelectUserRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectGrantResponse> selectGrant(
                io.milvus.grpc.SelectGrantRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.GetVersionResponse> getVersion(io.milvus.grpc.GetVersionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.CheckHealthResponse> checkHealth(
                io.milvus.grpc.CheckHealthRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createResourceGroup(
                io.milvus.grpc.CreateResourceGroupRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropResourceGroup(
                io.milvus.grpc.DropResourceGroupRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferNode(io.milvus.grpc.TransferNodeRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferReplica(io.milvus.grpc.TransferReplicaRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
                io.milvus.grpc.ListResourceGroupsRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
                io.milvus.grpc.DescribeResourceGroupRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> renameCollection(io.milvus.grpc.RenameCollectionRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
                milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
                milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ConnectResponse> connect(io.milvus.grpc.ConnectRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(
                io.milvus.grpc.AllocTimestampRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createDatabase(io.milvus.grpc.CreateDatabaseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropDatabase(io.milvus.grpc.DropDatabaseRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ListDatabasesResponse> listDatabases(
                io.milvus.grpc.ListDatabasesRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        public io.smallrye.mutiny.Uni<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
                io.milvus.grpc.ReplicateMessageRequest request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override
        public io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateCollectionRequest, io.milvus.grpc.Status>(
                                    this, METHODID_CREATE_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropCollectionRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getHasCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.HasCollectionRequest, io.milvus.grpc.BoolResponse>(
                                    this, METHODID_HAS_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getLoadCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.LoadCollectionRequest, io.milvus.grpc.Status>(this,
                                    METHODID_LOAD_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getReleaseCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.ReleaseCollectionRequest, io.milvus.grpc.Status>(
                                    this, METHODID_RELEASE_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDescribeCollectionMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.DescribeCollectionRequest, io.milvus.grpc.DescribeCollectionResponse>(
                                    this, METHODID_DESCRIBE_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetCollectionStatisticsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetCollectionStatisticsRequest, io.milvus.grpc.GetCollectionStatisticsResponse>(
                                    this, METHODID_GET_COLLECTION_STATISTICS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getShowCollectionsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ShowCollectionsRequest, io.milvus.grpc.ShowCollectionsResponse>(
                                    this, METHODID_SHOW_COLLECTIONS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getAlterCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.AlterCollectionRequest, io.milvus.grpc.Status>(
                                    this, METHODID_ALTER_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreatePartitionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreatePartitionRequest, io.milvus.grpc.Status>(
                                    this, METHODID_CREATE_PARTITION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropPartitionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropPartitionRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_PARTITION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getHasPartitionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.HasPartitionRequest, io.milvus.grpc.BoolResponse>(
                                    this, METHODID_HAS_PARTITION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getLoadPartitionsMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.LoadPartitionsRequest, io.milvus.grpc.Status>(this,
                                    METHODID_LOAD_PARTITIONS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getReleasePartitionsMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.ReleasePartitionsRequest, io.milvus.grpc.Status>(
                                    this, METHODID_RELEASE_PARTITIONS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetPartitionStatisticsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetPartitionStatisticsRequest, io.milvus.grpc.GetPartitionStatisticsResponse>(
                                    this, METHODID_GET_PARTITION_STATISTICS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getShowPartitionsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ShowPartitionsRequest, io.milvus.grpc.ShowPartitionsResponse>(
                                    this, METHODID_SHOW_PARTITIONS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetLoadingProgressMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetLoadingProgressRequest, io.milvus.grpc.GetLoadingProgressResponse>(
                                    this, METHODID_GET_LOADING_PROGRESS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetLoadStateMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.GetLoadStateRequest, io.milvus.grpc.GetLoadStateResponse>(
                                            this, METHODID_GET_LOAD_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateAliasMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateAliasRequest, io.milvus.grpc.Status>(this,
                                    METHODID_CREATE_ALIAS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropAliasMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropAliasRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_ALIAS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getAlterAliasMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.AlterAliasRequest, io.milvus.grpc.Status>(this,
                                    METHODID_ALTER_ALIAS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDescribeAliasMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.DescribeAliasRequest, io.milvus.grpc.DescribeAliasResponse>(this,
                                    METHODID_DESCRIBE_ALIAS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListAliasesMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.ListAliasesRequest, io.milvus.grpc.ListAliasesResponse>(
                                            this, METHODID_LIST_ALIASES, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateIndexMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateIndexRequest, io.milvus.grpc.Status>(this,
                                    METHODID_CREATE_INDEX, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getAlterIndexMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.AlterIndexRequest, io.milvus.grpc.Status>(this,
                                    METHODID_ALTER_INDEX, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDescribeIndexMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.DescribeIndexRequest, io.milvus.grpc.DescribeIndexResponse>(this,
                                    METHODID_DESCRIBE_INDEX, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetIndexStatisticsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetIndexStatisticsRequest, io.milvus.grpc.GetIndexStatisticsResponse>(
                                    this, METHODID_GET_INDEX_STATISTICS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetIndexStateMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetIndexStateRequest, io.milvus.grpc.GetIndexStateResponse>(this,
                                    METHODID_GET_INDEX_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetIndexBuildProgressMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetIndexBuildProgressRequest, io.milvus.grpc.GetIndexBuildProgressResponse>(
                                    this, METHODID_GET_INDEX_BUILD_PROGRESS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropIndexMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropIndexRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_INDEX, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getInsertMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.InsertRequest, io.milvus.grpc.MutationResult>(this,
                                    METHODID_INSERT, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDeleteMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DeleteRequest, io.milvus.grpc.MutationResult>(this,
                                    METHODID_DELETE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getUpsertMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.UpsertRequest, io.milvus.grpc.MutationResult>(this,
                                    METHODID_UPSERT, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getSearchMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.SearchRequest, io.milvus.grpc.SearchResults>(this,
                                    METHODID_SEARCH, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getFlushMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.FlushRequest, io.milvus.grpc.FlushResponse>(this,
                                    METHODID_FLUSH, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getQueryMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.QueryRequest, io.milvus.grpc.QueryResults>(this,
                                    METHODID_QUERY, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCalcDistanceMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.CalcDistanceRequest, io.milvus.grpc.CalcDistanceResults>(
                                            this, METHODID_CALC_DISTANCE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getFlushAllMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.FlushAllRequest, io.milvus.grpc.FlushAllResponse>(
                                    this, METHODID_FLUSH_ALL, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetFlushStateMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetFlushStateRequest, io.milvus.grpc.GetFlushStateResponse>(this,
                                    METHODID_GET_FLUSH_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetFlushAllStateMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetFlushAllStateRequest, io.milvus.grpc.GetFlushAllStateResponse>(
                                    this, METHODID_GET_FLUSH_ALL_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetPersistentSegmentInfoMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetPersistentSegmentInfoRequest, io.milvus.grpc.GetPersistentSegmentInfoResponse>(
                                    this, METHODID_GET_PERSISTENT_SEGMENT_INFO, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetQuerySegmentInfoMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetQuerySegmentInfoRequest, io.milvus.grpc.GetQuerySegmentInfoResponse>(
                                    this, METHODID_GET_QUERY_SEGMENT_INFO, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetReplicasMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.GetReplicasRequest, io.milvus.grpc.GetReplicasResponse>(
                                            this, METHODID_GET_REPLICAS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDummyMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DummyRequest, io.milvus.grpc.DummyResponse>(this,
                                    METHODID_DUMMY, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getRegisterLinkMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.RegisterLinkRequest, io.milvus.grpc.RegisterLinkResponse>(
                                            this, METHODID_REGISTER_LINK, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetMetricsMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.GetMetricsRequest, io.milvus.grpc.GetMetricsResponse>(
                                            this, METHODID_GET_METRICS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetComponentStatesMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetComponentStatesRequest, io.milvus.grpc.ComponentStates>(this,
                                    METHODID_GET_COMPONENT_STATES, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getLoadBalanceMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.LoadBalanceRequest, io.milvus.grpc.Status>(this,
                                    METHODID_LOAD_BALANCE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetCompactionStateMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetCompactionStateRequest, io.milvus.grpc.GetCompactionStateResponse>(
                                    this, METHODID_GET_COMPACTION_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getManualCompactionMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ManualCompactionRequest, io.milvus.grpc.ManualCompactionResponse>(
                                    this, METHODID_MANUAL_COMPACTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetCompactionStateWithPlansMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetCompactionPlansRequest, io.milvus.grpc.GetCompactionPlansResponse>(
                                    this, METHODID_GET_COMPACTION_STATE_WITH_PLANS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getImportMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.ImportRequest, io.milvus.grpc.ImportResponse>(this,
                                    METHODID_IMPORT_, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetImportStateMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.GetImportStateRequest, io.milvus.grpc.GetImportStateResponse>(
                                    this, METHODID_GET_IMPORT_STATE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListImportTasksMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ListImportTasksRequest, io.milvus.grpc.ListImportTasksResponse>(
                                    this, METHODID_LIST_IMPORT_TASKS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateCredentialMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateCredentialRequest, io.milvus.grpc.Status>(
                                    this, METHODID_CREATE_CREDENTIAL, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getUpdateCredentialMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.UpdateCredentialRequest, io.milvus.grpc.Status>(
                                    this, METHODID_UPDATE_CREDENTIAL, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDeleteCredentialMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DeleteCredentialRequest, io.milvus.grpc.Status>(
                                    this, METHODID_DELETE_CREDENTIAL, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListCredUsersMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ListCredUsersRequest, io.milvus.grpc.ListCredUsersResponse>(this,
                                    METHODID_LIST_CRED_USERS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateRoleMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateRoleRequest, io.milvus.grpc.Status>(this,
                                    METHODID_CREATE_ROLE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropRoleMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropRoleRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_ROLE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getOperateUserRoleMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.OperateUserRoleRequest, io.milvus.grpc.Status>(
                                    this, METHODID_OPERATE_USER_ROLE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getSelectRoleMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.SelectRoleRequest, io.milvus.grpc.SelectRoleResponse>(
                                            this, METHODID_SELECT_ROLE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getSelectUserMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.SelectUserRequest, io.milvus.grpc.SelectUserResponse>(
                                            this, METHODID_SELECT_USER, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getOperatePrivilegeMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.OperatePrivilegeRequest, io.milvus.grpc.Status>(
                                    this, METHODID_OPERATE_PRIVILEGE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getSelectGrantMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.SelectGrantRequest, io.milvus.grpc.SelectGrantResponse>(
                                            this, METHODID_SELECT_GRANT, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getGetVersionMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.GetVersionRequest, io.milvus.grpc.GetVersionResponse>(
                                            this, METHODID_GET_VERSION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCheckHealthMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<io.milvus.grpc.CheckHealthRequest, io.milvus.grpc.CheckHealthResponse>(
                                            this, METHODID_CHECK_HEALTH, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateResourceGroupMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateResourceGroupRequest, io.milvus.grpc.Status>(
                                    this, METHODID_CREATE_RESOURCE_GROUP, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropResourceGroupMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropResourceGroupRequest, io.milvus.grpc.Status>(
                                    this, METHODID_DROP_RESOURCE_GROUP, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getTransferNodeMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.TransferNodeRequest, io.milvus.grpc.Status>(this,
                                    METHODID_TRANSFER_NODE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getTransferReplicaMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.TransferReplicaRequest, io.milvus.grpc.Status>(
                                    this, METHODID_TRANSFER_REPLICA, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListResourceGroupsMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ListResourceGroupsRequest, io.milvus.grpc.ListResourceGroupsResponse>(
                                    this, METHODID_LIST_RESOURCE_GROUPS, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDescribeResourceGroupMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.DescribeResourceGroupRequest, io.milvus.grpc.DescribeResourceGroupResponse>(
                                    this, METHODID_DESCRIBE_RESOURCE_GROUP, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getRenameCollectionMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.RenameCollectionRequest, io.milvus.grpc.Status>(
                                    this, METHODID_RENAME_COLLECTION, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListIndexedSegmentMethod(), asyncUnaryCall(
                            new MethodHandlers<milvus.proto.feder.Feder.ListIndexedSegmentRequest, milvus.proto.feder.Feder.ListIndexedSegmentResponse>(
                                    this, METHODID_LIST_INDEXED_SEGMENT, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDescribeSegmentIndexDataMethod(), asyncUnaryCall(
                            new MethodHandlers<milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest, milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse>(
                                    this, METHODID_DESCRIBE_SEGMENT_INDEX_DATA, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getConnectMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.ConnectRequest, io.milvus.grpc.ConnectResponse>(
                                    this, METHODID_CONNECT, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getAllocTimestampMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.AllocTimestampRequest, io.milvus.grpc.AllocTimestampResponse>(
                                    this, METHODID_ALLOC_TIMESTAMP, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getCreateDatabaseMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.CreateDatabaseRequest, io.milvus.grpc.Status>(this,
                                    METHODID_CREATE_DATABASE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getDropDatabaseMethod(),
                            asyncUnaryCall(new MethodHandlers<io.milvus.grpc.DropDatabaseRequest, io.milvus.grpc.Status>(this,
                                    METHODID_DROP_DATABASE, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getListDatabasesMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ListDatabasesRequest, io.milvus.grpc.ListDatabasesResponse>(this,
                                    METHODID_LIST_DATABASES, compression)))
                    .addMethod(io.milvus.grpc.MilvusServiceGrpc.getReplicateMessageMethod(), asyncUnaryCall(
                            new MethodHandlers<io.milvus.grpc.ReplicateMessageRequest, io.milvus.grpc.ReplicateMessageResponse>(
                                    this, METHODID_REPLICATE_MESSAGE, compression)))
                    .build();
        }
    }

    private static final int METHODID_CREATE_COLLECTION = 0;

    private static final int METHODID_DROP_COLLECTION = 1;

    private static final int METHODID_HAS_COLLECTION = 2;

    private static final int METHODID_LOAD_COLLECTION = 3;

    private static final int METHODID_RELEASE_COLLECTION = 4;

    private static final int METHODID_DESCRIBE_COLLECTION = 5;

    private static final int METHODID_GET_COLLECTION_STATISTICS = 6;

    private static final int METHODID_SHOW_COLLECTIONS = 7;

    private static final int METHODID_ALTER_COLLECTION = 8;

    private static final int METHODID_CREATE_PARTITION = 9;

    private static final int METHODID_DROP_PARTITION = 10;

    private static final int METHODID_HAS_PARTITION = 11;

    private static final int METHODID_LOAD_PARTITIONS = 12;

    private static final int METHODID_RELEASE_PARTITIONS = 13;

    private static final int METHODID_GET_PARTITION_STATISTICS = 14;

    private static final int METHODID_SHOW_PARTITIONS = 15;

    private static final int METHODID_GET_LOADING_PROGRESS = 16;

    private static final int METHODID_GET_LOAD_STATE = 17;

    private static final int METHODID_CREATE_ALIAS = 18;

    private static final int METHODID_DROP_ALIAS = 19;

    private static final int METHODID_ALTER_ALIAS = 20;

    private static final int METHODID_DESCRIBE_ALIAS = 21;

    private static final int METHODID_LIST_ALIASES = 22;

    private static final int METHODID_CREATE_INDEX = 23;

    private static final int METHODID_ALTER_INDEX = 24;

    private static final int METHODID_DESCRIBE_INDEX = 25;

    private static final int METHODID_GET_INDEX_STATISTICS = 26;

    private static final int METHODID_GET_INDEX_STATE = 27;

    private static final int METHODID_GET_INDEX_BUILD_PROGRESS = 28;

    private static final int METHODID_DROP_INDEX = 29;

    private static final int METHODID_INSERT = 30;

    private static final int METHODID_DELETE = 31;

    private static final int METHODID_UPSERT = 32;

    private static final int METHODID_SEARCH = 33;

    private static final int METHODID_FLUSH = 34;

    private static final int METHODID_QUERY = 35;

    private static final int METHODID_CALC_DISTANCE = 36;

    private static final int METHODID_FLUSH_ALL = 37;

    private static final int METHODID_GET_FLUSH_STATE = 38;

    private static final int METHODID_GET_FLUSH_ALL_STATE = 39;

    private static final int METHODID_GET_PERSISTENT_SEGMENT_INFO = 40;

    private static final int METHODID_GET_QUERY_SEGMENT_INFO = 41;

    private static final int METHODID_GET_REPLICAS = 42;

    private static final int METHODID_DUMMY = 43;

    private static final int METHODID_REGISTER_LINK = 44;

    private static final int METHODID_GET_METRICS = 45;

    private static final int METHODID_GET_COMPONENT_STATES = 46;

    private static final int METHODID_LOAD_BALANCE = 47;

    private static final int METHODID_GET_COMPACTION_STATE = 48;

    private static final int METHODID_MANUAL_COMPACTION = 49;

    private static final int METHODID_GET_COMPACTION_STATE_WITH_PLANS = 50;

    private static final int METHODID_IMPORT_ = 51;

    private static final int METHODID_GET_IMPORT_STATE = 52;

    private static final int METHODID_LIST_IMPORT_TASKS = 53;

    private static final int METHODID_CREATE_CREDENTIAL = 54;

    private static final int METHODID_UPDATE_CREDENTIAL = 55;

    private static final int METHODID_DELETE_CREDENTIAL = 56;

    private static final int METHODID_LIST_CRED_USERS = 57;

    private static final int METHODID_CREATE_ROLE = 58;

    private static final int METHODID_DROP_ROLE = 59;

    private static final int METHODID_OPERATE_USER_ROLE = 60;

    private static final int METHODID_SELECT_ROLE = 61;

    private static final int METHODID_SELECT_USER = 62;

    private static final int METHODID_OPERATE_PRIVILEGE = 63;

    private static final int METHODID_SELECT_GRANT = 64;

    private static final int METHODID_GET_VERSION = 65;

    private static final int METHODID_CHECK_HEALTH = 66;

    private static final int METHODID_CREATE_RESOURCE_GROUP = 67;

    private static final int METHODID_DROP_RESOURCE_GROUP = 68;

    private static final int METHODID_TRANSFER_NODE = 69;

    private static final int METHODID_TRANSFER_REPLICA = 70;

    private static final int METHODID_LIST_RESOURCE_GROUPS = 71;

    private static final int METHODID_DESCRIBE_RESOURCE_GROUP = 72;

    private static final int METHODID_RENAME_COLLECTION = 73;

    private static final int METHODID_LIST_INDEXED_SEGMENT = 74;

    private static final int METHODID_DESCRIBE_SEGMENT_INDEX_DATA = 75;

    private static final int METHODID_CONNECT = 76;

    private static final int METHODID_ALLOC_TIMESTAMP = 77;

    private static final int METHODID_CREATE_DATABASE = 78;

    private static final int METHODID_DROP_DATABASE = 79;

    private static final int METHODID_LIST_DATABASES = 80;

    private static final int METHODID_REPLICATE_MESSAGE = 81;

    private static final class MethodHandlers<Req, Resp> implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>, io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

        private final MilvusServiceImplBase serviceImpl;

        private final int methodId;

        private final String compression;

        MethodHandlers(MilvusServiceImplBase serviceImpl, int methodId, String compression) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
            this.compression = compression;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_CREATE_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createCollection);
                    break;
                case METHODID_DROP_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropCollection);
                    break;
                case METHODID_HAS_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.HasCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse>) responseObserver, compression,
                            serviceImpl::hasCollection);
                    break;
                case METHODID_LOAD_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.LoadCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::loadCollection);
                    break;
                case METHODID_RELEASE_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ReleaseCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::releaseCollection);
                    break;
                case METHODID_DESCRIBE_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DescribeCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeCollectionResponse>) responseObserver,
                            compression, serviceImpl::describeCollection);
                    break;
                case METHODID_GET_COLLECTION_STATISTICS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetCollectionStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCollectionStatisticsResponse>) responseObserver,
                            compression, serviceImpl::getCollectionStatistics);
                    break;
                case METHODID_SHOW_COLLECTIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ShowCollectionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ShowCollectionsResponse>) responseObserver, compression,
                            serviceImpl::showCollections);
                    break;
                case METHODID_ALTER_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.AlterCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::alterCollection);
                    break;
                case METHODID_CREATE_PARTITION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreatePartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createPartition);
                    break;
                case METHODID_DROP_PARTITION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropPartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropPartition);
                    break;
                case METHODID_HAS_PARTITION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.HasPartitionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.BoolResponse>) responseObserver, compression,
                            serviceImpl::hasPartition);
                    break;
                case METHODID_LOAD_PARTITIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.LoadPartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::loadPartitions);
                    break;
                case METHODID_RELEASE_PARTITIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ReleasePartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::releasePartitions);
                    break;
                case METHODID_GET_PARTITION_STATISTICS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetPartitionStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetPartitionStatisticsResponse>) responseObserver,
                            compression, serviceImpl::getPartitionStatistics);
                    break;
                case METHODID_SHOW_PARTITIONS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ShowPartitionsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ShowPartitionsResponse>) responseObserver, compression,
                            serviceImpl::showPartitions);
                    break;
                case METHODID_GET_LOADING_PROGRESS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetLoadingProgressRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadingProgressResponse>) responseObserver,
                            compression, serviceImpl::getLoadingProgress);
                    break;
                case METHODID_GET_LOAD_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetLoadStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetLoadStateResponse>) responseObserver, compression,
                            serviceImpl::getLoadState);
                    break;
                case METHODID_CREATE_ALIAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createAlias);
                    break;
                case METHODID_DROP_ALIAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropAlias);
                    break;
                case METHODID_ALTER_ALIAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.AlterAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::alterAlias);
                    break;
                case METHODID_DESCRIBE_ALIAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DescribeAliasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeAliasResponse>) responseObserver, compression,
                            serviceImpl::describeAlias);
                    break;
                case METHODID_LIST_ALIASES:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ListAliasesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListAliasesResponse>) responseObserver, compression,
                            serviceImpl::listAliases);
                    break;
                case METHODID_CREATE_INDEX:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createIndex);
                    break;
                case METHODID_ALTER_INDEX:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.AlterIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::alterIndex);
                    break;
                case METHODID_DESCRIBE_INDEX:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DescribeIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeIndexResponse>) responseObserver, compression,
                            serviceImpl::describeIndex);
                    break;
                case METHODID_GET_INDEX_STATISTICS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetIndexStatisticsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStatisticsResponse>) responseObserver,
                            compression, serviceImpl::getIndexStatistics);
                    break;
                case METHODID_GET_INDEX_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetIndexStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexStateResponse>) responseObserver, compression,
                            serviceImpl::getIndexState);
                    break;
                case METHODID_GET_INDEX_BUILD_PROGRESS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetIndexBuildProgressRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetIndexBuildProgressResponse>) responseObserver,
                            compression, serviceImpl::getIndexBuildProgress);
                    break;
                case METHODID_DROP_INDEX:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropIndexRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropIndex);
                    break;
                case METHODID_INSERT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.InsertRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver, compression,
                            serviceImpl::insert);
                    break;
                case METHODID_DELETE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DeleteRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver, compression,
                            serviceImpl::delete);
                    break;
                case METHODID_UPSERT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.UpsertRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.MutationResult>) responseObserver, compression,
                            serviceImpl::upsert);
                    break;
                case METHODID_SEARCH:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.SearchRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SearchResults>) responseObserver, compression,
                            serviceImpl::search);
                    break;
                case METHODID_FLUSH:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.FlushRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.FlushResponse>) responseObserver, compression,
                            serviceImpl::flush);
                    break;
                case METHODID_QUERY:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.QueryRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.QueryResults>) responseObserver, compression,
                            serviceImpl::query);
                    break;
                case METHODID_CALC_DISTANCE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CalcDistanceRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.CalcDistanceResults>) responseObserver, compression,
                            serviceImpl::calcDistance);
                    break;
                case METHODID_FLUSH_ALL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.FlushAllRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.FlushAllResponse>) responseObserver, compression,
                            serviceImpl::flushAll);
                    break;
                case METHODID_GET_FLUSH_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetFlushStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushStateResponse>) responseObserver, compression,
                            serviceImpl::getFlushState);
                    break;
                case METHODID_GET_FLUSH_ALL_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetFlushAllStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetFlushAllStateResponse>) responseObserver,
                            compression, serviceImpl::getFlushAllState);
                    break;
                case METHODID_GET_PERSISTENT_SEGMENT_INFO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetPersistentSegmentInfoRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetPersistentSegmentInfoResponse>) responseObserver,
                            compression, serviceImpl::getPersistentSegmentInfo);
                    break;
                case METHODID_GET_QUERY_SEGMENT_INFO:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetQuerySegmentInfoRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetQuerySegmentInfoResponse>) responseObserver,
                            compression, serviceImpl::getQuerySegmentInfo);
                    break;
                case METHODID_GET_REPLICAS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetReplicasRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetReplicasResponse>) responseObserver, compression,
                            serviceImpl::getReplicas);
                    break;
                case METHODID_DUMMY:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DummyRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DummyResponse>) responseObserver, compression,
                            serviceImpl::dummy);
                    break;
                case METHODID_REGISTER_LINK:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.RegisterLinkRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.RegisterLinkResponse>) responseObserver, compression,
                            serviceImpl::registerLink);
                    break;
                case METHODID_GET_METRICS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetMetricsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetMetricsResponse>) responseObserver, compression,
                            serviceImpl::getMetrics);
                    break;
                case METHODID_GET_COMPONENT_STATES:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetComponentStatesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ComponentStates>) responseObserver, compression,
                            serviceImpl::getComponentStates);
                    break;
                case METHODID_LOAD_BALANCE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.LoadBalanceRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::loadBalance);
                    break;
                case METHODID_GET_COMPACTION_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetCompactionStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionStateResponse>) responseObserver,
                            compression, serviceImpl::getCompactionState);
                    break;
                case METHODID_MANUAL_COMPACTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ManualCompactionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ManualCompactionResponse>) responseObserver,
                            compression, serviceImpl::manualCompaction);
                    break;
                case METHODID_GET_COMPACTION_STATE_WITH_PLANS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetCompactionPlansRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetCompactionPlansResponse>) responseObserver,
                            compression, serviceImpl::getCompactionStateWithPlans);
                    break;
                case METHODID_IMPORT_:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ImportRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ImportResponse>) responseObserver, compression,
                            serviceImpl::import_);
                    break;
                case METHODID_GET_IMPORT_STATE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetImportStateRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetImportStateResponse>) responseObserver, compression,
                            serviceImpl::getImportState);
                    break;
                case METHODID_LIST_IMPORT_TASKS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ListImportTasksRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListImportTasksResponse>) responseObserver, compression,
                            serviceImpl::listImportTasks);
                    break;
                case METHODID_CREATE_CREDENTIAL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createCredential);
                    break;
                case METHODID_UPDATE_CREDENTIAL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.UpdateCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::updateCredential);
                    break;
                case METHODID_DELETE_CREDENTIAL:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DeleteCredentialRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::deleteCredential);
                    break;
                case METHODID_LIST_CRED_USERS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ListCredUsersRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListCredUsersResponse>) responseObserver, compression,
                            serviceImpl::listCredUsers);
                    break;
                case METHODID_CREATE_ROLE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createRole);
                    break;
                case METHODID_DROP_ROLE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropRole);
                    break;
                case METHODID_OPERATE_USER_ROLE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.OperateUserRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::operateUserRole);
                    break;
                case METHODID_SELECT_ROLE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.SelectRoleRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectRoleResponse>) responseObserver, compression,
                            serviceImpl::selectRole);
                    break;
                case METHODID_SELECT_USER:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.SelectUserRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectUserResponse>) responseObserver, compression,
                            serviceImpl::selectUser);
                    break;
                case METHODID_OPERATE_PRIVILEGE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.OperatePrivilegeRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::operatePrivilege);
                    break;
                case METHODID_SELECT_GRANT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.SelectGrantRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.SelectGrantResponse>) responseObserver, compression,
                            serviceImpl::selectGrant);
                    break;
                case METHODID_GET_VERSION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.GetVersionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.GetVersionResponse>) responseObserver, compression,
                            serviceImpl::getVersion);
                    break;
                case METHODID_CHECK_HEALTH:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CheckHealthRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.CheckHealthResponse>) responseObserver, compression,
                            serviceImpl::checkHealth);
                    break;
                case METHODID_CREATE_RESOURCE_GROUP:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createResourceGroup);
                    break;
                case METHODID_DROP_RESOURCE_GROUP:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropResourceGroup);
                    break;
                case METHODID_TRANSFER_NODE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.TransferNodeRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::transferNode);
                    break;
                case METHODID_TRANSFER_REPLICA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.TransferReplicaRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::transferReplica);
                    break;
                case METHODID_LIST_RESOURCE_GROUPS:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ListResourceGroupsRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListResourceGroupsResponse>) responseObserver,
                            compression, serviceImpl::listResourceGroups);
                    break;
                case METHODID_DESCRIBE_RESOURCE_GROUP:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DescribeResourceGroupRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.DescribeResourceGroupResponse>) responseObserver,
                            compression, serviceImpl::describeResourceGroup);
                    break;
                case METHODID_RENAME_COLLECTION:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.RenameCollectionRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::renameCollection);
                    break;
                case METHODID_LIST_INDEXED_SEGMENT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((milvus.proto.feder.Feder.ListIndexedSegmentRequest) request,
                            (io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.ListIndexedSegmentResponse>) responseObserver,
                            compression, serviceImpl::listIndexedSegment);
                    break;
                case METHODID_DESCRIBE_SEGMENT_INDEX_DATA:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne(
                            (milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest) request,
                            (io.grpc.stub.StreamObserver<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse>) responseObserver,
                            compression, serviceImpl::describeSegmentIndexData);
                    break;
                case METHODID_CONNECT:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ConnectRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ConnectResponse>) responseObserver, compression,
                            serviceImpl::connect);
                    break;
                case METHODID_ALLOC_TIMESTAMP:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.AllocTimestampRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.AllocTimestampResponse>) responseObserver, compression,
                            serviceImpl::allocTimestamp);
                    break;
                case METHODID_CREATE_DATABASE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.CreateDatabaseRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::createDatabase);
                    break;
                case METHODID_DROP_DATABASE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.DropDatabaseRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.Status>) responseObserver, compression,
                            serviceImpl::dropDatabase);
                    break;
                case METHODID_LIST_DATABASES:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ListDatabasesRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ListDatabasesResponse>) responseObserver, compression,
                            serviceImpl::listDatabases);
                    break;
                case METHODID_REPLICATE_MESSAGE:
                    io.quarkus.grpc.stubs.ServerCalls.oneToOne((io.milvus.grpc.ReplicateMessageRequest) request,
                            (io.grpc.stub.StreamObserver<io.milvus.grpc.ReplicateMessageResponse>) responseObserver,
                            compression, serviceImpl::replicateMessage);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }
}
