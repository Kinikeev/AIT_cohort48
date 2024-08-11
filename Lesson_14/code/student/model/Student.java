package student.model;
    /*
      Задача 2. Создать класс Студент (Student) с приватными полями:
                                            Create a Student class with private fields:
        id                                     id
        имя                                    Name
        фамилия                                Surname
        год рождения                           Year of birth
        специализация                          specialization

    Стандартные методы:                      Standard methods:
    - конструктор на все поля;                  - constructor for all fields;
    - геттеры и сеттеры на все поля;            - getters and setters for all fields;
    - метод display.                            - display method.

    Дополнительные методы:                   Additional methods:
      - учиться                                 - study
      - взять отпуск                            - take a vacation
      - сдать экзамен                           - pass the exam
     */

import java.util.Arrays;

public class Student {
    // Creating fields:
    private int id;
    private String name;
    private String surname;
    private int year_of_birth;
    private String specialization;
    private int[] grade;

    // Creating constructor

    public Student(int id, String name, String surname, int year_of_birth, String specialization, int[] grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year_of_birth = year_of_birth;
        this.specialization = specialization;
        this.grade = grade;
    }

    // Creating getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear_of_birth() {
        return year_of_birth;
    }
    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // display:
    public void display(){
        System.out.println("| id:             "+id+" \n" +
                           "| Name:           "+name+" \n" +
                           "| Surname:        "+surname+" \n" +
                           "| year_of_birth:  "+year_of_birth+" \n" +
                           "| specialization: "+specialization+"\n" +
                           "-------------------------------------------");
    }
    // Additional methods:
    public void study(){
        System.out.println("Student " + getName() + " " + getSurname() + " - study.");
    }
    public void takeVacation(){
        System.out.println("Student " + getName() + " " + getSurname() + " - takes the vacation.");
    }
    public void passExam(){
        System.out.println("Student " + getName() + " " + getSurname() + " - pass the exam.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year_of_birth=" + year_of_birth +
                ", specialization='" + specialization + '\'' +
                ", grade=" + Arrays.toString(grade) +
                '}';
    }
    public void displayStudent(){
        printGrade(grade);
    }
    private void printGrade(int[] grade){
        for (int i = 0; i < grade.length; i++) {
            System.out.print(grade[i] + " | ");
        }
        System.out.println();
        System.out.println("------------------------------------");
    }


} // End of class
