package superMarket_37.dao;

import superMarket_37.model.Product;

public interface SuperMarket {

    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findByBarcode(long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductsWithExpiredDate();
    int skuQuantity();
}
    /*
    Любой интерфейс требует имплементацию.
    Ставим курсор на SuperMarket и нажимаем Alt и Enter. Выбираем Implement interface.
     */
