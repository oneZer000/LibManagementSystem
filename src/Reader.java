import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> checkedOutBooks;

    public Reader(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
    }

    public void checkoutBook(Book book) {
        checkedOutBooks.add(book);
        book.checkout();
    }

    public void checkinBook(Book book) {
        checkedOutBooks.remove(book);
        book.checkin();
    }

    public void displayInfo() {
        System.out.println("Читатель: " + name);
        System.out.println("Выданные книги:");
        for (Book book : checkedOutBooks) {
            book.displayInfo();
        }
    }
}