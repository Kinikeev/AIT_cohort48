package home_work_39.tasksTreeSet.task3;

//     Задание 3: Работа с пользовательскими объектами
// 1. Создайте класс `Person` с полями `name` (имя) и `age` (возраст). Реализуйте интерфейс `Comparable`,
//    чтобы объекты класса `Person` сравнивались по возрасту.
// 2. Создайте `TreeSet`, который хранит объекты `Person`.
// 3. Добавьте несколько объектов `Person` с различными именами и возрастами в `TreeSet`.
// 4. Выведите все объекты `Person` в отсортированном порядке по возрасту.
// 5. Найдите и выведите самого молодого и самого старого человека в `TreeSet`.

public class Person implements Comparable<Person> {

    // fields
    String name;
    int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age,o.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

} // end of class
