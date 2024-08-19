package home_work_20.cafeOleg.controller;

import home_work_20.cafeOleg.model.Table;

import java.util.Scanner;

public class Cafe {
    //fields
    Table[] tables;
    private int reservedTables;
    private int numberOfWaiters;
    private int availableTables;

    //constructor
    public Cafe(int capacity, int numberOfWaiters) {
        this.tables = new Table[capacity];
        this.reservedTables = calculateReservedTables();
        this.availableTables = 0;
        this.numberOfWaiters = numberOfWaiters;
    }

    //ask for input
    public void input(Scanner scanner) {
        boolean exit = false;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("(1) Book a table\n(2) Check table as free\n(3) Add waiter\n(4) Print status\n(5) Split table in two\n(6) Merge two tables\n(7) Exit");
            System.out.println("----------------------------------------------------------");
            int input = scanner.nextInt();
            switch (input) {
                case 1: {//Book table for x persons
                    System.out.print("Person number: ");
                    int persons = scanner.nextInt();
                    reserveTable(persons);
                    printCafeStatus();
                    printTables();
                    break;
                }
                case 2: {//set table free
                    System.out.print("Table ID: ");
                    int id = scanner.nextInt();
                    boolean validId = false;
                    for (int i = 0; i < availableTables; i++) {
                        if (tables[i].getId() == id) {
                            validId = true;
                            if (tables[i].isReserved()) {
                                tables[i].setReserved(false);
                                System.out.println("The table with ID: " + id + " is free now");
                            } else {
                                System.out.println("The table with ID: " + id + " is already free");
                            }
                        }
                    }
                    if (!validId) {
                        System.out.println("There is no table with ID: " + id);
                    } else {
                        printCafeStatus();
                        printTables();
                    }
                    break;
                }
                case 3: {//add x waiters
                    System.out.println("Number of waiters: ");
                    int num = scanner.nextInt();
                    numberOfWaiters += num;
                    printCafeStatus();
                    break;
                }
                case 4: { //print status
                    printCafeStatus();
                    printTables();
                    break;
                }
                case 5: {//split tables
                    System.out.println("Table ID: ");
                    int id = scanner.nextInt();
                    boolean reserved = false;
                    for (int i = 0; i < availableTables; i++) {
                        if (tables[i].isReserved() && tables[i].getId() == id) {
                            System.out.println("The table is already reserved!");
                            reserved = true;
                        }
                    }
                    if (!reserved) {
                        if (availableTables < tables.length) {
                            splitTable(id);
                        } else {
                            System.out.println("There is no space for new table!");
                        }

                        printCafeStatus();
                        printTables();
                    }
                    break;
                }
                case 6: { //merge tables
                    System.out.println("First tableID: ");
                    int t1 = scanner.nextInt();
                    System.out.println("Second tableID: ");
                    int t2 = scanner.nextInt();
                    mergeTable(t1, t2);
                    printCafeStatus();
                    printTables();
                    break;
                }
                case 7: {
                    exit = true;
                    break;
                }

                default:
                    System.out.println("Nothing selected");
            }

        } while (!exit);
    }

    //reserves table by person count; auto merge 2 tables

    public boolean reserveTable(int persons) {
        boolean bookedOut = true;
        for (int i = 0; i < availableTables; i++) {
            if (!tables[i].isReserved()) {
                bookedOut = false;
            }
            if (tables[i].getNumberOfSeats() >= persons && !tables[i].isReserved()) {
                tables[i].setReserved(true);
                this.reservedTables++;
                System.out.println("A table with ID: " + tables[i].getId() + " is booked for " + persons + " persons.");
                return true;
            }
        }
        if (bookedOut) {
            System.out.println("We are booked out!");
            return false;
        }
        if (persons >= 2) {
            int id1 = -1;
            int id2 = -1;
            for (int i = 0; i < availableTables; i++) {
                if (persons / 2 == tables[i].getNumberOfSeats() && !tables[i].isReserved()) {
                    id1 = tables[i].getId();
                }
            }
            for (int i = 0; i < availableTables; i++) {
                if ((persons / 2) + (persons % 2) == tables[i].getNumberOfSeats() && tables[i].getId() != id1 && !tables[i].isReserved()) {
                    id2 = tables[i].getId();
                }
            }
            if (id1 == -1 || id2 == -1) {
                System.out.println("We are booked out");
                return false;
            } else {
                Table newTable = mergeTable(id1, id2);
                newTable.setReserved(true);
            }
        }
        return false;
    }

    public int getReservedTables() {
        return reservedTables;
    }

    public int getAvailableTables() {
        return availableTables;
    }

    public int getServedTables() {
        return calculateServedTables();
    }

    //splits 1 table in cafe in 2
    public void splitTable(int id) {
        Table table = findTable(id);
        if (table.getNumberOfSeats() >= 2) {
            int newSeatNumber1 = table.getNumberOfSeats() / 2;
            int newSeatNumber2;
            if (table.getNumberOfSeats() % 2 == 0) {
                newSeatNumber2 = table.getNumberOfSeats() / 2;
            } else {
                newSeatNumber2 = table.getNumberOfSeats() / 2 + table.getNumberOfSeats() % 2;
            }
            boolean newIsReserved = false;
            if (table.isReserved()) {
                newIsReserved = true;
            }
            int newId = 0;
            for (int i = 0; i < availableTables; i++) {
                if (tables[i].getId() > newId) {
                    newId = tables[i].getId();
                }
            }
            removeTable(id);
            Table table1 = new Table(newId + 1, newSeatNumber1, newIsReserved);
            addTable(table1);
            int newId1 = 0;
            for (int i = 0; i < availableTables; i++) {
                if (tables[i].getId() > newId1) {
                    newId1 = tables[i].getId();
                }
            }
            Table table2 = new Table(newId1 + 1, newSeatNumber2, newIsReserved);
            addTable(table2);
            System.out.println("Table with ID: " + id + " was splitted in to two tables with ID: " + tables[tables.length - 2].getId() + " and ID: " + tables[tables.length - 1].getId());

        } else {
            System.out.println("The table is too small to be splitted!");
        }
    }

    //merge 2 tables in cafe into 1
    public Table mergeTable(int id1, int id2) {
        Table target = null;
        Table table1 = findTable(id1);
        Table table2 = findTable(id2);
        int newSeatNumber;
        if (table1 != null && table2 != null && id1 != id2) {
            newSeatNumber = table1.getNumberOfSeats() + table2.getNumberOfSeats();
            int newId = 0;
            for (int i = 0; i < availableTables; i++) {
                if (tables[i].getId() > newId) {
                    newId = tables[i].getId();
                }
            }
            boolean newIsReserved = false;
            if (table1.isReserved() || table2.isReserved()) {
                newIsReserved = true;
            }
            System.out.println("Table with ID: " + id1 + " and table with ID: " + id2 + " were moved together to table with ID: " + (newId + 1));
            System.out.println("--------------------------------------------------------------------------------------------");
            target = new Table(newId + 1, newSeatNumber, newIsReserved);
            removeTable(id1);
            removeTable(id2);
            addTable(target);
        }
        return target;
    }

    //remove table form cafe
    public Table removeTable(int id) {
        Table victim = null;
        for (int i = 0; i < availableTables; i++) {
            if (tables[i].getId() == id) {
                victim = tables[i];
                for (int j = i; j < availableTables - 1; j++) {
                    tables[j] = tables[j + 1];
                }
                tables[availableTables - 1] = null;
                availableTables--;
                break;
            }
        }
        return victim;
    }

    //calculates reserved tables
    int calculateReservedTables() {
        int res = 0;
        for (int i = 0; i < availableTables; i++) {
            if (tables[i].isReserved()) {
                res++;
            }
        }
        return res;
    }

    public Table findTable(int id) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i].getId() == id) {
                return tables[i];
            }
        }
        return null;
    }

    //calculates served tables
    private int calculateServedTables() {
        int res = availableTables;
        if ((numberOfWaiters * 3) <= availableTables) {
            res = numberOfWaiters * 3;
        }
        return res;
    }

    //print cafe status
    public void printCafeStatus() {
        int resTable = calculateReservedTables();
        System.out.println("-------------------------------------------");
        System.out.println("Total tables: " + availableTables);
        System.out.println("Free tables: " + (availableTables - resTable));
        System.out.print("There are " + resTable + " tables reserved.");

        for (int i = 0; i < availableTables; i++) {
            if (tables[i].isReserved()) {
                System.out.print("| ID" + tables[i].getId());
            }
        }
        System.out.println();
        System.out.println("Number of waiters:  " + numberOfWaiters);
        if (getServedTables() < resTable) {
            System.out.println("You need more waiters!");
        }
        System.out.println("-------------------------------------------");
    }

    //print tables in cafe
    public void printTables() {
        for (int i = 0; i < availableTables; i++) {
            System.out.println(tables[i]);
        }
    }

    //add table to array
    public boolean addTable(Table table) {
        if (table == null || availableTables == tables.length) {
            System.out.println("The table is null or cafe is full");
            return false;
        }
        tables[availableTables] = table;
        availableTables++;
        return true;
    }

}
