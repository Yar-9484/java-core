package resolves.HW72;

public class Car {
    private int id;
    private String model;
    private CarType type; // ENUM
    private int power;
    private double price;
    private int year;

    // Конструктор
    public Car(int id, String model, CarType type, int power, double price, int year) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }

    // Геттери та сеттери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", power=" + power +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

// ENUM для типів автомобілів
enum CarType {
    SEDAN,
    COUPE,
    SPORT,
    SUV,
    TRUCK,
    VAN
}
