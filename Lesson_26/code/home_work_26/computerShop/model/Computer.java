package home_work_26.computerShop.model;

import java.util.Objects;

public class Computer {

    public static final int ISBN_LENGTH = 5;

    // fields
    private long isbn;
    private String cpu;
    private int ram;       // память оперативная
    private int ssd;
    private String brand;
    private double price;
    private double blackFriday;

    // constructor
    public Computer(long isbn, String cpu, int ram, int ssd, String brand, double price, double blackFriday) {
        this.isbn = isbn;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
        this.blackFriday = blackFriday;
    }

    // check isbn
    public long checkIsbn(long isbn){
        String check = "" + isbn;
        if (check.length() == ISBN_LENGTH){
            return isbn;
        }
        return -1;
    }

    // getters and setters
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getSsd() {
        return ssd;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getBlackFriday() {
        return blackFriday;
    }
    public void setBlackFriday(double blackFriday) {
        this.blackFriday = blackFriday;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Computer computer)) return false;
        return isbn == computer.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {

        return "Computer:" +
                "| ISBN: " + isbn +
                "| cpu: " + cpu +
                "| ram: " + ram +
                "| ssd: " + ssd +
                "| brand: " + brand +
                "| price: " + price +
                "| black friday: " + blackFriday + " |";
    }
    public void displayCom(){
        System.out.println("Computer:" + "\n" +
                "ISBN:              " + isbn + "\n" +
                "cpu:               " + cpu + "\n" +
                "ram:               " + ram + "\n"+
                "ssd:               " + ssd + "\n"+
                "brand:             " + brand + "\n" +
                "price:             " + price + "\n" +
                "black friday:      " + blackFriday);
    }

} // End of class
