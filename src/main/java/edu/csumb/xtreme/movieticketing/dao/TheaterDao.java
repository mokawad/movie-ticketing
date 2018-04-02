package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterDao extends JpaRepository<TheaterEntity, Integer> {

}