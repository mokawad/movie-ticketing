package edu.csumb.xtreme.movieticketing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ViewerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private ViewerEntity() {

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
    }

    public static final class ViewerEntityBuilder {

        private int id;
        private String username;

        private ViewerEntityBuilder() {
        }

        public static ViewerEntityBuilder aViewerEntity() {
            return new ViewerEntityBuilder();
        }

        public ViewerEntityBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public ViewerEntity build() {
            ViewerEntity viewerEntity = new ViewerEntity();
            viewerEntity.username = username;
            viewerEntity.id = this.id;
            return viewerEntity;
        }
    }
}
