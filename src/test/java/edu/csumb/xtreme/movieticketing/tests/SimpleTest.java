package edu.csumb.xtreme.movieticketing.tests;

import edu.csumb.xtreme.movieticketing.dao.MovieDao;
import edu.csumb.xtreme.movieticketing.entities.MovieEntity;
import edu.csumb.xtreme.movieticketing.dao.BookingDao;
import edu.csumb.xtreme.movieticketing.entities.BookingEntity;
import edu.csumb.xtreme.movieticketing.dao.SeatDao;
import edu.csumb.xtreme.movieticketing.entities.SeatEntity;
import edu.csumb.xtreme.movieticketing.dao.ViewerDao;
import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import edu.csumb.xtreme.movieticketing.dao.ShowtimeDao;
import edu.csumb.xtreme.movieticketing.entities.ShowtimeEntity;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class SimpleTest {

    @Autowired
    private MovieDao movieDao;
    private SeatDao seatDao;
    private ViewerDao viewerDao;
    private BookingDao bookingDao;
    private ShowtimeDao showtimeDao;

    @Test
    // Test to create the movie object and methods within object
    public void testMovie() {
        MovieEntity movieEntity = new MovieEntity();
        movieDao.save(movieEntity);
        /*List<MovieEntity> all = movieDao.findAll();
        List<MovieEntity> all1 = movieDao.findAll();*/
        String director = movieEntity.getDirector();
        String genre = movieEntity.getGenre();
        int id = movieEntity.getId();
        String name = movieEntity.getName();
        String rating= movieEntity.getRating();
    }
    @Test
    // Test to create the seat object and methods within object
    public void testSeats() {
        SeatEntity seatEntity = new SeatEntity();
        seatEntity.setNumber(3);
        seatEntity.setRow("B");
        int number = seatEntity.getNumber();
        String row = seatEntity.getRow();
    }
    @Test
    // Test to create the viewer object and methods within object
    public void testViewer() {
        ViewerEntity viewerEntity = new ViewerEntity();
        viewerEntity.setUsername("joe");
        String name = viewerEntity.getUsername();
    }
    @Test
    // Test to create the booking object and methods within object
    public void testBooking() {
        BookingEntity bookingEntity = new BookingEntity();
        ViewerEntity view = bookingEntity.getViewer();
        ShowtimeEntity show = bookingEntity.getShowtime();
    }
    @Test
    // Test to create the showtime object and methods within object
    public void testShowtime() {
        ShowtimeEntity showtimeEntity = new ShowtimeEntity();
        MovieEntity mov = new MovieEntity();
        showtimeEntity.setMovie(mov);
        MovieEntity movie = showtimeEntity.getMovie();
    }
    
    
}
