package edu.csumb.xtreme.movieticketing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SeatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private SeatEntity seat;
    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private BookingEntity booking;
    private SeatsEntity() {
    }

    public int getId() {
        return id;
    }

    public SeatEntity getSeat() {
        return seat;
    }

    public void setSeat(SeatEntity seat) {
        this.seat = seat;
    }

    public BookingEntity getBooking() {
        return booking;
    }

    public void setBooking(BookingEntity booking) {
        this.booking = booking;
    }

    public static final class SeatsEntityBuilder {

        private SeatEntity seat;

        private SeatsEntityBuilder() {
        }

        public static SeatsEntityBuilder aSeatsEntity() {
            return new SeatsEntityBuilder();
        }

        public SeatsEntityBuilder withSeat(SeatEntity seat) {
            this.seat = seat;
            return this;
        }

        public SeatsEntity build() {
            SeatsEntity seatsEntity = new SeatsEntity();
            seatsEntity.seat = seat;
            return seatsEntity;
        }
    }
}
