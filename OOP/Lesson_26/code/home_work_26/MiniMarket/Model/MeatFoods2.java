package home_work_26.MiniMarket.Model;

import java.util.Objects;

public class MeatFoods2 extends Food2{

    private String meatType;

    // constructor
    public MeatFoods2(long barCode, String name, double price, String expDate, String meatType) {
        super(barCode, name, price, expDate);
        this.meatType = meatType;
    }

    // getters and setters
    public String getMeatType() {
        return meatType;
    }
    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MeatFoods2 meat2)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(meatType, meat2.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meat ");
        sb.append(super.toString());
        sb.append(" meatType: ").append(meatType);
        sb.append(" |");
        return sb.toString();
    }
} // End of class
