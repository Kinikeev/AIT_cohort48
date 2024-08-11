package home_work_15.cube;
/*
    Задача 2. Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения
    периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.

    Task 2. Create a Cube class that describes a cube with side a. Implement in it methods for determining
    the perimeter p (the sum of the lengths of all edges), area s (the sum of the areas of all faces) and volume v.
 */
public class Cube {
    // field
    private int side;
    // constructor
    public Cube(int side) {
        this.side = side;
    }
    // getter and setter
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    // method for determining the perimeter p (the sum of the lengths of all edges)
    public int perimeter(){
        return side * 12;
    }
    // method for determining the area s (the sum of the areas of all faces)
    public int area(){
        return side * side * 6;
    }
    // method for determining the volume v.
    public int volume(){
        return side * side * side;
    }
    // display
    public void display(){
        System.out.println("Cube:\n" +
                           "side:      a = " + side +" cm.\n" +
                           "perimeter: p = " + perimeter() + "cm.\n" +
                           "area:      s = " + area() + "cm².\n" +
                           "Volume:    v = " + volume() + "cm³.");
    }

} // End of class
