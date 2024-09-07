package class_work_26.car_garage.dao;

import class_work_26.car_garage.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage{

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNamber()) != null){
            return false;
        }
        cars[size ++] = car;
        return true;
    }

    @Override
    public Car remove(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNamber().equals(regNumber)){
                Car victim = cars[i];
                cars[i] = cars[--size];
                return victim;
            }
        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNamber().equals(regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarByModel(String model) {
        return findCarByPredicate(car -> model.equals(car.getModel()));
    }

    @Override
    public Car[] findCarByCompany(String company) {
        return findCarByPredicate(car -> company.equals(car.getCompany()));
    }


    @Override
    public Car[] findCarByEngine(double min, double max) {
        return findCarByPredicate(car -> car.getEngine() > min && car.getEngine() < max);
    }

    @Override
    public Car[] findCarByColor(String color) {
        return findCarByPredicate(car -> color.equals(car.getColor()));
    }

    // дополнительный метод
    private Car[] findCarByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(cars[i])){
                count++;
            }
        }
        Car[] res = new Car[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (predicate.test(cars[i])) {
                res[j++] = cars[i];
            }
        }
        return res;
    }


} // End of class
