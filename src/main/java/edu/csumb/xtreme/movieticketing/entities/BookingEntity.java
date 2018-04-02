package edu.csumb.xtreme.movieticketing.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BookingEntity {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private ViewerEntity viewer;

    @OneToOne
    private ShowtimeEntity showtime;

    @OneToMany(mappedBy = "booking")
    private List<SeatsEntity> seats;

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
}
