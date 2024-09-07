package home_work_23.shape;

public class Circle extends Shape {

    // fields  dimension = radius;

    // constructor
    public Circle(double dimension) {
        super(dimension);
    }

    // calculate area of circle
    @Override
    protected double calcArea() {
        return dimension * dimension * Math.PI;
    }

    // calculate perimeter of circle
    @Override
    protected double calcPerimeter() {
        return 2 * Math.PI * dimension;
    }
} // End of class
