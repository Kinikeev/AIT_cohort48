package home_work_25.book_library.dao;

import home_work_25.book_library.model.Book;

public interface Library {

    // methods:

    // add book     добавляем книгу
    boolean addBook (Book book);

    // find book
    Book findBook(int isbn);

    // remove book
    Book removeBook (int isbn);

    // update
    Book update (Book book);

    // print books
    void printBook ();

    // quantity   количество книг
    int quantity();

    // найти все книги по автору
    Book[] findAllBooksByAuthor(String author);

    // найти книги с годом издания от и до
    Book[] findBooksWithYearOfPublication(int from, int to);
} // End of interface
