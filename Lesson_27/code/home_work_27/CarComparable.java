package home_work_27;

import java.util.Objects;

public class CarComparable implements Comparable<CarComparable>{

    // fields  бренд, цвет, стоимость, год выпуска
    private String brand;
    private String color;
    private double price;
    private int YearOfProduction;

    // constructor
    public CarComparable(String brand, String color, double price, int yearOfProduction) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        YearOfProduction = yearOfProduction;
    }

    // getters and setters
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        YearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof CarComparable that)) return false;
        return Double.compare(price, that.price) == 0 && YearOfProduction == that.YearOfProduction && Objects.equals(brand, that.brand) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, color, price, YearOfProduction);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CarComparable{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", YearOfProduction=").append(YearOfProduction);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(CarComparable car) {
        return this.getBrand().compareTo(car.getBrand());
    }

} // End of class
