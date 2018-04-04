package edu.csumb.xtreme.movieticketing;

import edu.csumb.xtreme.movieticketing.dao.ViewerDao;
import edu.csumb.xtreme.movieticketing.dao.ViewerService;
import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ViewerServiceTest {

    @Autowired
    ViewerDao viewerDao;

    @Autowired
    ViewerService viewerService;

    @Test
    public void createViewer() {
        ViewerEntity viewer = viewerService.createViewer("newUser");
        ViewerEntity reqViewer = viewerDao.getOne(viewer.getId());
        Assert.assertEquals(viewer.getId(), reqViewer.getId());
    }

    @Test
    public void deleteViewer() {
        long beforeAdd = viewerDao.count();
        ViewerEntity viewer = viewerService.createViewer("deleteUser");
        Assert.assertEquals(beforeAdd + 1, viewerDao.count());
        ViewerEntity reqViewer = viewerDao.getOne(viewer.getId());
        viewerService.deleteViewer(reqViewer.getId());
        Assert.assertEquals(beforeAdd, viewerDao.count());


    }

    @Test
    public void changeViewerName() {
        ViewerEntity viewer = viewerService.createViewer("oldUsername");
        Assert.assertEquals(viewer.getUsername(),
                            viewerDao.findById(viewer.getId()).get().getUsername());

        ViewerEntity viewerEntity = viewerDao.findById(viewer.getId()).get();
        viewerEntity.setUsername("newUsername");
        viewerDao.save(viewerEntity);
        Assert.assertEquals("newUsername",
                            viewerDao.findById(viewerEntity.getId()).get().getUsername());
    }
}
