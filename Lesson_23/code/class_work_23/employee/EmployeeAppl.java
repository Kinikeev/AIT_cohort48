package class_work_23.employee;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] firma = new Employee[5];  // create array of object type employee

        firma[0] = new Manager(1000,"Bill","Smith",160,5000,5);
        firma[1] = new Worker(2000,"Anna","Muller",160,15);
        firma[2] = new SalesManager(3000,"Peter","Jackson",160,19000,0.1);
        firma[3] = new SalesManager(4000,"Robin","Good",80,20000,0.1);
        //firma[4] = new Employee() {

        printFirma(firma);  // call method

        // total salary
        double totalSalary = totalSalary(firma);
        System.out.println(totalSalary * 12);

        // total sales
        int totalSales = totalSales(firma);
        System.out.println(totalSales * 12);

    } // End of main

    private static void printFirma(Employee[] firma) {
        for (int i = 0; i < firma.length; i++) {
            System.out.println(firma[i]);
        }
    }

    private static double totalSalary(Employee[] firma){
        double totalSalary = 0;
        for (int i = 0; i < firma.length; i++) {
            if (firma[i] != null) {
                totalSalary += firma[i].salary();
                System.out.println(totalSalary);
            }
        }
        return totalSalary;
    }

    private static int totalSales(Employee[] firma){
        int totalSales = 0;
        for (int i = 0; i < firma.length; i++) {
            if (firma[i] instanceof SalesManager sm && firma[i] != null){
                totalSales += (int) sm.getSalesValue();
            }
        }
        return totalSales;
    }

} // End of class
