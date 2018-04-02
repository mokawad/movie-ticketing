package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatDao extends JpaRepository<SeatEntity, Integer> {

}