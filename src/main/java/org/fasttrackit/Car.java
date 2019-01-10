package org.fasttrackit;

public class Car extends AutoVehicle {

    int doorCount;
    Engine engine;


    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorCount=" + doorCount +
                '}';
    }
}
