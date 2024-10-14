package home_work_43.parcel.model;

    // Создайте класс Parcel (посылка) с полем double weight - вес посылки.

public class Parcel {

    private double weight;

    public Parcel(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "weight: " + weight +
                '}';
    }
}
