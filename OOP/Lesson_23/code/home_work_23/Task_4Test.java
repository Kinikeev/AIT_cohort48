package home_work_23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task_4Test {

    Task_4 averageValueAllEvenElements = new Task_4();

    int[] array = new int[]{-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

    @BeforeEach
    void setUp() {

    }

    @Test
    void findAverageValueAllEvenElements() {

        assertEquals(2,averageValueAllEvenElements.findAverageValueAllEvenElements(array));

    }

} // End of class