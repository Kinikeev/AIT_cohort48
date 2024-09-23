package class_work_34.complexity.i_list.model;

import java.util.ArrayList;

public class IListAppl {
    public static void main(String[] args) {

        // список с целыми числами
        IList<Integer> listOfAges = new IListImpl<>();

        listOfAges.add(38);
        listOfAges.add(41);
        listOfAges.add(31);
        listOfAges.add(32);
        listOfAges.add(24);
        listOfAges.add(60);

        System.out.println(listOfAges.size()); // 6
        System.out.println(listOfAges.isEmpty()); // false
        System.out.println(listOfAges.indexOf(32)); // 3
        System.out.println(listOfAges.size()); // 6

        listOfAges.remove(5);
        System.out.println(listOfAges);

        for (Integer i : listOfAges){
            System.out.print(i + " | ");
        }
        System.out.println();

        listOfAges.remove((Integer)38);

        for (Integer i : listOfAges){
            System.out.print(i + " | ");
        }
        System.out.println();

        // заполняем числами
        for (int i = 0; i < 150; i++) {
            listOfAges.add(i * 10);
        }
        // печатаем
        for (Integer i : listOfAges) {
            System.out.print(i + " | ");
        }
        System.out.println();

        // теперь со String
        IList<String> listOfNames = new IListImpl<>();
        listOfNames.add("Oleg");
        listOfNames.add("Juri");
        listOfNames.add("Denis");
        listOfNames.add("Sergej");
        listOfNames.add("Farangiz");
        listOfNames.add("Konstantin");

        // печатаем:
        for (String str : listOfNames) {
            System.out.println(str);
        }

        // под каким номером (индексом) в списке Sergej
        int i = listOfNames.indexOf("Sergej");
        System.out.println(i); // 3
        // ищем того, кого нет в списке
        i = listOfNames.indexOf("Leonid"); // -1
        System.out.println(i);






    }

}
