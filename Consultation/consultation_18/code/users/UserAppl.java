package users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserAppl {
    public static void main(String[] args) {

        User[] users = new User[8];

        users[0] = new User(1, "Michael", "Robert", LocalDate.of(2000,01,01), "TR");
        users[1] = new User(2, "Mary", "Patricia", LocalDate.of(1961,01,01), "EN");
        users[2] = new User(3, "John", "Michael", LocalDate.of(1980,01,01), "FR");
        users[3] = new User(4, "Jennifer", "Linda", LocalDate.of(1985,01,01), "TR");
        users[4] = new User(5, "William", "Elizabeth", LocalDate.of(1976,01,01), "US");
        users[5] = new User(6, "Sue", "Jackson", LocalDate.of(1963,01,01), "IT");
        users[6] = new User(7, "Michael", "ATommy", LocalDate.of(1990,01,01), "EN");
        users[7] = new User(8,"Bill", "Mirray", LocalDate.of(2007,01,01), "EN");

        List<User> userList = new ArrayList<>();
        Collections.addAll(userList, users);

        //    - Перебор всех элементов userList с помощью forEach() и вывод их в консоль
        printUsers(userList);

        //    - Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль.
//      - Вместо имени только инициалы
        printInitials(userList);

        //      - Сортировка списка по полю age
        printUsersSortedByAge(userList);

        //    - Рассчитать средний возраст
        usersAvgAge(userList);

        // Проверка, что у всех User возраст (age) больше 18
        isAgeMore18(userList, 18);

        // Количество пользователей из разных стран
        calcUserByCountries(userList);


    } // end of main

    private static void calcUserByCountries(List<User> userList) {
        long countDifferentCountries = userList.stream()
                .map(User::getCountry)
                .distinct()
                .count();
        System.out.println("Number of Countries: " + countDifferentCountries);
    }

    private static void isAgeMore18(List<User> userList, int age) {
        // Проверка, что у всех User возраст (age) больше 18
        boolean isAgeMore18 = userList.stream()
                .allMatch(user -> user.getAge() > age);
        System.out.println("Are all users grate than 18: " + isAgeMore18);
    }


    //    - Рассчитать средний возраст
    private static void usersAvgAge(List<User> userList) {
        System.out.println("--------------- Average age of users -----------------------------");
        double avgAge = userList.stream()
                .mapToInt(User::getAge)
                .summaryStatistics()
                .getAverage();
        System.out.println("Average age = " + avgAge);

    }

    //      - Сортировка списка по полю age
    private static void printUsersSortedByAge(List<User> userList) {
        System.out.println("--------------- List of users sorted by age -----------------------------");
        userList.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .toList()
                .forEach(System.out::println);
    }

    //    - Перебор всех элементов userList с помощью forEach() и вывод их в консоль
    public static void printUsers(List<User> userList){
        System.out.println("--------------- List of users -----------------------------");
        userList.stream().forEach(System.out::println);
    }
    //    - Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль.
//      - Вместо имени только инициалы
    private static void printInitials(List<User> userList) {
        System.out.println("--------------- List of users Initials -----------------------------");
        userList.stream()
                .map(user -> {
                    return new User(
                            user.getId(),
                            user.getFirstName().charAt(0) + ".",
                            user.getLastName().charAt(0) + ".",
                            user.getBirthDay(),
                            user.getCountry()
                    );
                })
                .toList()
                .forEach(System.out::println);

    }

} // end of class
