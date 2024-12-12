package resolves.HW44;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Person person1 = new Person("Vasya", 31);
        Person person2 = new Person("Petya", 28);

        Pet pet1 = new Pet("Cat", "Tom");
        Pet pet2 = new Pet("Dog", "Rex");

        // Додати учасників у клуб
        zooClub.addMember(person1);
        zooClub.addMember(person2);

        // Додати тваринок до учасників клубу
        zooClub.addPetToMember(person1, pet1);
        zooClub.addPetToMember(person1, pet2);
        zooClub.addPetToMember(person2, pet2);

        // Вивести зооклуб на екран
        System.out.println("ZooClub після додавання учасників та тваринок:");
        zooClub.showClub();

        // Видалити тваринку з власника
        zooClub.removePetFromMember(person1, pet1);

        // Вивести зооклуб на екран після видалення тваринки
        System.out.println("\nZooClub після видалення тваринки у Vasya:");
        zooClub.showClub();

        // Видалити учасника клубу
        zooClub.removeMember(person2);

        // Вивести зооклуб на екран після видалення учасника
        System.out.println("\nZooClub після видалення учасника Petya:");
        zooClub.showClub();

        // Видалити конкретну тваринку з усіх власників
        zooClub.removePetFromAllMembers(pet2);

        // Вивести зооклуб на екран після видалення тваринки з усіх власників
        System.out.println("\nZooClub після видалення тваринки Dog Rex з усіх власників:");
        zooClub.showClub();
    }
}

