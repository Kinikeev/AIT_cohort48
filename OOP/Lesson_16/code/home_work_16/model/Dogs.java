package home_work_16.model;

import pet.model.Pet;

public class Dogs extends Pet {
    // additional fields:
    private String breed;
    private double height;
    private double wight;

    // constructor:
    public Dogs(int id, String view, int age, String nickname, String breed, double height, double wight) {
        super(id, view, age, nickname);
        this.breed = breed;
        this.height = height;
        this.wight = wight;
    }
    public void voice(){
        System.out.println("Woof-woof!");
    }
    // getters:
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
                " | wight: " + wight + " |";
    }

    // display Dogs
    public void displayDogs(){
        super.displayPet();
        System.out.println("Breed:    " + getBreed()+"\n" +
                           "Height:   " + getHeight()+"\n" +
                           "Wight:    " + getWight());
    }

} // End of class
