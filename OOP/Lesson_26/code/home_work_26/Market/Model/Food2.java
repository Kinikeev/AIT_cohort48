package home_work_26.Market.Model;

import java.util.Objects;

public class Food2 extends Product2{

    private String expDate;

    // constructor
    public Food2(long barCode, String name, double price, String expDate) {
        super(barCode, name, price);
        this.expDate = expDate;
    }

    // getters and setters
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Food2 food2)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(expDate, food2.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Expiration date:  " + expDate;
    }

} // End of class
