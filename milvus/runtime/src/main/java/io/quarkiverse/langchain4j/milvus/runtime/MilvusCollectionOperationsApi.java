package io.quarkiverse.langchain4j.milvus.runtime;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/vector/collections")
public interface MilvusCollectionOperationsApi {

    @POST
    @Path("/create")
    CreateCollectionResponse createCollecton(CreateCollectionRequest request);

    @GET
    @Path("/")
    ListCollectionsResponse listCollections();
}
