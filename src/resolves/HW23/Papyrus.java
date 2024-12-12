package resolves.HW23;

public class Papyrus {
    private String material;
    private String origin;

    public Papyrus(String material, String origin) {
        this.material = material;
        this.origin = origin;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "material='" + material + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}

