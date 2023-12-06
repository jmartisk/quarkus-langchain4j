package io.quarkiverse.langchain4j.milvus.runtime;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CreateCollectionRequest {

    // TODO: how to set autoId=false on the id field???
    // https://github.com/milvus-io/milvus/blob/master/tests/scripts/restful-data/create-collection.json
    private String dbName;
    private String collectionName;
    private int dimension;
    private MetricType metricType;
    private String primaryField;
    private String vectorField;

    public CreateCollectionRequest(String dbName,
            String collectionName,
            int dimension,
            MetricType metricType,
            String primaryField,
            String vectorField) {
        this.dbName = dbName;
        this.collectionName = collectionName;
        this.dimension = dimension;
        this.metricType = metricType;
        this.primaryField = primaryField;
        this.vectorField = vectorField;
    }

    public String getDbName() {
        return dbName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public int getDimension() {
        return dimension;
    }

    public MetricType getMetricType() {
        return metricType;
    }

    public String getPrimaryField() {
        return primaryField;
    }

    public String getVectorField() {
        return vectorField;
    }
}
