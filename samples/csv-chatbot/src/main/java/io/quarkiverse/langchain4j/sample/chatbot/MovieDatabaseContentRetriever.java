package io.quarkiverse.langchain4j.sample.chatbot;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import dev.langchain4j.rag.content.Content;
import dev.langchain4j.rag.content.retriever.ContentRetriever;
import dev.langchain4j.rag.query.Query;
import io.quarkus.logging.Log;
import io.vertx.core.json.JsonObject;

@ApplicationScoped
public class MovieDatabaseContentRetriever implements ContentRetriever {

    @Inject
    MovieMuseSupport support;

    @Inject
    DataSource dataSource;

    @Override
    public List<Content> retrieve(Query query) {
        String question = query.text();
        String messageWithsqlQuery = support.createSqlQuery(question);
        String sqlQuery = extractSqlQuery(messageWithsqlQuery);
        Log.info("Question to answer: " + question);
        Log.info("Supporting SQL query: " + sqlQuery);
        List<Content> results = new ArrayList<>();
        Log.info("Retrieved relevant movie data: ");
        try (Connection connection = dataSource.getConnection()) {
            try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(sqlQuery)) {
                    while (resultSet.next()) {
                        JsonObject json = new JsonObject();
                        int columnCount = resultSet.getMetaData().getColumnCount();
                        for (int i = 1; i <= columnCount; i++) {
                            String columnName = resultSet.getMetaData().getColumnName(i);
                            json.put(columnName, resultSet.getObject(i));
                        }
                        Log.info("Item: " + json);
                        results.add(Content.from(json.toString()));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return results;
    }

    // Try to extract the actual SQL query from the LLM's response when we asked it to create a SQL query
    private String extractSqlQuery(String messageWithsqlQuery) {
        Log.info("Raw response: " + messageWithsqlQuery);
        // GPT usually returns just the query wrapped between ```sql and ```
        if (messageWithsqlQuery.startsWith("```sql")) { // strip the formatting if it's there
            return messageWithsqlQuery.substring(messageWithsqlQuery.indexOf("```sql") + 6,
                    messageWithsqlQuery.lastIndexOf("```"));
        }
        // orca seems to usually add some text around the query even when you
        // ask it to not do that, and the query is wrapped inside a ``` block
        if (messageWithsqlQuery.contains("```")) {
            return messageWithsqlQuery.substring(messageWithsqlQuery.indexOf("```") + 3,
                    messageWithsqlQuery.lastIndexOf("```"));
        }
        // if the model didn't wrap the query in a code block, let's try to
        // just assume that the response is only the query without additional formatting
        // Codellama seems to do this
        return messageWithsqlQuery;
    }
}
