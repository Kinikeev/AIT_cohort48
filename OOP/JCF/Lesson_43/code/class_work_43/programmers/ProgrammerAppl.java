package class_work_43.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
    public static void main(String[] args) {

        List<Programmer> programmers = fillistProgrammers();

        System.out.println("====================== Most skilled programmers ================================");
        printMostSkilledProgrammers(programmers);

        System.out.println("====================== Most populars technologies ================================");

        mostPopularsTechnologies(programmers);

    } // end of main

    private static void mostPopularsTechnologies(List<Programmer> programmers) {
        System.out.println("Print all technologies");

        Iterable<String> technologies = programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        //technologies.forEach(System.out::println); // с дубликатами

        System.out.println("List of technologies");
        StreamSupport.stream(technologies.spliterator(),false)
                .distinct()      // убирает дубликаты
                .forEach(System.out::println);       // без дубликатов

        System.out.println("=============== Grouping by Programmers =================================");

        Map<String,Long> techFrequency = programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t->t, Collectors.counting()));

        System.out.println(techFrequency);

        Long max = techFrequency.values().stream()
                .max(Long :: compare).orElse(0L);

        techFrequency.entrySet().stream()
                .filter(e -> max.equals(e.getValue()))
                .forEach(e -> System.out.println(e.getKey()));


    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {

        /*
        Map<Integer,List<Programmer>> skilledProgrammers = new HashMap<>();
        int max = 0;
        for (Programmer p : programmers){   // при помощи p просматриваем список programmers
            int key = p.getTechnologies().length;  // Key for Map (количество языков)
            max = key > max ? key : max;  // по ходу цикла определяем max
            skilledProgrammers.putIfAbsent(key,new ArrayList<>());
            List<Programmer> programmerList = skilledProgrammers.get(key);
            programmerList.add(p);
        }
        System.out.println(skilledProgrammers);

         */
        Map<Integer,List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p-> p.getTechnologies().length));

        Integer max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        System.out.println(skilledProgrammers);
        System.out.println("Max = " + max);


        // Print keys and values - проход по всем ключам и их значениям
//        for (String key : nameMap.keySet()) {
//            System.out.println("key: " + key + " value: " + nameHashMap.get(key));
//        }
        for (Integer key : skilledProgrammers.keySet()){
            System.out.println("Q-ty of languages:" + key + ", programmer: " + skilledProgrammers.get(key));
        }
    }

    private static List<Programmer> fillistProgrammers() {
        return List.of(
                new Programmer("Peter","C++","Python","Java","Kotlin"),
                new Programmer("John","Python","Java"),
                new Programmer("Helen","JavaScrip","Scala","Java","Kotlin"),
                new Programmer("Jacob","Python","Go"),
                new Programmer("Mikhail","Fortran","Algol","PL-1")
        );
    }



}
