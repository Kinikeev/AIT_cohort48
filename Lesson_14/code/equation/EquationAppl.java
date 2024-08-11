package equation;
    /*
      Задача 3.(*): Создать клас EquationAppl в пакете equation с методом main.
      В методе main создать несколько экземпляров QuadraticEquation и
      вывести для каждого из них результаты работы методов display, delta, quantityRoots.
     */
    /* Task 3.(*): Create a class EquationAppl in the equation package with the main method.
       In the main method, create several instances of QuadraticEquation and
       print for each of which are the results of the display, delta, quantityRoots methods.
     */

import equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {

        QuadraticEquation equation1 = new QuadraticEquation(3,4,5);
        QuadraticEquation equation2 = new QuadraticEquation(1.6,7.3,4.8);
        QuadraticEquation equation3 = new QuadraticEquation(0,4,3);
        QuadraticEquation equation4 = new QuadraticEquation(6,0,7);
        QuadraticEquation equation5 = new QuadraticEquation(0,0,5);
        equation1.display();
        System.out.println("Calculate the discriminant: D = " +  equation1.delta());
        System.out.println("Number of solutions to the equation = " + equation1.quantityRoots());
        System.out.println("--------------------------------------------------");
        equation2.display();
        System.out.println("Calculate the discriminant: D = " +  equation2.delta());
        System.out.println("Number of solutions to the equation = " + equation2.quantityRoots());
        System.out.println("--------------------------------------------------");
        equation3.display();
        System.out.println("Calculate the discriminant: D = " +  equation3.delta());
        System.out.println("Number of solutions to the equation = " + equation3.quantityRoots());
        System.out.println("--------------------------------------------------");
        equation4.display();
        System.out.println("Calculate the discriminant: D = " +  equation4.delta());
        System.out.println("Number of solutions to the equation = " + equation4.quantityRoots());
        System.out.println("--------------------------------------------------");
        equation5.display();
        System.out.println("Calculate the discriminant: D = " +  equation5.delta());
        System.out.println("Number of solutions to the equation = " + equation5.quantityRoots());
        System.out.println("--------------------------------------------------");

    } // End of main

} // End of class
