package resolves.hw1;

import java.util.ArrayList;
import java.util.List;

public class Mainall {
    public static void main(String[] args) {
        // Створення об'єктів класу Book
        Book book1 = new Book("Java Programming", 500, "John Doe", "Education");
        Book book2 = new Book("Effective Java", 300, "Joshua Bloch", "Programming");
        Book book3 = new Book("Clean Code", 450, "Robert C. Martin", "Programming");
        Book book4 = new Book("Head First Java", 720, "Kathy Sierra", "Education");
        Book book5 = new Book("Java: The Complete Reference", 1200, "Herbert Schildt", "Reference");

        // Створення об'єктів класу Car
        Car car1 = new Car("Toyota Camry", 200, 2.5, true);
        Car car2 = new Car("Honda Accord", 190, 2.0, false);
        Car car3 = new Car("BMW 320i", 250, 2.0, true);
        Car car4 = new Car("Audi A4", 220, 2.0, true);
        Car car5 = new Car("Ford Mustang", 450, 5.0, true);

        // Створення об'єктів класу Dog
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Max", 2, "German Shepherd");
        Dog dog3 = new Dog("Bella", 4, "Bulldog");
        Dog dog4 = new Dog("Lucy", 5, "Beagle");
        Dog dog5 = new Dog("Daisy", 1, "Poodle");

        // Додавання об'єктів до списків
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        // Ітерація по списках та виведення об'єктів в консоль
        for (Book book : books) {
            System.out.println(book);
        }

        for (Car car : cars) {
            System.out.println(car);
        }

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
