package home_work_15.book;

import home_work_16.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {

        // create object
        Book book_01 = new Book(123,"For Whom the Bell Tolls","Ernest Hemingway",
                                 1940,"Roman");
        book_01.displayBook();
        System.out.println("-------------------------------------------");

        Book book_01_1 = new Book("For Whom the Bell Tolls","Ernest Hemingway",1940,
                                 "Roman");
        book_01_1.displayBook();
        System.out.println("-------------------------------------------");
        Book book_01_2 = new Book("For Whom the Bell Tolls","Ernest Hemingway", "Roman");
        book_01_2.displayBook();
        System.out.println("=====================================================================");
        Dictionary dictionary_1 = new Dictionary(978_5_04_198104_4L,"Внутри убийцы","Майк Омер",
                2024,"Детектив","Эксмо","Русский",24939);
        Dictionary dictionary_2 = new Dictionary(978_5_86471_952_7L,"Глубокие воды","Эмма Бэмфорд",
                2024,"Дэтектив","Фантом Прэсс","Русский",291);
        Dictionary dictionary_3 = new Dictionary(978_5_00214_419_8L,"Гордость и предубеждение","Джейн Остин",
                2024,"Роман","Манн Фербер","Русский",83759);
        Dictionary dictionary_4 = new Dictionary(978_5_392_39458_6L,"Грозовой перевал","Эмили Бронте",
                2024,"Роман","Проспект","Русский",61707);
        dictionary_1.displayDictionary();
        dictionary_2.displayDictionary();
        dictionary_3.displayDictionary();
        dictionary_4.displayDictionary();

    } // End of main

} // End of class
