package oop_introduction;

import oop_introduction.model.Car;

public class Car_Appl {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes",5,18000,63000);
        //System.out.println(car1);
        car1.displayCar();

        Car car2 = new Car("VW",8,15000,75000);
        car2.displayCar();

    } // End of main





} // End of class
