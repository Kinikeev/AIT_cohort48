package home_work_18.compShop.kontroller;

import home_work_18.compShop.model.Computer18;

public class Stock {

    // fields:
    private Computer18[] computer18s;
    private int size;

    // constructor:
    public Stock(int capacity) {
        this.computer18s = new Computer18[capacity];
        this.size = size;
    }

    // print computers;
    public void printComp(){
        for (int i = 0; i < size; i++) {
            System.out.println(computer18s[i]);
        }
    }

    // find computer
    public Computer18 findComp(long isbn){
        for (int i = 0; i < size; i++) {
            if (computer18s[i].getIsbn() == isbn){
                return computer18s[i];
            }
        }
        return null;
    }

    // add computer:
    public boolean addComp(Computer18 computer){
        if (computer == null || size == computer18s.length || findComp(computer.getIsbn()) != null){
            return false;
        }
        computer18s[size] = computer;
        size ++;
        return true;
    }
    // удалить компьютер; remove computer
    public Computer18 removeComp(long isbn){
        Computer18 victim = null;
        for (int i = 0; i < size; i++) {
            if (computer18s[i].getIsbn() == isbn){
                victim = computer18s[i];
                computer18s[i] = computer18s[size - 1];
                computer18s[i] = null;
                size --;
                break;
            }
        }
        return victim;
    }
    // сколько компьютеров на складе.
    public int amounts(){
        return size;
    }

} // End of class
