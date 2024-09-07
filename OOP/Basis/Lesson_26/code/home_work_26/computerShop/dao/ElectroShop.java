package home_work_26.computerShop.dao;


import home_work_26.computerShop.model.Computer;

public interface ElectroShop {

    // добавляем електроприбор
    boolean addDevice(Computer computer);

    // найти электроприбор по номеру isbn
    Computer findDeviceByIsbn(long isbn);

    // удалить електроприбор
    Computer removeDevice(long isbn);

    // обновить данные о електроприборах
    Computer updateComputers(Computer computer);

    // quantity
    int quantity();

    // print computers;
    void printComputers();

    // Общая сумма ssd
    int totalSumSSD();

    // общая стоимость електроприборов
    double totalPrice();

    // общая стоимость електроприборов black Friday
    double totalBlackFriday();

    // общий вес електроприборов
    double totalWeight();

} // End of interface
