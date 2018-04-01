package edu.csumb.xtreme.movieticketing.models;

import java.util.List;

public class Theater {

  private String name;
  private int capacity;
  private List<Seat> seats;



  public List<Movie> getMovies() {
    return null;
  }

  public List<Showtime> getShowtimes(Movie movie) {
    return null;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }
}
