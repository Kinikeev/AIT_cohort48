package electro_shop.model;

public class Laptop extends Computer{

    private double displaySize;
    private double wight;
    public int batteryCapacity;

    // constructor
    public Laptop(long isbn, String color, String model, double price, double blackFriday,
                  String cpu, int ram, int ssd, double displaySize, double wight, int batteryCapacity) {
        super(isbn, color, model, price, blackFriday, cpu, ram, ssd);
        this.displaySize = displaySize;
        this.wight = wight;
        this.batteryCapacity = batteryCapacity;
    }

    // getters
    public double getDisplaySize() {
        return displaySize;
    }
    public double getWight() {
        return wight;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    // setters
    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }
    public void setWight(double wight) {
        this.wight = wight;
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
} // End of class
