package class_work_30.coffee_mashine;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to coffee shop!");
        Coffee[] menu = Coffee.values();
        for (Coffee coffee : menu){
            System.out.println(coffee);
        }
        boolean flag = true;
        while (flag){
            System.out.println("Input your choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> System.out.println("Your choice is;" + menu[choice - 1].toString());
                case 2 -> System.out.println("Your choice is;" + menu[choice - 1].toString());
                case 3 -> System.out.println("Your choice is;" + menu[choice - 1].toString());
                case 4 -> System.out.println("Your choice is;" + menu[choice - 1].toString());
                case 5 -> flag = false;
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
