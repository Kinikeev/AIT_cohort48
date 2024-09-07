package class_work_30.month;

public class MonthAppl {
    public static void main(String[] args) {

        Month m = Month.FEB;
        System.out.println(m);

        m.plusMonth(m,6);
        System.out.println(m.plusMonth(m,6));

        m = Month.APR;
        System.out.println(m.plusMonth(m,6));


    } // End of class
}
