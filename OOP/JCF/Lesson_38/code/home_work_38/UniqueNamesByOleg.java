package home_work_38;

import java.util.*;

public class UniqueNamesByOleg {

/*     code by Oleg M

Задача 1. Создайте список из 20 имен людей с повторениями. Удалите из списка все повторяющиеся имена. Выведите список уникальных имен в алфавитном порядке.
Условия: Программа должна использовать HashSet для удаления дубликатов.
Подсказка: Для сортировки уникальных слов можно использовать класс ArrayList и метод Collections.sort().
 */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Emily");
        names.add("Michael");
        names.add("Sarah");
        names.add("David");
        names.add("Jessica");
        names.add("James");
        names.add("Emma");
        names.add("John");    // repeat
        names.add("Michael"); // repeat
        names.add("Emily");   // repeat
        names.add("David");   // repeat
        names.add("Jessica"); // repeat
        names.add("Sarah");   // repeat
        names.add("Emma");    // repeat
        names.add("James");   // repeat
        names.add("Michael"); // repeat 2
        names.add("Sarah");   // repeat 2
        names.add("Emily");   // repeat 2
        names.add("John");    // repeat 2
        // print
        printArray(names);
        System.out.println("-------------------------------------------------------");
        //copy to hash set to get a list of unique names
        Set<String> uniqueNames = new HashSet<>(names);
        //copy back to array list for sorting
        names.clear();
        names.addAll(uniqueNames);
        Collections.sort(names);
        printArray(names);
    }
    private static <E> void printArray(List<E> list) {
        for (E e : list) {
            System.out.println(e);
        }

    } // end of main

} // end of class
