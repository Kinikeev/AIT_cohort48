package home_work_34;

    // Задача 3. Заполните структуру типа ArrayList<> символами латинского алфавита от A(65) до Z(...).

import java.util.ArrayList;

public class AlphabetList {
    public static void main(String[] args) {

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
            alphabet.add(ch);
        }
        System.out.println();
        System.out.println(alphabet);

    } // End of main
    
} // End of class
