package home_work_26.computerShop.test;

import home_work_26.computerShop.dao.ElectroShop;
import home_work_26.computerShop.dao.ElectroShopImpl;
import home_work_26.computerShop.model.Computer;
import home_work_26.computerShop.model.Laptop;
import home_work_26.computerShop.model.SmartPhon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectroShopImplTest {

    ElectroShop electroShop;
    Computer[] computers;

    @BeforeEach
    void setUp() {
        electroShop = new ElectroShopImpl(10);
        computers = new Computer[9];

        computers[0] = new Computer(10001L,"Core i7",32,1024,"Apple",2000,1400);
        computers[1] = new Computer(10002L,"Core i8",16,512,"Akr",800,450);
        computers[2] = new Computer(10003L,"Core i9",16,1024,"HP",1600,1000);

        computers[3] = new Laptop(10004L,"M2",16,1024,"Apple",3000,2200,
                                14.1,2.6,10);
        computers[4] = new Laptop(10005L,"M1",8,412,"Apple",2400,1800,
                                15.1,1.9,8);
        computers[5] = new Laptop(10006L,"M3",32,2048,"Lenovo",5200,3000,
                                20.7,2.2,12);

        computers[6] = new SmartPhon(10007L,"Smart_1",128,64,"iPhon13",800,500,
                                7.6,0.6,12,1234,4567L);
        computers[7] = new SmartPhon(10008L,"A15",64,1024,"iPhon14",1000,750,
                                8.8,0.7,15,2342,62314L);
        computers[8] = new SmartPhon(10009L,"A22",64,2048,"iPhon15",1200,900,
                                9.3,0.96,24,5612,7541235L);

        for (int i = 0; i < computers.length; i++) {
            electroShop.addDevice(computers[i]);
        }
    }

    @Test
    void addDevice() {
        assertFalse(electroShop.addDevice(null));
        assertFalse(electroShop.addDevice(computers[3]));
        Computer com01 = new Computer(10011L,"Core i7",32,1024,"Apple",2000,1400);
        assertTrue(electroShop.addDevice(com01));
        assertEquals(10,electroShop.quantity());
        Computer com03 = new Computer(10111L,"Core i7",32,1024,"Apple",2000,1400);
        assertFalse(electroShop.addDevice(com03));
        assertEquals(10,electroShop.quantity());
    }

    @Test
    void findDeviceByIsbn() {
        assertEquals(computers[3],electroShop.findDeviceByIsbn(10004L));
        assertNull(electroShop.findDeviceByIsbn(10011L));
    }

    @Test
    void removeDevice() {
        assertEquals(computers[5],electroShop.removeDevice(10006L));
        assertEquals(8,electroShop.quantity());
        assertNull(electroShop.removeDevice(10111L));
        assertEquals(8,electroShop.quantity());
    }
    @Test
    void quantity(){
        electroShop.quantity();
    }

    @Test
    void updateComputers() {
        Computer computer = new Computer(10003L,"Change",16,1032,"HP",1400,800);
        assertEquals(computers[2],electroShop.updateComputers(computer));
        Laptop laptop = new Laptop(10222L,"Change",8,412,"Apple",2400,1600,
                15.1,1.9,8);
        assertNull(electroShop.updateComputers(laptop));
    }

    @Test
    void printComputers() {
        electroShop.printComputers();
    }

    @Test
    void totalSumSSD() {
        assertEquals(9180,electroShop.totalSumSSD());
        updateComputers();
        assertEquals(9188,electroShop.totalSumSSD());
        addDevice();
        assertEquals(10212,electroShop.totalSumSSD());
        electroShop.removeDevice(10003L);
        assertEquals(9180,electroShop.totalSumSSD());

    }

    @Test
    void totalPrice() {
        assertEquals(18000,electroShop.totalPrice());
        updateComputers();
        assertEquals(17800,electroShop.totalPrice());
        addDevice();
        assertEquals(19800,electroShop.totalPrice());
        electroShop.removeDevice(10006L);
        assertEquals(14600,electroShop.totalPrice());
    }

    @Test
    void totalBlackFriday() {
        assertEquals(12000,electroShop.totalBlackFriday());
        updateComputers();
        assertEquals(11800,electroShop.totalBlackFriday());
        addDevice();
        assertEquals(13200,electroShop.totalBlackFriday());
        electroShop.removeDevice(10006L);
        assertEquals(10200,electroShop.totalBlackFriday());
    }

    @Test
    void totalWeight() {
        assertEquals(8.96,electroShop.totalWeight());
        updateComputers();
        electroShop.removeDevice(10006L);
        assertEquals(6.76,electroShop.totalWeight());
    }
} // End of class