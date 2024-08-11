package home_work_26.electro_shop.model;

import java.util.Objects;

public class Device {

    protected static final long ISBN_LENGTH = 5;

    // fields
    private long isbn;
    private String model;
    private String color;
    private double price;
    private double blackFriday;

    // check isbn:
    public long Device(long isbn){
        String check = "" + isbn;
        if (check.length() == ISBN_LENGTH){
            return isbn;
        }
        return -1;
    }

    // constructor
    public Device(long isbn, String color, String model, double price, double blackFriday) {
        this.isbn = isbn;
        this.color = color;
        this.model = model;
        this.price = price;
        this.blackFriday = blackFriday;
    }

    // getters and setters

    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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
        if (!(object instanceof Device device)) return false;
        return isbn == device.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Device:");
        sb.append(" | isbn: ").append(isbn);
        sb.append(" | model: ").append(model).append('\'');
        sb.append(" | color: ").append(color).append('\'');
        sb.append(" | price: ").append(price);
        sb.append(" | blackFriday: ").append(blackFriday);
        sb.append(" | ");
        return sb.toString();
    }
} // End of class
