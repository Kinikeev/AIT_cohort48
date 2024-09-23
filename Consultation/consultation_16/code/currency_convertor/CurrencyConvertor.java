package currency_convertor;

//  Соберите в HashSet не менее 10 наименований национальных валют (EUR, USD и т.д).
//  Создайте enum с кодами валют и их текущими курсами к евро.
//  Выведите список валют и их курсов на экран.
//  Реализуйте возможность для пользователя выбрать желаемую валюту, ввести ее количество и узнать,
//  сколько он получит при обмене на евро.

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {

        // 1. из ENUM делаем массив при помощи метода Currency.values();
        Currency[] currencies = Currency.values(); // values введёт в массив все его значения

        // 2. создаём метод printCurrencies для распечатки массива
        printCurrencies(currencies);

        // 3. нужно спросить пользователя что он хочет узнать и дать ему результат
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of currency");
        String choice = scanner.nextLine();
        System.out.println("Input amount of money: ");
        String amount = scanner.nextLine();
        // convert String to Double
        double quantity = Double.parseDouble(amount);
        double rate = 0;

        switch (choice) {
            case "1" -> rate = Currency.EUR.getRate();
            case "2" -> rate = Currency.USD.getRate();
            case "3" -> rate = Currency.CHF.getRate();
            case "4" -> rate = Currency.GBP.getRate();
            default -> System.out.println("Wrong input.");
        }
        // вычисляем результат
        double res = quantity / rate;
        System.out.printf("You get: %.2f ", res);
        System.out.println("euro");

    }

    // 2. создаём метод printCurrencies для распечатки массива
    private static void printCurrencies(Currency[] currencies) {
        for (Currency c : currencies){
            System.out.println(c);
        }
        System.out.println("------------------------------------------------------------------------------");
    }
}
