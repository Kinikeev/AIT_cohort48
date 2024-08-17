Задание 1. Придумайте класс МойКласс с полями типа:

    - String
    - int
    - double
например: Person - name, weight, age City - name, population, area ...

Реализуйте этот класс и выполните с ним все то, что мы делали на занятии.

Задание 2.(*) В классе DateSortTest (см. код занятия), реализовать компаратор в методе setUp, 
чтобы тест был верный. Просьба не использовать Java Time API.

/*

package classwork_28.date.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {
Comparator<String> comparator;

    @BeforeEach
    void setUp() {
        comparator = (s1, s2) -> {
            // TODO Homework
            return 0;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };
        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        Arrays.sort(dates, comparator);
        assertArrayEquals(expected, dates);
    }
}
