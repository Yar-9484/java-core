package resolves.HW43;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Skill
        Skill skill1 = new Skill("java", 10);
        Skill skill2 = new Skill("js", 10);
        Skill skill3 = new Skill("c++", 10);
        Skill skill4 = new Skill("python", 8);
        Skill skill5 = new Skill("ruby", 7);

        // Створення об'єкта класу Car
        Car car = new Car("toyota", 2021, 250);

        // Створення об'єктів класу User
        User user1 = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, List.of(skill1, skill2, skill3), car);
        User user2 = new User(2, "petya", "ivanov", "petya@asd.com", 28, Gender.MALE, List.of(skill1, skill2), car);
        User user3 = new User(3, "masha", "petrova", "masha@asd.com", 25, Gender.FEMALE, List.of(skill2, skill3), car);
        User user4 = new User(4, "katya", "sidorova", "katya@asd.com", 29, Gender.FEMALE, List.of(skill1, skill3), car);
        User user5 = new User(5, "kolya", "smirnov", "kolya@asd.com", 32, Gender.MALE, List.of(skill1, skill2, skill3), car);
        User user6 = new User(6, "dima", "terentyev", "dima@asd.com", 30, Gender.MALE, List.of(skill1), car);
        User user7 = new User(7, "olga", "voronina", "olga@asd.com", 27, Gender.FEMALE, List.of(skill4), car);
        User user8 = new User(8, "nina", "tarasova", "nina@asd.com", 26, Gender.FEMALE, List.of(skill2, skill5), car);
        User user9 = new User(9, "kirill", "sergeev", "kirill@asd.com", 31, Gender.MALE, List.of(skill1, skill5), car);
        User user10 = new User(10, "lena", "kuznetsova", "lena@asd.com", 22, Gender.FEMALE, List.of(skill3, skill4), car);

        // Створення HashSet з 10 об'єктів
        HashSet<User> usersSet = new HashSet<>();
        usersSet.add(user1);
        usersSet.add(user2);
        usersSet.add(user3);
        usersSet.add(user4);
        usersSet.add(user5);
        usersSet.add(user6);
        usersSet.add(user7);
        usersSet.add(user8);
        usersSet.add(user9);
        usersSet.add(user10);

        // Ітерація по HashSet та видалення всіх чоловіків
        Iterator<User> iterator = usersSet.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getGender() == Gender.MALE) {
                iterator.remove();
            }
        }

        // Виведення залишених користувачів
        System.out.println("Залишені користувачі:");
        for (User user : usersSet) {
            System.out.println(user);
        }

        // Створення TreeSet з 10 об'єктів, сортування за кількістю скілів від меншого до більшого
        TreeSet<User> usersTreeSet = new TreeSet<>((u1, u2) -> Integer.compare(u1.getSkills().size(), u2.getSkills().size()));
        usersTreeSet.add(user1);
        usersTreeSet.add(user2);
        usersTreeSet.add(user3);
        usersTreeSet.add(user4);
        usersTreeSet.add(user5);
        usersTreeSet.add(user6);
        usersTreeSet.add(user7);
        usersTreeSet.add(user8);
        usersTreeSet.add(user9);
        usersTreeSet.add(user10);

        // Виведення TreeSet
        System.out.println("\nTreeSet, відсортований за кількістю скілів:");
        for (User user : usersTreeSet) {
            System.out.println(user);
        }
    }
}
