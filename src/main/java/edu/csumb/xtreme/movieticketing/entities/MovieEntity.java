package edu.csumb.xtreme.movieticketing.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int runtime;
    private String rating;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private MovieEntity() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public static final class MovieEntityBuilder {

        private String name;
        private int runtime;
        private String rating;
        private String genre;
        private String director;
        private LocalDate releaseDate;

        private MovieEntityBuilder() {
        }

        public static MovieEntityBuilder aMovieEntity() {
            return new MovieEntityBuilder();
        }

        public MovieEntityBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public MovieEntityBuilder withRuntime(int runtime) {
            this.runtime = runtime;
            return this;
        }

        public MovieEntityBuilder withRating(String rating) {
            this.rating = rating;
            return this;
        }

        public MovieEntityBuilder withGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public MovieEntityBuilder withDirector(String director) {
            this.director = director;
            return this;
        }

        public MovieEntityBuilder withReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public MovieEntity build() {
            MovieEntity movieEntity = new MovieEntity();
            movieEntity.name = name;
            movieEntity.runtime = runtime;
            movieEntity.rating = rating;
            movieEntity.genre = genre;
            movieEntity.director = director;
            movieEntity.releaseDate = releaseDate;
            return movieEntity;
        }
    }
}
