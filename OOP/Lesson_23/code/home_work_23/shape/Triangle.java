package home_work_23.shape;

public class Triangle extends Shape {

    // field

    // constructor
    public Triangle(double dimension) {
        super(dimension);
    }

    // calculate area of triangle
    @Override
    protected double calcArea() {
        return dimension * dimension * Math.sqrt(3) / 4;
    }

    // calculate perimeter of triangle
    @Override
    protected double calcPerimeter() {
        return dimension * 3;
    }
} // End of class
