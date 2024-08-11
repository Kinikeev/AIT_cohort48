package home_work_26.electro_shop.dao;

import home_work_26.electro_shop.model.Computer;
import home_work_26.electro_shop.model.Device;

public class ElectroShopImpl implements ElectroShop{

    // fields
    private Device[] devices;
    private int size;

    // constructor
    public ElectroShopImpl(int capacity) {
        this.devices = new Device[capacity];
        this.size = size;
    }

    // Creating methods:

    // добавляем електроприбор
    @Override
    public boolean addDevice(Device device) {
        if (device == null || size == devices.length || findDeviceByIsbn(device.getIsbn()) != null) {
            return false;
        }
        devices[size ++] = device;
        return true;
    }

    // найти электроприбор по номеру isbn
    @Override
    public Device findDeviceByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getIsbn() == isbn){
                return devices[i];
            }
        }
        return null;
    }

    // удалить електроприбор
    @Override
    public Device removeDevice(long isbn) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getIsbn() == isbn){
                Device victim = devices[i];
                devices[i] = devices[--size];
                return victim;
            }
        }
        return null;
    }

    // обновить данные о електроприборах
    @Override
    public Device updateDevice(Device device) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getIsbn() == device.getIsbn()){
                devices[i] = device;
                return device;
            }
        }
        return null;
    }

    // Общая сумма ssd
    @Override
    public int totalSumSSD() {
        int sum = 0;
        for (int i = 0; i < size; i++) {

        }
        return sum;
    }

    // общая стоимость електроприборов
    @Override
    public double totalPrice() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += devices[i].getPrice();
        }
        return sum;
    }

    // общий вес електроприборов
    @Override
    public double totalWeight() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += devices[i].getPrice();
        }
        return sum;
    }
    /*
    private Device[] findCarByPredicate(Predicate<Device> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(devices[i])){
                count++;
            }
        }
        Device[] res = new Device[][count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(devices[i])){
                res[j++] = devices[i];
            }
        }
        return res;
    }
     */
    @Override
    public Device[] findDevicesByModel(String model) {
        return new Device[0];
    }

    @Override
    public Device[] findDevicesByColor(String color) {
        return new Device[0];
    }

    @Override
    public Device[] findDevicesByBlackFriday(double blackFriday) {
        return new Device[0];
    }
} // End of class
