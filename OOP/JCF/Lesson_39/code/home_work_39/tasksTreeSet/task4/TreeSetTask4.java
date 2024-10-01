package home_work_39.tasksTreeSet.task4;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTask4 {
    //     Задание 4: Обратный порядок
    // 1. Создайте `TreeSet` для хранения строк, который будет отсортирован в обратном алфавитном порядке.
    // 2. Добавьте в него строки: “слон“, “тигр“, “лев“, “пантера“, “гепард“.
    // 3. Выведите все элементы на экран.
    // 4. Найдите строку, которая идет сразу после “тигр” в порядке убывания.
    public static void main(String[] args) {

        // reverse Order - Обратный порядок
        TreeSet<String> animals = new TreeSet<>(Comparator.reverseOrder());
        animals.add("слон");
        animals.add("тигр");
        animals.add("лев");
        animals.add("пантера");
        animals.add("гепард");

        System.out.println(animals);

        // 4. Найдите строку, которая идет сразу после “тигр” в порядке убывания.
        System.out.println("После слона идёт " + animals.higher("слон")); // higher - выше

    } // end of main

} // end of class
