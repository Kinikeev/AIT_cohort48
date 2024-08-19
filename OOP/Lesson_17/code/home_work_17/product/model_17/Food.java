package home_work_17.product.model_17;
/*
    Задача 1. Создать класс Food расширяющий класс Product с полем private String expDate,
              которое хранит дату истечения срока годности.

      Task 1. Create a Food class that extends the Product class with a private String expDate field
              that stores the expiration date.
 */

import java.util.Objects;

public class Food extends Product {

    private String expDate;     // дата срока годности

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Expiration date:  " + expDate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Food food)) return false;
        if (!super.equals(object)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }

} // End of class
