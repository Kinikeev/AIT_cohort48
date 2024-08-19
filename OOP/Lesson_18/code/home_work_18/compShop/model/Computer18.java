package home_work_18.compShop.model;

import java.util.Objects;

public class Computer18 {

    public static final int ISBN_LENGTH = 15;

    // fields:
    private long isbn;
    private String cpu;
    private int ram;       // память оперативная
    private int ssd;
    private String brand;
    private double price;

    // constructor:
    public Computer18(long isbn, String cpu, int ram, int ssd, String brand, double price) {
        this.isbn = isbn;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
    }
    // check of ISBN:
    private int countDigits(long isbn){
        int count = 0;
        do {
            count ++;
            isbn /= 10;
        }
        while (isbn != 0);
        return count;
    }

    private int countDig(long isbn){
        String dig = "" + isbn;
        int count = 0;
        for (int i = 0; i < dig.length(); i++) {
            if(isbn != 0){
                count ++;
            }
        }
        return count;
    }

    private long checkISBN(long isbn){
        if (countDigits(isbn) == ISBN_LENGTH){
            return isbn;
        }
        return -1;
    }

    // getters:
    public long getIsbn() {
        return isbn;
    }
    public String getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public int getSsd() {
        return ssd;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Computer: |" +
                " ISBN: " + isbn +
                " | Cpu: " + cpu +
                " | Ram: " + ram +
                " | Ssd: " + ssd +
                " | Brand: " + brand +
                " | Price: " + price + " |" + "\n" +
                "-----------------------------------------------------------------------------------------------------------";
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Computer18 that)) return false;
        return isbn == that.isbn;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

} // End of class

