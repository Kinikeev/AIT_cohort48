package home_work_17.product.model_17;
/*
    Задача 1. Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat,
              которые хранят тип молока и жирность продукта соответственно.

      Task 1. Create a MilkFood class extending the Food class with private String milkType fields,
              private double fat, which store the type of milk and fat content of the product, respectively.
 */

import java.util.Objects;

public class MilkFood extends Food {

    private String milkType;
    private double fat;

    public MilkFood(double price, String name, long barCode, String expDate, String milkType, double fat) {
        super(price, name, barCode, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    public String getMilkType() {
        return milkType;
    }
    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Milk type:        " + milkType + "\n" +
                "Fat:              " + fat + " %";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MilkFood milkFood)) return false;
        if (!super.equals(object)) return false;
        return Double.compare(fat, milkFood.fat) == 0 && Objects.equals(milkType, milkFood.milkType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), milkType, fat);
    }

} // End of class
