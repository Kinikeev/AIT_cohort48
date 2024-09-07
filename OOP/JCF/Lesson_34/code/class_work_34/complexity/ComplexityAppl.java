package class_work_34.complexity;

import java.util.Arrays;

public class ComplexityAppl {
    public static void main(String[] args) {
        // заведем простой массив целых чисел
// будем выполнять с ним различные операции (вычисление среднего, сложение элементов, поиск элемента,
// поиск мин и макс, сортировка)
// оценим вычислительную сложность алгоритма

    int[] arr = {-24, 7, -67, 15, 8, 93, 1, 10};
               //-24, -67, 7, 8, 15, 1, 93  - 3 раза
               //-67, -24, 7, 8, 1, 15, 93  - 2 раза
               //-67, -24, 7, 1, 8, 15, 93  - 1 раз
               //-67, -24, 1, 7, 8, 15, 93  - 1 раз
    // вычисление среднего значения
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;

        System.out.println("---------------------------------------------------------------");

        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------------------------------");
        int index = Arrays.binarySearch(arr, -67);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 93);
        System.out.println(index);
        index = Arrays.binarySearch(arr, -100);
        System.out.println(index);
        // O(log(n)) - это логарифмическая сложность (самая низкая!)
        // при 8 элементах - 3 итерации
        // при 16 элементах - 4 итерации
        // при 1024 элементах - 10 итераций
        // O(log(n)) - это логарифмическая сложность (самая низкая!)

        // сортировка методом BubbleSort сравниваем по 2 элемента, i - й с i + 1 -ым
        int count = 0;
        int count_j = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            count = count + arr.length - 1 - i;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {
                    // переставим элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count_j++;
                }
            }

        }
        //System.out.println(Arrays.toString(arr));
        System.out.println(count);
        System.out.println(count_j);
        // это квадратичная сложность O(n^2))

    }
}
