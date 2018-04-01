package edu.csumb.xtreme.movieticketing.models;

import java.util.Date;
import java.util.List;

public class Showtime {

  private List<Date> times;
  private Float price;
  private Movie movie;

  public List<Date> getTimes() {
    return times;
  }

  public void setTimes(List<Date> times) {
    this.times = times;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }
}
