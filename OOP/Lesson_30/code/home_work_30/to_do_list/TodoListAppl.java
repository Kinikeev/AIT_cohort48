package home_work_30.to_do_list;

import java.util.Scanner;

public class TodoListAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selection of action!");
        TodoList[] menu1 = TodoList.values();
        for (TodoList todoList : menu1) {
            System.out.println(todoList);
        }
        boolean flag = true;
        while (flag){
            System.out.println("Input your action!");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> System.out.println("Your action is: " + menu1[choice - 1].toString());
                case 2 -> System.out.println("Your action is: " + menu1[choice - 1].toString());
                case 3 -> System.out.println("Your action is: " + menu1[choice - 1].toString());
                case 4 -> flag = false;
                default -> System.out.println("Wrong number");
            }
        }

    } // End of main

} // End of class
