package home_work_27;

import java.util.Comparator;

public class OddEvenComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // Сначала проверяем, являются ли числа четными или нечетными
        if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1; // o1 четное, o2 нечетное
        } else if (o1 % 2 != 0 && o2 % 2 == 0) {
            return 1; // o1 нечетное, o2 четное
        } else {
            return 0; // оба числа четные или оба нечетные, порядок не важен
        }
    }

} // End of class
