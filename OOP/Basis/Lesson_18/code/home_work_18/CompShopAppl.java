package home_work_18;

import home_work_18.compShop.kontroller.Stock;
import home_work_18.compShop.model.Computer18;

public class CompShopAppl {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        Computer18[] computers = new Computer18[5];
        computers[0] = new Computer18(123456111213214L,"Core i7",32,1024,"Apple",2000);
        computers[1] = new Computer18(456754632178589L,"Core i5",4,512,"Akr",800);
        computers[2] = new Computer18(123458932142789L,"Core i9",16,512,"HP",1600);
        computers[3] = new Computer18(789121459871233L,"Core i8",8,512,"Akr",1800);
        computers[4] = new Computer18(123656482146554L,"Core i4",16,1024,"Lenovo",1700);

        // add computers in stock:
        Stock stock = new Stock(20);
        for (int i = 0; i < computers.length; i++) {
            stock.addComp(computers[i]);
        }
        // print all computers
        System.out.println("Print all computers:");
        stock.printComp();

        // size of computers
        System.out.println("Size of computers: = " + stock.amounts());

        // searching of computer by ISBN.
        System.out.println("Find computer by ISBN - 123456111213214L:" + "\n" + stock.findComp(123456111213214L));

        // adding computers:
        Computer18 computer_01 = new Computer18(265798421346597L,"Amor",32,1024,"Apple",2200);
        Computer18 computer_02 = new Computer18(265798456346597L,"Pis",64,2048,"Ahu",3500);
        stock.addComp(computer_01);
        stock.addComp(computer_02);

        // print all computers after adding:
        System.out.println("Print all computers after adding:");
        stock.printComp();

        // size of computers after adding:
        System.out.println("Size of computers after adding: = " + stock.amounts());

        // remove computer:
        System.out.println("Remove computer: " + "\n" + stock.removeComp(456754632178589L));

        // size of computers after remove:
        System.out.println("Size of computers after remove: = " + stock.amounts());

    } // End of main

} // End of class
