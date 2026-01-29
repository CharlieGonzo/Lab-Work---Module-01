package org.example;

import org.junit.jupiter.api.Test;

/**
 * @author Charles Gonzalez
 * This application is for the lab 1 assigment in class CSC 311
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Vehicle vehicle = new Vehicle(4,"Blue",4.0f,"Regular");
       Car car = new Car(vehicle.getNumberofWheels(),vehicle.getColor(), vehicle.getEngineSize(), vehicle.getFuelftype(),"Ford");
        car.displayInfo();

        vehicle.setNumberofWheels(3);
        vehicle.setColor("Red");
        vehicle.setEngineSize(3.0f);
        vehicle.setFuelftype("Premium");

        car.setNumberofWheels(3);
        car.setBrand("Honda");
        car.setColor("Red");
        car.setEngineSize(3.0f);
        car.setFuelftype("Premium");

        car.honk();

        System.out.println("After changes.");
        car.displayInfo();
    }
}