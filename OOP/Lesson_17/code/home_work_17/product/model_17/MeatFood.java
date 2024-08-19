package home_work_17.product.model_17;
/*
    Задача 1. Создать класс MeatFood расширяющий класс Food с полем private String meatType,
              которое хранит тип мяса, из которого изготовлен продукт.

      Task 1. Create a MeatFood class extending the Food class with a private String meatType field
              that stores the type of meat from which the product is manufactured.
 */

import java.util.Objects;

public class MeatFood extends Food {

    private String meatType;  //

    public MeatFood(double price, String name, long barCode, String expDate, String meatType) {
        super(price, name, barCode, expDate);
        this.meatType = meatType;
    }

    public String getMeatType() {
        return meatType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Meat type:        " + meatType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof MeatFood meatFood)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(meatType, meatFood.meatType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), meatType);
    }

} // End of class
