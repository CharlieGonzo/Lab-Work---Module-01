package org.example;

public class Vehicle {
    int numberofWheels;
    String color;
    float engineSize;
    String fuelftype;

    public Vehicle(int numberofWheels, String color, float engineSize, String fuelftype) {
        this.numberofWheels = numberofWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelftype = fuelftype;
    }

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
