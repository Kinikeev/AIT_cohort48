package home_work_16.model;
    /*
      Задача 3. Создайте класс Dictionary, который расширяет класс Book. Предложите для него набор полей
      и переопределите метод display. В классе BookAppl в методе main создайте несколько словарей и
      выведите информацию о них в консоль.
     */
    /*
      Task 3. Create a Dictionary class that extends the Book class. Provide a set of fields for it
      and override the display method. In the BookAppl class, in the main method, create several dictionaries and
      display information about them to the console.
     */

import home_work_15.book.Book;

public class Dictionary extends Book {
    private String publisher;        // издатель
    private String language;         // язык
    private int readers;     // число прочитавших


    public Dictionary(long isbn, String title, String author, int yearOfPublishing, String genre, String publisher, String language, int numberOfReaders) {
        super(isbn, title, author, yearOfPublishing, genre);
        this.publisher = publisher;
        this.language = language;
        readers = numberOfReaders;
    }

    public String getPublisher() {
        return publisher;
    }
    public String getLanguage() {
        return language;
    }
    public int getNumberOfReaders() {
        return readers;
    }

    public void displayDictionary() {
        super.displayBook();
        System.out.println("Publisher:          " + publisher + "\n" +
                "Language:           " + language + "\n" +
                "Readers:            " + readers + "\n" +
                "------------------------------------");
    }

} // End of class











