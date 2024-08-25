package students_consultation;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private int yearOfBirthday;
    private double avgMark;

    public Student(String name, int yearOfBirthday, double avgMark) {
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.avgMark = avgMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(double avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student student)) return false;
        return yearOfBirthday == student.yearOfBirthday && Double.compare(avgMark, student.avgMark) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfBirthday, avgMark);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", yearOfBirthday=").append(yearOfBirthday);
        sb.append(", avgMark=").append(avgMark);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);

    }

}
