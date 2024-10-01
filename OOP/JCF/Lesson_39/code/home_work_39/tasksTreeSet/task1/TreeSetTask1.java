package home_work_39.tasksTreeSet.task1;

import java.util.TreeSet;

public class TreeSetTask1 {

    // ### Задание 1: Создание и базовые операции
    // 1. Создайте `TreeSet` и добавьте в него элементы: “яблоко“, “банан“, “апельсин“, “груша“.
    // 2. Выведите все элементы на экран.
    // 3. Удалите элемент “банан” и снова выведите все элементы.
    // 4. Проверьте, существует ли элемент “яблоко” в `TreeSet`.
    // 5. Выведите первый и последний элементы в множестве.

    public static void main(String[] args) {

        // 1 Создайте `TreeSet` и добавьте в него элементы: “яблоко“, “банан“, “апельсин“, “груша“.
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("яблоко");
        fruits.add("банан");
        fruits.add("апельсин");
        fruits.add("груша");

        // 2 Выведите все элементы на экран.
        System.out.println(fruits);

        // 3 Удалите элемент “банан” и снова выведите все элементы.
        fruits.remove("банан");
        System.out.println(fruits);

        // 4 Проверьте, существует ли элемент “яблоко” в `TreeSet`.
        System.out.println(fruits.contains("яблоко")); // true
        System.out.println(fruits.contains("банан"));  // false

        // 5 Выведите первый и последний элементы в множестве.
        System.out.println("Первый элемент: " + fruits.first());
        System.out.println("Последний элемент: " + fruits.last());

    } // end of main

} // end of class
