package JavaHomework.ObjectInMember.Book;

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book();

        book.setAuthor("Ivan Ivanov");
        System.out.println(book.getAuthor());

        book.setNumberOfPages(125);
        System.out.println(book.getNumberOfPages());

        book.setTitle("Holy Bible");
        System.out.println(book.getTitle());
    }
}
