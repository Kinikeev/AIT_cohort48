package ait.employee_company.dao;

import ait.employee_company.model.Employee;

public interface Company {

    // здесь будут только абстрактные методы для Employee and children

    /*   C - create
         R - read
         U - update
         D - delete
     */
    // dao - Date assess object

    // искать в списке
    Employee findEmployee (int id);

    // обновлять данные
    Employee updateEmployee (Employee employee);

    // нанимать сотрудников C - create
    boolean addEmployee (Employee employee);     // boolean - отвечает за то, что удалось добавить или нет

    // увольнять
    Employee removeEmployee (int id);

    // напечатать
    void printEmployee ();

    // количество сотрудников
    int quantity();

    // начислять зарплату,
    double totalSalary ();

    // оборот продажи
    double totalSales ();

    Employee[] findEmployeeGrateHoursThan(double hours);

} // End of class
