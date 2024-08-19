package home_work_23.shape;

public class Square extends Shape{

    // constructor
    public Square(double dimension) {
        super(dimension);
    }

    // calculate area of square
    @Override
    protected double calcArea() {
        return dimension * dimension;
    }

    // calculate perimeter of square
    @Override
    protected double calcPerimeter() {
        return dimension * 4;
    }

} // End of class
