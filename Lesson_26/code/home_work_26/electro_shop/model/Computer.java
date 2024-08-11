package home_work_26.electro_shop.model;

import java.util.Objects;

public class Computer extends Device {

    // fields
    private String cpu;
    private int ram;       // память оперативная
    private int ssd;

    // constructor
    public Computer(long isbn, String color, String model, double price, double blackFriday, String cpu, int ram, int ssd) {
        super(isbn, color, model, price, blackFriday);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }

    // getters
    public String getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public int getSsd() {
        return ssd;
    }

    // setters
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("cpu='").append(cpu).append('\'');
        sb.append(", ram=").append(ram);
        sb.append(", ssd=").append(ssd);
        sb.append('}');
        return sb.toString();
    }
} // End of class
