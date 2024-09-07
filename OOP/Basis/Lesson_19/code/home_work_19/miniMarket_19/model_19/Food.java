package home_work_19.miniMarket_19.model_19;

public class Food extends Product{

    private int energy;

    public Food(double price, String barcode, String name, int energy) {
        super(price, barcode, name);
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return super.toString() +
                " energy: " + energy + " |";
    }
} // End of class
