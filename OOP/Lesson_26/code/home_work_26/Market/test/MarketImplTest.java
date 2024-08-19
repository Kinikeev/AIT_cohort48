package home_work_26.Market.test;

import home_work_26.Market.Model.Food2;
import home_work_26.Market.Model.MeatFoods2;
import home_work_26.Market.Model.MilkFoods2;
import home_work_26.Market.Model.Product2;
import home_work_26.Market.dao.Market;
import home_work_26.Market.dao.MarketImpl;
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
        products[1] = new Product2(111102L, "Product_2", 1026.79);
        products[2] = new Food2(111103L, "Food_1", 25.32, "2024-12-25");
        products[3] = new Food2(111104L, "Food_2", 12.45, "2024-11-23");
        products[4] = new MeatFoods2(111105L, "MeatFood_1", 10.80, "2024-10-12", "Meat");
        products[5] = new MeatFoods2(111106L, "MeatFood_2", 15.99, "2024-09-12", "Sausage");
        products[6] = new MilkFoods2(111107L, "MilkFood_1", 1.64, "2024-08-07", "Milk", 0.1);
        products[7] = new MilkFoods2(111108L, "MilkFood_2", 2.15, "2024-09-26", "sour cream", 0.35);
        products[8] = new MilkFoods2(111109L, "MilkFood_3", 3.99, "2024-11-13", "Butter", 0.1);

        for (int i = 0; i < products.length; i++) {
            market.addProduct(products[i]);
        }
    }

    @Test
    void findProductByBarCode() {
        assertEquals(products[5],market.findProductByBarCode(111106L));
        assertNull(market.findProductByBarCode(111111L));
    }

    @Test
    void addProduct() {

    }

    @Test
    void printArray() {
        market.printArray();
    }

    @Test
    void removeProduct() {
    }

    @Test
    void quantityProducts() {
    }

    @Test
    void upDateProducts() {
    }

    @Test
    void sumAllProducts() {
    }

    @Test
    void averageCostAllProducts() {
    }

    @Test
    void averageFatMilkProducts() {
    }
} // End of class test