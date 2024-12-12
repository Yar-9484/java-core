package resolves.HW24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Skill
        Skill skill1 = new Skill("java", 10);
        Skill skill2 = new Skill("js", 10);
        Skill skill3 = new Skill("c++", 10);

        // Створення об'єкта класу Car
        Car car = new Car("toyota", 2021, 250);

        // Створення об'єктів класу User
        User user1 = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, Arrays.asList(skill1, skill2, skill3), car);
        User user2 = new User(2, "petya", "ivanov", "petya@asd.com", 28, Gender.MALE, Arrays.asList(skill1, skill2), car);
        User user3 = new User(3, "masha", "petrova", "masha@asd.com", 25, Gender.FEMALE, Arrays.asList(skill2, skill3), car);
        User user4 = new User(4, "katya", "sidorova", "katya@asd.com", 29, Gender.FEMALE, Arrays.asList(skill1, skill3), car);
        User user5 = new User(5, "kolya", "smirnov", "kolya@asd.com", 32, Gender.MALE, Arrays.asList(skill1, skill2, skill3), car);

        // Додавання об'єктів до списку
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        // Ітерація по списку та виведення об'єктів в консоль
        for (User user : users) {
            System.out.println(user);
        }
    }
}
