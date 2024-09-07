package class_work_18.computor_shop.model;

public class SmartPhon extends Laptop {

    private int cameraResolution;
    private long imei;

    public SmartPhon(String cpu, int ram, int ssd, String brand, double price, double displaySize, int batteryCapacity, double wight, int cameraResolution, long imei) {
        super(cpu, ram, ssd, brand, price, displaySize, batteryCapacity, wight);
        this.cameraResolution = cameraResolution;
        this.imei = imei;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }
    public long getImei() {
        return imei;
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
