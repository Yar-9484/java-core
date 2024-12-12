package resolves.hw1;

import java.util.ArrayList;
import java.util.List;

public class MainCar {
    public static void main(String[] args) {

        // Створення об'єктів класу Car
        Car car1 = new Car("Toyota Camry", 200, 2.5, true);
        Car car2 = new Car("Honda Accord", 190, 2.0, false);
        Car car3 = new Car("BMW 320i", 250, 2.0, true);
        Car car4 = new Car("Audi A4", 220, 2.0, true);
        Car car5 = new Car("Ford Mustang", 450, 5.0, true);


        // Додавання об'єктів до списків
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        // Ітерація по списках та виведення об'єктів в консоль

        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
