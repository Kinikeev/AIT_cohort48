package class_work_16.computor_shop.model;

public class Laptop extends Computer{

    private double displaySize;
    private double wight;
    public int batteryCapacity;


    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, int batteryCapacity, double wight) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.batteryCapacity = batteryCapacity;
        this.wight = wight;
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
}
