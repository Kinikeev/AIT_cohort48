package class_work_40;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntro {
    public static void main(String[] args) {

        // Создадим Map, которая содержит наименование горда и его население
        // key - это город, тип String
        // value - это население, тип Integer

        Map<String,Integer> cities = new TreeMap<>();
        cities.put("Denver",600_000);
        cities.put("Boston", 670_000);
        cities.put("Chicago", 2_700_000);
        cities.put("Atlanta", 470_000);
        cities.put("New York", 8_500_000);
        cities.put("Dallas", 1_300_000);

        System.out.println("cities.size -> " + cities.size()); // 6
        System.out.println("cities.isEmpty -> " + cities.isEmpty());  // false

        int populations = cities.get("Chicago");
        System.out.println("populations of Chicago -> " + populations);
        populations = cities.get("Atlanta");
        System.out.println("populations of Atlanta -> " + populations);

        System.out.println(cities.containsKey("Boston"));  // true
        System.out.println(cities.containsKey("Odessa"));  // false

        // total populations ????
        // 1st option
        Collection<Integer> totalPopulation = cities.values(); // create new object

        int total = 0;
        for (Integer i : totalPopulation){
            total += i;
        }
        System.out.println("Total population: " + total);

        // print
        System.out.println("Print for:");
        for (Integer i : totalPopulation){
            System.out.println(i);
        }

        // 2nd option
        total = 0;
        Set<String> setOfCities = cities.keySet();
        for (String str : setOfCities){
            total += cities.get(str);
        }
        System.out.println("Total 2nd option = " + total);

        // Print keys - проход по всем ключам
        System.out.println("Print keys - проход по всем ключам:");
        for (String key : cities.keySet()) {
            System.out.println(key); // print keys
        }

        // Print values - проход по всем значениям
        System.out.println("Print values - проход по всем значениям:");
        for (Integer value : cities.values()) {
            System.out.println(value);
        }

        // Print keys and values - проход по всем ключам и их значениям
        System.out.println("Print keys and values - проход по всем ключам и их значениям: ");
        for (String key : cities.keySet()) {
            System.out.println("key: " + key + ", value: " + cities.get(key));
        }


    } // end of main
}
