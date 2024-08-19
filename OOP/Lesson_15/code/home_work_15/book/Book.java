package home_work_15.book;
    /*
      Задача 1. Создайте класс Book с полями: (Create a Book class with fields:)
        - уникальный номер - ISBN number
        - название         - title
        - автор            - author
        - год издания      - yearOfPublishing
        - жанр             - genre
      В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
      который выводит информацию о книге.
      Создайте конструктор, в котором нет поля ISBN.
      Создайте конструктор, в котором есть только поля title, author и genre.

      In the Book class, implement a constructor, getters and setters for all fields, and a display method
      that displays information about the book.
      Create a constructor that does not have an ISBN field.
      Create a constructor that only has the title, author, and genre fields.
     */

public class Book {
    // fields
    long isbn;
    String title;
    String author;
    int yearOfPublishing;
    String genre;

    // constructor
    public Book(long isbn, String title, String author, int yearOfPublishing, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // constructor without ISBN
    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    // constructor with only title, author, and genre
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    // getters and setters
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
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
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    // display information about the book.
    public void displayBook(){
        System.out.println("ISBN:               " + getIsbn() +"\n" +
                           "Title:              " + getAuthor() + "\n" +
                           "Author:             " + getTitle() + "\n" +
                           "Year of publishing: " + getYearOfPublishing() + "\n" +
                           "Genre:              " + getGenre());
    }

} // End of class
