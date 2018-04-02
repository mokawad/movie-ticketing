package edu.csumb.xtreme.movieticketing.tests;

import edu.csumb.xtreme.movieticketing.dao.MovieDao;
import edu.csumb.xtreme.movieticketing.entities.MovieEntity;
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

    @Test
    public void createMovie() {
        MovieEntity movieEntity = new MovieEntity();
        movieDao.save(movieEntity);
        List<MovieEntity> all = movieDao.findAll();
        List<MovieEntity> all1 = movieDao.findAll();
    }
}
