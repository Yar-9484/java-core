package resolves.HW52;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення масиву з 20 числами
        int[] numbers = {18, 22, 9, 14, 26, 30, 11, 6, 3, 25, 17, 40, 19, 33, 28, 12, 2, 15, 24, 5};

        // Сортування масиву
        int[] sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toArray();
        System.out.println("Відсортований масив:");
        Arrays.stream(sortedNumbers).forEach(System.out::println);

        // Отримати числа кратні 3
        List<Integer> multiplesOf3 = Arrays.stream(numbers)
                .filter(n -> n % 3 == 0)
                .boxed()
                .toList();
        System.out.println("Числа кратні 3:");
        multiplesOf3.forEach(System.out::println);

        // Отримати числа кратні 10
        List<Integer> multiplesOf10 = Arrays.stream(numbers)
                .filter(n -> n % 10 == 0)
                .boxed()
                .toList();
        System.out.println("Числа кратні 10:");
        multiplesOf10.forEach(System.out::println);

        // Перебрати масив за допомогою foreach()
        System.out.println("Масив перебраний за допомогою foreach():");
        Arrays.stream(numbers).forEach(System.out::println);

        // Перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
        int[] tripledNumbers = Arrays.stream(numbers)
                .map(n -> n * 3)
                .toArray();
        System.out.println("Новий масив, у якому всі значення у 3 рази більші:");
        Arrays.stream(tripledNumbers).forEach(System.out::println);
    }
}

