package home_work_34;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {

        // 1. add elements to the list, using the add() method:
        // 1. добавьте элементы в список, используя метод add():
        ArrayList<String> cars = new ArrayList<>(); // Creating an ArrayList object
        System.out.println("1. Creating and add an ArrayList objects:");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("VW");
        System.out.println(cars);
        System.out.println("----------------------------------------------------------------------");

        // 2. add an item at a specified position by referring to the index number:
        // 2. добавить элемент в указанную позицию, ссылаясь на номер индекса:
        System.out.println("2. Adding an element by the index number:");
        System.out.println("Before - " + cars);
        cars.add(2,"Mazda");
        cars.add(1,"Volvo");
        System.out.println("After - " + cars);
        System.out.println("----------------------------------------------------------------------");

        // 3. To access an element in the ArrayList, using the get() method and referring to the index number:
        // 3. Чтобы получить доступ к элементу в ArrayList, используйте метод get() и обратитесь к номеру индекса:
        System.out.println("3. Access element by index:");
        System.out.println(cars);
        System.out.println("cars.get(0) -> " + cars.get(0));
        System.out.println("cars.get(3) -> " + cars.get(3));
        System.out.println("----------------------------------------------------------------------");

        // 4. modify an element, using the set() method by the index number:
        // 4. изменить элемент, используя метод set() по номеру индекса:
        System.out.println("4. Change an item (element):");
        System.out.println("Before - " + cars);
        cars.set(4,"Toyota");
        System.out.println("cars.set(4,\"Toyota\");");
        System.out.println("After - " + cars);
        System.out.println("----------------------------------------------------------------------");

        // 5. remove an element, use the remove() method by the index number:
        // 5. удалить элемент, используйте метод remove() по номеру индекса:
        System.out.println("5. Remove an item (element):");
        System.out.println("Before - " + cars);
        cars.remove(1);
        System.out.println("cars.remove(1);");
        System.out.println("After - " + cars);
        System.out.println("----------------------------------------------------------------------");

        // 6. find out how many elements an ArrayList have, use the size method:
        // 6. Чтобы узнать, сколько элементов содержит ArrayList, используйте метод size:
        System.out.println("6. ArrayList size (array.length):");
        System.out.println(cars);
        cars.size();
        System.out.println("cars.size();");
        System.out.println("cars.size = " + cars.size());
        System.out.println("----------------------------------------------------------------------");

        // 7. remove all the elements in the ArrayList, use the clear() method:
        // 7. удалите все элементы в ArrayList, используйте метод clear():
        System.out.println("7. Remove all elements:");
        System.out.println("Before - " + cars);
        cars.clear();
        System.out.println("cars.clear();");
        System.out.println("After - " + cars);
        System.out.println("----------------------------------------------------------------------");

        // 8. Loop through the elements of an ArrayList with a for loop, and use the size() method
        //    to specify how many times the loop should run:
        // 8. Пройдитесь по элементам ArrayList с помощью цикла for и используйте метод size(),
        //    чтобы указать, сколько раз должен выполняться цикл:
        System.out.println("8. Loop through an ArrayList (for):");
        ArrayList<String> cars1 = new ArrayList<>();
        cars1.add("Volvo");
        cars1.add("Ford");
        cars1.add("Mazda");
        cars1.add("VW");
        System.out.println(cars1);
        for (int i = 0; i < cars1.size(); i++) {
            System.out.println(cars1.get(i));
        }
        System.out.println("----------------------------------------------------------------------");

        // 9. You can also loop through an ArrayList with the for-each loop:
        // 9. Вы также можете выполнить цикл по ArrayList с помощью цикла for-each:
        System.out.println("9. Loop through an ArrayList (for-each):");
        System.out.println(cars1);
        for (String i : cars1){
            System.out.println(i);
        }

        // 10. Sort an ArrayList of Strings:
        System.out.println("10. Sort an ArrayList of Strings:");
        System.out.println("Before - " + cars1);
        Collections.sort(cars1);
        System.out.println("Collections.sort(cars1);");
        System.out.println("After - " + cars1);
        System.out.println("----------------------------------------------------------------------");

    } // End of main

} // End of class