package io.quarkiverse.langchain4j.sample.chatbot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movie", schema = "public")
public class Movie {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "index")
    private int index;

    @Column(name = "movie_name")
    private String movieName;

    @Column(name = "year_of_release")
    private int yearOfRelease;

    @Column(name = "mpaa_rating")
    private String mpaaRating;

    @Column(name = "run_time")
    private int runTime;

    @Column(name = "genres")
    private String genres;

    @Column(name = "imdb_rating")
    private float imdbRating;

    @Column(name = "votes")
    private int votes;

    @Column(name = "gross_total")
    private float grossTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String category) {
        this.mpaaRating = category;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public float getGrossTotal() {
        return grossTotal;
    }

    public void setGrossTotal(float grossTotal) {
        this.grossTotal = grossTotal;
    }
}
