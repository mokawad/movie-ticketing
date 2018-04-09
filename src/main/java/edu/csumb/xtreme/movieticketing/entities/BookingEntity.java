package edu.csumb.xtreme.movieticketing.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private ViewerEntity viewer;
    @OneToOne
    private ShowtimeEntity showtime;
    @OneToMany(mappedBy = "booking")
    private List<SeatsEntity> seats;

    private BookingEntity() {
    }

    public int getId() {
        return id;
    }

    public ViewerEntity getViewer() {
        return viewer;
    }

    public void setViewer(ViewerEntity viewer) {
        this.viewer = viewer;
    }

    public ShowtimeEntity getShowtime() {
        return showtime;
    }

    public void setShowtime(ShowtimeEntity showtime) {
        this.showtime = showtime;
    }

    public List<SeatsEntity> getSeats() {
        return seats;
    }

    public void setSeats(List<SeatsEntity> seats) {
        this.seats = seats;
    }

    public static final class BookingEntityBuilder {

        private ViewerEntity viewer;
        private ShowtimeEntity showtime;
        private List<SeatsEntity> seats;

        private BookingEntityBuilder() {
        }

        public static BookingEntityBuilder aBookingEntity() {
            return new BookingEntityBuilder();
        }

        public BookingEntityBuilder withViewer(ViewerEntity viewer) {
            this.viewer = viewer;
            return this;
        }

        public BookingEntityBuilder withShowtime(ShowtimeEntity showtime) {
            this.showtime = showtime;
            return this;
        }

        public BookingEntityBuilder withSeats(List<SeatsEntity> seats) {
            this.seats = seats;
            return this;
        }

        public BookingEntity build() {
            BookingEntity bookingEntity = new BookingEntity();
            bookingEntity.viewer = viewer;
            bookingEntity.showtime = showtime;
            bookingEntity.seats = seats;
            return bookingEntity;
        }
    }
}
