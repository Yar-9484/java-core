package resolves.HW22;

public class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(String brand, String model, double screenSize, double weight) {
        super(brand, model, screenSize);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", screenSize=" + getScreenSize() +
                ", weight=" + weight +
                '}';
    }
}

