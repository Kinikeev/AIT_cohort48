package home_work_40;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class countriesOfContinents {

    // Задание 1. Соберите в структуру Map порядка 20 стран, по несколько страны из разных континентов Земли.
    // Подсчитайте количество стран на континентах из полученного списка.

    // Task 1. Collect about 20 countries in the Map structure, several countries from different continents of the Earth.
    // Count the number of countries on the continents from the resulting list.

    public static void main(String[] args) {

        Map<String, String> countries = new TreeMap<>();
        countries.put("Egypt", "Africa");
        countries.put("Russian", "Eurasia");
        countries.put("USA", "North America");
        countries.put("Brazil","South America");
        countries.put("India", "Asia");
        countries.put("Germany", "Europe");
        countries.put("Angola", "Africa");
        countries.put("China", "Asia");
        countries.put("Colombia", "South America");
        countries.put("France", "Europe");
        countries.put("Kenya", "Africa");
        countries.put("Canada", "North America");
        countries.put("Austria", "Europe");
        countries.put("Libya", "Africa");
        countries.put("Argentina", "South America");
        countries.put("Morocco", "Africa");
        countries.put("Iran", "Asia");
        countries.put("Belgium", "Europe");
        countries.put("Mozambique", "Africa");
        countries.put("Yemen", "Asia");

        System.out.println("Size of countries = " +  countries.size());
        printMap(countries);

        System.out.println("Africa -> " + countOfCountries(countries,"Africa") + " countries");
        System.out.println("Eurasia -> " + countOfCountries(countries,"Eurasia") + " countries");
        System.out.println("South America -> " + countOfCountries(countries,"South America") + " countries");
        System.out.println("North America -> " + countOfCountries(countries,"North America") + " countries");
        System.out.println("Europe -> " + countOfCountries(countries,"Europe") + " countries");
        System.out.println("Asia -> " + countOfCountries(countries,"Asia") + " countries");

    } // end of main
    private static void printMap(Map<String,String> map){
        for (String str : map.keySet()){
            System.out.println(str + " -> " + map.get(str));
        }
        System.out.println("--------------------------------------------------------------");
    }

    private static int countOfCountries(Map<String,String> map,String continent){
        int count = 0;
        for (String str : map.keySet()) {
            if (map.get(str).equals(continent)) {
                count ++;
            }
        }
        return count;
    }



}
