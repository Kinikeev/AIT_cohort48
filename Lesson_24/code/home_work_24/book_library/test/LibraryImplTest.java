package home_work_24.book_library.test;

import home_work_24.book_library.dao.Library;
import home_work_24.book_library.dao.LibraryImpl;
import home_work_24.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;
    Book[] books;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(6);
        books = new Book[5];

        books[0] = new Book(100,"Title_1","Author_A",2001);
        books[1] = new Book(200,"Title_2","Author_B",2002);
        books[2] = new Book(300,"Title_3","Author_C",2003);
        books[3] = new Book(400,"Title_4","Author_D",2004);
        books[4] = new Book(500,"Title_5","Author_E",2005);

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

    }

    @Test
    void addBook() {
        assertFalse(library.addBook(null));   // такой книги не существует
        assertFalse(library.addBook(books[2])); // эта книга уже внесена
        assertEquals(5,library.quantity()); // имеем 5 книг, а capacity = 6; можно добавлять
        Book book = new Book(600,"Title_6","Author_F",2006);
        assertTrue(library.addBook(book)); // можем добавить т.к. есть место capacity = 6
        assertEquals(6,library.quantity());  // количество изменилось с 5 на 6
        book = new Book(700,"Title_7","Author_D",2007);
        assertFalse(library.addBook(book)); // не можем добавить т.к. нет места capacity = 6
        assertEquals(6,library.quantity()); // количество не изменилось
    }

    @Test
    void findBook() {
        assertEquals(books[2],library.findBook(300)); // такая книга существует (найдена)
        assertNull(library.findBook(600));  // такой книги нет
    }

    @Test
    void removeBook() {

        assertNull(library.removeBook(700));  // такой книги нет и мы не можем списать
        assertEquals(5,library.quantity()); // количество не изменилось
        assertEquals(books[0],library.removeBook(100)); // списываем эту книгу
        assertEquals(4,library.quantity());  // количество изменилось с 5 на 4
    }

    @Test
    void update() {
    }

    @Test
    void printBook() {
        library.printBook();
    }

    @Test
    void quantity() {
        assertEquals(5,library.quantity());
    }

} // End of class