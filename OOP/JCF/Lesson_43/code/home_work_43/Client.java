package home_work_43;

    // Задача 1.
//
//    Турагентство специализируется на странах Средиземноморья - Испания, Франция, Италия, Греция, Турция, Тунис.
//    Имеется таблица с данными о поездках клиентов в течение 2020-2023 годов в перечисленные страны.
//    Каждый из клиентов посетил от одной до 3 стран, причем некоторые страны по 2 и более раз.
//
//    Необходимо ответить на вопросы:
//
//        - Какие страны наиболее популярны?
//        - Кто из клиентов посетил наибольшее количество стран?

import java.util.Arrays;

public class Client {

    // fields
    private String name;
    String[] countries ;

    // constructor
    public Client(String name, String ... countries) {
        this.name = name;
        this.countries = countries;
    }

    // getters
    public String getName() {
        return name;
    }
    public String[] getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name:'" + name + '\'' +
                ", countries: " + Arrays.toString(countries) +
                '}';
    }
} // end of class
