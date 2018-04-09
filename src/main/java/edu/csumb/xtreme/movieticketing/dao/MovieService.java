package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.MovieEntity;
import edu.csumb.xtreme.movieticketing.entities.MovieEntity.MovieEntityBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class MovieService {
    
    @Autowired
    private MovieDao movieDao;

    public MovieEntity createMovie(String movieName, String director, String genre, String rating,
        LocalDate releaseDate, int runtime) {
        MovieEntity movieEntity = MovieEntityBuilder.aMovieEntity()
            .withName(movieName)
            .withDirector(director)
            .withGenre(genre)
            .withRating(rating)
            .withReleaseDate(releaseDate)
            .withRuntime(runtime).build();
        return movieDao.save(movieEntity);
    }
    
    public void deleteMovie(int id) {
        movieDao.deleteById(id);
    }

    // Method to determine if movie is NowPlaying
    public boolean isNowPlaying(int  movieId) {
        MovieEntity movieEntity = movieDao.getOne(movieId);;
        LocalDate currentDate = LocalDate.now();
        if (movieEntity.getReleaseDate().isBefore(currentDate)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to determing if moview is ComingSoon
    public boolean isComingSoon(int  movieId) {
        MovieEntity movieEntity = movieDao.getOne(movieId);;
        LocalDate currentDate = LocalDate.now();
        if (movieEntity.getReleaseDate().isAfter(currentDate)) {
            return true;
        } else {
            return false;
        }
    }
}
