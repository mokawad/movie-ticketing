package edu.csumb.xtreme.movieticketing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ViewerEntity {

    @Id
    @GeneratedValue
    private int id;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
