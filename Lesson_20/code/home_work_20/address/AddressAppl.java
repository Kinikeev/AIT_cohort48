package home_work_20.address;
    /*
      Задача 1: Проверте работу конструктора в приложении AddressAppl.
                Организуйте в нём возможность ввода адреса и его проверку по введённому индексу.
     */

public class AddressAppl {
    public static void main(String[] args) {

        Address address = new Address("Mark-place",36,"95123");
        System.out.println(address);

        System.out.println("Вместо 95123 введём 0521");
        Address address1 = new Address("Mark-place",36,"0521");
        System.out.println(address1);

        System.out.println("Вместо 95123 введём 95123h");
        Address address2 = new Address("Mark-place",36,"95123h");
        System.out.println(address2);

        System.out.println("Вместо 95123 введём A5123");
        Address address3 = new Address("Mark-place",36,"A5123");
        System.out.println(address3);

        System.out.println("Вместо 95123 введём 9512#");
        Address address4 = new Address("Mark-place",36,"9512#");
        System.out.println(address4);

        System.out.println("Вместо 95123 введём 95 123");
        Address address5 = new Address("Mark-place",36,"95 123");
        System.out.println(address5);

    } // End of main

} // End of class
