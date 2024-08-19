package home_work_16.beverage;

public class Wine extends Beverage{

    private double alcoholPercent;
    private String brand;
    private String type;
    private int age;

    public Wine(int volume, String color, String boxing, double alcoholPercent, String brand,
                String type, int age) {
        super(volume, color, boxing);
        this.alcoholPercent = alcoholPercent;
        this.brand = brand;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wine{");
        sb.append("alcoholPercent=").append(alcoholPercent);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }



} // End of class









