package home_work_23;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethodsTest = new ArrayMethods();

    int[] a = new int[]{-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
    int[] b = new int[]{6, -8, -1, 6, -2, -8, -9, 9, 0, -7};
    int[] c = new int[] {-5, 8, 7, -6, 8, -7, 7, 2, -8, 2};

    @BeforeEach
    void setUp() {
    }

    @Test
    void printArray(){
        arrayMethodsTest.printArray(a);
        arrayMethodsTest.printArray(b);
        arrayMethodsTest.printArray(c);
    }

    @Test
    void sumAllElementsWithOddIndices() {
        assertEquals(80,arrayMethodsTest.sumAllElementsWithOddIndices(a));
        assertEquals(-8,arrayMethodsTest.sumAllElementsWithOddIndices(b));
        assertEquals(-1,arrayMethodsTest.sumAllElementsWithOddIndices(c));
        assertEquals(80,arrayMethodsTest.sumAllElementsWithOddIndices(a));
    }

    @Test
    void findElementByIndex() {
        assertEquals(-30,arrayMethodsTest.findElementByIndex(a,3));
        assertEquals(-2,arrayMethodsTest.findElementByIndex(b,4));
        assertEquals(-7,arrayMethodsTest.findElementByIndex(c,5));
    }

    @Test
    void arrayOfRandomIntegers() {

    }

    @Test
    void positiveNumbers() {
        assertEquals(6,arrayMethodsTest.positiveNumbers(a));
        assertEquals(4,arrayMethodsTest.positiveNumbers(b));
        assertEquals(6,arrayMethodsTest.positiveNumbers(c));
    }

    @Test
    void negativeNumbers() {
        assertEquals(4,arrayMethodsTest.negativeNumbers(a));
        assertEquals(6,arrayMethodsTest.negativeNumbers(b));
        assertEquals(4,arrayMethodsTest.negativeNumbers(c));
    }

    @Test
    void evenNumbers() {
        assertEquals(4,arrayMethodsTest.evenNumbers(a));
        assertEquals(6,arrayMethodsTest.evenNumbers(b));
        assertEquals(6,arrayMethodsTest.evenNumbers(c));
    }

    @Test
    void zerosNumbers() {
        assertEquals(0,arrayMethodsTest.zerosNumbers(a));
        assertEquals(1,arrayMethodsTest.zerosNumbers(b));
        assertEquals(0,arrayMethodsTest.zerosNumbers(c));
    }

    @Test
    void findAverageValueAllEvenElements() {
        assertEquals(2,arrayMethodsTest.findAverageValueAllEvenElements(a));
        assertEquals(-1,arrayMethodsTest.findAverageValueAllEvenElements(b));
        assertEquals(1,arrayMethodsTest.findAverageValueAllEvenElements(c));
    }

} // End of class