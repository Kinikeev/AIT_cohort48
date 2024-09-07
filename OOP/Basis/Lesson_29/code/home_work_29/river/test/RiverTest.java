package home_work_29.river.test;

import class_work_29.city_copy_array.ait.city.model.City;
import home_work_29.river.model.River;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River[] rivers;

    @BeforeEach
    void setUp() {
        rivers = new River[10];
        rivers[0] = new River("Moscow","Europa",300);
        rivers[1] = new River("Neva","Europa",60);
        rivers[2] = new River("Volga","Europa",5000);
        rivers[3] = new River("Amazon","South America",7100);
        rivers[4] = new River("Nile","Africa",6500);
        rivers[5] = new River("Mississippi","North America",6420);
        rivers[6] = new River("Rein","Europa",4000);
        rivers[7] = new River("Ob","Asia",5700);
        rivers[8] = new River("Senna","Europa",2000);
        rivers[9] = new River("Yukon","North America",6210);
    }

    private void printArray(Object[] arr,String title){
        System.out.println("===================== - " + title +  " - ======================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    void testComparable(){
        printArray(rivers,"Natural array");
        Arrays.sort(rivers);
        printArray(rivers,"Array after sorting");
        River pattern = new River("River","Continent",3000);
        int index = Arrays.binarySearch(rivers,pattern);
        System.out.println("Index = " + index);
    }
    @Test
    void testComparator(){
        Comparator<River> riverComparator = (r1,r2) -> r1.getName().compareTo(r2.getName());
        Arrays.sort(rivers,riverComparator);
        printArray(rivers,"Sort by name");
        River pattern = new River("Don","Europa",6000);
        int index = Arrays.binarySearch(rivers,pattern,riverComparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testSortByContinentAndLength(){
        Comparator<River> comparator = (r1,r2) -> {
            int res = r1.getContinent().compareTo(r2.getContinent());
            return res != 0 ? res : Integer.compare(r1.getLength(), r2.getLength());
        };
        Arrays.sort(rivers, comparator);
        printArray(rivers,"Sorting");
        River pattern = new River("Moscow","Europa",2500);
        int index = Arrays.binarySearch(rivers,pattern,comparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testArrayCopy(){
        // Статический метод Arrays.copyOf, принимает в качестве аргумента массив, новый размер и
        // возвращает массив нового размера, в который скопированы элементы исходного массива.
        Comparator<River> comparator= Comparator.nullsLast((r1,r2) -> r1.getName().compareTo(r2.getName()));
        River[] riversCopy = Arrays.copyOf(rivers,rivers.length + 3);
        printArray(riversCopy,"Copy before sorting");
        Arrays.sort(riversCopy,comparator);
        printArray(riversCopy,"Copy after sorting");

        River pattern = new River("Don","Europa",6000);
        int index = Arrays.binarySearch(riversCopy,0,rivers.length,pattern,comparator);
        System.out.println("Index = " + index);
    }
    @Test
    void testKeepSort(){
        printArray(rivers,"Natural without sorting");
        River river = new River("Don","Europa",6000);
        River[] riversCopy = Arrays.copyOf(rivers,rivers.length + 1);
        int index = Arrays.binarySearch(riversCopy,0,riversCopy.length - 1,river);
        System.out.println(index);
        index = index >= 0 ? index : - index - 1;
        System.out.println(index);
        System.arraycopy(riversCopy,index,riversCopy,index + 1,riversCopy.length - index - 1);
        riversCopy[index] = river;
        rivers = riversCopy;
        printArray(rivers,"Natural order after add new city");
    }
    @Test
    void testSystemArrayCopy(){
        River[] riversCopy = new River[rivers.length + 2];
        System.arraycopy(rivers,1,riversCopy,2,8);
        printArray(rivers,"Original");
        printArray(riversCopy,"New and copy rang");
    }
    @Test
    void testCopyOfRange(){
        River[] riversCopy = Arrays.copyOfRange(rivers, 2, rivers.length + 2);
        printArray(rivers, "Original array");
        printArray(riversCopy, "Copy of range");
    }

} // End of class