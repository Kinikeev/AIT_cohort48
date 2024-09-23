package class_work_38.post_office;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PostOfficeAppl {

    //**Задача:** Написать приложение, которое позволит понять,
    // из каких мест на данную почту приходят письма.

    // Оператор будет вводить индексы из приходящих писем, будем их заносить в HashSet
    // в конце смены - распечатать HashSet.

    public static void main(String[] args) {

        // Создаём интерфейс Set<> на базе объекта, который будет параметризован дженериком String.
        Set<String> postCode = new HashSet<>(); // создаем новый объект, хранит уникальные элементы

        Scanner scanner = new Scanner(System.in);
        boolean flag = true; // по умолчанию всегда false

        System.out.println("Welcome to Post Office.");
        do{
            System.out.println("Input post code: ");
            String newPostCode = scanner.nextLine();

            if(postCode.add(newPostCode)){
                System.out.println("Post code " + newPostCode + " added.");
            } else {
                System.out.println("Post code already exists.");
            }
            System.out.println("Continue? Press 's' to stop. If no Press 'n'");
            char ch = scanner.next().charAt(0);
            if(ch == 's'){
                flag = false;
            }
            scanner.nextLine();
        }
        while (flag);
        System.out.println("Added post codes:");
        for (String str : postCode) {
            System.out.println(str);
        }

    }
}
