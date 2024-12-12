package resolves.HW41;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        // Створення списку користувачів
        List<User> users = new ArrayList<>();
        users.add(new User("Anna", 25));
        users.add(new User("Boris", 20));
        users.add(new User("Catherine", 30));
        users.add(new User("David", 35));
        users.add(new User("Eva", 28));

        // Відсортувати за віком (зростання)
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Відсортовано за віком (зростання):");
        for (User user : users) {
            System.out.println(user);
        }

        // Відсортувати за віком (спадання)
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println("\nВідсортовано за віком (спадання):");
        for (User user : users) {
            System.out.println(user);
        }

        // Відсортувати за кількістю знаків в імені (зростання)
        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        System.out.println("\nВідсортовано за кількістю знаків в імені (зростання):");
        for (User user : users) {
            System.out.println(user);
        }

        // Відсортувати за кількістю знаків в імені (спадання)
        users.sort(Comparator.comparingInt(user -> user.getName().length()).reversed());
        System.out.println("\nВідсортовано за кількістю знаків в імені (спадання):");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
