package home_work_39.citizens.dao;

import home_work_39.citizens.model.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CitizensImpl implements Citizens {

    // В проекте Citizens, создать // Comparators
    // private static Comparator<Person> lastNameComparator;
    // private static Comparator<Person> ageComparator;

    // статические переменные класса
    private static Comparator<Person> lastNameComparator;
    private static Comparator<Person> ageComparator;

    static {
        lastNameComparator = (p1, p2) -> {
            int res = p1.getLastName().compareTo(p2.getLastName()); // по фамилии
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
        ageComparator = (p1, p2) -> {
            int res = Integer.compare(p1.getAge(), p2.getAge()); // по возрасту
            return res != 0 ? res : Integer.compare(p1.getId(), p2.getId()); // по id
        };
    }

    // fields
    private List<Person> idList;
    private List<Person> lastNameList;
    private List<Person> ageList;

    public CitizensImpl() {
        idList = new ArrayList<>();
        lastNameList = new ArrayList<>();
        ageList = new ArrayList<>();
    }

    public CitizensImpl(List<Person> citizens) {
        this();
        citizens.forEach(p -> add(p));
    }

    // O(n) - ???
    @Override
    public boolean add(Person person) {
        // не добавляем null
        if (person == null) {
            return false;
        }
        // не добавляем дубликат
        int index = Collections.binarySearch(idList, person); // индекс нашелся
        if (index >= 0) { // положительный, значит такой элемент уже есть
            return false;
        }
        index = -index - 1; // если index = -5, то он становится = 4
        idList.add(index, person); // добавляем на индекс 4 новую персону
        // повторяем это для других листов, так как у этой персоны в каждом листе свое место, свой индекс
        index = Collections.binarySearch(ageList, person, ageComparator);
        index = index >= 0 ? index : - index - 1;
        ageList.add(index, person);
        index = Collections.binarySearch(lastNameList, person, lastNameComparator);
        index = index >= 0 ? index : -index - 1;
        lastNameList.add(index, person);
        return true;
    }

    // O(n)
    @Override
    public boolean remove(int id) {
        Person victim = find(id);
        if (victim == null) {
            return false;
        }
        idList.remove(victim);
        ageList.remove(victim);
        lastNameList.remove(victim);
        return true;
    }

    // O(log(n))
    @Override
    public Person find(int id) {
        Person pattern = new Person(id, "", "", LocalDate.now());
        int index = Collections.binarySearch(idList, pattern);
        return index < 0 ? null : idList.get(index);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", "", now.minusYears(minAge));
        int from = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", "", now.minusYears(maxAge));
        int to = -Collections.binarySearch(ageList, pattern, ageComparator) - 1;
        return ageList.subList(from, to);
    }

    // O(log(n))
    @Override
    public Iterable<Person> find(String lastName) {
        LocalDate now = LocalDate.now();
        Person pattern = new Person(Integer.MIN_VALUE, "", lastName, now);
        int from = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        pattern = new Person(Integer.MAX_VALUE, "", lastName, now);
        int to = -Collections.binarySearch(lastNameList, pattern, lastNameComparator) - 1;
        return lastNameList.subList(from, to);
    }
    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }
    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }
    // O(1)
    @Override
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return null;
    }
    // O(1)
    @Override
    public int size() {
        return idList.size();
    }

} // end of class
