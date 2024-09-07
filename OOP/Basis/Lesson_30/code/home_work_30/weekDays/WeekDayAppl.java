package home_work_30.weekDays;

import java.util.Arrays;

public class WeekDayAppl {

    public static void main(String[] args) {

        WeekDay wd = WeekDay.MON;
        System.out.println(wd);
        System.out.println(wd.plusWeek(wd,10));
        System.out.println("----------------------------------------------------------");

        WeekDay wd2 = WeekDay.FRI;
        System.out.println(wd2);
        System.out.println(wd2.plusWeek(wd2,8));
        System.out.println("----------------------------------------------------------");

        System.out.println(Arrays.toString(WeekDay.values()));
        System.out.println("----------------------------------------------------------");

        WeekDay[] weekDays = WeekDay.values(); // все значения enum попали в массив
        // for each  ( enter iter )
        for (WeekDay weekDay : weekDays) {
            System.out.println(weekDay);
        }
        System.out.println("Index of Saturday = " + WeekDay.SAT.ordinal());
        System.out.println("To string -> " + WeekDay.SUN.toString());

        System.out.println("valueOf -> " + WeekDay.valueOf("SAT"));

    } // End of main

} // End of class
