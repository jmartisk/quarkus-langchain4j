package io.milvus.grpc;

import io.quarkus.grpc.MutinyService;

@jakarta.annotation.Generated(value = "by Mutiny Grpc generator", comments = "Source: milvus.proto")
public interface ProxyService extends MutinyService {

    io.smallrye.mutiny.Uni<io.milvus.grpc.RegisterLinkResponse> registerLink(io.milvus.grpc.RegisterLinkRequest request);
}
