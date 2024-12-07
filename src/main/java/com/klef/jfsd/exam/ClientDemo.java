package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {

    public static void main(String[] args) {
        // Create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Vehicle.class)
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Truck.class)
                .buildSessionFactory();

        // Create a session
        Session session = factory.getCurrentSession();

        try {
            // Create a Vehicle object
            Vehicle vehicle = new Vehicle("Generic Vehicle", "Motorbike", 120, "Red");

            // Create a Car object
            Car car = new Car("Toyota", "Sedan", 180, "Blue", 4);

            // Create a Truck object
            Truck truck = new Truck("Ford", "Truck", 100, "Black", 2000);

            // Start a transaction
            session.beginTransaction();

            // Save the objects
            session.save(vehicle);
            session.save(car);
            session.save(truck);

            // Commit the transaction
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
