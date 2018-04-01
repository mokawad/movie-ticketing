package edu.csumb.xtreme.movieticketing.models;

import java.util.List;

public class Booking {

  private Viewer user;
  private Showtime showtime;
  private List<Seat> seats;

  public Viewer getUser() {
    return user;
  }

  public void setUser(Viewer user) {
    this.user = user;
  }

  public Showtime getShowtime() {
    return showtime;
  }

  public void setShowtime(Showtime showtime) {
    this.showtime = showtime;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }
}
