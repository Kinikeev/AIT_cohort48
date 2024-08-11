package class_work_18.computor_shop;

import class_work_18.computor_shop.model.Computer;
import class_work_18.computor_shop.model.Laptop;
import class_work_18.computor_shop.model.SmartPhon;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("Core i7",8,512,"Asus",1200);
        Laptop laptop = new Laptop("M2",16,1024,"Apple",3000,14.1,10,2.6);
        System.out.println(computer);
        System.out.println(laptop);
        laptop.displayLaptop();

        SmartPhon smartPhon = new SmartPhon("iPhone 15",54,128,"iPhone",980,7,11,0.3,1024,25631475235L);
        System.out.println(smartPhon);
        smartPhon.displaySmart();

        Computer[] computers = new Computer[7];
        computers[0] = new Computer("Core i7",8,512,"Asus",1200);
        computers[1] = new Computer("Core i5",4,512,"Akr",800);
        computers[2] = new Computer("Core i9",16,512,"HP",1600);
        computers[3] = new Laptop("M2",16,1024,"Apple",3000,
                                    14.1,10,2.6);   // upper casting
        computers[4] = new Laptop("M1",8,412,"Apple",2400,
                                    12.1,12,1.6);
        computers[5] = new Laptop("M3",32,2048,"Apple MacBook pro",5200,
                                    16,16,3.6);
        computers[6] = new SmartPhon("A3",128,64,"iPhone14",1400,7.5,
                                    20,0.6,1245,456321L);

        int sumSSD = 0;
        for (int i = 0; i < computers.length; i++) {
            sumSSD = sumSSD + computers[i].getSsd();
        }
        System.out.println("Total ssd = " + sumSSD);

        double totalPrice = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrice += computers[i].getPrice();
        }
        System.out.println("Total price = " + totalPrice);

        System.out.println(computers[0].getBrand());

        // нужно получить общий вес
        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop) {  // down casting делается только после проверки instanceof
                Laptop myLaptop = (Laptop) computers[i];
                totalWeight += myLaptop.getWight();
            }
        }
        System.out.println("Total weight = " + totalWeight);

    } // End of main

} // End of class
