package class_work_24.employee_company.dao;

import class_work_24.employee_company.model.Employee;
// абстрактные классы - полезны для НАСЛЕДОВАНИЯ, невозможно СОЗДАВАТЬ ОБЪЕКТЫ на их основе,
// для создания полей в абстрактном классе рекомендуется использовать protected
//абстрактные методы - не содержат ТЕЛА, имеется только СИГНАТУРА

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

} // End of class
