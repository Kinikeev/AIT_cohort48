package home_work_27;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Заполним массив случайными числами от 1 до 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Генерируем число от 1 до 100
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортируем с помощью OddEvenComparator
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray);

        System.out.println("Отсортированный массив: " + Arrays.toString(integerArray));
    }
}
