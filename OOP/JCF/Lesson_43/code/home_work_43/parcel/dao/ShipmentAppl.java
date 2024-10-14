package home_work_43.parcel.dao;

// Создайте класс ShipmentAppl с методом main. Задумайте случайное количество контейнеров (от 10 до 20).
//    В каждом контейнере задумайте случайное количество коробок (от 10 до 20). В каждой коробке задумайте
//    случайное количество посылок (от 5 до 10). Предположим, что каждая посылка в среднем имеет вес = 2 кг.
//
//        - Подсчитайте общее количество посылок во всех ящиках и их общий вес.
//        - Найдите label того из контейнеров, в котором оказалось максимальное количество посылок.
//        - Найдите все контейнеры с максимальным количеством посылок.

import home_work_43.parcel.model.Container;
import home_work_43.parcel.model.Parcel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShipmentAppl {

    List<Container> containers;

    // constructor
    public ShipmentAppl() {
        containers = new ArrayList<>();
        int numContainers = (int) (Math.random() * 11 + 10); // от 10 до 20 контейнеров
        for (int i = 1; i < numContainers; i++) {
            containers.add(new Container("Container: " + i ,(int) (Math.random() * 11 + 10)));
        }
    }

    public static void main(String[] args) {

        ShipmentAppl shipmentApp = new ShipmentAppl();

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("1. Подсчет общего количества посылок и веса:");
        shipmentApp.totalParcelsAndWeight();
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("2. Поиск контейнера с наибольшим количеством посылок:");
        shipmentApp.containerWithMaxParcels();
        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("3.Поиск всех контейнеров с максимальным количеством посылок:");
        shipmentApp.allContainersWithMaxParcels();
        System.out.println("------------------------------------------------------------------------------------");

    } // end of main

    // 3. Метод для поиска всех контейнеров с максимальным количеством посылок
    private void allContainersWithMaxParcels() {
        // Находим максимальное количество посылок в контейнерах
        int maxParcels = containers.stream()
                .mapToInt(container -> container.getBoxes().stream()
                        .mapToInt(box -> box.getParcels().size())
                        .sum())
                .max()
                .orElse(0);  // если контейнеров нет, возвращаем 0

        // Находим все контейнеры, где количество посылок соответствует максимальному
        List<String> containersWithMax = containers.stream()
                .filter(container -> container.getBoxes().stream()
                        .mapToInt(box -> box.getParcels().size())
                        .sum() == maxParcels)
                .map(Container::getLabel)
                .toList();

        System.out.println("Контейнеры с максимальным количеством посылок: " + containersWithMax);

    }

    // 2. Метод для поиска контейнера с наибольшим количеством посылок
    private void containerWithMaxParcels() {
        containers.stream()
                .max(Comparator.comparingInt(container-> container.getBoxes().stream()
                        .mapToInt(box -> box.getParcels().size())
                        .sum()))   // считаем количество посылок в контейнере
                .ifPresent(container -> System.out.println("Контейнер с наибольшим количеством посылок: "
                        + container.getLabel() + " (Посылок: "
                        + container.getBoxes().stream()
                        .mapToInt(box -> box.getParcels().size())
                        .sum() + ")"));
    }

    // 1. Метод для подсчета общего количества посылок и их веса
    private void totalParcelsAndWeight() {
        int totalParcels = containers.stream()
                .flatMap(containers -> containers.getBoxes().stream())
                .flatMap(box -> box.getParcels().stream())
                // // каждая посылка +1
                .mapToInt(parcel -> 1)
                .sum();
        double totalWeight = containers.stream()
                .flatMap(containers -> containers.getBoxes().stream())
                .flatMap(containers -> containers.getParcels().stream())
                // // суммируем веса посылок
                .mapToDouble(Parcel::getWeight)
                .sum();

        System.out.println("Общее количество посылок: " + totalParcels );
        System.out.println("Общий вес посылок: " + totalWeight + " кг");
    }

} // end of class
