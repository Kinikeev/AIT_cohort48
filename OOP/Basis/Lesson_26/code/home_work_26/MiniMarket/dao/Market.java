package home_work_26.MiniMarket.dao;

import home_work_26.MiniMarket.Model.Product2;

public interface Market {

    // найти продукт по barCode
    Product2 findProductByBarCode(long barCode);

    // добавить продукт
    boolean addProduct(Product2 product);

    // распечатать массив продуктов
    void printArray();

    // удалить продукт
    Product2 removeProduct(long barCode);

    // подсчитать количество продуктов
    int quantityProducts();

    // обновить данные о продуктах
    Product2 upDateProducts(Product2 product);

    // общая сумма всех продуктов
    double sumAllProducts();

    // средняя стоимость
    double averageCostAllProducts();

    // средняя жирность молочных продуктов
    double averageFatMilkProducts();


} // End of interface
