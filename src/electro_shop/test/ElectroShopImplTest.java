package electro_shop.test;

import electro_shop.dao.ElectroShop;
import electro_shop.dao.ElectroShopImpl;
import electro_shop.model.Device;
import electro_shop.model.Laptop;
import electro_shop.model.Computer;
import electro_shop.model.SmartPhon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElectroShopImplTest {

    ElectroShop electroShop;
    Device[] devices;

    @BeforeEach
    void setUp() {
        electroShop = new ElectroShopImpl(10);
        devices[0] = new Device(10001,"Black","Model_1",800,0.15);
        devices[1] = new Device(10002,"White","Model_2",600,0.15);
        devices[2] = new Device(10003,"Black","Model_3",1000,0.15);
        devices[3] = new Computer(10004,"White","Model_4",1200,0.25,"Core i1",8,512);
        devices[4] = new Computer(10005,"Black","Model_5",1400,0.25,"Core i1",16,1024);
        devices[5] = new Computer(10006,"White","Model_6",1600,0.25,"Core i1",32,2048);
        devices[6] = new Laptop(10007,"Rosa","Model_7",1500,0.3,"Map_1",16,1024,
                                14.5,2.6,4);
        devices[7] = new Laptop(10008,"Black","Model_8",1700,0.3,"Map_1",32,1024,
                                 14.5,2.6,4);
        devices[8] = new Laptop(10009,"White","Model_9",1900,0.3,"Map_1",64,2048,
                                14.5,2.6,4);
        devices[9] = new SmartPhon(10010,"Black","Model_10",750,0.2,123,12347L);
        devices[10] = new SmartPhon(10010,"White","Model_11",800,0.3,125,44348L);
        devices[11] = new SmartPhon(10010,"Black","Model_12",900,0.35,426,55349L);
    }

    @Test
    void addDevice() {
    }

    @Test
    void findDeviceByIsbn() {
    }

    @Test
    void testToString() {
    }

    @Test
    void removeDevice() {
    }

    @Test
    void updateDevice() {
    }

    @Test
    void totalSumSSD() {
    }

    @Test
    void totalPrice() {
    }

    @Test
    void totalWeight() {
    }

    @Test
    void findDevicesByModel() {
    }

    @Test
    void findDevicesByColor() {
    }

    @Test
    void findDevicesByBlackFriday() {
    }
}