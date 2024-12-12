package resolves.HW44;

import java.util.*;

public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    // Метод для додавання учасника в клуб
    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    // Метод для додавання тваринки до учасника клубу
    public void addPetToMember(Person person, Pet pet) {
        club.get(person).add(pet);
    }

    // Метод для видалення тваринки з власника
    public void removePetFromMember(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.remove(pet);
        }
    }

    // Метод для видалення учасника клубу
    public void removeMember(Person person) {
        club.remove(person);
    }

    // Метод для видалення конкретної тваринки з усіх власників
    public void removePetFromAllMembers(Pet pet) {
        for (List<Pet> pets : club.values()) {
            pets.remove(pet);
        }
    }

    // Метод для виведення зооклубу на екран
    public void showClub() {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
