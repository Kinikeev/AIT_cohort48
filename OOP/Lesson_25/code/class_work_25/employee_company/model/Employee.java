package class_work_25.employee_company.model;

import java.util.Objects;

public abstract class Employee {

    // для создания полей в абстрактном классе рекомендуется использовать protected

    // fields:
    protected static double minWage = 13;
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected double hours;

    // constructor
    public Employee(int id, String firstName, String lastName, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hours = hours;
    }

    // getter and setter for mimWage
    public static double getMinWage() {
        return minWage;
    }

    public static void setMinWage(double minWage) {
        if (minWage >= Employee.minWage) {
            Employee.minWage = minWage;
        }
    }
    // getters and setters


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // Method protect from mistake in salary department
    public double ensureSalary(double salary){
        if (salary < hours * minWage){
            salary = hours * minWage;
        }
        return salary;
    }

    // абстрактный метод , требует реализации в дочернем классе
    public abstract double salary(); //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append('}');
        return sb.toString();
    }
} // End of class
