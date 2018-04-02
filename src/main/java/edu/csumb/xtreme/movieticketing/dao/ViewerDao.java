package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewerDao extends JpaRepository<ViewerEntity, Integer> {

}