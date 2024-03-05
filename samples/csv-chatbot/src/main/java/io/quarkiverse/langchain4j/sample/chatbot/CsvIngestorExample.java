package io.quarkiverse.langchain4j.sample.chatbot;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.logging.Log;
import io.quarkus.runtime.StartupEvent;

import javax.sql.DataSource;

@ApplicationScoped
public class CsvIngestorExample {

    @ConfigProperty(name = "csv.file")
    File file;

    @ConfigProperty(name = "csv.headers")
    List<String> headers;

    @Inject
    DataSource ds;

    @Transactional
    public void ingest(@Observes StartupEvent event) throws IOException, SQLException {
        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(headers.toArray(new String[0]))
                .setSkipHeaderRecord(true)
                .build();
        try (Connection connection = ds.getConnection()) {
            createTableIfNotExists(connection);
            int count = 0;
            try (Reader reader = new FileReader(file)) {
                Iterable<CSVRecord> records = csvFormat.parse(reader);
                for (CSVRecord record : records) {
                    insert(connection, record);

                    Movie movie = new Movie();
                    movie.setIndex(Integer.parseInt(record.get("index")));
                    movie.setMovieName(record.get("movie_name"));
                    movie.setYearOfRelease(Integer.parseInt(record.get("year_of_release")));
                    movie.setCategory(record.get("category"));
                    movie.setRunTime(Integer.parseInt(record.get("run_time")));
                    movie.setGenre(record.get("genre"));
                    movie.setImdbRating(Float.parseFloat(record.get("imdb_rating")));
                    movie.setVotes(
                            Integer.parseInt(record.get("votes").substring(1, record.get("votes").length() - 1).replace(",", "")));
                    movie.setGrossTotal(Float.parseFloat(record.get("gross_total")));
                    em.persist(movie);
                    count++;
                }
                Log.infof("Ingested %d movies.%n", count);
            }
        }

    }

    private void insert(Connection connection, CSVRecord record) throws SQLException {
        try(PreparedStatement pst = connection.prepareStatement(
                "INSERT INTO MOVIE (index, movie_name, " +
                "year_of_release, category, run_time, genre, " +
                "imdb_rating, votes, gross_total) " +
                "VALUES (?,?,?,?,?,?,?,?,?)")) {
            pst.setInt(1, Integer.parseInt(record.get("index")));
            pst.setString(2, record.get("movie_name"));
            pst.setInt(3, Integer.parseInt(record.get("year_of_release")));
            pst.setString(4, record.get("category"));
            pst.setInt(5, Integer.parseInt(record.get("run_time")));
            pst.setString(6, record.get("genre"));
            pst.setFloat(7, Float.parseFloat(record.get("imdb_rating")));
            pst.setInt(8, Integer.parseInt(record.get("votes").substring(1, record.get("votes").length() - 1).replace(",", "")));
            pst.setFloat(9, Float.parseFloat(record.get("gross_total")));
            
        }
        try (Statement statement = connection.createStatement()) {
            String sql = "INSERT INTO movie (index, movie_name, year_of_release, category, run_time, genre, imdb_rating, votes, gross_total) "
                    + "VALUES ("
                    + Integer.parseInt(record.get("index")) + ", "
                    + "'" + record.get("movie_name") + "', "
                    + Integer.parseInt(record.get("year_of_release")) + ", "
                    + "'" + record.get("category") + "', "
                    + record.get("run_time") + ", "
                    + "'" + record.get("genre") + "', "
                    + record.get("imdb_rating") + ", "
                    + record.get("votes") + ", "
                    + record.get("gross_total") + ")";
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void createTableIfNotExists(Connection connection) {
        try (Statement statement = connection.createStatement()) {
            boolean RESULT = statement.execute("CREATE TABLE IF NOT EXISTS movie ("
                    + "id SERIAL PRIMARY KEY, "
                    + "index INTEGER, "
                    + "movie_name VARCHAR(255), "
                    + "year_of_release INTEGER, "
                    + "category VARCHAR(255), "
                    + "run_time INTEGER, "
                    + "genre VARCHAR(255), "
                    + "imdb_rating FLOAT, "
                    + "votes INTEGER, "
                    + "gross_total FLOAT)");
            System.out.println(RESULT);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
