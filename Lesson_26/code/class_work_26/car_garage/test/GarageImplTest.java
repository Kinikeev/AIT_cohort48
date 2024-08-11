package class_work_26.car_garage.test;

import class_work_26.car_garage.dao.Garage;
import class_work_26.car_garage.dao.GarageImpl;
import class_work_26.car_garage.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] cars;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
        cars = new Car[4];

        cars[0] = new Car("Number_1","Model_1","Company_1",1.5,"Red");
        cars[1] = new Car("Number_2","Model_2","Company_1",2.5,"Green");
        cars[2] = new Car("Number_3","Model_1","Company_2",1.8,"Red");
        cars[3] = new Car("Number_4","Model_4","Company_2",2.0,"Green");

        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);
        }
    }

    @Test
    void addCar() {
        assertFalse(garage.addCar(null));
        Car car = new Car( "Number_5","Model_5","Company_3",2.0,"White");
        assertTrue(garage.addCar(car));
        Car oneMoreCar = new Car( "Number_7","Model_7","Company_3",2.0,"White");
        assertFalse(garage.addCar(oneMoreCar));
    }

    @Test
    void findCarByRegNumber() {
        Car car = garage.findCarByRegNumber("Number_4");
        assertEquals(cars[3],car);
        assertEquals(cars[3].getColor(),car.getColor());
    }

    @Test
    void findCarByModel() {
        Car[] expected = {cars[0], cars[2]};
        Car[] actual = garage.findCarByModel("Model_1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByCompany() {
        Car[] expected = {cars[0], cars[1]};
        Car[] actual = garage.findCarByCompany("Company_1");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByEngine() {
        Car[] expected = {cars[1], cars[3]};
        Car[] actual = garage.findCarByEngine(1.9, 2.6);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarByColor() {
        Car[] expected = {cars[1], cars[3]};
        Car[] actual = garage.findCarByColor("Green");
        assertArrayEquals(expected, actual);
    }

} // End of class