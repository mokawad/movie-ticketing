package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.BookingEntity;
import edu.csumb.xtreme.movieticketing.entities.SeatsEntity;
import edu.csumb.xtreme.movieticketing.entities.ShowtimeEntity;
import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingDao bookingDao;

    public BookingEntity createBooking(ViewerEntity viewer, ShowtimeEntity showtimeEntity,
                                       List<SeatsEntity> seats) {
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setSeats(seats);
        bookingEntity.setShowtime(showtimeEntity);
        bookingEntity.setViewer(viewer);
        return bookingDao.save(bookingEntity);
    }

    public void deleteBooking(int id) {
        bookingDao.deleteById(id);
    }
}
