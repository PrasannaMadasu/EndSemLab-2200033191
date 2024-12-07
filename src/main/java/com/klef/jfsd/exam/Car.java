package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {

    @Column(name = "Number_Of_Doors")
    private int numberOfDoors;

    // Constructors, Getters, Setters
    public Car() {}

    public Car(String name, String type, int maxSpeed, String color, int numberOfDoors) {
        super(name, type, maxSpeed, color);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
