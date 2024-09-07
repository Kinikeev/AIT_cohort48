package home_work_30.weekDays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class WeekDayTest {

    WeekDay[] weekDays = WeekDay.values();

    @BeforeEach
    void setUp() {
    }
    public void printArray(Object[] arr,String title){
        System.out.println("============== " +title + " ===============");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    @Test
    void testPrint(){
        for (WeekDay weekDay : weekDays) {
            System.out.println(weekDay);
        }
        System.out.println("=========================================");
    }
    @Test
    void testPlusWeek(){
        WeekDay wd = WeekDay.MON;
        System.out.println(wd);
        System.out.println(wd.plusWeek(wd,10));
        System.out.println(WeekDay.FRI.plusWeek(WeekDay.FRI,4));
        WeekDay day = WeekDay.SUN.plusWeek(WeekDay.SUN,8);
        System.out.println(day);

    }
    @Test
    void testComparator(){
        Comparator<WeekDay> weekDayComparator = (d1, d2) -> d1.getName().compareTo(d2.getName());
        Arrays.sort(weekDays,weekDayComparator);
        printArray(weekDays,"SortByName");
    }
    @Test
    void testByOrdinal(){
        System.out.println("Index of Saturday = " + WeekDay.SAT.ordinal());
    }
    @Test
    void testValues(){
        System.out.println(Arrays.toString(WeekDay.values()));

    }
    @Test
    void testToString(){
        System.out.println(WeekDay.SUN.toString());
        System.out.println(WeekDay.WED.toString());
    }
    @Test
    void testValueOf(){
        System.out.println("valueOf -> " + WeekDay.valueOf("SAT"));
    }
}