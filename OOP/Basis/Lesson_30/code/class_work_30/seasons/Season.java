package class_work_30.seasons;

public enum Season {
    WINTER("Winter",1),SPRING("Spring",2),SUMMER("Summer",3),
    AUTUMN("Autumn",4);

    // fields
    private String name;
    private int number;

    // constructor
    Season(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Season{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
