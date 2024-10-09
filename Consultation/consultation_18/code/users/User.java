package users;

    // **Задача 1.**
//- класс User и работа со списком пользователей:
//    - Перебор всех элементов userList с помощью forEach() и вывод их в консоль
//    - Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль.
//      - Вместо имени только инициалы
//      - Сортировка списка по полю age
//    - Сортировка списка по нескольким свойствам: age, firstName, lastName.
//    - Рассчитать средний возраст
//    - Сделать проверку, что у всех User возраст (age) больше 18
//    - Определить количество пользователей из разных стран

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class User {

    // fields
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDay;
    private String country;

    // private UserProfile userProfile;

    // constructor
    public User(long id, String firstName, String lastName, LocalDate birthDay, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.country = country;
    }

    // getters

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getCountry() {
        return country;
    }

    // setters
    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // set Age
    public int setAge(){
        LocalDate currentday = LocalDate.now();
        return  (int) ChronoUnit.YEARS.between(birthDay,currentday);
    }
    // get Age
    public int getAge(){
        return setAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        //sb.append(", birthDay=").append(birthDay);
        sb.append(", Age=").append(getAge());
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
} // end of class
