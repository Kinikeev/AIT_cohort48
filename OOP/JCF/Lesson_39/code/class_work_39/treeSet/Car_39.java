package class_work_39.treeSet;

import java.util.Objects;

public class Car_39 implements Comparable<Car_39> {

    // fields:
    private String regNamber;
    private String model;
    private String company;
    private double engine;
    private String color;

    // constructor
    public Car_39(String regNamber, String model, String company, double engine, String color) {
        this.regNamber = regNamber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

    // getters
    public String getRegNamber() {
        return regNamber;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    // setters
    public void setRegNamber(String regNamber) {
        this.regNamber = regNamber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNamber='").append(regNamber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car_39 o) {
        return this.getRegNamber().compareTo(o.getRegNamber()) ;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Car_39 car)) return false;
        return Objects.equals(regNamber, car.regNamber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNamber);
    }


} // End of class
