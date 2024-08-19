package home_work_19.miniMarket_19;

import home_work_19.miniMarket_19.controller_19.MiniMarket;
import home_work_19.miniMarket_19.model_19.Food;
import home_work_19.miniMarket_19.model_19.Product;

/*
    Создайте класс MiniMarketAppl, в котором создайте объект miniMarket на основе класса MiniMarket
    с номером филиала 1001 и capacity 5. Наполните miniMarket продуктами, опробуйте на них работу
    методов: findProduct removeProduct printProducts updateProduct (*)
     */
public class MiniMarketAppl_19 {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product(23.79,"DA123456789123456789","Product 1:");
        products[1] = new Product(22.88,"DA123456789123456788","Product 2:");
        products[2] = new Food(21.77,"DA123456789123456787","Product 3:",500);
        products[3] = new Food(20.99,"DA123456789123456786","Product 4:",120);

        // Заполняем маркет продуктами
        MiniMarket market = new MiniMarket(1001,5);
        for (int i = 0; i < products.length; i++) {
            market.addProduct(products[i]);
        }
        // Проверяем работу методов:
        System.out.println("----------------------------------------------");
        System.out.println("Amount of Products: " + market.amountProducts());
        System.out.println("Method printProducts:");
        market.printProducts();

        System.out.println("Добавляем продукт:");
        market.addProduct(new Food(11.20,"AA0012365478965412300","Product 5:",300));
        System.out.println("Amount of Products: " + market.amountProducts());
        market.printProducts();

        System.out.println("Ищем продукт:");
        System.out.println( market.findProduct("DA123456789123456787"));
        System.out.println("-----------------------------------------------------------");

        System.out.println("Удаляем продукт:");
        market.removeProduct("DA123456789123456789");
        System.out.println(market.removeProduct("DA123456789123456789"));
        System.out.println("-----------------------------------------------------------");

        System.out.println("Amount of Products: " + market.amountProducts());
        market.printProducts();

        System.out.println("Меняем цену продукта 4 с 20.99 на 16.00");
        market.updateProduct("DA123456789123456786",16.00);
        market.printProducts();







    } // End of main

} // End of class
