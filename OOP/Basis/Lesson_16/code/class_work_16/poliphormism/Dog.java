package class_work_16.poliphormism;

public class Dog {

    // fields
    private String name;
    private int age;
    private double wight;
    private String breed;

    // constructor
    public Dog(String name, int age, double wight, String breed) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                ", breed='" + breed + '\'' +
                '}';
    }
    public void voice(){
        System.out.println("Gaww - gaww");
    }



}
