package class_work_37.superMarket.dao;

import class_work_37.superMarket.model.Product;

public interface SuperMarket {

    // Перечисляем абстрактные методы только в виде их сигнатур
    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findByBarcode(long barCode);
    Iterable<Product> findByCategory(String category); // этот метод возвращает перебираемую коллекцию, которая
    // Параметризирована Продуктом <Product>, у тех продуктов у которых их внутренняя категория равна String category.
    // (Он находит все продукты с требуемой категорией в данной коллекции.)
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductsWithExpiredDate();
    int skuQuantity(); // сколько по штучно
}
    /*
    Любой интерфейс требует имплементацию.
    Ставим курсор на SuperMarket и нажимаем Alt и Enter. Выбираем Implement interface.
     */
