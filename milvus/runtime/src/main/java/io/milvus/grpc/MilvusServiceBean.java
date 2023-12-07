package io.milvus.grpc;

import io.grpc.BindableService;
import io.quarkus.grpc.GrpcService;
import io.quarkus.grpc.MutinyBean;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public class MilvusServiceBean extends MutinyMilvusServiceGrpc.MilvusServiceImplBase implements BindableService, MutinyBean {

    private final MilvusService delegate;

    MilvusServiceBean(@GrpcService MilvusService delegate) {
        this.delegate = delegate;
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCollection(io.milvus.grpc.CreateCollectionRequest request) {
        try {
            return delegate.createCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropCollection(io.milvus.grpc.DropCollectionRequest request) {
        try {
            return delegate.dropCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasCollection(io.milvus.grpc.HasCollectionRequest request) {
        try {
            return delegate.hasCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadCollection(io.milvus.grpc.LoadCollectionRequest request) {
        try {
            return delegate.loadCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releaseCollection(io.milvus.grpc.ReleaseCollectionRequest request) {
        try {
            return delegate.releaseCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeCollectionResponse> describeCollection(
            io.milvus.grpc.DescribeCollectionRequest request) {
        try {
            return delegate.describeCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCollectionStatisticsResponse> getCollectionStatistics(
            io.milvus.grpc.GetCollectionStatisticsRequest request) {
        try {
            return delegate.getCollectionStatistics(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowCollectionsResponse> showCollections(
            io.milvus.grpc.ShowCollectionsRequest request) {
        try {
            return delegate.showCollections(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterCollection(io.milvus.grpc.AlterCollectionRequest request) {
        try {
            return delegate.alterCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createPartition(io.milvus.grpc.CreatePartitionRequest request) {
        try {
            return delegate.createPartition(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropPartition(io.milvus.grpc.DropPartitionRequest request) {
        try {
            return delegate.dropPartition(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.BoolResponse> hasPartition(io.milvus.grpc.HasPartitionRequest request) {
        try {
            return delegate.hasPartition(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadPartitions(io.milvus.grpc.LoadPartitionsRequest request) {
        try {
            return delegate.loadPartitions(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> releasePartitions(io.milvus.grpc.ReleasePartitionsRequest request) {
        try {
            return delegate.releasePartitions(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPartitionStatisticsResponse> getPartitionStatistics(
            io.milvus.grpc.GetPartitionStatisticsRequest request) {
        try {
            return delegate.getPartitionStatistics(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ShowPartitionsResponse> showPartitions(
            io.milvus.grpc.ShowPartitionsRequest request) {
        try {
            return delegate.showPartitions(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadingProgressResponse> getLoadingProgress(
            io.milvus.grpc.GetLoadingProgressRequest request) {
        try {
            return delegate.getLoadingProgress(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetLoadStateResponse> getLoadState(
            io.milvus.grpc.GetLoadStateRequest request) {
        try {
            return delegate.getLoadState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createAlias(io.milvus.grpc.CreateAliasRequest request) {
        try {
            return delegate.createAlias(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropAlias(io.milvus.grpc.DropAliasRequest request) {
        try {
            return delegate.dropAlias(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterAlias(io.milvus.grpc.AlterAliasRequest request) {
        try {
            return delegate.alterAlias(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeAliasResponse> describeAlias(
            io.milvus.grpc.DescribeAliasRequest request) {
        try {
            return delegate.describeAlias(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListAliasesResponse> listAliases(io.milvus.grpc.ListAliasesRequest request) {
        try {
            return delegate.listAliases(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createIndex(io.milvus.grpc.CreateIndexRequest request) {
        try {
            return delegate.createIndex(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> alterIndex(io.milvus.grpc.AlterIndexRequest request) {
        try {
            return delegate.alterIndex(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeIndexResponse> describeIndex(
            io.milvus.grpc.DescribeIndexRequest request) {
        try {
            return delegate.describeIndex(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStatisticsResponse> getIndexStatistics(
            io.milvus.grpc.GetIndexStatisticsRequest request) {
        try {
            return delegate.getIndexStatistics(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexStateResponse> getIndexState(
            io.milvus.grpc.GetIndexStateRequest request) {
        try {
            return delegate.getIndexState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetIndexBuildProgressResponse> getIndexBuildProgress(
            io.milvus.grpc.GetIndexBuildProgressRequest request) {
        try {
            return delegate.getIndexBuildProgress(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropIndex(io.milvus.grpc.DropIndexRequest request) {
        try {
            return delegate.dropIndex(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> insert(io.milvus.grpc.InsertRequest request) {
        try {
            return delegate.insert(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> delete(io.milvus.grpc.DeleteRequest request) {
        try {
            return delegate.delete(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.MutationResult> upsert(io.milvus.grpc.UpsertRequest request) {
        try {
            return delegate.upsert(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SearchResults> search(io.milvus.grpc.SearchRequest request) {
        try {
            return delegate.search(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushResponse> flush(io.milvus.grpc.FlushRequest request) {
        try {
            return delegate.flush(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.QueryResults> query(io.milvus.grpc.QueryRequest request) {
        try {
            return delegate.query(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.CalcDistanceResults> calcDistance(io.milvus.grpc.CalcDistanceRequest request) {
        try {
            return delegate.calcDistance(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.FlushAllResponse> flushAll(io.milvus.grpc.FlushAllRequest request) {
        try {
            return delegate.flushAll(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushStateResponse> getFlushState(
            io.milvus.grpc.GetFlushStateRequest request) {
        try {
            return delegate.getFlushState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetFlushAllStateResponse> getFlushAllState(
            io.milvus.grpc.GetFlushAllStateRequest request) {
        try {
            return delegate.getFlushAllState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetPersistentSegmentInfoResponse> getPersistentSegmentInfo(
            io.milvus.grpc.GetPersistentSegmentInfoRequest request) {
        try {
            return delegate.getPersistentSegmentInfo(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetQuerySegmentInfoResponse> getQuerySegmentInfo(
            io.milvus.grpc.GetQuerySegmentInfoRequest request) {
        try {
            return delegate.getQuerySegmentInfo(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetReplicasResponse> getReplicas(io.milvus.grpc.GetReplicasRequest request) {
        try {
            return delegate.getReplicas(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DummyResponse> dummy(io.milvus.grpc.DummyRequest request) {
        try {
            return delegate.dummy(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(
            io.milvus.grpc.RegisterLinkRequest request) {
        try {
            return delegate.registerLink(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetMetricsResponse> getMetrics(io.milvus.grpc.GetMetricsRequest request) {
        try {
            return delegate.getMetrics(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ComponentStates> getComponentStates(
            io.milvus.grpc.GetComponentStatesRequest request) {
        try {
            return delegate.getComponentStates(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> loadBalance(io.milvus.grpc.LoadBalanceRequest request) {
        try {
            return delegate.loadBalance(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionStateResponse> getCompactionState(
            io.milvus.grpc.GetCompactionStateRequest request) {
        try {
            return delegate.getCompactionState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ManualCompactionResponse> manualCompaction(
            io.milvus.grpc.ManualCompactionRequest request) {
        try {
            return delegate.manualCompaction(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetCompactionPlansResponse> getCompactionStateWithPlans(
            io.milvus.grpc.GetCompactionPlansRequest request) {
        try {
            return delegate.getCompactionStateWithPlans(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ImportResponse> import_(io.milvus.grpc.ImportRequest request) {
        try {
            return delegate.import_(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetImportStateResponse> getImportState(
            io.milvus.grpc.GetImportStateRequest request) {
        try {
            return delegate.getImportState(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListImportTasksResponse> listImportTasks(
            io.milvus.grpc.ListImportTasksRequest request) {
        try {
            return delegate.listImportTasks(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createCredential(io.milvus.grpc.CreateCredentialRequest request) {
        try {
            return delegate.createCredential(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> updateCredential(io.milvus.grpc.UpdateCredentialRequest request) {
        try {
            return delegate.updateCredential(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> deleteCredential(io.milvus.grpc.DeleteCredentialRequest request) {
        try {
            return delegate.deleteCredential(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListCredUsersResponse> listCredUsers(
            io.milvus.grpc.ListCredUsersRequest request) {
        try {
            return delegate.listCredUsers(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createRole(io.milvus.grpc.CreateRoleRequest request) {
        try {
            return delegate.createRole(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropRole(io.milvus.grpc.DropRoleRequest request) {
        try {
            return delegate.dropRole(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operateUserRole(io.milvus.grpc.OperateUserRoleRequest request) {
        try {
            return delegate.operateUserRole(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectRoleResponse> selectRole(io.milvus.grpc.SelectRoleRequest request) {
        try {
            return delegate.selectRole(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectUserResponse> selectUser(io.milvus.grpc.SelectUserRequest request) {
        try {
            return delegate.selectUser(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> operatePrivilege(io.milvus.grpc.OperatePrivilegeRequest request) {
        try {
            return delegate.operatePrivilege(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.SelectGrantResponse> selectGrant(io.milvus.grpc.SelectGrantRequest request) {
        try {
            return delegate.selectGrant(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.GetVersionResponse> getVersion(io.milvus.grpc.GetVersionRequest request) {
        try {
            return delegate.getVersion(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.CheckHealthResponse> checkHealth(io.milvus.grpc.CheckHealthRequest request) {
        try {
            return delegate.checkHealth(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createResourceGroup(
            io.milvus.grpc.CreateResourceGroupRequest request) {
        try {
            return delegate.createResourceGroup(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropResourceGroup(io.milvus.grpc.DropResourceGroupRequest request) {
        try {
            return delegate.dropResourceGroup(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferNode(io.milvus.grpc.TransferNodeRequest request) {
        try {
            return delegate.transferNode(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> transferReplica(io.milvus.grpc.TransferReplicaRequest request) {
        try {
            return delegate.transferReplica(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListResourceGroupsResponse> listResourceGroups(
            io.milvus.grpc.ListResourceGroupsRequest request) {
        try {
            return delegate.listResourceGroups(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.DescribeResourceGroupResponse> describeResourceGroup(
            io.milvus.grpc.DescribeResourceGroupRequest request) {
        try {
            return delegate.describeResourceGroup(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> renameCollection(io.milvus.grpc.RenameCollectionRequest request) {
        try {
            return delegate.renameCollection(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.ListIndexedSegmentResponse> listIndexedSegment(
            milvus.proto.feder.Feder.ListIndexedSegmentRequest request) {
        try {
            return delegate.listIndexedSegment(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<milvus.proto.feder.Feder.DescribeSegmentIndexDataResponse> describeSegmentIndexData(
            milvus.proto.feder.Feder.DescribeSegmentIndexDataRequest request) {
        try {
            return delegate.describeSegmentIndexData(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ConnectResponse> connect(io.milvus.grpc.ConnectRequest request) {
        try {
            return delegate.connect(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.AllocTimestampResponse> allocTimestamp(
            io.milvus.grpc.AllocTimestampRequest request) {
        try {
            return delegate.allocTimestamp(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> createDatabase(io.milvus.grpc.CreateDatabaseRequest request) {
        try {
            return delegate.createDatabase(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.Status> dropDatabase(io.milvus.grpc.DropDatabaseRequest request) {
        try {
            return delegate.dropDatabase(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ListDatabasesResponse> listDatabases(
            io.milvus.grpc.ListDatabasesRequest request) {
        try {
            return delegate.listDatabases(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }

    @Override
    public io.smallrye.mutiny.Uni<io.milvus.grpc.ReplicateMessageResponse> replicateMessage(
            io.milvus.grpc.ReplicateMessageRequest request) {
        try {
            return delegate.replicateMessage(request);
        } catch (UnsupportedOperationException e) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }
    }
}
