package resolves.HW22;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook("Apple", "MacBook Air", 13.3, 1.25);
        Workstation workstation = new Workstation("Dell", "Precision", 15.6, true);

        System.out.println(ultrabook);
        System.out.println(workstation);
    }
}

