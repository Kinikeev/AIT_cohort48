package class_work_30.month;

public enum Month {
    JAN("January",31),FEB("February", 28), MAR("March", 31),
    APR("April", 30), MAY("May", 31), JUN("June", 30),
    JUL("July", 31), AUG("August", 31), SEP("September", 30),
    OCT("October", 31), NOV("November", 30), DEC("December", 31);

    // fields
    private String name;
    private int days;

    // constructor
    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Month{");
        sb.append("name='").append(name).append('\'');
        sb.append(", days=").append(days);
        sb.append('}');
        return sb.toString();
    }
    // Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //Пример: AUG + 6 month = FEB
    public Month plusMonth(Month month, int quantity){
        int index = month.ordinal(); // index of month
        index += quantity;
        Month[] months = values();
        int res = index % months.length;
        return months[res];
    }

} // End of enum
