package city;

import city.model.City;

public class CityAppl {

    public static void main(String[] args) {

        City city1 = new City("Augsburg",300_000L,300,2000);
        City city2 = new City("Cologne",1_080_000L,405,4000);
        City city3 = new City("Nidemor",1467,12,100);

        long totalPopulation = city1.getPopulation() + city2.getPopulation() + city3.getPopulation();
        System.out.println("Total population: " + totalPopulation);

    }
}
