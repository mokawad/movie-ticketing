package edu.csumb.xtreme.movieticketing.models;

import java.util.Date;

public class Movie {

  private int id;
  private String name;
  private int runtime;
  private String rating;
  private String genre;
  private String director;
  private Date releaseDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }
}
