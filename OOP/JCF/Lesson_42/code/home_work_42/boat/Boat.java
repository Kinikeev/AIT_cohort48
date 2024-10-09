package home_work_42.boat;

// Задание: Создать класс «Яхта» (Boat). В классе должна храниться следующая информация:

//    - производитель(верфь);(shipyard)
//    - страна (флаг);
//    - год выпуска; (year of issue - йюр оф ишшей)
//    - длина; (length)
//    - материал корпуса (body material) (дерево, пластик, металл); (wood, plastic, metal)
//    - стоимость. (price)

import java.util.Objects;

public class Boat {

    // fields
    private String shipyard;
    private String country;
    private int yearOfIssue;
    private double length;
    private String bodyMaterial;
    private  double price;

    // constructor
    public Boat(String shipyard, String country, int yearOfIssue, double length, String bodyMaterial, double price) {
        this.shipyard = shipyard;
        this.country = country;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.bodyMaterial = bodyMaterial;
        this.price = price;
    }

    // getters
    public String getShipyard() {
        return shipyard;
    }
    public String getCountry() {
        return country;
    }
    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public double getLength() {
        return length;
    }
    public String getBodyMaterial() {
        return bodyMaterial;
    }
    public double getPrice() {
        return price;
    }

    // setters
    public void setShipyard(String shipyard) {
        this.shipyard = shipyard;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boat boat)) return false;
        return yearOfIssue == boat.yearOfIssue && Double.compare(length, boat.length) == 0 && Double.compare(price, boat.price) == 0 && Objects.equals(shipyard, boat.shipyard) && Objects.equals(country, boat.country) && Objects.equals(bodyMaterial, boat.bodyMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shipyard, country, yearOfIssue, length, bodyMaterial, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Boat{");
        sb.append("shipyard:'").append(shipyard).append('\'');
        sb.append("| country:'").append(country).append('\'');
        sb.append("| yearOfIssue: ").append(yearOfIssue);
        sb.append("| length: ").append(length);
        sb.append("| bodyMaterial:'").append(bodyMaterial).append('\'');
        sb.append("| price: ").append(price);
        sb.append('}');
        return sb.toString();
    }

} // end of class
