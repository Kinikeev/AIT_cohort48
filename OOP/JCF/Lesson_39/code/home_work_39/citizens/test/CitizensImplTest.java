package home_work_39.citizens.test;

import home_work_39.citizens.dao.Citizens;
import home_work_39.citizens.dao.CitizensImpl;
import home_work_39.citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class CitizensImplTest {

    Citizens citizens;
    Person[] person ;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        citizens = new CitizensImpl();
        person = new Person[5];
        person[0] = new Person(345,"Peter","Schmidt", LocalDate.of(1975,02,28));
        person[1] = new Person(234,"Arthur","Mayer", LocalDate.of(1986,12,9));
        person[2] = new Person(123,"Michael","Ernst", LocalDate.of(1965,10,12));
        person[3] = new Person(456,"Inga","Kaul", LocalDate.of(1980,03,5));
        person[4] = new Person(666,"null","Arnst",LocalDate.of(2000,8,8));

        for (Person p : person){
            citizens.add(p);
        }
    }

    @Test
    void add() {
        assertEquals(5,citizens.size());
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(person[1])); // уже существует
        Person person1 = new Person(345,"Michael","Ernst", LocalDate.of(1965,10,12));
        assertFalse(citizens.add(person1)); // такой тоже уже есть
        Person person2 = new Person(123,"Nick","Anna", LocalDate.of(2000,11,8));
        assertFalse(citizens.add(person2));
        Person person3 = new Person(564,"Ernest","Bauer", LocalDate.of(2005,5,1));
        assertTrue(citizens.add(person3));
        assertEquals(6,citizens.size());

    }

    @Test
    void remove() {
        assertEquals(5,citizens.size());
        assertFalse(citizens.remove(777));
        assertTrue(citizens.remove(123));
        assertEquals(4,citizens.size());
    }

    @Test
    void findByLastName() {
        Iterable<Person> res = citizens.find("Jackson");
//        res.forEach(p -> assertTrue("Jackson".equals(p.getLastName())));
        List<Person> actual = new ArrayList<>();
        res.forEach(p -> actual.add(p));
        Collections.sort(actual);
        Iterable<Person> expected = List.of(
                new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(3, "Mary", "Jackson", now.minusYears(20)));
        assertIterableEquals(expected, actual);
    }

    @Test
    void testFindById() {
        Person person = citizens.find(234);
        assertEquals(234, person.getId());
        assertEquals("Arthur", person.getFirstName());
        assertEquals("Mayer", person.getLastName());
        assertEquals(37, person.getAge());
        assertNull(citizens.find(555));
    }

    @Test
    void testFindByAge() {
        Iterable<Person> res = citizens.find(30, 50);
        for (Person person : res) {
            assertTrue(person.getAge() >= 30 && person.getAge() <= 50);
        }
        // res.forEach(p -> assertTrue(p.getAge() >= 30 && p.getAge() <= 50));
        printArray(res);
    }

    @Test
    void getAllPersonsSortedById() {
        Iterable<Person> actual = citizens.getAllPersonsSortedById();
        Iterable<Person> expected = List.of(new Person(123, "Michael", "Ernst", now.minusYears(58)),
                new Person(234, "Arthur", "Mayer", now.minusYears(47)),
                new Person(345, "Peter", "Schmidt", now.minusYears(48)),
                new Person(456, "Inga", "Kaul", now.minusYears(44)),
                new Person(666,"David","Arnst",now.minusYears(24)));
        assertIterableEquals(expected, actual);
        printArray(actual);
    }
    //        person[0] = new Person(345,"Peter","Schmidt", LocalDate.of(1975,02,28));
    //        person[1] = new Person(234,"Arthur","Mayer", LocalDate.of(1986,12,9));
    //        person[2] = new Person(123,"Michael","Ernst", LocalDate.of(1965,10,12));
    //        person[3] = new Person(456,"Inga","Kaul", LocalDate.of(1980,03,5));
    //        person[4] = new Person(666,"null","null",LocalDate.of(2000,8,8));

    @Test
    void getAllPersonsSortedByAge() {
        Iterable<Person> res = citizens.getAllPersonsSortedByAge();
        int age = -1;
        int count = 0;
        for (Person person : res) {
            count++;
            assertTrue(person.getAge() >= age);
            age = person.getAge();
        }
        assertEquals(5, count);
        printArray(res);
    }

    @Test
    void getAllPersonsSortedByLastName() {
        Iterable<Person> actual = citizens.getAllPersonsSortedByLastName();
        String name = "";
        int count = 0;
        for (Person person : actual) {
            count++;
            assertTrue(person.getLastName().compareTo(name) >= 0);
            name = person.getLastName();
        }
        assertEquals(5, count);
        printArray(actual);
    }

    @Test
    void size() {
        assertEquals(5, citizens.size());
        Person person1 = new Person(555,null,"",LocalDate.now());
        citizens.add(person1);
        assertEquals(6,citizens.size());
    }

    private static void printArray(Iterable<Person> arr){
        for (Object o : arr) {
            System.out.println(o);
        }
        System.out.println("------------------------------------");
    }
}