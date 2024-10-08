package ait.employee_company.model;
    /*
    - создать дочерние классы practice.model.Manager, practice.model.SalesManager и Worker,
      реализовать в них методы начисления зарплаты:
    - practice.model.Manager: base + grade*hours
    - practice.model.SalesManager: salesValue * percent
    - Worker: grade*hours
     */


public class Worker extends Employee {

    private double wage;

    // constructor
    public Worker(int id, String firstName, String lastName, double hours, double wage) {
        super(id, firstName, lastName, hours);
        this.wage = wage;
    }
    // getters and setters
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public double salary() {
        double salary = wage * hours; // calculate salary
        //salary = ensureSalary(salary);
        return ensureSalary(salary);
    }


} // End of class
