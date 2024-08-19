package home_work_17.product.model_17;
/*
    Задача 1. Создать класс Product, с полями:
    Task 1. Create a class Product, with fields:
        - private double price
        - private String name
        - private long barCode;
 */

import java.util.Objects;

public class Product {

    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public long getBarCode() {
        return barCode;
    }

    @Override
    public String toString() {
        return "Product:" + "\n" +
                "Name:             " + name + "\n" +
                "Price:            " + price + " €" + "\n" +
                "barCode:          " + barCode;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }
} // End of class
