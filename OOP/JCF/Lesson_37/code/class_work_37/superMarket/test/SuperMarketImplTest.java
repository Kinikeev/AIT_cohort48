package class_work_37.superMarket.test;

import class_work_37.superMarket.dao.SuperMarket;
import class_work_37.superMarket.dao.SuperMarketImpl;
import class_work_37.superMarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SuperMarketImplTest {

    // необходимые поля:

    // 3. Нужно импортировать структуры, в которых будет всё храниться. Берём с интерфейса
    SuperMarket myMarket;
    Product[] products; // однотипные продукты положим в массив, потом из массива переложим в нужное место.
    LocalDate now = LocalDate.now(); // Текущая дата. Нужна для определения просрочки.

    @BeforeEach
    void setUp() {
        // 4. что бы создать новую имплементацию нашего класса, в котором все наши методы, нам нужен конструктор.
        // Вернёмся в SuperMarketImpl.

        // 5. Составляем список продуктов супермаркета.
        myMarket = new SuperMarketImpl(); // в скобках не нужно указывать capacity (он резиновый).
        // Объявляем массив на 5 тестовых продуктов:
        products = new Product[5];
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));

        // 6. Вносим массив в объект myMarket.
//        for (int i = 0; i < products.length; i++) {    // раньше мы перебирали до size.
//            myMarket.addProduct(products[i]);
//        }

        // 9. Можно внести при помощи for each
//
       for (Product p : products){
            myMarket.addProduct(p);
        }
    }
    // 7. Напишем метод для распечатки объекта
    private static void printArray(Object[] array){  // передаём ему массив объектов
        // Можно for each потому что объект уже создан
        for (Object o : array) {
            System.out.println(o);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }

    @Test
    void addProduct() {
        // 8. проверяем, заполнился ли массив продуктов
        printArray(products);
        // 10. тестируем этот метод
        assertFalse(myMarket.addProduct(null));
        assertFalse(myMarket.addProduct(products[3]));
        Product product1 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product1));
        myMarket.addProduct(product1);
        assertEquals(6, myMarket.skuQuantity());
        Product product2 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(myMarket.addProduct(product2)); // с одинаковым баркодом
        Product product3 = new Product(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product3));
    }

    @Test
    void removeProduct() {
        assertEquals(products[1], myMarket.removeProduct(222222));
        assertEquals(4, myMarket.skuQuantity());
        assertNull(myMarket.removeProduct(222222)); // дважды не можем удалить
        // assertNull(myMarket.removeProduct(222222));
    }

    @Test
    void findByBarcode() {
        assertEquals(products[1], myMarket.findByBarcode(222222));
        assertNull(myMarket.findByBarcode(888888));
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByBrand() {
    }

    @Test
    void findProductsWithExpiredDate() {
    }

    @Test
    void skuQuantity() {
    }
}