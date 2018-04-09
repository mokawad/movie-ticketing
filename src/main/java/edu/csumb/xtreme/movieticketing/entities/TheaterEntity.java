package edu.csumb.xtreme.movieticketing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int capacity;
    private TheaterEntity() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static final class TheaterEntityBuilder {

        private String name;
        private int capacity;

        private TheaterEntityBuilder() {
        }

        public static TheaterEntityBuilder aTheaterEntity() {
            return new TheaterEntityBuilder();
        }

        public TheaterEntityBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public TheaterEntityBuilder withCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public TheaterEntity build() {
            TheaterEntity theaterEntity = new TheaterEntity();
            theaterEntity.name = this.name;
            theaterEntity.capacity = this.capacity;
            return theaterEntity;
        }
    }
}
