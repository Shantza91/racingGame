package org.fasttrackit;


public class App
{
    public static void main( String[] args ) {

        // Example of static variables unique for the whole application
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.vehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
//        vehicle2.vehicleCount = 2;
//
//        Vehicle.vehicleCount = 3;
//
//        System.out.println("Value from vehicle1: "+vehicle1.vehicleCount);
//        System.out.println("Value from vehicle2: "+vehicle2.vehicleCount);
//        System.out.println("Value from Vehicle Class: " +Vehicle.vehicleCount);
//
//        new AutoVehicle();
//
//        new AutoVehicle(new Engine());
//
//        vehicle1.accelerate(34.12);
//        vehicle2.accelerate(130,0.8);
//
//        new UFO().accelerate(130, 0.8);

        //Polymorphism (an object can take multiple forms)
//        Vehicle ufo = new UFO();
//        //The type of the variable does NOT determine the object's behavior
//        ufo.accelerate(200, 2);


        //Type casting! (The type of the variable determines what methods can be invoked
        //We might need type casting (see below)
        //((UFO) ufo).concealCheating();


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
//        System.out.println(car.toString());

        Game game = new Game();
        game.start();
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
