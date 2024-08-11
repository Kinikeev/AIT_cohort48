package home_work_25.book_library.dao;

import home_work_25.book_library.model.Book;

public class LibraryImpl implements Library {

    private Book[] books;     // array of objects
    private int size;         // current size of array     текущиее количество

    // constructor
    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    // Methods:

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBook(book.getIsbn()) != null){
            //System.out.println("The book is null or library is full or the book already exists");
            return false;
        }
        // в конец массива добавить новый элемент
        books[size] = book;  // size - это индекс первого свободного места в массиве
        size ++;
        return true;
    }

    @Override
    public Book findBook(int isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn ){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book removeBook(int isbn) {
        Book victim = null;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn){
                victim = books[i];
                // на место этой книги ставим последнюю
                books[i] = books[size - 1];
                books[size - 1] = null;
                size --;
                break;
            }
        }
        return victim;
    }

    @Override
    public Book update(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == book.getIsbn()) {
                books[i] = book;
                return book;
            }
        }
        return null;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public Book[] findAllBooksByAuthor(String author) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)){
                count ++;
            }
        }
        Book[] result = new Book[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (books[i].getAuthor().equals(author)){
                result[j++] = books[i];
            }
        }
        return result;
    }


    @Override
    public Book[] findBooksWithYearOfPublication(int from, int to) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getYearOfPublishing() >= from && books[i].getYearOfPublishing() <= to){
                count ++;
            }
        }
        Book[] result = new Book[count];
        for (int i = 0, j = 0; j < count; i++) {
            if (books[i].getYearOfPublishing() >= from && books[i].getYearOfPublishing() <= to){
                result[j++] = books[i];
            }
        }
        return result;
    }

} // End of class
