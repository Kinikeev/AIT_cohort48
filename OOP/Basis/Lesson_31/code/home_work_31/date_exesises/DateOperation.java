package home_work_31.date_exesises;
    /*
    Задача 1.
        В классе DateOperation из классной работы, реализовать метод getAge,
        принимающий дату рождения в виде стринга,
        и возвращающий возраст.
     */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class DateOperation {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate + " -> Текущая дата");
        String birthDay = "01/05/1964";
        LocalDate bd = LocalDate.parse(birthDay,DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy]")); // from String to Local
        System.out.println(bd + " -> Дата рождения");
        System.out.println(localDate.compareTo(bd) + " years -> Age. (compareTo)"); // years

        int age = localDate.compareTo(bd);
        System.out.println(age); // years

        int years = (int) ChronoUnit.YEARS.between(bd,localDate); // years
        System.out.println(years + " years -> Age. (ChronoUnit)");

        String[] dates = {"29.09.1974","06-05-1985","1988/03/02"};
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        //System.out.println(Arrays.toString(sortStringDates(dates)));
        System.out.println(Arrays.toString(sortStringDates2(dates)));

    } // End of main

    public int getAge(String birthDay){
        LocalDate localDate = LocalDate.now();
        LocalDate bd = LocalDate.parse(birthDay,DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy][dd.MM.yyyy]"));
        return localDate.compareTo(bd);
    }
    /*
    Задача 2.
        В классе DateOperation реализовать метод sortStringDates,
        принимающий массив дат в виде массива стрингов, и возвращающий отсортированный массив стрингов-дат.
        Для проверки используйте класс DateOperationTest с юнит-тестами.
     */

    public static String[] sortStringDates(String[] dates){
        // Определяем формат даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy][dd.MM.yyyy]");

        Comparator<String> comparator1;
        comparator1 = (s1,s2) -> {
            LocalDate date1 = LocalDate.parse(s1,formatter);
            LocalDate date2 = LocalDate.parse(s2,formatter);
            return date1.compareTo(date2);
        };
        Arrays.sort(dates,comparator1);

        return dates;
    }
    public static String[] sortStringDates2(String[] dates){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd-MM-yyyy][dd/MM/yyyy][dd.MM.yyyy]");
        for (int i = 0; i < dates.length; i++) {


        }
        Arrays.sort(dates);
        return dates;
    }



} // End of class
