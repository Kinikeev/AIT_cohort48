package home_work_16.model;
    /*
      Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
      Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.

      Task 1.  Create child classes Cat and Dog from the Pet class with additional fields:
      Create a voice method that emits "Meow!" for the Cat class and "Woof-woof!" for the Dog class.
            - порода            - breed
            - рост              - height
            - вес               - wight
     */
import class_work_16.poliphormism.Cat;
import pet.model.Pet;

public class Cats extends Pet {
    // additional fields:
    private String breed;
    private double height;
    private double wight;

    // constructor
    public Cats(int id, String view, int age, String nickname, String breed, double height, double wight) {
        super(id, view, age, nickname);
        this.breed = breed;
        this.height = height;
        this.wight = wight;
    }
    public void voice(){
        System.out.println("Meow!");
    }
    // getters
    public String getBreed() {
        return breed;
    }
    public double getHeight() {
        return height;
    }
    public double getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return super.toString() +
                " breed: " + breed +
                " | height: " + height +
                " | wight: " + wight +
                " |";
    }

    // display Cats
    public void displayCats(){
        Cats.super.displayPet();
        System.out.println("Breed:    " + getBreed()+"\n" +
                           "Height:   " + getHeight()+"\n" +
                           "Wight:    " + getWight());
    }

} // End of class

