package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.inject.Singleton;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
@Singleton
public interface MovieMuseSupport {

    @SystemMessage("""
            Create a SQL query to retrieve the data necessary to
            answer the user's question using data from the database.
            The database contains information about top rated movies from IMDB.
            The dialect is PostgreSQL and the relevant table is called 'movie'.
            Always include `movie_name` in the SELECT clause.
            You must not add any placeholders into the query, all data must be hardcoded in it.

            The user might have not provided the movie name exactly, in that case
            try to correct it to the official movie name, or match it using a LIKE clause.

            The table has the following columns:
            - id (integer)
            - index (integer)
            - movie_name (string)
            - year_of_release (integer)
            - mpaa_rating (string) - this is the MPAA rating (G, PG, PG-13, R,...)
            - run_time (integer, in minutes)
            - genres (string) - this is a comma-separated list of genres. Used genres are Comedy, Crime, Drama,
                Thriller, Action, Adventure, Fantasy, Sci-Fi, Mystery, Horror, Animation, Biography, History, War, Music, Musical, Western.
            - imdb_rating (float)
            - votes (integer)
            - gross_total (integer, in millions of US dollars)

            Answer only with the raw SQL query and nothing else, don't add any text around it!
            """)
    @UserMessage("""
            The user's question is:

            {question}
            """)
    String createSqlQuery(String question);

}
