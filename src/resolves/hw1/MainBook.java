package resolves.hw1;

import java.util.ArrayList;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        // Створення об'єктів класу Book
        Book book1 = new Book("Java Programming", 500, "John Doe", "Education");
        Book book2 = new Book("Effective Java", 300, "Joshua Bloch", "Programming");
        Book book3 = new Book("Clean Code", 450, "Robert C. Martin", "Programming");
        Book book4 = new Book("Head First Java", 720, "Kathy Sierra", "Education");
        Book book5 = new Book("Java: The Complete Reference", 1200, "Herbert Schildt", "Reference");


        // Додавання об'єктів до списків
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        // Ітерація по списках та виведення об'єктів в консоль
        for (Book book : books) {
            System.out.println(book);
        }

    }
}

