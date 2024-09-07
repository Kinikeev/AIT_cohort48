package class_work_30.coffee_mashine;

public enum Coffee {
    ESP("Espresso", 2.5,1), AMR("Americano", 3.0,2),
    CAP("Cappuccino", 4.0,3), LAT("Latte", 4.5,4);

    // fields
    private String name;
    private double price;
    private int choice;

    Coffee(String name, double price, int i) {
        this.name = name;
        this.price = price;
        this.choice = i;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coffee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }
}
