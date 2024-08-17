package class_work.soldier;

// - name: String
//- height: int
//- weight: double
//- profile: int;

import java.util.Objects;

public class Soldier implements Comparable<Soldier> {

    // fields
    private String name;
    private int height;
    private double weight;
    private int profile;

    // constructor


    public Soldier(String name, int height, double weight, int profile) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Soldier soldier)) return false;
        return height == soldier.height && Double.compare(weight, soldier.weight) == 0 && profile == soldier.profile && Objects.equals(name, soldier.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, profile);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Soldier{");
        sb.append("name='").append(name).append('\'');
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", profile=").append(profile);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Soldier o) {
        return Integer.compare(this.height,o.height);  //от большего к меньшему
    }
} // End of class
