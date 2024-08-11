package class_work_24.employee_company.test;

import class_work_24.employee_company.dao.Company;
import class_work_24.employee_company.dao.CompanyImpl;
import class_work_24.employee_company.model.Employee;
import class_work_24.employee_company.model.Manager;
import class_work_24.employee_company.model.SalesManager;
import class_work_24.employee_company.model.Worker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] firma;


    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);

        firma = new Employee[5]; // create array of objects type Employee

        firma[0] = new Manager(1000, "Bill", "Smith", 160, 5000, 5);
        firma[1] = new Worker(2000, "Anna", "Muller", 160, 15);
        firma[2] = new SalesManager(3000, "Peter", "Jackson", 160, 19000, 0.1);
        firma[3] = new SalesManager(4000, "Robin", "Good", 80, 20000, 0.1);

        for (int i = 0; i < firma.length; i++) {
            company.addEmployee(firma[i]);
        }
    }

    @Test
    void findEmployee() {
        // find
        assertEquals(firma[1], company.findEmployee(2000));
        // find absent
        assertNull(company.findEmployee(5000));
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void addEmployee() {
        assertFalse(company.addEmployee(null)); // add null
        assertFalse(company.addEmployee(firma[0])); //try to add duplicate
        Employee employee = new SalesManager(5000, "Mikhael", "Shumaher", 160, 20000, 0.1);
        assertTrue(company.addEmployee(employee)); // add one more
        assertEquals(5, company.quantity()); // check
        employee = new SalesManager(6000, "Nik", "Shumaher", 160, 20000, 0.1);
        assertFalse(company.addEmployee(employee)); // oversize company
    }

    @Test
    void removeEmployee() {
        Employee employeeVictim = company.removeEmployee(5000);
        assertNull(employeeVictim);
        assertEquals(4, company.quantity());
        assertNull(company.removeEmployee(6000));
        assertEquals(firma[2],company.removeEmployee(3000));
        assertEquals(3,company.quantity());
    }

    @Test
    void printEmployee() {
        company.printEmployee();
        company.addEmployee(new Worker(8000,"Andreas","Bauer",180,18));
        System.out.println("--------------------------------------------------------------");
        company.printEmployee();
    }

    @Test
    void quantity() {
        assertEquals(4,company.quantity());
        company.removeEmployee(2000);
        assertEquals(3,company.quantity());
    }

    @Test
    void totalSalary() {
        assertEquals(147360.0,company.totalSalary());
        Employee employee = new SalesManager(6000, "Nik", "Shumaher", 160, 40000, 0.1);
        company.addEmployee(employee);
        assertEquals(195360,company.totalSalary());
    }

    @Test
    void totalSales() {
        assertEquals(468000,company.totalSales());
        Employee employee = new SalesManager(5000, "Mikhael", "Shumaher", 160, 20000, 0.1);
        company.addEmployee(employee);
        assertEquals(708000,company.totalSales());
    }

} // End of class