package class_work_17.compareComputers;

import java.util.Scanner;

public class CompareComputersAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("i5",16,512,"HP");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input cpu ");
        String cpu = scanner.nextLine();

        System.out.println("Input ram ");
        int ram = scanner.nextInt();

        System.out.println("Input ssd ");
        int ssd = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Input brand ");
        String brand = scanner.nextLine();

        Computer computer1 = new Computer(cpu,ram,ssd,brand);

        System.out.println(computer);
        System.out.println(computer1);
        boolean checker = computer1 == computer;
        System.out.println(checker);
        System.out.println("=====================================");
        checker = computer1.equals(computer);
        System.out.println(checker);

    } // End of main

} // End of class
