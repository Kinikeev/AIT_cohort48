package post_author;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;
    private int yearOfBirthday;

    public Author(String name, String lastName, int yearOfBirthday) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirthday = yearOfBirthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;
        return yearOfBirthday == author.yearOfBirthday && Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, yearOfBirthday);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", yearOfBirthday=").append(yearOfBirthday);
        sb.append('}');
        return sb.toString();
    }
}
