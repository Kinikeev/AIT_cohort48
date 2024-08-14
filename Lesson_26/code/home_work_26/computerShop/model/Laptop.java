package home_work_26.computerShop.model;

public class Laptop extends Computer {

    // fields
    private double displaySize;
    private double wight;
    public int batteryCapacity;

    // constructor
    public Laptop(long isbn, String cpu, int ram, int ssd, String brand, double price, double blackFriday, double displaySize, double wight, int batteryCapacity) {
        super(isbn, cpu, ram, ssd, brand, price, blackFriday);
        this.displaySize = displaySize;
        this.wight = wight;
        this.batteryCapacity = batteryCapacity;
    }

    // getters and setters
    public double getDisplaySize() {
        return displaySize;
    }
    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
    public double getWight() {
        return wight;
    }
    public void setWight(double wight) {
        this.wight = wight;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public String toString() {
        return "Laptop-" + super.toString() +
                " displaySize: " + displaySize +
                "| wight: " + wight +
                "| batteryCapacity: " + batteryCapacity +
                " |";
    }
    public void displayLaptop(){
        System.out.print("Laptop-");
        super.displayCom();
        System.out.println( "displaySize:       " + displaySize +"\n" +
                "wight:             " + wight + "\n" +
                "batteryCapacity:   " + batteryCapacity );
    }

} // End of class
