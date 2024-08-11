package home_work_25.book_library.model;

import java.util.Objects;

public class Book {

    protected static final int isbnLength = 3;     // ISBN на корректное количество цифр = 3.

    // fields
    private final int isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    // constructor


    public Book(int isbn, String title, String author, int yearOfPublishing) {
        this.isbn = (int) checkIsbn(isbn);
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    // проверка ISBN
    private long checkIsbn(int isbn) {
        if (countDigits(isbn) == isbnLength){
            return isbn;
        }
        return -1;
    }

    private int countDigits(int isbn) {
        int count = 0;
        do {
            count ++;
            isbn = isbn / 10;
        }
        while (isbn != 0);
        return count;
    }

    // getters and setters
    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Book {" +
                " isbn: " + isbn +
                " | title: " + title +
                " | author: " + author +
                " | yearOfPublishing: " + yearOfPublishing +
                " }";
    }

} // End of class
