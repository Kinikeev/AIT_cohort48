package class_work_18.computor_shop.model;
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
    private double price;

    // constructor
    public Computer(String cpu, int ram, int ssd, String brand, double price) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.brand = brand;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return "Computer:" +
                "| cpu: " + cpu +
                "| ram: " + ram +
                "| ssd: " + ssd +
                "| brand: " + brand +
                "| price: " + price + " |";
    }
    public void displayCom(){
        System.out.println("Computer:" + "\n" +
                           "cpu:               "+ cpu + "\n" +
                           "ram:               " + ram + "\n"+
                           "ssd:               " + ssd + "\n"+
                           "brand:             " + brand + "\n" +
                           "price:             " + price);
    }

} // End of class
