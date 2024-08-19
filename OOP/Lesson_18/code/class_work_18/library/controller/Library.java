package class_work_18.library.controller;

import class_work_18.library.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size;

    // constructor
    public Library(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // methods
    // print books
    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    // find book
    public Book findBook(long isbn){
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn ){
                return books[i];
            }
        }
        return null;
    }
    // определение количества книг
    public int size(){
        return size;
    }
    // add book
    public boolean addBook(Book book){
        /*
         плохие случаи:
        if (book == null){
            return false;
        }
        if (size == books.length){
            return false;
        }
        if (findBook(book.getIsbn()) != null){    // случай с дубликатами
            return false;
        }

         */
        if (book == null || size == books.length || findBook(book.getIsbn()) != null){
            System.out.println("The book is null or library is full or the book already exists");
            return false;
        }
        // в конец массива добавить новый элемент
        books[size] = book;  // size - это индекс первого свободного места в массиве
        size ++;
        return true;
    }

    // remove book
    public Book removeBook(long isbn){
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

} // End of class
