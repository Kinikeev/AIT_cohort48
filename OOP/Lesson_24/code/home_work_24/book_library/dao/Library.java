package home_work_24.book_library.dao;

import home_work_24.book_library.model.Book;

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

} // End of interface
