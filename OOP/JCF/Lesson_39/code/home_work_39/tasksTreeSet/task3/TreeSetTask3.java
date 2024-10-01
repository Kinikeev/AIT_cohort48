package home_work_39.tasksTreeSet.task3;

// 2. Создайте `TreeSet`, который хранит объекты `Person`.
// 3. Добавьте несколько объектов `Person` с различными именами и возрастами в `TreeSet`.
// 4. Выведите все объекты `Person` в отсортированном порядке по возрасту.
// 5. Найдите и выведите самого молодого и самого старого человека в `TreeSet`.

import java.util.TreeSet;

public class TreeSetTask3 {

    public static void main(String[] args) {

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("Аня", 25));
        people.add(new Person("Борис", 30));
        people.add(new Person("Катя", 22));
        people.add(new Person("Дима", 35));

        // Вывод всех объектов Person
        System.out.println("Персоны: " + people);

        // Самый молодой и самый старый человек
        System.out.println("Самый молодой: " + people.first());
        System.out.println("Самый старый: " + people.last());

    } // end of main

} // end of class
