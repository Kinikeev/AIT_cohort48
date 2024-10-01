package home_work_39.tasksTreeSet.task2;

import java.util.TreeSet;

public class TreeSetTask2 {

    // ### Задание 2: Работа с числами
    // 1. Создайте `TreeSet` для хранения целых чисел.
    // 2. Добавьте в него числа: 10, 20, 5, 15, 25, 30, 2.
    // 3. Выведите все элементы на экран.
    // 4. Найдите и выведите на экран:
    //    - Самое маленькое число, большее или равное 18.
    //    - Самое большое число, меньшее или равное 18.
    // 5. Удалите все элементы, которые меньше 10, и снова выведите все элементы.

    public static void main(String[] args) {

        // 1 Создайте `TreeSet` для хранения целых чисел.
        TreeSet<Integer> numbers = new TreeSet<>();

        // 2 Добавьте в него числа: 10, 20, 5, 15, 25, 30, 2.
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(30);
        numbers.add(2);

        // 3 Выведите все элементы на экран.
        for (Integer num : numbers){
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println(numbers);

        // 4 Найдите и выведите на экран:
        //    - Самое маленькое число, большее или равное 18.
        System.out.println("Самое маленькое число >= 18: " + numbers.ceiling(18));
        //    - Самое большое число, меньшее или равное 18.
        System.out.println("Самое большое число <= 18: " + numbers.floor(18));

        // 5. Удалите все элементы, которые меньше 10, и снова выведите все элементы.
        numbers.removeIf(n -> n < 10);
        System.out.println("После удаления < 10: " + numbers);

    } // end of main

} // end of class
