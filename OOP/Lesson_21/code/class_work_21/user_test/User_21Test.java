package class_work_21.user_test;

import class_work_20.user_validation.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class User_21Test {

    // fields
    // Step 1 - создать объект на основе тестируемого класса
    User_21 user;

    final String password = "123456Az!";
    final String email = "peter@mail.de";

    // Step 2 - задаем то, что происходит перед каждым тестом
    @BeforeEach    // перед каждым тестом
    void setUp() {
        user = new User_21(email, password);  // create new object
    }

    // Step 3 - вызвать метод тестируемого класса и проверить результат его работы
        // с помощью assertion-методов из библиотеки JUnit
        // assertion - утверждение, контроль, заявление, предположение
    @Test
    void testValidPassword(){
        user.setPassword("123456Aq!"); // валидный пароль
        assertEquals("123456Aq!",user.getPassword()); // // ожидаем, что тест пройдет, так как пароль сменился
    }
    @Test
    void testPasswordLength(){
        user.setPassword("124aAz!");
        assertEquals("123456Az!",user.getPassword());
    }
    @Test
    void testPasswordUpperCase(){
        user.setPassword("123456az!");
        assertEquals("123456Az!",user.getPassword());
    }
    @Test
    void testPasswordLowerCase(){
        user.setPassword("123456MK!");
        assertEquals("123456Az!",user.getPassword());
    }
    @Test
    void testPasswordDigit(){
        user.setPassword("Kjhg!#lnk");
        assertEquals("123456Az!",user.getPassword());
    }
    @Test
    void testPasswordSymbol(){
        user.setPassword("1254LKng2");
        assertEquals("123456Az!",user.getPassword());
    }

    // Проводим проверку email:
    @Test
    void testEmailValid(){
        user.setEmail("sascha.1-2_3@mail.de");
        assertEquals("sascha.1-2_3@mail.de",user.getEmail());
    }
    @Test
    void testEmailHasAt(){
        user.setEmail("peter€mail.de");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailAtLastIndex(){
        user.setEmail("peter.de@");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailHasPoint(){
        user.setEmail("peter@mailde");        // TO DO
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint1(){
        user.setEmail("peter@mail.de.");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint2(){
        user.setEmail("peter@mail.d.e");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint3(){
        user.setEmail("peter@mai.lde.");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint4(){
        user.setEmail("peter@maild.e");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint5(){
        user.setEmail("peter@maild.e.");
        assertEquals("peter@mail.de",user.getEmail());
    }
    @Test
    void testEmailLastIndexOfPoint6(){
        user.setEmail("peter@mailde.");
        assertEquals("peter@mail.de",user.getEmail());
    }

} // End of class