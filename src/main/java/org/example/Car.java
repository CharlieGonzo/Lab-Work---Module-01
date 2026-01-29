package org.example;

/**
 * @author Charles Gonzalez
 * Car class extends {@link Vehicle} class, adding extra functionality.
 */
public class Car extends Vehicle{

    String brand;

    // Constructor
    public Car(int numberofWheels, String color, float engineSize, String fuelftype,String brand) {
        super(numberofWheels, color, engineSize, fuelftype);
        this.brand = brand;
    }

    // getter and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This function just Honks...
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /**
     * Prints out Car info.
     */
    public void displayInfo(){
        System.out.println("Car{" +
                "brand='" + brand + '\'' +
                ", numberofWheels=" + getNumberofWheels() +
                ", color='" + getColor() + '\'' +
                ", engineSize=" + getEngineSize() +
                ", fuelftype='" + getFuelftype() + '\'' +
                '}');
    }

} // End of class
