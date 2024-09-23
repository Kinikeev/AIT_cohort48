package class_work_37.superMarket.dao;

import class_work_37.superMarket.model.Product;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarketImpl implements SuperMarket {

    // 1. Надо поместить продукты в новую структуру из Java Collection FrameWork
    private Collection<Product> products = new ArrayList<>();

    // 2. Переходим на тестирование (в SuperMarketImplTest через Generate)

    // 5. Создаём конструктор: Раньше мы вставляли (запихивали) туда
    // массив[capacity]; - который был ограничен длинной capacity
    // int size; - потому что мы сами контролировали все наши действия в массиве.
    // Но так как у нас всё в ArrayList<>(), этого делать не надо. ArrayList<>() делает всё сам.
    // Возвращаемся в SuperMarketImplTest.


    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarcode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return 0;
    }
}
