package home_work_29.car_garage_2.dao;

import home_work_29.car_garage_2.model.Car;

public interface Garage_2 {

    boolean addCar (Car car);

    Car remove(String regNumber);

    Car removeCar(String regNumber);

    Car findCarByRegNumber(String regNumber);
    Car[] findCarByModel(String model);
    Car[] findCarByCompany(String company);

    Car[] findCarByEngine(double min, double max);

    Car[] findCarByColor (String color);



} // End of interface
