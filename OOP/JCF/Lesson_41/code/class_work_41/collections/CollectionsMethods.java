package class_work_41.collections;

import java.util.*;

public class CollectionsMethods {

    // - Создайте список известных вам фруктов.
    //- Выполните поиск имеющегося и отсутствующего элемента списка.
    //- Отсортируйте этот список по алфавиту в прямом и обратном порядке.
    //- Проверьте работу методов:
    //  - max(Collection<?> coll)
    //  - min(Collection<?> coll), что они возвращают?

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("kiwi");
        fruits.add("grapefruit");
        fruits.add("grape");
        fruits.add("apricot");
        fruits.add("peach");

        System.out.println(fruits);
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        Collections.sort(fruits);
        System.out.println("------------- после сортировки -----------------------");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        Comparator<String> fruitComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return - o1.compareTo(o2);
            }
        };
        Collections.sort(fruits,fruitComparator);
        System.out.println(fruits);

        System.out.println("------------- max -----------------------");

        String max = Collections.max(fruits);
        System.out.println(max);

        String max1 = Collections.max(fruits,fruitComparator);
        System.out.println(max1);

        System.out.println("------------- shuffle - перемешиваем -----------------------");
        Collections.shuffle(fruits);
        System.out.println(fruits);

        System.out.println("------------- reverse - разворачиваем -----------------------");
        Collections.reverse(fruits);
        System.out.println(fruits);

    } // end of main


} // end of class
