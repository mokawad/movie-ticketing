package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.ShowtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowtimeDao extends JpaRepository<ShowtimeEntity, Integer> {

}