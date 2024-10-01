package class_work_39.treeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNumbers {

    // загрузить в TreeSet 10 случайных целых чисел и понять:
    // - это Set? - есть ли в нем порядок?

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        // add elements

        numbers.add(8);
        numbers.add(20);
        numbers.add(8);
        numbers.add(22);
        numbers.add(82);
        numbers.add(30);
        numbers.add(81);
        numbers.add(20);

        System.out.println(numbers.size());

        for (Integer i : numbers){
            System.out.println(i);
        }


    }
}
