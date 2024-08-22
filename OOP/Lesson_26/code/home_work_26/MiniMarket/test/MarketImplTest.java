package home_work_26.MiniMarket.test;

import home_work_26.MiniMarket.Model.Food2;
import home_work_26.MiniMarket.Model.MeatFoods2;
import home_work_26.MiniMarket.Model.MilkFoods2;
import home_work_26.MiniMarket.Model.Product2;
import home_work_26.MiniMarket.dao.Market;
import home_work_26.MiniMarket.dao.MarketImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketImplTest {

    Market market;
    Product2[] products;

    @BeforeEach
    void setUp() {
        market = new MarketImpl(10);
        products = new Product2[9];

        products[0] = new Product2(111101L, "Product_1", 233.65);
        products[1] = new Product2(111102L, "Product_2", 1026.78);
        products[2] = new Food2(111103L, "Food_1", 25.32, "2024-12-25");
        products[3] = new Food2(111104L, "Food_2", 12.45, "2024-11-23");
        products[4] = new MeatFoods2(111105L, "MeatFood_1", 10.80, "2024-10-12", "Meat");
        products[5] = new MeatFoods2(111106L, "MeatFood_2", 15.98, "2024-09-12", "Sausage");
        products[6] = new MilkFoods2(111107L, "MilkFood_1", 1.64, "2024-08-07", "Milk", 0.1);
        products[7] = new MilkFoods2(111108L, "MilkFood_2", 2.15, "2024-09-26", "sour cream", 0.35);
        products[8] = new MilkFoods2(111109L, "MilkFood_3", 3.99, "2024-11-13", "Butter", 0.1);

        for (int i = 0; i < products.length; i++) {
            market.addProduct(products[i]);
        }
    }

    @Test
    void findProductByBarCode() {
        assertEquals(products[0],market.findProductByBarCode(111101L));
        assertEquals(products[3],market.findProductByBarCode(111104L));
        assertEquals(products[5],market.findProductByBarCode(111106L));
        assertEquals(products[8],market.findProductByBarCode(111109L));
        assertNull(market.findProductByBarCode(111111L));
        assertNotEquals(products[2],market.findProductByBarCode(111102L));
        assertNotEquals(products[7],market.findProductByBarCode(111111L));
    }

    @Test
    void addProduct() {
        assertFalse(market.addProduct(null));
        assertFalse(market.addProduct(products[6]));
        Product2 product = new Product2(111111L,"Product_6",45.96);
        assertTrue(market.addProduct(product));
        assertEquals(10,market.quantityProducts());
        Product2 product1 = new Food2(111112L,"Food_7",23.76,"2024-12-30");
        assertFalse(market.addProduct(product1));
        assertEquals(10,market.quantityProducts());
    }

    @Test
    void printArray() {
        market.printArray();
    }

    @Test
    void removeProduct() {
        assertNull(market.removeProduct(111112L));
        assertEquals(products[0],market.removeProduct(111101));
        printArray();
    }

    @Test
    void quantityProducts() {
        assertEquals(9,market.quantityProducts());
        addProduct();
        assertEquals(10,market.quantityProducts());
        assertNotEquals(9,market.quantityProducts());
        removeProduct();
        assertNotEquals(10,market.quantityProducts());
        assertEquals(9,market.quantityProducts());
    }

    @Test
    void upDateProducts() {
        products[8] = new MilkFoods2(111109L, "MilkFood_Change", 3.99, "Change", "Butter", 0.2);
        assertEquals(products[8],market.upDateProducts(products[8]));
        printArray();


    }

    @Test
    void sumAllProducts() {
        assertEquals(1332.76,market.sumAllProducts());
        addProduct();
        assertEquals(1377.72,market.sumAllProducts());

    }

    @Test
    void averageCostAllProducts() {
        assertEquals(148.08,market.averageCostAllProducts());
    }

    @Test
    void averageFatMilkProducts() {
        assertEquals(0.18,market.averageFatMilkProducts());
    }
} // End of class test