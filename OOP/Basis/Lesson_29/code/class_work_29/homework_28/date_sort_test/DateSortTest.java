package class_work_29.homework_28.date_sort_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DateSortTest {

    // comparator works with String
    Comparator<String> comparator;

    @BeforeEach
    void setUp() {

        comparator = (s1, s2) -> { // compare two string

            String[] str1 = s1.split("-"); // split string by "-"
            String[] str2 = s2.split("-"); // split string by "-"
            for (int i = str1.length - 1; i >= 0; i--) { // идем с конца строки к началу
                int d1 = Integer.parseInt(str1[i]); // get number from string
                int d2 = Integer.parseInt(str2[i]); // get number from string
                if (d1 > d2) { // compare numbers
                    return 1;
                }
                if (d1 < d2) {
                    return -1;
                }

            }
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
