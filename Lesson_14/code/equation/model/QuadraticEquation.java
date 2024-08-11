package equation.model;
    /*
     Задача 3.(*) Создать класс QuadraticEquation в пакете equation.model.
      - В этом классе определить поля private double a; private double b; private double c;.
      - Создать конструктор public QuadraticEquation(double a, double b, double c) для инициализации полей.
      - Создать геттеры и сеттеры.
      - Создать метод public void display() для печати в консоль квадратного уравнения.
      - Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта
        и количества решений уравнения соответственно.
     */
    /*
     Task 3.(*) Create a QuadraticEquation class in the equation.model package.
      - In this class, define the fields private double a; private double b; private double c;.
      - Create a constructor public QuadraticEquation(double a, double b, double c) to initialize fields.
      - Create getters and setters.
      - Create a public void display() method to print a quadratic equation to the console.
      - Create methods public double delta() and public int quantityRoots() to calculate the discriminant
        and the number of solutions to the equation, respectively.
     */
public class QuadraticEquation {

    // fields:
    private double a, b, c;

    // constructor:  (конструктор с заданием всех коэффициентов сразу)
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /** constructor:
        * конструктор без аргументов
        * с начальными значениями коэффициентов - нулями,
        * чтобы коэффициенты можно было изменить позже.

    public QuadraticEquation() {
        a = 0;
        b = 0;
        c = 0;
    }
     */
    // getters and setters:
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    // Method to print a quadratic equation to the console.
    // квадратное уравнение: ax² + bx + c = 0;
    public void display(){
        System.out.println("A quadratic equation: ax² + bx + c = 0; \n" +
                getA() + " * x² + " + getB() + " * x + " + getC() + " = 0;");
    }
    // calculate the discriminant: D = b² - 4 * a * c ; - ( это если a != 0 )
    public double delta(){
        return Math.pow(b,2) - 4 * a * c;
    }
    // calculate the number of solutions to the equation, respectively.
        /**
         В квадратном уравнении может быть несколько ситуаций:
         * дискриминант < 0, тогда корней нет,
         * дискриминант == 0, тогда корень один,
         * дискриминант > 0, тогда корней два,
         * и два варианта, когда a == 0:
         * b != 0, тогда корень один (x = -c/b),
         * b == 0, тогда корней бесконечное множество.
         */
    public int quantityRoots(){
        if (delta() < 0 && a != 0){
            return 0;
        }
        else if ((delta() == 0 && a != 0) || a == 0 && b != 0){
            return 1;
        }
        else if (delta() > 0 && a != 0){
            return 2;
        }
        else return Integer.MAX_VALUE;
    }

} // End of class






















