package home_work_39.citizens.test;

import home_work_39.citizens.dao.Citizens;
import home_work_39.citizens.dao.CitizensSetIml;
import home_work_39.citizens.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizensSetImlTest {

    Citizens citizens;
    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        citizens = new CitizensSetIml(
                List.of(new Person(1, "Peter", "Jackson", now.minusYears(23)),
                        new Person(2, "John", "Smith", now.minusYears(20)),
                        new Person(3, "Mary", "Jackson", now.minusYears(20)),
                        new Person(4, "Rabindranate", "Anand", now.minusYears(25)))
        );
    }

    @Test
    void testCitizensImplListOfPerson() {
        citizens = new CitizensSetIml(List.of(new Person(1, "Peter", "Jackson", now.minusYears(23))
                , new Person(1, "Peter", "Jackson", now.minusYears(23))));
        assertEquals(1, citizens.size());
    }

    @Test
    void add() {
        assertEquals(4,citizens.size());
        assertFalse(citizens.add(null));
        assertFalse(citizens.add(new Person(2, "John", "Smith", now.minusYears(20))));
        assertEquals(4, citizens.size());
        assertTrue(citizens.add(new Person(5, "John", "Smith", now.minusYears(20))));
        assertEquals(5, citizens.size());
    }

    @Test
    void remove() {
        assertFalse(citizens.remove(5));
        assertEquals(4, citizens.size());
        assertTrue(citizens.remove(2));
        assertEquals(3, citizens.size());
    }

    @Test
    void findById() {
        Person person = citizens.find(1);
        assertEquals(1, person.getId());
        assertEquals("Peter", person.getFirstName());
        assertEquals("Jackson", person.getLastName());
        assertEquals(23, person.getAge());
        assertNull(citizens.find(5));
    }

    @Test
    void testFindByAge() {
        Iterable<Person> res = citizens.find(20, 23);
//        for (Person person : res) {
//            assertTrue(person.getAge() >= 20 && person.getAge() <= 23);
//        }
        res.forEach(p -> assertTrue(p.getAge() >= 20 && p.getAge() <= 23));
    }

    @Test
    void testFindByLastName() {
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
    void getAllPersonsSortedById() {
        Iterable<Person> actual = citizens.getAllPersonsSortedById();
        Iterable<Person> expected = List.of(new Person(1, "Peter", "Jackson", now.minusYears(23)),
                new Person(2, "John", "Smith", now.minusYears(20)),
                new Person(3, "Mary", "Jackson", now.minusYears(20)),
                new Person(4, "Rabindranate", "Anand", now.minusYears(25)));
        assertIterableEquals(expected, actual);
    }

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
        assertEquals(4, count);
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
        assertEquals(4, count);
        printArray(actual);
    }

    @Test
    void size() {
        assertEquals(4, citizens.size());
    }
    private static void printArray(Iterable<Person> arr){
        for (Person o : arr) {
            System.out.println(o);
        }
        System.out.println("------------------------------------");
    }
}