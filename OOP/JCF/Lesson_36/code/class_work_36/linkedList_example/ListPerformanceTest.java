package class_work_36.linkedList_example;

import java.util.*;

public class ListPerformanceTest {

    // заполнить список случайными целыми числами

    private static final int N_NUMBERS = 500_000; // отвечает за количество чисел в листе
    // константы пишутся с большими буквами
    private static final Random random = new Random(); // счётчик случайных чисел
    // Объект random создастся за счёт конструктора, который есть в классе Random.
    private static final int MIN = 10; // константа минимума
    private static final int MAX = 20; // константа максимума (диапозон случайных чисел от 10 до 20)

    public static void main(String[] args) {

        // будем сравнивать циклы:
        // выгодно начинать с интерфейса (List<Integer> list) от которого наследуются методы. На основании
        // которых, происходит реализация
        // и потом писать ему реализацию (new LinkedList<>();)
        List<Integer> list = new LinkedList<>();
        fillCollection(list);
                                                    // loop - цикл
        System.out.println("======================== for each loop =============================");
        // За какое время подсчитает сумму всех чисел
        long t1 = System.currentTimeMillis(); //  подсчёт времени - начало цикла
        int sum = 0;
        // при помощи for each конструируем цикл
        for (Integer num : list){
            sum += num;
        }
        long t2 = System.currentTimeMillis(); // конец цикла
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2 - t1)); // Duration (дюрэйшен) - продолжительность

        System.out.println("======================== iterator ===============================");
        t1 = System.currentTimeMillis();
        sum = 0;
        // берём итератор, который будет работать с целыми числами
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){  // пока что есть в листе
            sum += iterator.next();  // давай сюда
        }
        t2 = System.currentTimeMillis(); // конец цикла
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2 - t1)); // Duration (дюрэйшен) - продолжительность

        System.out.println("======================== for i loop =============================");
        t1 = System.currentTimeMillis();
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        t2 = System.currentTimeMillis(); // конец цикла
        System.out.println("Sum = " + sum);
        System.out.println("Duration = " + (t2 - t1)); // Duration (дюрэйшен) - продолжительность

    } // end of main

    private static void fillCollection(List<Integer> list) {
        // (List<Integer> list) - это то, что нам надо заполнить.
        // заполнять Collection c for each нельзя, только c for i.
        // for each у нас только для перебора (итерирования), максимум для удаления по условию
        for (int i = 0; i < N_NUMBERS; i++) {     //      начало      предел
            // для заполнения выбираем random.nextInt(int origin, int bound)- от и до
            list.add(random.nextInt(MIN,MAX));
        }
    }

    private static void printList(List<Integer> list) {
        for (Integer i : list){
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("========================================================================");
    }

} // end of class
