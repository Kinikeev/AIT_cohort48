package home_work_33.fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci(8);

        // - распечатать первые 8 чисел из ряда Фибоначчи
        // 1, 1, 2, 3, 5, 8, 13, 21 - это должно получиться

        for (Integer fib : fibonacci) {
            System.out.print(fib + " | ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        // - сложить все эти числа
        // sum = 54
        int sum = 0;
        for (Integer num : fibonacci) {
            sum += num;
            // System.out.println(num);
        }
        System.out.println("Sum = " + sum);

    }
}
