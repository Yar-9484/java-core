package resolves.HW32;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Грає барабан з розміром: " + size);
    }

    // Геттери та сеттери (якщо потрібні)
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
