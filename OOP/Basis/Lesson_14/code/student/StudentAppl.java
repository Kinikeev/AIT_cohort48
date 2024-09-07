package student;
    /*
     Задача 2: В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.
     Task 2:  In the StudentAppl class, create several students. Display the learning process.
     */

import student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {

        Student student1 = new Student(21,"Peter","Schwarz",2001,"Front end.", new int[] {1,2,3});
        Student student2 = new Student(22,"Limani","Alert",2002,"Back end.", new int[] {2,3,4});
        Student student3 = new Student(23,"Kuhn","Alex",2000,"Linux", new int[] {2,3,5});

        student1.display();
        student2.display();
        student3.display();
        student2.study();
        student3.takeVacation();
        student1.passExam();

    } // End of main

} // End of class
