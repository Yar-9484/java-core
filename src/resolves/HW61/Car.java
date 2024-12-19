package resolves.HW61;

public class Car {
    private final String brand;
    private double enginePower;
    private final Person owner;
    private final double price;
    private final int year;

    public Car(String brand, double enginePower, Person owner, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Person getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
