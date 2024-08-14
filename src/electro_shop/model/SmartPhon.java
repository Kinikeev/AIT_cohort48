package electro_shop.model;

public class SmartPhon extends Device {

    // fields
    private int cameraResolution;
    private long imei;

    // constructor
    public SmartPhon(long isbn, String color, String model, double price, double blackFriday,
                     int cameraResolution, long imei) {
        super(isbn, color, model, price, blackFriday);
        this.cameraResolution = cameraResolution;
        this.imei = imei;
    }

    // getters
    public int getCameraResolution() {
        return cameraResolution;
    }
    public long getImei() {
        return imei;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartPhon{");
        sb.append("cameraResolution=").append(cameraResolution);
        sb.append(", imei=").append(imei);
        sb.append('}');
        return sb.toString();
    }
} // End of class
