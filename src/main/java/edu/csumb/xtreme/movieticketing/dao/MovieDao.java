package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<MovieEntity, Integer> {

}
