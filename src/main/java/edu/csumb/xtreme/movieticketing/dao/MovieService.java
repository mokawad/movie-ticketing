package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class MovieService {
    
    @Autowired
    private MovieDao movieDao;
    
    public MovieEntity createMovie(String movieName, String director, String genre, String rating,
        LocalDate releaseDate, int runtime) {
        MovieEntity newMovie = new MovieEntity();
        newMovie.setName(movieName);
        newMovie.setDirector(director);
        newMovie.setGenre(genre);
        newMovie.setRating(rating);
        newMovie.setReleaseDate(releaseDate);
        newMovie.setRuntime(runtime);
        return movieDao.save(newMovie);
    }
    
    public void deleteMovie(int id) {
        movieDao.deleteById(id);
    }

}
