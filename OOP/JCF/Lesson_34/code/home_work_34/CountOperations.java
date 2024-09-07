package home_work_34;

import java.util.Arrays;
    //Задача 1. Дополните метод bubbleSort счетчиком, который позволяет узнать, сколько операций
    // было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которыхсодержатся
    // 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000.
    // Как растет количество операций при сортировке при росте количества элементов массива?

public class CountOperations {
    public static void main(String[] args) {

        int[] array10 = randomArray(10,0,1000);
        System.out.println(Arrays.toString(array10));
        bubbleSort(array10);
        System.out.println(Arrays.toString(array10));
        System.out.println("-------------------------------------------------------------------------------------------");

        int[] array100 = randomArray(100,0,1000);
        System.out.println(Arrays.toString(array100));
        bubbleSort(array100);
        System.out.println(Arrays.toString(array100));
        System.out.println("-------------------------------------------------------------------------------------------");

        int[] array1000 = randomArray(1000,0,1000);
        System.out.println(Arrays.toString(array1000));
        bubbleSort(array1000);
        System.out.println(Arrays.toString(array1000));
        System.out.println("-------------------------------------------------------------------------------------------");

        // Количество операций при сортировке при росте количества элементов массива растет в 100 раз!!!

    } // End of main

    public static int[] randomArray (int length,int from,int to){
        int[] arr = new int[length];
        for (int i = 0; i < arr.length - 1; i++) {
            int random = (int) (Math.random() * (to - from + 1) + from);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == random){
                    random = (int) (Math.random() * (to - from + 1) + from);
                    j = 0;
                }
            }
            arr[i] = random;
        }
        return arr;
    }

    public static void bubbleSort(int[] arr){
        // сортировка методом BubbleSort сравниваем по 2 элемента, i - й с i + 1 -ым
        int countChange = 0;
        int countOperations = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {

            countOperations = countOperations + arr.length - 1 - i;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    // переставим элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    countChange++;
                }
            }
        }
        System.out.println("Count operations = " + countOperations);
        System.out.println("Count change = " + countChange);
        // это квадратичная сложность O(n^2))
    }

} // End of class
