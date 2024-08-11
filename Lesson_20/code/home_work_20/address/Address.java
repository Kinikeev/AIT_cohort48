package home_work_20.address;
    /*
      Задание 1: Создайте класс Address с полями:
                   - String street;
                   - int number;
                   - String postCode;
        Почтовый код должен содержать только цифры и быть длинной только 5 символов.
        Реализуйте в классе Address конструктор с проверкой правильности введённого postCode.
        Проверте работу конструктора в приложении AddressAppl.
        Организуйте в нём возможность ввода адреса и его проверку по введённому индексу.
     */

import java.util.Objects;


public class Address {

    // fields:
    String street;
    int number;
    String postCode;

    // constructor:
    public Address(String street, int number, String postCode) {
        this.street = street;
        this.number = number;
        setPostCode(postCode);     // Вместо this.postCode = postCode;
    }

    // getters and setters:

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostCode() {
        return postCode;
    }

    // Почтовый код должен содержать только цифры и быть длинной только 5 символов.
    // Реализуйте в классе Address конструктор с проверкой правильности введённого postCode.

    private boolean isPostCodeValid(String postCode) {
        for (int i = 0; i < postCode.length(); i++) {
            char ch = postCode.charAt(i);
            if ("-_.:,;<>!§$%&/()=?´ *+#".indexOf(ch) >= 0) {
                return false;
            }
            if (Character.isAlphabetic(ch)) {
                return false;
            }
        }
        if (postCode.length() != 5) {
            return false;
        }
        return true;
    }

    public void setPostCode(String postCode) {
        if (isPostCodeValid(postCode)) {
            this.postCode = postCode;
        } else {
            System.out.println("Post code is not valid !!!");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Address address)) return false;
        return Objects.equals(postCode, address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postCode);
    }

    @Override
    public String toString() {
        return "Address:" + "\n" +
                "Street: " + street + "\n" +
                "Number: " + number + "\n" +
                "PostCode: " + postCode + "\n" +
                "-----------------------------";
    }

} // End of class


















