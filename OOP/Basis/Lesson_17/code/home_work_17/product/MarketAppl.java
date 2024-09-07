package home_work_17.product;
/*
     Задача 1. Создать класс MarketAppl и в нем метод main. В методе main создать массив
               в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
                    - печатающий все продукты из массива,
                    - метод возвращающий сумму цен всех продуктов.

       Task 1. Create a MarketAppl class. In the main method, create an array
               that stores one object for each product. Create a methods:
                    - prints all products from the array,
                    - method that returns the sum of the prices of all products.
 */

import home_work_17.product.model_17.Food;
import home_work_17.product.model_17.MeatFood;
import home_work_17.product.model_17.MilkFood;
import home_work_17.product.model_17.Product;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product(1200.69,"TV",1523789L);
        products[1] = new Food(2.59,"Apple",56231479L,"22.12.2024");
        products[2] = new MeatFood(12.89,"Meat",23546879L,"15.07.2024",
                "Beef");
        products[3] = new MilkFood(2.99,"Quark",65489254L,"12.12.2024",
                "Milky",3.5);

        printProduct(products);
        System.out.println("Total sum:        " + String.format("%.2f",sumProducts(products)) + " €");
        System.out.println(sumProducts(products));
        System.out.println("==============================");

        System.out.println(findProductWithBarCode(products,56231479));
        printNonFoodProducts(products);

    } // End of main

    public static void printProduct(Product[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println("-----------------------------");
        }
    }
    public static double sumProducts(Product[] array){
        double sumPrice = 0;
        for (int i = 0; i < array.length; i++) {
            sumPrice += array[i].getPrice();
        }
        return sumPrice;
    }

    // метод принимающий баркод и возвращающий продукт с данным баркодом.
    // a method that accepts a barcode and returns a product with this barcode.

    public static String findProductWithBarCode(Product[] array, long number){
        for (int i = 0; i < array.length; i++) {
            if (number == array[i].getBarCode() ) {
                return array[i].toString();
            }
        }
         return ("Product with code: " + number + " does not exist.");
    }

    // метод печатающий в консоль все не пищевые продукты.
    // A method that prints all non-food products to the console.

    public static void printNonFoodProducts(Product[] array){
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] instanceof Food)){
                System.out.println(array[i]);
            }
        }
    }

} // End of class
