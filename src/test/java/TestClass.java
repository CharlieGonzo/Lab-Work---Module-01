import org.example.Car;
import org.example.Vehicle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class TestClass {
    private Vehicle vehicle;
    private Car car;

    @BeforeEach
    public void setUp()
    {
        vehicle = new Vehicle(4,"Blue",4.0f,"Regular");
        car = new Car(vehicle.getNumberofWheels(),vehicle.getColor(), vehicle.getEngineSize(), vehicle.getFuelftype(),"Ford");
    }

    @Test
    @DisplayName("Test Vehicle Getter and Setters")
    public void testVehicleGetterAndSetters(){
         Assertions.assertEquals(4, vehicle.getNumberofWheels());
         Assertions.assertEquals("Blue", vehicle.getColor());
         Assertions.assertEquals(4.0f, vehicle.getEngineSize());
         Assertions.assertEquals("Regular", vehicle.getFuelftype());

         vehicle.setNumberofWheels(3);
         vehicle.setColor("Red");
         vehicle.setEngineSize(3.0f);
         vehicle.setFuelftype("Premium");

         Assertions.assertEquals(3, vehicle.getNumberofWheels());
         Assertions.assertEquals("Red", vehicle.getColor());
         Assertions.assertEquals(3.0f, vehicle.getEngineSize());
         Assertions.assertEquals("Premium", vehicle.getFuelftype());

    }


    @Test
    @DisplayName(" Getter methods Test")
    public void testCarGetters() {
        Assertions.assertEquals(4, car.getNumberofWheels());
        Assertions.assertEquals("Blue", car.getColor());
        Assertions.assertEquals(4.0f, car.getEngineSize());
        Assertions.assertEquals("Regular", car.getFuelftype());
        Assertions.assertEquals("Ford", car.getBrand());
    }

    @Test
    @DisplayName(" Setter methods Test")
    public void testCarSetters() {
        car.setNumberofWheels(3);
        car.setBrand("Honda");
        car.setColor("Red");
        car.setEngineSize(3.0f);
        car.setFuelftype("Premium");

        Assertions.assertEquals(3, car.getNumberofWheels());
        Assertions.assertEquals("Red", car.getColor());
        Assertions.assertEquals(3.0f, car.getEngineSize());
        Assertions.assertEquals("Premium", car.getFuelftype());
        Assertions.assertEquals("Honda", car.getBrand());
    }

    @Test
    @DisplayName("Honk Test")
    public void honkTest() {
        car.honk();
    }

    @Test
    @DisplayName("Testing Diplaying Info")
    public void displayInfoTest() {
        car.displayInfo();
    }




}
