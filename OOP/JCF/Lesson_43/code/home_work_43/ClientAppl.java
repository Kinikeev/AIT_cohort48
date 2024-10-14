package home_work_43;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ClientAppl {
    //Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
//    Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны.
//    Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.
//
//        - Какие страны наиболее популярны?
//        - Кто из клиентов посетил наибольшее количество стран?

    public static void main(String[] args) {

        // 1. вносим клиентов в список
        List<Client> clients = filListClients();

        // 2. делаем распечатку листа
        System.out.println("Clients List:");
        clients.forEach(System.out::println);

        // 3. Какие страны наиболее популярны
        System.out.println("====================== Most populars countries ================================");
        printMostPopularCountry(clients);

        // 4. Кто из клиентов посетил наибольшее количество стран
        System.out.println("===================== = Most quensency clients ================================");
        printMostQuensencyClients(clients);

    } // end of main

    // 4. Кто из клиентов посетил наибольшее количество стран
    private static void printMostQuensencyClients(List<Client> clients) {

        Map<Integer,List<Client>> quensClient = clients.stream()
                .collect(Collectors.groupingBy(client -> client.getCountries().length));
        Integer max = quensClient.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        System.out.println("Max travels of client = " + max);
        for (Integer key : quensClient.keySet()){
            System.out.println("Size travels: " + key + " -> client: " + quensClient.get(key));
        }
    }

    // 3. Какие страны наиболее популярны
    private static void printMostPopularCountry(List<Client> clients) {
        System.out.println("---- List of countries: -----");
        // заполним countries при помощи Stream
        // забираем и преобразовываем из нашей структуры массив String[] countries в Stream;
        // выбираем из массива страны и переводим в stream
        Iterable<String> countries = clients.stream()
                .map(Client::getCountries)
                .flatMap(Arrays ::stream)
                .distinct()   // убираем дубликаты
                .collect(Collectors.toList());
        // Терминальный метод collect может собрать содержимое стрима в нужную нам структуру.
        // Для этого ему надо передать объект имплементирующий интерфейс Collectors.
         countries.forEach(System.out::println);
        System.out.println("=============== Grouping by Countries =================================");

        Map<String,Long> visitFrequency = clients.stream()
                .map(Client::getCountries)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(visitFrequency);

        System.out.println("----------- frequently visited countries ----------------------");

        // ищем максимум встречающихся стран
        Long max = visitFrequency.values().stream()
                .max(Long::compare).orElse(0L);

        // выбираем страны с max
        visitFrequency.entrySet().stream()
                .filter(c-> max.equals(c.getValue()))
                .forEach(c-> System.out.println(c.getKey()));
    }

    // 1. вносим клиентов в список
    private static List<Client> filListClients() {
        return List.of(
                new Client("Maier","Spain","France"),
                new Client("Smith","Italy", "Spain", "Turkey"),
                new Client("Arnst","Tunisia", "Greece"),
                new Client("Huber","Spain", "Turkey", "France"),
                new Client("Muller","Spain")
        );
    }

} // end of class
