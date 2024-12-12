package resolves.HW22;

public class Laptop extends PC {
    private double screenSize;

    public Laptop(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}