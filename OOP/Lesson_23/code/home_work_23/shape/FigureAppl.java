package home_work_23.shape;
    /*
        Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
        Добавьте в массив два круга, один треугольник и один квадрат.
        Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
     */

public class FigureAppl {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Circle(10);
        shapes[2] = new Triangle(7);
        shapes[3] = new Square(6);


        System.out.println("Total area all shapes = " + totalArea(shapes));

        System.out.println("Area of circle   = " + String.format("%.2f",shapes[0].calcArea()));
        System.out.println("Area of circle   = " + String.format("%.2f",shapes[1].calcArea()));
        System.out.println("Area of triangle = " + String.format("%.2f",shapes[2].calcArea()));
        System.out.println("Area of square   = " + String.format("%.2f",shapes[3].calcArea()));
        System.out.println("-----------------------------------------------------------");

        System.out.println("Total perimeter all shapes = " + totalPerimeter(shapes));
        System.out.println("Perimeter of circle   = " + String.format("%.2f",shapes[0].calcPerimeter()));
        System.out.println("Perimeter of circle   = " + String.format("%.2f",shapes[1].calcPerimeter()));
        System.out.println("Perimeter of triangle = " + String.format("%.2f",shapes[2].calcPerimeter()));
        System.out.println("Perimeter of square   = " + String.format("%.2f",shapes[3].calcPerimeter()));
        System.out.println("-----------------------------------------------------------");

        System.out.println("Total area only circles = " + String.format("%.2f", totalCircleArea(shapes)));
        System.out.printf("%.2f",totalCircleArea(shapes));

    } // End of main

    // calculate total areas all figures:
    public static double totalArea (Shape[] shapes){
        double totalArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calcArea();
        }
        return totalArea;
    }

    // calculate total perimeters all figures:
    public static double totalPerimeter (Shape[] shapes){
        double totalPerimeter = 0;
        for (int i = 0; i < shapes.length; i++) {
            totalPerimeter += shapes[i].calcPerimeter();
        }
        return totalPerimeter;
    }

    // calculate total area only circles:
    public static double totalCircleArea (Shape[] shapes){
        double totalCircleArea = 0;
        for (int i = 0; i < shapes.length ; i++) {
            if (shapes[i] instanceof Circle)            // Проверяем, является ли фигура кругом
                totalCircleArea += shapes[i].calcArea();
        }
        return totalCircleArea;
    }

} // End of class
