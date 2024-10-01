package home_work_40;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DigitsFreqApp {

    // Задача 3(*). В классе DigitsFreqApp сгенерировать один миллион положительных целых чисел
    // в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.

    public static void main(String[] args) {

        // Генератор случайных чисел
        Random random = new Random();

        // Создаём коллекцию для хранения частоты встречаемости цифр
        Map<Integer,Integer> digitFrequency = new HashMap<>();

        // Инициализируем частоту цифр от 0 до 9
        for (int i = 0; i <= 9 ; i++) {
            digitFrequency.put(i,0); // K - цифры от 0 до 9; V - count каждой = 0;
        }

        // Генерация одного миллиона чисел в интервале от 100 до 1000
        for (int i = 0; i < 1_000_000; i++) {
            int number = 100 + random.nextInt(901);

            // Подсчет частоты цифр в числе
            while (number > 0){
                int digit = number % 10; // Получаем последнюю цифру (остаток)
                // любое число делимое на 10 даёт остаток от 0 до 9
                digitFrequency.put(digit,digitFrequency.get(digit) + 1); // Увеличиваем счетчик
                number /= 10; // Убираем последнюю цифру
            }
        }
        // Вывод результата
        System.out.println("Частота встречаемости цифр:");
        for (Map.Entry<Integer,Integer> entry : digitFrequency.entrySet()){
            System.out.println("Digit: " + entry.getKey() + " has count: " + entry.getValue());
        }


    }
}
