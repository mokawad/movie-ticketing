package edu.csumb.xtreme.movieticketing.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String row;
    private int number;
    private SeatEntity() {

    }

    public int getId() {
        return id;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static final class SeatEntityBuilder {

        private String row;
        private int number;

        private SeatEntityBuilder() {
        }

        public static SeatEntityBuilder aSeatEntity() {
            return new SeatEntityBuilder();
        }

        public SeatEntityBuilder withRow(String row) {
            this.row = row;
            return this;
        }

        public SeatEntityBuilder withNumber(int number) {
            this.number = number;
            return this;
        }

        public SeatEntity build() {
            SeatEntity seatEntity = new SeatEntity();
            seatEntity.row = row;
            seatEntity.number = number;
            return seatEntity;
        }
    }
}
