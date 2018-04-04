package edu.csumb.xtreme.movieticketing.dao;

import edu.csumb.xtreme.movieticketing.entities.ViewerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {

    @Autowired
    private ViewerDao viewerDao;

    public ViewerEntity createViewer(String username) {
        ViewerEntity newViewer = new ViewerEntity();
        newViewer.setUsername(username);
        return viewerDao.save(newViewer);
    }

    public void deleteViewer(int id) {
        viewerDao.deleteById(id);
    }
}
