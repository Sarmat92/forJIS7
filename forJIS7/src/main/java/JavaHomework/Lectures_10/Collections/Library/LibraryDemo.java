package JavaHomework.Lectures_10.Collections.Library;

public class LibraryDemo {

    public static void main(String[] args) {

        Library.addBook(new Book("Ушинский", "Колобок"));
        Library.addBook(new Book("Дюма", "Охота и Любовь"));
        Library.addBook(new Book("Пушкин", "Стихи"));
        Library.addBook(new Book("Толстой", "Стихи"));

        Library.showAllBook();
        System.out.println();
        Library.showAllBookByAuthor();
        System.out.println();
        Library.searchBookByName("Стихи");
    }
}
