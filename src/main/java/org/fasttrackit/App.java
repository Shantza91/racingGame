package org.fasttrackit;


public class App 
{
    public static void main( String[] args ) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("white");
        car.doorCount = 4;
        car.setMileage(7.5);
        car.running = true;

        double carTraveledDistance = car.accelerate(100, 2);

        car.engine = engine;

        car.engine.manufacturer = "BMW";
        engine = null;


        Car car2 = new Car(engine);
        car2.setName("sfa");

    }
}
