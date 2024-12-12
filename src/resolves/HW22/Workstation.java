package resolves.HW22;

public class Workstation extends Laptop {
    private boolean hasDedicatedGPU;

    public Workstation(String brand, String model, double screenSize, boolean hasDedicatedGPU) {
        super(brand, model, screenSize);
        this.hasDedicatedGPU = hasDedicatedGPU;
    }

    public boolean isHasDedicatedGPU() {
        return hasDedicatedGPU;
    }

    public void setHasDedicatedGPU(boolean hasDedicatedGPU) {
        this.hasDedicatedGPU = hasDedicatedGPU;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", screenSize=" + getScreenSize() +
                ", hasDedicatedGPU=" + hasDedicatedGPU +
                '}';
    }
}

