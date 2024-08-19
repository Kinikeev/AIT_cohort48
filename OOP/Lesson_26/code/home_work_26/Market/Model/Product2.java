package home_work_26.Market.Model;

import java.util.Objects;

public class Product2 {

    public static final int CODE_LENGTH = 6;

    // fields
    private long barCode;
    private String name;
    private double price;

    // check barCode
    public long checkCode(long barCode){
        String code = "" + barCode;
        if (code.length() == CODE_LENGTH){
            return barCode;
        }
        return -1;
    }

    // constructor
    public Product2(long barCode, String name, double price) {
        this.barCode = barCode;
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public long getBarCode() {
        return barCode;
    }
    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product2 product)) return false;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(barCode);
    }

    @Override
    public String toString() {
        return "Product:" + "\n" +
                "Name:             " + name + "\n" +
                "Price:            " + price + " €" + "\n" +
                "barCode:          " + barCode;
    }

} // End of class
