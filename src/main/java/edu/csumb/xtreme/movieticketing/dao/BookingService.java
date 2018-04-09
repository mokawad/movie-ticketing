package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.BookingEntity;
import edu.csumb.xtreme.movieticketing.entities.BookingEntity.BookingEntityBuilder;
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
        BookingEntityBuilder builder = BookingEntityBuilder.aBookingEntity();
        builder.withSeats(seats)
            .withShowtime(showtimeEntity)
            .withViewer(viewer);
        return bookingDao.save(builder.build());
    }

    public void deleteBooking(int id) {
        bookingDao.deleteById(id);
    }

    public void addSeats(int bookingId) {

    }

    public void removeSeats(int bookingId) {

    }
}
