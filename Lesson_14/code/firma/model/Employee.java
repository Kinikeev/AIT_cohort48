package firma.model;

public class Employee {

    // fields
    private int id;
    private String name;
    private String lastName;
    private boolean gender;
    private double salary;

    // constructor

    public Employee (int id,String name,String lastName,boolean gender,double salary){
        this.id= id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }
    // getters and setters:
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", gender: " + gender +
                ", salary: " + salary +
                '}';
    }

    public void work(){
        System.out.println("Employee is working...");
    }
    public void lunch(){
        System.out.println("Employee " + getLastName() + " is eating lunch.");
    }

} // End of class
