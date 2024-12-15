package resolves.HW51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Створення ArrayList зі словами
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("kiwi");
        words.add("grape");
        words.add("mango");
        words.add("pear");
        words.add("peach");
        words.add("cherry");
        words.add("strawberry");
        words.add("blueberry");
        words.add("raspberry");
        words.add("watermelon");
        words.add("pineapple");
        words.add("lemon");
        words.add("lime");
        words.add("plum");
        words.add("fig");
        words.add("date");
        words.add("pomegranate");

        // Відсортувати список за алфавітом
        Collections.sort(words);

        // Вивести відсортований список в консоль
        System.out.println("Відсортований список слів за алфавітом:");
        for (String word : words) {
            System.out.println(word);
        }

        // Відфільтрувати слова довжиною менше 4 символів
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() >= 4)
                .collect(Collectors.toList());

        // Вивести відфільтрований список в консоль
        System.out.println("\nВідфільтрований список слів (довжина >= 4):");
        for (String word : filteredWords) {
            System.out.println(word);
        }
    }
}

