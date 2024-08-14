package class_work_27.wine_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine[] wines;

    @BeforeEach
    void setUp() {
        wines = new Wine[5];

        wines[0] = new Wine("Type1","AAA",2021,2.3);
        wines[1] = new Wine("Type2","XXX",2024,2.8);
        wines[2] = new Wine("Type3","NNN",2022,3.5);
        wines[3] = new Wine("Type1","OOO",2015,4.8);
        wines[4] = new Wine("Type2","CCC",2000,6.3);

    }
    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------------------------");
    }

    @Test
    void testSortWineByAge(){
        printArray(wines);

        Arrays.sort(wines);
        printArray(wines);

    }
    @Test
    void testSortWineByPrice(){
        printArray(wines);
        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                //return (int) (wine1.getPrice() - wine2.getPrice());
                return Double.compare(wine1.getPrice(),wine2.getPrice());
            }
        };
        Arrays.sort(wines,comparatorByPrice);
        printArray(wines);
    }
    @Test
    void testSortWineByTitle(){
        printArray(wines);
        Comparator<Wine> comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine wine1, Wine wine2) {
                return wine1.getTitle().compareTo(wine2.getTitle());
            }
        };
        Arrays.sort(wines,comparatorByTitle);
        printArray(wines);
    }
    @Test
    void testSortWineByAgeAndPrice(){

    }
} // End of class