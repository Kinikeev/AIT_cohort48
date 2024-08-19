package home_work_26.Market.Model;

import java.util.Objects;

public class MilkFoods2 extends Food2{

    private String milkType;
    private double fat;

    // constructor
    public MilkFoods2(long barCode, String name, double price, String expDate, String milkType, double fat) {
        super(barCode, name, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    // getters and setters
    public String getMilkType() {
        return milkType;
    }
    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }
    public double getFat() {
        return fat;
    }
    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MilkFoods2 that)) return false;
        if (!super.equals(object)) return false;
        return Double.compare(fat, that.fat) == 0 && Objects.equals(milkType, that.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Milk type:        " + milkType + "\n" +
                "Fat:              " + fat + " %";
    }

} // End of class
