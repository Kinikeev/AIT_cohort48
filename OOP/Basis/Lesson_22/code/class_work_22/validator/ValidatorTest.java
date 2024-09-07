package class_work_22.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void checkCreditCardNumber() {
        assertTrue(Validator.checkCreditCardNumber("12345678"));
        assertTrue(Validator.checkCreditCardNumber("1234567887654321"));
        assertTrue(Validator.checkCreditCardNumber("1234567890"));
        assertFalse(Validator.checkCreditCardNumber("1234567"));
        assertFalse(Validator.checkCreditCardNumber("12345678876543210"));
        assertFalse(Validator.checkCreditCardNumber("12345678A"));
    }

    @Test
    void checkDateFormatEU() {
        assertTrue(Validator.checkDateFormatEU("26.10.2023"));
        assertTrue(Validator.checkDateFormatEU("05.10.2023"));
        assertTrue(Validator.checkDateFormatEU("29.02.2020"));
        assertFalse(Validator.checkDateFormatEU("32.02.2023"));
        assertFalse(Validator.checkDateFormatEU("15.13.2023"));
        assertFalse(Validator.checkDateFormatEU("26/02/2023"));
        assertFalse(Validator.checkDateFormatEU("5.10.2023"));
        assertFalse(Validator.checkDateFormatEU("29.02.2022"));

    }

    @Test
    void checkDateFormatUS() {
        assertTrue(Validator.checkDateFormatUS("1964.05.01"));
        assertTrue(Validator.checkDateFormatUS("2020.02.29"));
        assertTrue(Validator.checkDateFormatUS("2002.11.12"));
        assertTrue(Validator.checkDateFormatUS("1964.05.01"));
        assertFalse(Validator.checkDateFormatUS("2022.02.30"));
        assertFalse(Validator.checkDateFormatUS("64.10.31"));
        assertFalse(Validator.checkDateFormatUS("2020.05.2"));
        assertFalse(Validator.checkDateFormatUS("2015.11.31"));
        assertFalse(Validator.checkDateFormatUS("2014.15.31"));
    }

    @Test
    void checkPhoneNumber() {
        assertTrue(Validator.checkPhoneNumber("+08(11)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("08(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+108(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+8(01)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(1)1234-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)123-5678"));
        assertFalse(Validator.checkPhoneNumber("+08(01)1234-56789"));
    }

    @Test
    void checkLessEquals255() {
        assertTrue(Validator.checkLessEquals255("0"));
        assertTrue(Validator.checkLessEquals255("5"));
        assertTrue(Validator.checkLessEquals255("58"));
        assertTrue(Validator.checkLessEquals255("199"));
        assertTrue(Validator.checkLessEquals255("255"));
        assertFalse(Validator.checkLessEquals255("256"));
        assertFalse(Validator.checkLessEquals255("-5"));
        assertFalse(Validator.checkLessEquals255("b5"));
    }

} // End of class