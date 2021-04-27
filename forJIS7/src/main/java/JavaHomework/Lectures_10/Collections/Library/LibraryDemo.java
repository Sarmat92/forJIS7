package JavaHomework.Lectures_10.Collections.Library;

public class LibraryDemo {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Ушинский", "Колобок"));
        library.addBook(new Book("Дюма", "Охота и Любовь"));
        library.addBook(new Book("Пушкин", "Стихи"));
        library.addBook(new Book("Толстой", "Стихи"));

        library.showAllBook();
        System.out.println();
        library.showAllBookByAuthor();
        System.out.println();
        library.searchBookByName("Стихи");

    }
}
