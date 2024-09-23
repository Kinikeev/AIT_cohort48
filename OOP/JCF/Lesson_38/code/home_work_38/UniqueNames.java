package home_work_38;

// Задача 1. Создайте список из 20 имен людей с повторениями. Удалите из списка все повторяющиеся имена.
// Выведите список уникальных имен в алфавитном порядке.

//Условия: Программа должна использовать HashSet для удаления дубликатов.
// Подсказка: Для сортировки уникальных слов можно использовать класс ArrayList и метод Collections.sort().

import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {

        // 1. Мы создаем ArrayList и добавляем имена, некоторые из которых повторяются.

        List<String> names = new ArrayList<>();

        names.add("Иван");
        names.add("Мария");
        names.add("Петр");
        names.add("Анна");
        names.add("Иван"); // Повторение
        names.add("Светлана");
        names.add("Петр"); // Повторение
        names.add("Дмитрий");
        names.add("Ольга");
        names.add("Саша");
        names.add("Анна"); // Повторение
        names.add("Павел");
        names.add("Ирина");
        names.add("Мария"); // Повторение
        names.add("Татьяна");
        names.add("Алексей");
        names.add("Елена");
        names.add("Максим");
        names.add("Иван"); // Повторение
        names.add("Анастасия");

        System.out.println("Names = " + names.size());  // Проверяем количество

        // 2. Используем HashSet для удаления дубликатов
        Set<String> uniqueNames = new HashSet<>(names);

        // 3. Перемещаем уникальные имена в ArrayList для сортировки
        List<String> uniqueNamesList = new ArrayList<>(uniqueNames);

        // 4. Сортируем уникальные имена в алфавитном порядке
        Collections.sort(uniqueNamesList);

        // 5. Выводим уникальные имена
        System.out.println("Уникальные имена в алфавитном порядке:");
        for (String name : uniqueNamesList){
            System.out.println(name);
        }

        System.out.println("Unique names =  " + uniqueNamesList.size());  // Проверяем количество уникальных

    } // end of main

} // end of class
