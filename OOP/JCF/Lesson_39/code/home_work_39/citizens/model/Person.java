package home_work_39.citizens.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;  // temporal - временной
import java.util.Objects;

public class Person implements Comparable<Person> {

    // Task 1. Project citizens

    // fields
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    // constructor
    public Person(int id, String firstName, String lastName, LocalDate birthDate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    // getters
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Create getAge (пишем сами, потому что в полях его нет)
    public int getAge(){
        return (int) ChronoUnit.YEARS.between(birthDate,LocalDate.now());
        //return Period.between(this.birthDate,LocalDate.now()).getYears();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        int age = getAge();
        return String.format("ID: %d, First name: %s, Last name %s, Age: %d", id, firstName, lastName, age);
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id,person.id);
    }

} // end of class

