package class_work_26.car_garage.dao;

import class_work_26.car_garage.model.Car;

public interface Garage {

    boolean addCar (Car car);
    Car remove (String regNumber);
    Car findCarByRegNumber(String regNumber);
    Car[] findCarByModel(String model);
    Car[] findCarByCompany(String company);

    Car[] findCarByEngine(double min, double max);

    Car[] findCarByColor (String color);



} // End of interface
