package firma;

import firma.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Leonid","Klein",true,2000);
        Employee e2 = new Employee(2,"Robert","Kinikeev",true,2500);
        Employee e3 = new Employee(3,"Juri","Wist",true,3000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary();
        System.out.println("Total salary = " + totalSalary);

        System.out.println(e1.getLastName());
        e1.work();
        System.out.println(e2.getLastName());
        e2.lunch();
        System.out.println(e3.getLastName());
        e3.work();

    }
}
