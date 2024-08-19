package oop_introduction.model;

public class Car {
    // Марка BMW, Mercedes, Opel ...... String
    // Год выпуска 2020, 2021, 2022.... int
    // Стоимость 25.000 .................double

    // fields:
    private String brand;
    private int age;
    private double price;
    private int km;

    // Поля . это характеристики объекта типа Car
    // их можно объеденить с помощью метода constructor

    public Car (String brand,int age,double price,int km){
        this.brand = brand;
        this.age = age;
        this.price = price;
        this.km = km;
    }
    public void displayCar (){
        System.out.println("Brand: " + brand + "| Age: " + age + "| Price: " + price + "| km: " +km);
    }


}
