package class_work_18.library;

import class_work_18.library.controller.Library;
import class_work_18.library.model.Book;

public class LibraryAppl {
    public static void main(String[] args) {

        // создать объект типа Library на 5-6 книг;
        Book[] books = new Book[6];
        books[0] = new Book("For Whom the Bell Tolls", "Ernest Hemingway", 1940,
                128_5_04_176214_4L);
        books[1] = new Book("Внутри убийцы", "Майк Омер", 2024,
                978_5_04_198104_4L);
        books[2] = new Book("Глубокие воды", "Эмма Бэмфорд", 2024,
                978_5_86471_952_7L);
        books[3] = new Book("Гордость и предубеждение", "Джейн Остин", 2024,
                978_5_00214_419_8L);
        books[4] = new Book("Грозовой перевал", "Эмили Бронте", 2024,
                978_5_392_39458_6L);
        books[5] = new Book("Белые ночи", "Федор Достоевский", 2020,
                978_5_17_106575_1L);

        Library library = new Library(6);
        library.printBooks();
        System.out.println("Library size: " + library.size());
        System.out.println("//-------------------------------------//");

        for (int i = 0; i < books.length; i++) {
            library.addBook(books[i]);
        }

        // напечатать все книги, имеющиеся в библиотеке;
        library.printBooks();

        // получить текущий размер библиотеки (кол-во книг);
        System.out.println("Size of books: " + library.size());

        // добавить в библиотеку еще 1-2 книги;
        Book newBook_1 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1985, 9785171203177L);
        System.out.println("Add book_1: " + library.addBook(newBook_1));
        Book newBook_2 = new Book("Анна Каренина","Лев Толстой",1997,9780142000274L);
        System.out.println("Add book_2: " + library.addBook(newBook_2));

        // напечатать все книги, имеющиеся в библиотеке ;
        System.out.println("Print all books after adding:");
        library.printBooks();

        // получить текущий размер библиотеки (кол-во книг);
        System.out.println("Size of books: " + library.size());

        // проверить работу метода поиска книги по ISBN;
        System.out.println("Find book:" + "\n" + library.findBook(128_5_04_176214_4L));

        // удалить какую-нибудь книгу из библиотеки;
        System.out.println("Remove book:" + "\n" + library.removeBook(978_5_86471_952_7L));

        // проверить количество книг после удаления и
        System.out.println("Size of books after remove: " + library.size());

        // распечатать имеющиеся книги.
        library.printBooks();

    } // End of main

} // End of class
