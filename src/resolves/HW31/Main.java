package resolves.HW31;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];

        // Створення об'єктів класів Book та Magazine
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Effective Java", "Joshua Bloch");
        Magazine magazine1 = new Magazine("Tech Today", "January 2022");
        Magazine magazine2 = new Magazine("Science World", "February 2022");

        // Додавання об'єктів до масиву
        printables[0] = book1;
        printables[1] = book2;
        printables[2] = magazine1;
        printables[3] = magazine2;

        // Ітерація по масиву та виклик методу print()
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
