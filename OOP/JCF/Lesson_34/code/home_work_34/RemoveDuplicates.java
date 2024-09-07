package home_work_34;

    // Задача 4.(*) Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10.
    // Удалите из полученного списка дубликаты.

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 20 ; i++) {
            int random =  (int) (Math.random() * 21);
            arrayList.add(random);
        }
        System.out.println("Список с дубликатами: " + arrayList);

        // Удаляем дубликаты, используя HashSet
        HashSet<Integer> set = new HashSet<>(arrayList); // HashSet, автоматически удаляет дубликаты.
        ArrayList<Integer> uniqueList = new ArrayList<>(set); // Затем, создаем новый ArrayList,
                                                              // чтобы сохранить уникальные значения.

        System.out.println("Список без дубликатов: " + uniqueList);

    } // End of main

} // End of class
