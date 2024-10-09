package class_work_41.primitive_stream;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    // // получить случайные целые числа в виде потока

    private static final int N_NUMBER = 10;
    private static final int MIN = 1;
    private static final int MAX = 10;

    public static void main(String[] args) {

        Stream<Integer> numbers = getRandomNumbers(N_NUMBER,MIN,MAX);
        numbers.forEach(System.out::println);
        System.out.println("------------------ sum of numbers ----------------------------");
        int sum = getRandomNumbers(N_NUMBER,MIN,MAX)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum = " + sum);
        System.out.println("-------------- Summary statistics ---------------------");
        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBER,MIN,MAX)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println("Min = " + intStat.getMin());
        System.out.println("Max = " + intStat.getMax());
        System.out.println("Average = " + intStat.getAverage());
        System.out.println("Sum = " + intStat.getSum());
        System.out.println("Count = " + intStat.getCount());

        // DoubleSummaryStatistics doubleStat = ... - по аналогии попробовать для типа double

        System.out.println("-------------- Lottery 6 from 49 ---------------------");

        new Random()
                .ints(1,50)
                .distinct()   // исключает повторы
                .limit(6)
                .forEach(System.out::println);

        System.out.println("-------------- Shuffle перемешиваем ---------------------");

        int[] array = {10,20,30,40,50};
        new Random()
                .ints(0, array.length)
                .distinct()
                .limit(array.length)
                .forEach(i -> System.out.print(array[i] + " | "));




    } // end of main

    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min,max)
                .peek(System.out::println)
                .limit(nNumber)
                .boxed();
    }



} // end of class
