package com.klef.jfsd.exam;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle {

    @Column(name = "Load_Capacity")
    private int loadCapacity;

    // Constructors, Getters, Setters
    public Truck() {}

    public Truck(String name, String type, int maxSpeed, String color, int loadCapacity) {
        super(name, type, maxSpeed, color);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
