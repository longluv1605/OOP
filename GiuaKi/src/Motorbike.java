public class Motorbike extends Vehicle {
    private boolean hasSidecar;

    public Motorbike(String brand, String model, String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        String info = "Motorbike:\n";
        info += "  Brand: " + this.brand + "\n";
        info += "  Model: " + this.model + "\n";
        info += "  Registration Number: " + this.registrationNumber + "\n";
        info += "  Has Side Car: " + this.hasSidecar + "\n";
        info += "  Belongs to " + this.owner.getInfo() + "\n";
        return info;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
