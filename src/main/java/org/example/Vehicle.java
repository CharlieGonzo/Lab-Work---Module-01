package org.example;

/**
 * @author Charles Gonzalez
 * Vehicle class holds the basic information you will need for any type of vehicle. Mainly
 * to be used for inhertance purposes.
 */
public class Vehicle {
    // Variables
    private int numberofWheels;
    private String color;
    private float engineSize;
    private String fuelftype;

    // Constructor
    public Vehicle(int numberofWheels, String color, float engineSize, String fuelftype) {
        this.numberofWheels = numberofWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelftype = fuelftype;
    }

    // Getters and Setters
    public int getNumberofWheels() {
        return numberofWheels;
    }

    public void setNumberofWheels(int numberofWheels) {
        this.numberofWheels = numberofWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelftype() {
        return fuelftype;
    }

    public void setFuelftype(String fuelftype) {
        this.fuelftype = fuelftype;
    }

}
