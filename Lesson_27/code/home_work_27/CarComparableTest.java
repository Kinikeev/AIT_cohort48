package home_work_27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CarComparableTest {

    CarComparable[] cars;

    @BeforeEach
    void setCars(){
        cars = new CarComparable[6];

        cars[0] = new CarComparable("Mercedes", "White",15000,2015);
        cars[1] = new CarComparable("Mercedes", "Black",30000,2019);
        cars[2] = new CarComparable("VW", "Green",17000,2015);
        cars[3] = new CarComparable("VW", "White",20000,2018);
        cars[4] = new CarComparable("BMW", "Black",35000,2020);
        cars[5] = new CarComparable("BMW", "White",26000,2017);
    }
    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    @Test
    void testSortByBrand(){
        printArray(cars);
        Arrays.sort(cars);
        printArray(cars);
    }

    @Test
    void testSortByPrice(){
        printArray(cars);
        Comparator<CarComparable> comparatorByPrice = new Comparator<CarComparable>() {
            @Override
            public int compare(CarComparable car1, CarComparable car2) {
                return - (Double.compare(car1.getPrice(),car2.getPrice()));
            }
        };
        Arrays.sort(cars,comparatorByPrice);
        printArray(cars);
    }
    @Test
    void testSortByYearOfProduction(){
        printArray(cars);
        Comparator<CarComparable> comparatorByYearOfProduction = new Comparator<CarComparable>() {
            @Override
            public int compare(CarComparable o1, CarComparable o2) {
                return Integer.compare(o1.getYearOfProduction(), o2.getYearOfProduction()) ;
            }
        };
        Arrays.sort(cars,comparatorByYearOfProduction);
        printArray(cars);
    }
    @Test
    void testSortByColorAndBrand(){
        printArray(cars);
        Comparator<CarComparable> comparatorByColor = new Comparator<CarComparable>() {
            @Override
            public int compare(CarComparable o1, CarComparable o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        Arrays.sort(cars,comparatorByColor);
        printArray(cars);


    }

} // End of class

