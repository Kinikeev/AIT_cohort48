package home_work_19.miniMarket_19.controller_19;

import home_work_19.miniMarket_19.model_19.Product;

import java.util.Objects;
// В классе MiniMarket создайте конструктор, принимающий на вход номер филиала brunch и
    // вместимость склада capacity.
    /*
    В классе MiniMarket создайте методы:
        - void printProducts()
        - boolean addProduct(Product product)
        - Product findProduct(~~long~~ String barcode)
        - Product updateProduct(~~long~~ String barcode, double price)
        - Product removeProduct(~~long~~ String barcode)
     */

public class MiniMarket {

    // fields
    private int branch;    // филиал
    private Product[] products;
    private int quantity;

    // constructor:
    public MiniMarket(int branch, int capacity) {
        this.branch = branch;
        this.products = new Product[capacity];
        this.quantity = 0;
    }

    // Methods:
    // - void printProducts()
    public void printProducts(){
        for (int i = 0; i < quantity; i++) {
            System.out.println(products[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------------");
    }

    // add product:
    public boolean addProduct(Product product){
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null){
            System.out.println("The product is null or market is full or the product already exists");
            return false;
        }
        products[quantity] = product;
        quantity ++;
        return true;
    }

    // find product:
    public Product findProduct (String barCode){
        for (int i = 0; i < quantity; i++) {
            if (Objects.equals(products[i].getBarcode(), barCode)){
                return products[i];
            }
        }
        System.out.println("This product does not exist!");
        return null;
    }

    // remove product:
    public Product removeProduct (String barCode){
        Product victim = null;
        for (int i = 0; i < quantity; i++) {
            if (Objects.equals(products[i].getBarcode(), barCode)){
                victim = products[i];
                products[i] = products[quantity - 1];
                products[quantity - 1] = null;
                quantity --;
                break;
            }
        }
        return victim;
    }

    // update product: обновить продукт (меняется цена)
    public Product updateProduct (String barCode,double price){
        for (int i = 0; i < quantity; i++) {
            if (Objects.equals(products[i].getBarcode(), barCode)){
                products[i].setPrice(price);
                return products[i];
            }
        }
        return null;
    }

    // amount of products
    public int amountProducts (){
        return quantity;
    }

} // End of class




















