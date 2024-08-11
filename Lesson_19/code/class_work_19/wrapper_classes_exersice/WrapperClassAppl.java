package class_work_19.wrapper_classes_exersice;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {

        int k = 1234567890;
        System.out.println(k);
        System.out.println("-----------------------------------------");

        Integer myInt = Integer.parseInt("1234567890");
        System.out.println(myInt + 5);
        System.out.println("-----------------------------------------");

        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);
        System.out.println("-----------------------------------------");

        // кол-во цифр в числеб версия 2
        Integer x = 123456789; // автоупаковка int в Integer
        String str = x.toString();
        int l = str.length();
        System.out.println(x + " contains " + l + " digits or symbols");
        System.out.println("-----------------------------------------");
        System.out.println("Max value of Integer: " + x.MAX_VALUE);
        System.out.println("Min value of Integer: " + x.MIN_VALUE);

        // присвоение и умножение
        int n = 20;
        Integer m = 10;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        System.out.println("-----------------------------------------");
        m = m + n;
        System.out.println("m + n = " + m);
        n = n + m;
        System.out.println("n + m = " + n);
        System.out.println("-----------------------------------------");

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);
        System.out.printf("Length = %.2f",circleLength);
        System.out.println("-----------------------------------------");

        // обработка деления на 0
        double a = 20.0 / 0;
        System.out.println(a);
        if (Double.isInfinite(a) || Double.isNaN(a)){
            System.out.println("Wrong operation or incorrect result");
        }
        else {
            System.out.println(a);
        }

        // перевод  строки в число
        String str1 = "0987654321";
        int num = Integer.parseInt(str1);
        System.out.println(num);
        System.out.println("-----------------------------------------");

        String str2 = "2.7118281828";
        double exp = Double.parseDouble(str2);
        System.out.println("exp = " + exp);







    } // End of class
}
