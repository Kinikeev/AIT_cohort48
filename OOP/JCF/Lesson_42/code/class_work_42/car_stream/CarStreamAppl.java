package class_work_42.car_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarStreamAppl {

    // Задание 2. Класс Car (regNumber, brand, age, color) и работа со списком объектов класса:
    //
    //Перебор всех элементов carList с помощью forEach() и вывод их в консоль
    //Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль.
    //Из регистрационного номера - только буквы
    //Сортировка списка по полю age
    //Сортировка списка по нескольким свойствам: brand, age, color.
    //Рассчитать средний возраст
    //Сделать проверку, что у всех Car возраст (age) больше 5 лет
    //Определить количество машин разных цветов
    public static void main(String[] args) {

        List<CarStream> cars = Arrays.asList(
                new CarStream("AB123CD", "Audi", 5, "Red"),
                new CarStream("EF456GH", "Mercedes", 3, "Red"),
                new CarStream("IJ789KL", "Audi", 5, "Black"),
                new CarStream("MN012OP", "Tesla", 1, "Green"),
                new CarStream("QR345ST", "Volkswagen", 6, "Red"),
                new CarStream("UV678WX", "Toyota", 2, "Green") );

        printCars(cars);

        //   Из регистрационного номера - только буквы
        printLettersOfRegNumber(cars);

        //Сортировка списка по полю age
        List<CarStream> carsByAge = sortCarsByAge(cars);
        printCars(carsByAge);

        //Сортировка списка по нескольким свойствам: brand, age, color.
        List<CarStream> carsSorted = sortCarsByBrandAgeColor(cars);
        printCars(carsSorted);

        //Рассчитать средний возраст
        double avgAge = cars.stream()
                .mapToInt(car -> car.getAge() )
                .summaryStatistics()
                .getAverage();
        System.out.println("Average age = " + avgAge);

        //Сделать проверку, что у всех Car возраст (age) больше 5 лет
        int age = 10;
        isMoreThenNAge(cars,age);

        //Определить количество машин разных цветов
        printNumberOfColors(cars);
        // количество машин заданного цвета
        String color = "Red";
        long carsByColor = calcCarsByColors(cars,color);
        System.out.println("Color " + color + " cars: " + carsByColor);

        // список машин по цветам
        Map<String,List<CarStream>> carsByColors = cars.stream()
                .collect(Collectors.groupingBy(CarStream::getColor));
        for (String colorByCar : carsByColors.keySet()){
            System.out.println("Color: " + colorByCar + ", value: " + carsByColors.get(colorByCar).size()
            + " | " + carsByColors.get(colorByCar));
        }




    } // end of main


    // количество машин заданного цвета
    private static long calcCarsByColors(List<CarStream> cars, String color) {
        return cars.stream()
                .filter(car->car.getColor().equals(color))
                .count();
    }


    //Определить количество машин разных цветов
    private static void printNumberOfColors(List<CarStream> cars) {
        long numberOfColor = cars.stream()
                .map(CarStream::getColor)
                .distinct()
                .count();
        System.out.println("Numbers of colors " + numberOfColor);
    }

    //Сделать проверку, что у всех Car возраст (age) больше 5 лет
    private static void isMoreThenNAge(List<CarStream> cars, int age) {
        int checkAge = age;
        boolean isMoreAge = cars.stream()
                .allMatch(car -> car.getAge() < checkAge);
        System.out.println("Cars more then " + age + " presents: " + isMoreAge);
    }


    //Сортировка списка по нескольким свойствам: brand, age, color.
    private static List<CarStream> sortCarsByBrandAgeColor(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getBrand)
                        .thenComparing(CarStream::getAge)
                        .thenComparing(CarStream::getColor))
                .toList();
    }


    //Сортировка списка по полю age
    private static List<CarStream> sortCarsByAge(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getAge))
                .toList();
    }

    //   Из регистрационного номера - только буквы
    private static void printLettersOfRegNumber(List<CarStream> cars) {
        printCars(cars.stream()
                .map(carStream -> {
                    return new CarStream(
                            carStream.getRegNumber().substring(0,2),
                            carStream.getBrand(),
                            carStream.getAge(),
                            carStream.getColor()
                    );
                })
                .toList()
        );
    }

    private static void printCars(List<CarStream> cars) {
        cars.stream()
                .forEach(n -> System.out.println(n));
        System.out.println("--------------------------------------------------");
    }

}
