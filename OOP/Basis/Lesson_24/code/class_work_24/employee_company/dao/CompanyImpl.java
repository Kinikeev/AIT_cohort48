package class_work_24.employee_company.dao;

import class_work_24.employee_company.model.Employee;
import class_work_24.employee_company.model.Manager;
import class_work_24.employee_company.model.SalesManager;
import class_work_24.employee_company.model.Worker;

public class CompanyImpl implements Company {

    private Employee[] employees;  // array of objects
    private int size;    // current size of array     текущиее количество

    // constructor
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];  // this не обязательно
        //this.size = 0;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null) {
            return false;
        }
        if (employees.length == size) {
            return false;
        }
        if (findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee;
        size++;
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = null;
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                victim = employees[i];
                employees[i] = employees[size - 1];
                employees[size - 1] = null;
                size --;
                break;
            }
        }

        return victim;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof Worker) {
                totalSalary += employees[i].getHours() * ((Worker) employees[i]).getWage();
                System.out.println("Worker" + totalSalary);
            }
            if (employees[i] instanceof Manager) {
                totalSalary += ((Manager) employees[i]).getBaseSalary() + employees[i].getHours() * ((Manager) employees[i]).getGrade();
                System.out.println("Manadger" + totalSalary);
            }
            if (employees[i] instanceof SalesManager) {
                double ensureSalary = employees[i].getHours() * 13;
                double salary = ((SalesManager) employees[i]).getPercent() * ((SalesManager) employees[i]).getSalesValue();
                if (ensureSalary > salary) {
                    totalSalary += ensureSalary;
                } else {
                    totalSalary += salary;
                }
                System.out.println("Sales" + totalSalary);
            }
        }
        return totalSalary * 12;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager) {
                totalSales += ((SalesManager) employees[i]).getSalesValue();
            }
        }
        return totalSales * 12;
    }
} // End of class

