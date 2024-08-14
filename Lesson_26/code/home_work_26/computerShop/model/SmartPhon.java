package home_work_26.computerShop.model;

public class SmartPhon extends Laptop {

    // fields
    private int cameraResolution;
    private long imei;

    // constructor
    public SmartPhon(long isbn, String cpu, int ram, int ssd, String brand, double price, double blackFriday, double displaySize, double wight, int batteryCapacity, int cameraResolution, long imei) {
        super(isbn, cpu, ram, ssd, brand, price, blackFriday, displaySize, wight, batteryCapacity);
        this.cameraResolution = cameraResolution;
        this.imei = imei;
    }

    // getters and setters
    public int getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public long getImei() {
        return imei;
    }
    public void setImei(long imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "SmartPhon: " + super.toString() +
                " Camera resolution: " + cameraResolution +
                "| imei: " + imei +
                " |";
    }
    public void displaySmart(){
        System.out.println("SmartPhon:______________________"+"\n" +
                "ISBN:              " + getIsbn() + "\n" +
                "cpu:               "+ getCpu() + "\n" +
                "ram:               " + getRam() + "\n"+
                "ssd:               " + getSsd()+ "\n"+
                "brand:             " + getBrand() + "\n" +
                "price:             " + getPrice() + "\n" +
                "displaySize:       " + getDisplaySize() +"\n" +
                "wight:             " + getWight() + "\n" +
                "batteryCapacity:   " + batteryCapacity + "\n" +
                "Camera resolution: " + cameraResolution + "\n" +
                "imei:              " + imei );
    }

} // End of class
