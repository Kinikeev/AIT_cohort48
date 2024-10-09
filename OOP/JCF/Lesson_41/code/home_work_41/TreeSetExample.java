package home_work_41;

import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

    // Задание 1. TreeSet - методы floor, cellar.
    // Создайте список известных вам фруктов (стран, городов и т.п.) и поместите его в TreeSet.
    // Апробируйте использование методов floor и ceiling на полученной структуре.

    public static void main(String[] args) {

        TreeSet<String> fruits =  new TreeSet<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Lemon");
        fruits.add("Kiwi");
        fruits.add("Grapefruit");
        fruits.add("Grape");
        fruits.add("Apricot");
        fruits.add("Peach");

        System.out.println(fruits);

        fruits.floor("Lemon");
        System.out.println(fruits);
        fruits.ceiling("Kiwi");


        System.out.println(fruits);

    } // end of main

} // end of class
