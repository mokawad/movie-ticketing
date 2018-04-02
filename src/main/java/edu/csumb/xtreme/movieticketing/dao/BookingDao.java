package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDao extends JpaRepository<BookingEntity, Integer> {

}
