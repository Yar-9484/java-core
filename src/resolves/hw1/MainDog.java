package resolves.hw1;

import java.util.ArrayList;
import java.util.List;

public class MainDog {
    public static void main(String[] args) {

        // Створення об'єктів класу Dog
        Dog dog1 = new Dog("Buddy", 3, "Golden Retriever");
        Dog dog2 = new Dog("Max", 2, "German Shepherd");
        Dog dog3 = new Dog("Bella", 4, "Bulldog");
        Dog dog4 = new Dog("Lucy", 5, "Beagle");
        Dog dog5 = new Dog("Daisy", 1, "Poodle");

        // Додавання об'єктів до списків

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        // Ітерація по списках та виведення об'єктів в консоль

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
