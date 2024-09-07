package home_work_26.computerShop.dao;

import home_work_26.computerShop.model.Computer;
import home_work_26.computerShop.model.Laptop;

public class ElectroShopImpl implements ElectroShop {

    // fields
    private Computer[] computers;
    private int size;

    // constructor
    public ElectroShopImpl(int capacity) {
        this.computers = new Computer[capacity];
        this.size = size;
    }

    // добавляем електроприбор
    @Override
    public boolean addDevice(Computer computer) {
        if (computer == null || computers.length == size || findDeviceByIsbn(computer.getIsbn()) != null) {
            return false;
        }
        computers[size++] = computer;
        return true;
    }

    @Override
    public Computer findDeviceByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getIsbn() == isbn){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer removeDevice(long isbn) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getIsbn() == isbn){
                Computer tmp = computers[i];
                computers[i] = computers[--size];
                return tmp;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Computer updateComputers(Computer computer) {
        for (int i = 0; i < size; i++) {
            if (computers[i].getIsbn() == computer.getIsbn()){
                computers[i] = computer;
                return computer;
            }
        }
        return null;
    }

    @Override
    public void printComputers() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    @Override
    public int totalSumSSD() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += computers[i].getSsd();
        }
        return sum;
    }

    @Override
    public double totalPrice() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += computers[i].getPrice();
        }
        return sum;
    }

    @Override
    public double totalBlackFriday() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += computers[i].getBlackFriday();
        }
        return sum;
    }

    @Override
    public double totalWeight() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (computers[i] instanceof Laptop){
                Laptop shop = (Laptop) computers[i];
                sum += ((Laptop) computers[i]).getWight();
            }
        }
        return sum;
    }

} // End of class
