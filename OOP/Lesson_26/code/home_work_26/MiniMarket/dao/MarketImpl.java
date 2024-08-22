package home_work_26.MiniMarket.dao;

import home_work_26.MiniMarket.Model.MilkFoods2;
import home_work_26.MiniMarket.Model.Product2;

public class MarketImpl implements Market{

    // fields
    private Product2[] products;
    private int size;

    // constructor
    public MarketImpl(int capacity) {
        this.products = new Product2[capacity];
        this.size = size;
    }

    @Override
    public Product2 findProductByBarCode(long barCode) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode){
                return products[i];
            }
        }
        return null;
    }

    @Override
    public boolean addProduct(Product2 product) {
        if (product == null || products.length == size || findProductByBarCode(product.getBarCode()) != null) {
            return false;
        }
        products[size++] = product;
        return true;
    }

    @Override
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

    @Override
    public Product2 removeProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode){
                Product2 victim = products[i];
                products[i] = products[--size];
                return victim;
            }
        }
        return null;
    }

    @Override
    public int quantityProducts() {
        return size;
    }

    @Override
    public Product2 upDateProducts(Product2 product) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == product.getBarCode()){
                products[i] = product;
                return product;
            }
        }
        return null;
    }

    @Override
    public double sumAllProducts() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += products[i].getPrice();
        }
        return sum;
    }

    @Override
    public double averageCostAllProducts() {
        return sumAllProducts() / quantityProducts();
    }

    @Override
    public double averageFatMilkProducts() {
        int count = 0;
        double fat = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof MilkFoods2){
                fat += ((MilkFoods2) products[i]).getFat();
                count ++;
            }
        }
        return fat / count;
    }
} // End of class
