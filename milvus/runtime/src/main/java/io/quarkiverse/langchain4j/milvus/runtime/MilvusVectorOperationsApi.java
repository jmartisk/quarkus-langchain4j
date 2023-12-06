package io.quarkiverse.langchain4j.milvus.runtime;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/vector")
public interface MilvusVectorOperationsApi {

    @POST
    @Path("/upsert")
    UpsertResponse upsert(UpsertRequest request);

    @POST
    @Path("/search")
    SearchResponse search(SearchRequest request);

}
