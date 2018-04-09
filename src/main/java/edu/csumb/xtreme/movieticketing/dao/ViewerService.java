package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.BookingEntity;
import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import edu.csumb.xtreme.movieticketing.entities.ViewerEntity.ViewerEntityBuilder;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {

    @Autowired
    private ViewerDao viewerDao;

    public ViewerEntity createViewer(String username) {
        ViewerEntityBuilder builder = ViewerEntityBuilder.aViewerEntity();
        builder.withUsername(username);
        return viewerDao.save(builder.build());
    }

    public void deleteViewer(int viewerId) {
        viewerDao.deleteById(viewerId);
    }

    public List<BookingEntity> getBookings(int viewerId) {
        return null;
    }
}
