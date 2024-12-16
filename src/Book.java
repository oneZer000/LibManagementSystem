public class Book {
    private String title;
    private String author;
    public boolean isCheckedOut;

    // Конструктор для инициализации полей
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false; // По умолчанию книга доступна
    }

    // Метод для выдачи книги
    public void checkout() {
        isCheckedOut = true;
        System.out.println("\nКнига '" + title + "' выдана.");
    }

    // Метод для возврата книги
    public void checkin() {
        isCheckedOut = false;
        System.out.println("\nКнига '" + title + "' возвращена.");
    }

    // Метод для вывода информации о книге
    public void displayInfo() {

        System.out.printf("Название: %s; Автор: %s; Доступность: %s", title, author, isCheckedOut);
    }
}