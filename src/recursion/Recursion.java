package recursion;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(power(6,6));
        System.out.println(powerFor(5,5));

        System.out.println(decimalBinary(155));
        int binary = Integer.parseInt(decimalBinary(155));
        System.out.println("int binary = " + binary);

        double[] b = {1,2,3,4};
        System.out.println(average(b));
        System.out.println("Factorial = " + factorial(4));
        System.out.println("Sum for = " + sumOfNumberF(5)); // 1 2 3 4 5 = 15
        System.out.println("Sum rec = " + sumOfNumbersR(5));
        StringBuilder str = new StringBuilder("1234567");
        str.reverse();

        System.out.println(str);

    } // end of main

    public static int sumOfNumberF(int n){
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sumOfNumbersR(int n){
        if (n == 0)
            return 0;
        return sumOfNumbersR(n - 1) + n;
    }

    public static int factorial(int n){
        /* n! = 1 * 2 * 3 * ..... n.  n * f(n - 1)                1-1
           4! = 4 * f(4 - 1)   = 4 * 6 = 24
           (4 - 1) = (n = 3)     3 * f(3 - 1) = 3 * 2 = 6
           (3 - 1) = (n = 2)     2 * f(2-1)   = 2 * 1 = 2
           (2 - 1) = (n = 1)     1 * f(n = 1) = 1 * 1 = 1
                                                               1

         */

        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
    public static int powerFor(int num, int pow){
        int mul = 1;
        for (int i = 1; i <= pow ; i++) {
            mul *= num;
        }
        return mul;
    }

    public static int power (int number,int pow){
        if (pow == 0)
            return 1;
        return number * power(number,pow - 1);
    }
    public static void decimalToBinary(int number) {
        System.out.print(number + " -> Decimal to binary -> ");
        String bin = "";
        for (int i = number; i >= 1; i /= 2) {
            bin += i % 2;
            System.out.print(i);
            if (i != 1)
                System.out.print("/2 ");
        }
        String result = "";
        for (int i = bin.length() - 1; i >= 0; i--) {
            char ch = bin.charAt(i);
            result += ch;
        }
        int binary = Integer.parseInt(result);
        System.out.println(" = " + binary);
    }

    public static String decimalBinary(int n){
        if (n == 1)
            return "1";
        return decimalBinary(n / 2) + n % 2;
    }

    public static double average (double[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+= a[i];
        }
        return sum/a.length;
    }

} // end of class
