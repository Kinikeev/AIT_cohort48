package home_work_23;
    /*
       Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:

        - сумма всех элементов массива с нечетными индексами;
        - поиск элемента в массиве по его индексу; Разработайте тесты для этих методов.

        Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
        Подсчитайте, сколько в этом массиве оказалось:

        - положительных чисел;
        - отрицательных чисел;
        - четных чисел;
        - нулей.
        Оформите решение данной задачи методами и напишите для них тесты.
     */

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] a = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        int[] b = new int[]{6, -8, -1, 6, -2, -8, -9, 9, 0, -7};
        int[] c = new int[] {-5, 8, 7, -6, 8, -7, 7, 2, -8, 2};

        System.out.println("Task 1:");
        // сумма всех элементов массива с нечетными индексами;
        //System.out.println("Sum = " + sumAllElementsWithOddIndices(a));

        // поиск элемента в массиве по его индексу;
        //System.out.println("Element = " + findElementByIndex(a, 0));
        System.out.println("---------------------------------------------");
        System.out.println("Task 2:");

        //int[] randomArray = arrayOfRandomIntegers(10,-10,10);
        //System.out.println(Arrays.toString(randomArray));
        //System.out.println(findAverageValueAllEvenElements(randomArray));
        //System.out.println(findAverageValueAllEvenElements(a));
        //System.out.println(findAverageValueAllEvenElements(b));
        //stem.out.println(findAverageValueAllEvenElements(c));
        //System.out.println(positiveNumbers(a));
        //System.out.println(positiveNumbers(b));
        //System.out.println(positiveNumbers(c));
        //System.out.println(negativeNumbers(a));
        //System.out.println(negativeNumbers(b));
        //System.out.println(negativeNumbers(c));
        //System.out.println(evenNumbers(a));
        //System.out.println(evenNumbers(b));
        //System.out.println(evenNumbers(c));
        //System.out.println(zerosNumbers(a));
        //System.out.println(zerosNumbers(b));
        //System.out.println(zerosNumbers(c));


    } // End of main

    // print array
    public void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    // сумма всех элементов массива с нечетными индексами;
    // the sum of all elements of an array with odd indices;
    public int sumAllElementsWithOddIndices(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i += 2) {
            sum += array[i];
            System.out.print(array[i] + ", ");
        }
        System.out.println(" = " + sum);
        return sum;
    }

    // поиск элемента в массиве по его индексу;
    // search for an element in an array by its index;
    public int findElementByIndex(int[] array, int index) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (index < array.length)
                res = array[index];
        }
        return res;
    }

    // массив из случайных целых чисел в интервале
    // array of random integers
    public int[] arrayOfRandomIntegers(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * (to - from + 1) + from);
        }
        return array;
    }

    // определяем количество положительных чисел;
    public int positiveNumbers(int[] array) {
        int amountPositiveNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                amountPositiveNumbers++;
                //System.out.print(array[i] + ", ");
            }
        }
        //System.out.println(" -> Positive numbers");
        //System.out.println("Amount of positive numbers = " + amountPositiveNumbers);
        return amountPositiveNumbers;
    }

    // определяем количество отрицательных чисел;
    public int negativeNumbers(int[] array) {
        int amountNegativeNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                amountNegativeNumbers++;
                //System.out.print(array[i] + ", ");
            }
        }
        //System.out.println("   -> Negative numbers");
        //System.out.println("Amount of negative numbers = " + amountNegativeNumbers);
        return amountNegativeNumbers;
    }

    // определяем количество четных чисел;
    public int evenNumbers(int[] array) {
        int amountEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                amountEvenNumbers++;
                //System.out.print(array[i] + ", ");
            }
        }
        //System.out.println(" -> even numbers");
        //System.out.println("Amount of even numbers = " + amountEvenNumbers);
        return amountEvenNumbers;
    }

    // определяем количество нулей
    public int zerosNumbers(int[] array) {
        int amountZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                amountZeros++;
                //System.out.print(array[i] + ", ");
            }
            //System.out.println(" -> Zeros");
            //System.out.println("Amount of zeros = " + amountZeros);
        }
        return amountZeros;
    }

    // Find the average value for all even elements of the array.
    public int findAverageValueAllEvenElements (int[] array){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){              // Проверяем, является ли элемент четным
                sum += array[i];
                count ++;
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        int average = sum / count;
        //System.out.println("The average value for all even elements of the array = " + average);
        return average;
    }
} // End of class
