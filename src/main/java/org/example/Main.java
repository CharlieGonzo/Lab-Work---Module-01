package org.example;


/**
 * @author Charles Gonzalez
 * This application is for the lab 1 assigment in class CSC 311
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create Vehicle and Car Objects.
       Vehicle vehicle = new Vehicle(4,"Blue",4.0f,"Regular");
       Car car = new Car(vehicle.getNumberofWheels(),vehicle.getColor(), vehicle.getEngineSize(), vehicle.getFuelftype(),"Ford");

        // Vehicle getters are called inside displayInfo()
        car.displayInfo();

        // Vehicle setter test
        vehicle.setNumberofWheels(3);
        vehicle.setColor("Red");
        vehicle.setEngineSize(3.0f);
        vehicle.setFuelftype("Premium");
        System.out.println("***vehicle changes***");
        System.out.println("numberofWheels: " + vehicle.getNumberofWheels());
        System.out.println("color: " + vehicle.getColor());
        System.out.println("engineSize: " + vehicle.getEngineSize());
        System.out.println("fuelftype: " + vehicle.getFuelftype());

        // Car setter Test
        car.setNumberofWheels(3);
        car.setBrand("Honda");
        car.setColor("Red");
        car.setEngineSize(3.0f);
        car.setFuelftype("Premium");

        // Honk test
        car.honk();

        // Did the setters work?
        System.out.println("After changes.");
        car.displayInfo();
    }
}