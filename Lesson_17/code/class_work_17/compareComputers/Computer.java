package class_work_17.compareComputers;

import java.util.Objects;

/*
    Создать класс Computer c полями:
            - cpu
            - ram
            - ssd
            - brand
            - price
 */
public class Computer {
    // fields
    private String cpu;
    private int ram;       // память оперативная
    private int ssd;
    private String brand;


    // constructor
    public Computer(String cpu, int ram, int ssd, String brand) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;

    }
    // getters and setters
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

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Computer computer)) return false;
        return ram == computer.ram && ssd == computer.ssd && Objects.equals(cpu, computer.cpu) && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, ssd, brand);
    }

    public void displayCom(){
        System.out.println("Computer:" + "\n" +
                           "cpu:               "+ cpu + "\n" +
                           "ram:               " + ram + "\n"+
                           "ssd:               " + ssd + "\n"+
                           "brand:             " + brand);
    }

}
