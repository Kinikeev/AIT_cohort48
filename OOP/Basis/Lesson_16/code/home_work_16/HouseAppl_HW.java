package home_work_16;

import home_work_16.model.Cats;
import home_work_16.model.Dogs;
/*
      Задача 1. Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
      Смоделируйте жизнь в этом доме в течение дня.

      Task 1. Create a HouseAppl that has a main method. Place 2 dogs and 3 cats in the house.
      Simulate life in this house during the day.
     */
public class HouseAppl_HW {
        public static void main(String[] args) {

            Dogs dog_1 = new Dogs(01,"a dog",3,"Red","Bulldog",0.7,5.3);
            Dogs dog_2 = new Dogs(02,"a dog",2,"White","Poodle",0.3,2.6);

            Cats cat_1 = new Cats(03,"a cat",4,"Grey","British",0.3,8.2);
            Cats cat_2 = new Cats(04,"a cat",5,"Blue","Siamese",0.2,5.8);
            Cats cat_3 = new Cats(05,"a cat",1,"Yellow","Ragdoll",0.1,1.8);

            System.out.println(dog_1.toString());
            dog_2.displayDogs();
            System.out.println("----------------------------");
            System.out.println(cat_1.toString());
            cat_2.displayCats();
            System.out.println("----------------------------");
            dog_1.sleep();
            dog_2.walk();
            cat_1.eat();
            cat_2.makeSound();
            cat_2.voice();
            cat_3.play();

        } // End of main

} // End of class
