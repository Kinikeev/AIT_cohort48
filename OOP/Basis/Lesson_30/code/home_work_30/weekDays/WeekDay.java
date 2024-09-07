package home_work_30.weekDays;

// Задача 1. Задать ENUM weekDay - дни недели. Опробовать на нем методы:
// .VALUES() .toString .ordinal() .valueOf()

import java.util.Arrays;

public enum WeekDay {
    MON("Monday",1),TUE("Tuesday",2),WED("Wednesday",3),THU("Thursday",4),
    FRI("Friday",5),SAT("Saturday",6),SUN("Sunday",7);

    // fields
    private String name;
    private int number;

    // constructor
    WeekDay(String name, int number) {
        this.name = name;
        this.number = number;
    }
    // getters
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name: '").append(name).append('\'');
        sb.append(", number: ").append(number);
        sb.append('}');
        return sb.toString();
    }
    // Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.
    // Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг)
    // Проверьте работу метода с помощью теста.
    public WeekDay plusWeek(WeekDay weekDay,int quantity){
        int index = weekDay.ordinal(); // index of weekday
        index += quantity;
        WeekDay[] weekDays = values();
        int res = index % weekDays.length;
        return weekDays[res];
    }

} // End of enum
