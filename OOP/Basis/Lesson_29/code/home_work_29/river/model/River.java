package home_work_29.river.model;

import java.util.Objects;

public class River implements Comparable<River>{

    private String name;
    private String continent;
    private int length;

    public River(String name, String continent, int length) {
        this.name = name;
        this.continent = continent;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof River river)) return false;
        return length == river.length && Objects.equals(name, river.name) && Objects.equals(continent, river.continent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, continent, length);
    }

    @Override
    public String toString() {

        return String.format("River name - %s, Continent - %s, Length - %d ",name,continent,length);
    }

    @Override
    public int compareTo(River o) {
        return Integer.compare(this.length,o.length);
    }
}
