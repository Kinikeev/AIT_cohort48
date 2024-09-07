package class_work_20.number_convert;

public class NumberConvert {
    public static void main(String[] args) {
        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-й степени : " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в 8-й степени : " + string2);

        String string3 = Long.toBinaryString(254);
        System.out.println("254 в 2-й степени : " + string3);

    } // End of main

} // End of class
