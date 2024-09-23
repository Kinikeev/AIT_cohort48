package class_work_36.linkedList_example;

    // Задание: Заполнить список случайными целыми числами и опробовать работу методов.

import java.util.*;

public class LinkedListAppl {

    // LinkedList - создаем и пробуем его методы

    // До main создадим себе необходимые константы
    // заполняем наш список случайными целыми числами

    // заполнить список случайными целыми числами
    // проверить работу методов LinkedList
    private static final int N_NUMBERS = 10; // отвечает за количество чисел в листе
                                             // константы пишутся с большими буквами
    private static final Random random = new Random(); // счётчик случайных чисел
    // Объект random создастся за счёт конструктора, который есть в классе Random.
    private static final int MIN = 10; // константа минимума
    private static final int MAX = 20; // константа максимума (диапозон случайных чисел от 10 до 20)

    public static void main(String[] args) {
        // создаём лист, который будет параметризироваться целыми числами
        List<Integer> list = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();

        // LinkedList и ArrayList имеют одни и теже методы, но отличаются своей внутренней организацией
        // В ArrayList есть индексы каждого елемента и расположение их фиксированное.
        // В LinkedList есть тоже индексы, он тоже сортируется, но внутренняя структура сложнее:
        // каждый элемент знает своих соседей (слева и справа)

        // для заполнения листа понадобится метод (назовём его fillCollection)
        // при помощи класса Collection (это класс подобный Arrays тоже класс обёртка вокруг коллекции)
        fillCollection (list); // (list) - это объект, который нужно заполнить.
        // для вывода листа в консол напишем метод printList.
        printList(list);

        System.out.println("Size = " + list.size()); // узнаём количество элементов в списке

        System.out.println(list.get(0)); // получаем элемент под индексом 0.
        System.out.println(list.get(5)); // получаем элемент под индексом 5.
        System.out.println(list.get(9)); // получаем элемент под индексом 9.
        //  System.out.println(list.get(10)); // здесь покажет ошибку т.к. превышает длинну

        System.out.println(list.indexOf(15)); // узнаём под каким индексом находится число 15
                                              // если его нет то как и в ArrayList покажет -1
        System.out.println(list.lastIndexOf(15)); // будет искать с конца
        // если будет 3 елемента, то индекс среднего не покажет (или первый или последний)

        // при помощи list.set устанавливаем под нужный индекс нужное число
        System.out.println("Before set and add");
        printList(list); // до установки
        list.set(0, 5); // под индекс 0 устанавливаем 5 (хотя интервал от 10 до 20)
        list.add(0);    // добавляем элемент 0 (добавляется в конец)
        System.out.println("After set and add");
        printList(list);
        list.set(10, 50); // под индекс 10 устанавливаем 50 (хотя интервал от 10 до 20)
        System.out.println("After set, add and set");
        printList(list);  // после установки

        // с remove нужно быть всегда осторожным !!!
        // если удалять путём перебора (for i или for each) - покажет ошибку

        //        NB! Wrong way!
//        for (Integer num : list) {
//            if (num.equals(15)) {
//                list.remove(num);
//            }
//        }
        // удалять нужно при помощи итератора!!!

      // Вызываем итератор, параметризированный интеджером. Наш list уже итерируемый и у него есть итератор,
        // потому что он создан как LinkedList на основе листа
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            // будем его перебирать, пока некий интеджер не будет равен 15
            Integer num = iterator.next(); // пока есть следующий элемент, он (итератор) его перебирает
            if(num.equals(15)){ // можно if(num == 15) но лучше equals потому что это объект
                iterator.remove();
            }
        }
        System.out.println("After remove 15");
        printList(list);
        //list.remove(50); так не идёт
        Integer num = 50;
        list.remove(num);
        System.out.println("Remove 50");
        printList(list);
        list.remove(0);
        System.out.println("Delete element at index 0");
        printList(list);

        // удаление по условию (предикат с лямда выражением)
        list.removeIf(n -> n%2 == 0); // удаление всех чётных чисел
        System.out.println("removing all even numbers");
        printList(list);
        list.removeIf(n -> n > 5 && n < 15);
        System.out.println("removing from 5 to 15");
        printList(list);

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

} // End of class
