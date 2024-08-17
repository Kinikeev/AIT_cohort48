package home_work_28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person[] person;

    @BeforeEach
    void setUp() {
        person = new Person[]{
                new Person("Georg",56,82.6),
                new Person("Mischel",47,71.3),
                new Person("Elena",35,68.7),
                new Person("Robert",60,81.8),
                new Person("Alex",45,82.6)
        };
    }

    public static void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("------------------------------------------------");
    }
    @Test
    void testPersonNaturalOrder(){
        printArray(person);
        Arrays.sort(person);
        printArray(person);

    }
    @Test
    void testPersonByAge(){
        printArray(person);
        Arrays.sort(person, (p1,p2) -> p1.getAge() - p2.getAge());
        printArray(person);
    }
    @Test
    void testPersonByWeight(){
        printArray(person);
        Arrays.sort(person, (p1,p2) -> Double.compare(p1.getWeight(),p2.getWeight()));
        printArray(person);
    }
    @Test
    void testPersonByWeightAndAge(){
        printArray(person);
        Arrays.sort(person, (p1,p2) -> {
            int res = Double.compare(p1.getWeight(),p2.getWeight());
            return  res != 0 ? res : p1.getAge() - p2.getAge();
        });
        printArray(person);
    }

} // End of class