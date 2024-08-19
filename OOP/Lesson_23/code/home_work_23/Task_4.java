package home_work_23;
    /*
        Задание 4. (на повторение и закрепление)
        Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        Найдите среднюю величину по всем четным элементам массива.
        Разработайте соответсвующий тест (набор тестов).

        Task 4. (for review and consolidation)
        You are given an array of integers {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}.
        Find the average value for all even elements of the array.
        Develop a corresponding test (set of tests).
     */

public class Task_4 {


    // Find the average value for all even elements of the array.
    public int findAverageValueAllEvenElements (int[] array){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){              // Проверяем, является ли элемент четным
                sum += array[i];
                count ++;
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
        int average = sum / count;
        System.out.println("The average value for all even elements of the array = " + average);
        return average;
    }

} // End of class
