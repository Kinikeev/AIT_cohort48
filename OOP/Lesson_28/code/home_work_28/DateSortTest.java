package home_work_28;

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
            int res1 = s1.substring(6).compareTo(s2.substring(6));
            int res2 = s1.substring(3,4).compareTo(s2.substring(3,4));
            if (res1 != 0){
                return res1;
            }else if (res2 != 0){
                return res2;
            }
            else {
                return s1.substring(0,1).compareTo(s2.substring(0,1));
            }
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

} // End of class