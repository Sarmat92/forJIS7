package JavaHomework.Lectures_10.Collections.Library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    public List<Book> bookList = new ArrayList<>();

    public void addBook(Book bookForAdd) {
        bookList.add(bookForAdd);
    }

    public void deleteBook(int bookForDelete) {
        bookList.remove(bookForDelete);
    }

    public void showAllBook() {
        for (Book bookEach : bookList) {
            System.out.println(bookEach);
        }
    }

    public void showAllBookByAuthor() {
        for (Book bookEach : bookList) {
                System.out.println(bookEach.getAuthorOfTheBook());
        }
    }

    public void searchBookByName(String title){
        for (Book bookEach:bookList) {
            if (bookEach.getBookTitle().equals(title)){
                System.out.println(bookEach.getAuthorOfTheBook() + " " + bookEach.getBookTitle());
            }
        }
    }
}
