package JavaHomework.Lectures_10.Collections.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static List<Book> bookList = new ArrayList<>();

    public static void addBook(Book bookForAdd) {
        bookList.add(bookForAdd);
    }

    public static void deleteBook(int bookForDelete) {
        bookList.remove(bookForDelete);
    }

    public static void showAllBook() {
        for (Book bookEach : bookList) {
            System.out.println(bookEach);
        }
    }

    public static void showAllBookByAuthor() {
        for (Book bookEach : bookList) {
                System.out.println(bookEach.getAuthorOfTheBook());
        }
    }

    public static void searchBookByName(String title){
        for (Book bookEach:bookList) {
            if (bookEach.getBookTitle().equals(title)){
                System.out.println(bookEach.getAuthorOfTheBook() + " " + bookEach.getBookTitle());
            }
        }
    }
}
