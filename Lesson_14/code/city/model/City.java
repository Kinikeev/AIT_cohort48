package city.model;

public class City {
    private String name;
    private long population;
    private double area;
    private int age;

    public City(String name, long population, double area, int age) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", age=" + age +
                '}';
    }
}
