package students_consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Predicate;

class StudentTest {

    Student[] students;

    @BeforeEach
    void setUp() {
        students = new Student[5];
        students[0] = new Student("Oleg      ", 1985, 4.6);
        students[1] = new Student("Ramazan   ", 1976, 4.7);
        students[2] = new Student("Robert    ", 1964, 4.5);
        students[3] = new Student("Sergej    ", 1982, 4.4);
        students[4] = new Student("Konstantin", 1993, 4.6);
    }
    @Test
    void comparable(){
        printArray(students);
        Arrays.sort(students);
        printArray(students);

    }
    @Test
    void testByYearBirthday(){
        // зададим условие
        // (s -> s.YearOfBirthday > 1975)
        //Predicate<Student> predicate

        // вызвать метод, который отберёт по условию
        Student[] res = findEmployeesByPredicate(s -> s.getYearOfBirthday() > 1975);

        // распечатать результат
        printArray(res);
    }
    private Student[] findEmployeesByPredicate(Predicate<Student> predicate) {
        int size = students.length;
        Student[] res = new Student[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(students[i])) {
                res[j++] = students[i];
            }
        }
        return Arrays.copyOf(res, j);
    }
    private static void printArray(Student[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    @Test
    void testByFirstLetterName(){
        // вызвать метод, который отберёт по условию
        Student[] res = findEmployeesByPredicate(s -> s.getName().charAt(0) == 'R');

        // распечатать результат
        printArray(res);

    }
    @Test
    void testByAvgMark(){
        // вызвать метод, который отберёт по условию
        Student[] res = findEmployeesByPredicate(s -> s.getAvgMark() > 4.5 && s.getAvgMark() < 4.7);

        // распечатать результат
        printArray(res);

    }
}