package home_work_23.shape;
    /*
    Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter.
     */

public abstract class Shape {

    // field
    protected double dimension; // Поле для хранения размера (например, радиус, сторона, высота)

    // constructor
    public Shape(double dimension) {
        this.dimension = dimension;
    }

    // getters and setters
    public double getDimension() {
        return dimension;
    }
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    protected abstract double calcArea(); // Абстрактный метод для расчета площади
    protected abstract double calcPerimeter(); // Абстрактный метод для расчета периметра

} // End of class
