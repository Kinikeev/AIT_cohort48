package home_work_20.cafeOleg;

import home_work_20.cafeOleg.controller.Cafe;
import home_work_20.cafeOleg.model.Table;

import java.util.Scanner;

public class CafeAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Table[] tables = new Table[10];
        int capacity = 5;
        System.out.print("Do you want to open your terrace? (Y/N)");
        String input = scanner.nextLine();
        if (input.toUpperCase().equals("Y")) {
            capacity += 5;
        }
        System.out.print("Enter number of waiters: ");
        int numWaiters = scanner.nextInt();
        Cafe cafe = new Cafe(capacity, numWaiters);
        tables[0] = new Table(1, 1, false);
        tables[1] = new Table(2, 1, false);
        tables[2] = new Table(3, 2, false);
        tables[3] = new Table(4, 2, false);
        tables[4] = new Table(5, 3, false);
        tables[5] = new Table(6, 3, false);
        tables[6] = new Table(7, 4, false);
        tables[7] = new Table(8, 4, false);
        tables[8] = new Table(9, 5, false);
        tables[9] = new Table(10, 5, false);
        for (int i = 0; i < capacity; i++) {
            cafe.addTable(tables[i]);
        }
        cafe.printCafeStatus();
        cafe.printTables();
        cafe.input(scanner);
    }

}
