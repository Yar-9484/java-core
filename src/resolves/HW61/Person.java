package resolves.HW61;
import java.io.Serializable;

public class Person implements Serializable {
    public  String name;
    public int age;
    public int drivingExperience;

    public Person(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void increaseExperience() {
        this.drivingExperience += 1;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    }




