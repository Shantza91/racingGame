package org.fasttrackit;


public class App 
{
    public static void main( String[] args ) {

        // Example of static variables unique for the whole application
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle1: "+vehicle1.vehicleCount);
        System.out.println("Value from vehicle2: "+vehicle2.vehicleCount);
        System.out.println("Value from Vehicle Class: " +Vehicle.vehicleCount);
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1500;
//
//        Car car = new Car(engine);
//        car.setName("Dacia");
//        car.setColor("white");
//        car.doorCount = 4;
//        car.setMileage(7.5);
//        car.running = true;
//
//        double carTraveledDistance = car.accelerate(100, 2);
//
//        car.engine = engine;
//
//        car.engine.manufacturer = "BMW";
//        engine = null;
//
//
//        Car car2 = new Car(engine);
//        car2.setName("sfa");

    }
}
