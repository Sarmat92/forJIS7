package JavaHomework.Lectures_10.Collections.Library;

import java.util.Objects;

public class Book {

    private String authorOfTheBook;
    private String bookTitle;

    public Book() {
    }

    public Book(String authorOfTheBook, String bookTitle) {
        this.authorOfTheBook = authorOfTheBook;
        this.bookTitle = bookTitle;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(authorOfTheBook, book.authorOfTheBook) && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorOfTheBook, bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorOfTheBook='" + authorOfTheBook + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
