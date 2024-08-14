package electro_shop.dao;

import electro_shop.model.Device;

public interface ElectroShop {

    // добавляем електроприбор
    boolean addDevice(Device device);

    // найти электроприбор по номеру isbn
    Device findDeviceByIsbn(long isbn);

    // удалить електроприбор
    Device removeDevice(long isbn);

    // обновить данные о електроприборах
    Device updateDevice(Device device);

    // Общая сумма ssd
    int totalSumSSD();

    // общая стоимость електроприборов
    double totalPrice();

    // общий вес електроприборов
    double totalWeight();

    // найти электроприборы по модели
    Device[] findDevicesByModel(String model);

    // найти электроприборы по цвету
    Device[] findDevicesByColor(String color);

    // найти электроприборы по чёрной пятнице
    Device[] findDevicesByBlackFriday(double blackFriday);

} // End of interface