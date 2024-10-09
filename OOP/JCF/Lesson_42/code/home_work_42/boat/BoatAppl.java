package home_work_42.boat;

import java.util.*;

public class BoatAppl {
    // Нужно создать набор яхт и выполнить следующие задачи:

    //    - отобразить все яхты;
    //    - отобразить яхты, сделанные из указанного материала корпуса;
    //    - отобразить яхты дороже указанной цены;
    //    - отобразить яхты, чей год выпуска находится в заданном диапазоне;
    //    - отсортировать яхты в порядке убывания стоимости;
    //    - получить среднюю стоимость яхты из созданного набора;
    //    - сколько и конкретно какие яхты под каким флагом стоят в порту.

    public static void main(String[] args) {

        List<Boat> boats = Arrays.asList(
                new Boat("Craft","FR",2006,8.5,"Wood",180000),
                new Boat("Amtec","TR",2010,11,"Wood",400000),
                new Boat("Venture","FR",2012,9,"Plastic",200000),
                new Boat("AMC Design","RU",2014,12,"Metal",600000),
                new Boat("AST","DE",2007,10,"Metal",300000),
                new Boat("Abim","NL",2011,11.5,"Plastic",450000),
                new Boat("ARNO","IT",2008,14,"Metal",900000),
                new Boat("Tender","FR",2013,15,"Metal",800000),
                new Boat("AB Yachts","IT",2009,13,"Plastic",700000)
        );

        // 1. отобразить все яхты;
        printAllBoats(boats);

        // 2. отобразить яхты, сделанные из указанного материала корпуса;
        String material = "Metal"; // Plastic Metal
        System.out.println("------------------------------- boats from " + material + " ----------------------------");
        boatsByMaterial(boats,material);
        System.out.println("-----------------------------------------------------------------------------");

        // 3. отобразить яхты дороже указанной цены;
        double price = 500_000;
        System.out.println("-------------------------- more expensive than " + price + " -----------------------");
        boatsMorePrice(boats,price);

        // 4. отобразить яхты, чей год выпуска находится в заданном диапазоне;
        int from = 2009;
        int to = 2012;
        System.out.println("-------------------------- Boats from " + from + " to " + to + " -----------------------");
        boatsByYearOfIssue(boats,from,to);

        // 5. отсортировать яхты в порядке убывания стоимости;
        System.out.println("-------------------------- sorted By Price Descending -----------------------");
        sortedByPriceDescending(boats);

        // 6. получить среднюю стоимость яхты из созданного набора;
        System.out.println("------------------- Average price ----------------------------------------------");
        double avgPrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average price = " + avgPrice + " $");
        System.out.println("Average price = " + getAveragePrice(boats) + " $");

        // 7. сколько и конкретно какие яхты под каким флагом стоят в порту.
        System.out.println("----------------------------- Size of boats ---------------------------------------");
        sizeBoatsByCountry(boats,"FR");
        sizeBoatsByCountry(boats,"TR");
        sizeBoatsByCountry(boats,"IT");
        sizeBoatsByCountry(boats,"RU");
        sizeBoatsByCountry(boats,"NL");
        sizeBoatsByCountry(boats,"DE");

    } // end of main

    // 7. сколько и конкретно какие яхты под каким флагом стоят в порту.
    public static void sizeBoatsByCountry(List<Boat> boats, String country) {
        List<Boat> filteredBoats = boats.stream()
                .filter(boat -> boat.getCountry().equalsIgnoreCase(country))
                .toList();
        System.out.println("Total number of yachts under the flag " + country + ": " + filteredBoats.size());
        filteredBoats.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
    }

    // 6. получить среднюю стоимость яхты из созданного набора;
    private static double getAveragePrice(List<Boat> boats) {
        return boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0);
    }

    // 5. отсортировать яхты в порядке убывания стоимости;
    private static void sortedByPriceDescending(List<Boat> boats) {
        boats.stream()
                .sorted(Comparator.comparing(Boat::getPrice).reversed())
                .forEach(System.out::println);
    }

    // 4. отобразить яхты, чей год выпуска находится в заданном диапазоне;
    private static void boatsByYearOfIssue(List<Boat> boats, int from, int to) {
        boats.stream()
                .filter(boat -> boat.getYearOfIssue() >= from && boat.getYearOfIssue() <= to)
                .sorted(Comparator.comparing(Boat::getYearOfIssue))
                .forEach(System.out::println);
    }

    // 3. отобразить яхты дороже указанной цены;
    private static void boatsMorePrice(List<Boat> boats, double price) {
        boats.stream()
                .filter(boat -> boat.getPrice() > price)
                .sorted(Comparator.comparing(Boat::getPrice))
                .forEach(System.out::println);
    }

    // 2. отобразить яхты, сделанные из указанного материала корпуса;
    private static void boatsByMaterial(List<Boat> boats, String material) {
        boats.stream()
                .filter(boat -> boat.getBodyMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);

    }

    // 1. отобразить все яхты;
    private static void printAllBoats(List<Boat> boats) {
        System.out.println("------------------------------- print all boats ----------------------------");
       boats.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------------------------");
    }


} // end of class
