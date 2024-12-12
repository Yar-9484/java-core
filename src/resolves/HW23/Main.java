package resolves.HW23;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal("Papyrus", "Egypt", "Ancient Times", "Historical Society", 5);
        Comic comic = new Comic("Papyrus", "Egypt", "Super Hero Adventures", "John Smith", "Jane Doe");

        System.out.println(journal);
        System.out.println(comic);
    }
}

