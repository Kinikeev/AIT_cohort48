package home_work_19.miniMarket_19.model_19;

import java.util.Objects;

public class Product {
    private final String barCode;      // 20 Characters
    private final String name;
    private double price;

    public static final int CODE_LENGTH = 20;

    private String checkCode (String code){
        if (code.length() == CODE_LENGTH){
            return code;
        }
        else
            return "Wrong bar code";
    }

    // constructor:
    public Product(double price, String barcode, String name) {
        this.price = price;
        this.barCode = barcode;
        this.name = name;
    }
    // getters:
    public String getBarcode() {
        return barCode;
    }
    public String getName() {
        return name;
    }
    // setter
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product:" +
                " | barcode: " + barCode +
                " | Name: " + name +
                " | Price: " + price + " |";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product product)) return false;
        return Objects.equals(barCode, product.barCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }
} // End of class
