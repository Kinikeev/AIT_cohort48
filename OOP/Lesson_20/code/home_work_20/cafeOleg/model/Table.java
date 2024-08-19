package home_work_20.cafeOleg.model;
/*
 **Задача 1.**
Ваш приятель собирается открыть кафе на 10 столиков.
У него сложности с бюджетом, он не может себе позволить купить готовую программу,
поэтому он просит вас написать ему приложение для управления столиками в течение рабочего дня.
Помогите ему в этом.
*/
import java.util.Objects;

public class Table {

    int id;
    int numberOfSeats;
    boolean isReserved;

    public Table(int id, int numberOfSeats, boolean isReserved) {
        this.id = id;
        this.numberOfSeats = numberOfSeats;
        this.isReserved = isReserved;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Table table)) return false;
        return id == table.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        String str = "";
        if (isReserved) {
            str = "table is reserved";
        } else {
            str = "table is free";
        }
        return "Table{" +
                "id: " + id +
                ", number of seats: " + numberOfSeats +
                ", reservation status:" + str +
                '}';
    }
} // End of class
