package pet;

// Задача 1. В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.
// Task 1.   In the PetAppl class, create several pet instances. Display the day lived.

import pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {

        Pet cat = new Pet(101,"a cat",5,"Vaska");
        Pet dog = new Pet(102,"a dog",6,"Borbos");
        Pet rabbit = new Pet(103,"a rabbit",3,"Flack");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(rabbit);

        cat.sleep();
        dog.makeSound();
        rabbit.eat();

    } // End of main

} // End of class
