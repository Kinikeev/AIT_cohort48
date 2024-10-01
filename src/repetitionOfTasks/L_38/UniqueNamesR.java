package repetitionOfTasks.L_38;

// Задача 1. Создайте список из 20 имен людей с повторениями. Удалите из списка все повторяющиеся имена.
// Выведите список уникальных имен в алфавитном порядке.

import java.util.*;

public class UniqueNamesR {
    public static void main(String[] args) {

        // 1. Мы создаем ArrayList.
        List<String> names = new ArrayList<>();

        // Добавляем в лист имена, некоторые из которых повторяются.

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

        // Проверяем количество имён
        System.out.println("Size of names = " + names.size());

        // 2. Используем HashSet для удаления дубликатов
        Set<String> uniqueNames = new HashSet<>(names);

        // 3. Перемещаем уникальные имена в ArrayList для сортировки
        List<String> uniqueNamesList = new ArrayList<>(uniqueNames);

        // 4. Сортируем уникальные имена в алфавитном порядке
        Collections.sort(uniqueNamesList);

        // 5. Выводим уникальные имена
        System.out.println("Уникальные имена в алфавитном порядке:");
        System.out.println(uniqueNamesList);
        for (String str : uniqueNamesList){
            System.out.println(str);
        }

        // Проверяем количество уникальных
        System.out.println("Size of unique names = " + uniqueNamesList.size());

    } // end of main

} // end of class
