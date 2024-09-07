package class_work_29.city_copy_array.ait.city.model;

import java.util.Objects;

// **Задание 1.**
//Создать класс City - название, население.
//Сделать класс Citi сортируемым по полю кол-во населения.

public class City implements Comparable<City> {

    // fields
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof City city)) return false;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {

        return String.format("City name - %s, population - %d ",name,population);
    }

    @Override
    public int compareTo(City o) {
        //return this.population - o.population;
        return Integer.compare(this.population,o.population);
    }
} // End of class
