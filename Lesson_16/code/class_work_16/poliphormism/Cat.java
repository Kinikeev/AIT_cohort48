package class_work_16.poliphormism;

public class Cat {

    // fields
    private String name;
    private int age;
    private double wight;
    private String breed;

    // constructor
    public Cat(String name, int age, double wight, String breed) {
        this.name = name;
        this.age = age;
        this.wight = wight;
        this.breed = breed;
    }
    // getters


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWight() {
        return wight;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wight=" + wight +
                ", breed='" + breed + '\'' +
                '}';
    }
    public void voice(){
        System.out.println("Muauuuuu.......");
    }






}
