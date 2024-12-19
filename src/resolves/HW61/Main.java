package resolves.HW61;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення власників
        Person person1 = new Person("John", 30, 6);
        Person person2 = new Person("Jane", 28, 3);
        Person person3 = new Person("Mike", 35, 10);
        Person person4 = new Person("Anna", 32, 7);
        Person person5 = new Person("David", 26, 2);
        Person person6 = new Person("Eva", 29, 1);
        Person person7 = new Person("Alex", 45, 20);

        // Створення автомобілів
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 150, person1, 20000, 2015));
        cars.add(new Car("Honda", 140, person2, 18000, 2016));
        cars.add(new Car("Ford", 160, person3, 22000, 2014));
        cars.add(new Car("BMW", 200, person4, 35000, 2018));
        cars.add(new Car("Audi", 210, person5, 34000, 2017));
        cars.add(new Car("Nissan", 130, person6, 17000, 2013));
        cars.add(new Car("Mercedes", 220, person7, 40000, 2019));

        // Збільшити потужність двигуна на 10% для половини автопарку
        cars.stream().limit(cars.size() / 2).forEach(car -> car.setEnginePower(car.getEnginePower() * 1.1));

        // Перевірка досвіду всіх водіїв та підвищення кваліфікації
        cars.forEach(car -> {
            Person owner = car.getOwner();
            if (owner.getDrivingExperience() < 5 && owner.getAge() > 25) {
                owner.setDrivingExperience(owner.getDrivingExperience() + 1);
            }
        });

        // Розрахунок суми для покупки всіх автомобілів
        double totalCost = cars.stream().mapToDouble(Car::getPrice).sum();
        System.out.println("Загальна вартість всіх автомобілів: " + totalCost);

        // Запис автомобілів у файл з обробкою помилок
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cars.txt"))) {
            for (Car car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Помилка запису файлу: " + e.getMessage());
        }

        // Зчитування автомобілів з файлу з обробкою помилок
        try (BufferedReader reader = new BufferedReader(new FileReader("cars.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Файл не знайдено: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка зчитування файлу: " + e.getMessage());
        }

        // Створення невалідних даних та обробка помилки
        try {
            cars.add(new Car(null, -150, person1, -20000, -2015));
        } catch (IllegalArgumentException e) {
            System.err.println("Невалідні дані для автомобіля: " + e.getMessage());
        }
    }
}



