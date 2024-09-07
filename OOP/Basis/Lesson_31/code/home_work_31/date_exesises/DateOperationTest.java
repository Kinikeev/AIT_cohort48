package home_work_31.date_exesises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DateOperationTest {

    @Test
    public void testSortStringDates() {
        String[] dates = {"12/01/2023", "01/01/2023", "15/01/2023"};
        String[] expected = {"01/01/2023", "12/01/2023", "15/01/2023"};
        String[] sortedDates = DateOperation.sortStringDates(dates);
        assertArrayEquals(expected, sortedDates);
    }
    @Test
    void testSortStringDates2() {
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
        Arrays.sort(dates);
        assertArrayEquals(expected, dates);
    }

}