package class_work_42.primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    // Задание 1. Отобрать из массива целых чисел только простые числа.

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                List.of(10,11,12,13,14,15,16,17,18,19,20)
        ); // 11,13,17,19

        // printing
        System.out.println("Numbers:");
        printNumbers(numbers);

        System.out.println("Prime numbers:");

        List<Integer> primeNumbers = primeNumbers(numbers);

        numbers.stream()
                .filter(n-> isPrime(n)) //
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        printNumbers(primeNumbers);


    } // end of main

    private static List<Integer> primeNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> isPrime(n))
                .toList();
    }

    private static boolean isPrime(Integer n) {
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    private static void printNumbers(List<Integer> numbers) {
        numbers.stream()
                .forEach(n -> System.out.print(n + " | "));
        System.out.println();
    }

} // end of class
