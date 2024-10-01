package home_work_39.citizens.dao;

import home_work_39.citizens.model.Person;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CitizensSetIml implements Citizens{

    // fields
    private TreeSet<Person> idList;
    private TreeSet<Person> lastNameList;
    private TreeSet<Person> ageList;

    // comparators
    private static Comparator<Person> lastNameComparator = (p1,p2) -> {
        int res = p1.getLastName().compareTo(p2.getLastName());
        return res!= 0 ? res : Integer.compare(p1.getId(), p2.getId());
    };
    private static Comparator<Person> ageComparator = (p1,p2) -> {
        int res = Integer.compare(p1.getAge(), p2.getAge());
        return res != 0 ? res : Integer.compare(p1.getId(), p2.getId());
    };

    // constructors
    public CitizensSetIml() {
        idList = new TreeSet<>();
        lastNameList = new TreeSet<>(lastNameComparator);
        ageList = new TreeSet<>(ageComparator);
    }
    public CitizensSetIml(List<Person> citizens){
        this();
        citizens.forEach(person -> add(person));
    }
//    В Java синтаксис Person... citizens используется для объявления переменного числа аргументов (или varargs),
//    что позволяет передавать неопределенное количество аргументов в метод или конструктор.
//    Что такое ... (varargs)?
//    Механизм varargs (...) позволяет передавать в метод или конструктор переменное количество аргументов одного
//    и того же типа без необходимости создания массива вручную.
//    Аргументы, переданные в таком формате, автоматически собираются в массив.
/*
    public CitizensSetImpl(Person... citizens) { // varargs
        this();
        for (Person p : citizens) {
            add(p);
        }
    }
 */

    @Override
    // O(1) + 3 * O(log(n)) = O(log(n))
    public boolean add(Person person) {
        return person != null && idList.add(person) && lastNameList.add(person) && ageList.add(person);
    }

    @Override
    // 4 * O(log(n)) = O(log(n))
    public boolean remove(int id) {
        Person victum = find(id);
        return victum != null && idList.remove(victum) && lastNameList.remove(victum) && ageList.remove(victum);
    }

    @Override
    // O(log(n))
    public Person find(int id) {
        Person pattern = new Person(id,null,null,null);
        Person person = idList.ceiling(pattern);
        return pattern.equals(person) ? person : null;
    }

    @Override
    // O(log(n))
    public Iterable<Person> find(int minAge, int maxAge) {
        LocalDate now = LocalDate.now();
        Person from = new Person(Integer.MIN_VALUE,null,null, now.minusYears(minAge));
        Person to = new Person(Integer.MAX_VALUE,null,null,now.minusYears(maxAge));
        return ageList.subSet(from,to);

    }

    @Override
    // 3 * O(log(n)) = O(log(n))
    public Iterable<Person> find(String lastName) {
        Person from = new Person(idList.first().getId(),null,lastName,null);
        Person to = new Person(idList.last().getId(),null,lastName,null);
        return lastNameList.subSet(from,true,to,true);
    }

    @Override
    // O(1)
    public Iterable<Person> getAllPersonsSortedById() {
        return idList;
    }

    @Override
    // O(1)
    public Iterable<Person> getAllPersonsSortedByAge() {
        return ageList;
    }

    @Override
    // O(1)
    public Iterable<Person> getAllPersonsSortedByLastName() {
        return lastNameList;
    }

    @Override
    // O(1)
    public int size() {
        return idList.size();
    }
}
