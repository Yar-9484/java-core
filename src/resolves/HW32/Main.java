package resolves.HW32;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];

        // Створення об'єктів класів Guitar, Drum та Trumpet
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(12);
        Trumpet trumpet = new Trumpet(8);

        // Додавання об'єктів до масиву
        instruments[0] = guitar;
        instruments[1] = drum;
        instruments[2] = trumpet;

        // Ітерація по масиву та виклик методу play()
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
