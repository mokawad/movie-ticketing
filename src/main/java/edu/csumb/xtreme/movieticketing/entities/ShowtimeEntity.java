package edu.csumb.xtreme.movieticketing.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ShowtimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date time;
    private Float price;
    @OneToOne
    private MovieEntity movie;
    private ShowtimeEntity() {
    }

    public int getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public MovieEntity getMovie() {
        return movie;
    }

    public void setMovie(MovieEntity movie) {
        this.movie = movie;
    }

    public static final class ShowtimeEntityBuilder {

        private Date time;
        private Float price;
        private MovieEntity movie;

        private ShowtimeEntityBuilder() {
        }

        public static ShowtimeEntityBuilder aShowtimeEntity() {
            return new ShowtimeEntityBuilder();
        }

        public ShowtimeEntityBuilder withTime(Date time) {
            this.time = time;
            return this;
        }

        public ShowtimeEntityBuilder withPrice(Float price) {
            this.price = price;
            return this;
        }

        public ShowtimeEntityBuilder withMovie(MovieEntity movie) {
            this.movie = movie;
            return this;
        }

        public ShowtimeEntity build() {
            ShowtimeEntity showtimeEntity = new ShowtimeEntity();
            showtimeEntity.time = time;
            showtimeEntity.price = price;
            showtimeEntity.movie = movie;
            return showtimeEntity;
        }
    }
}
