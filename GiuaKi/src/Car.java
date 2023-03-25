public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        String info = "Car:\n";
        info += "  Brand: " + this.brand + "\n";
        info += "  Model: " + this.model + "\n";
        info += "  Registration Number: " + this.registrationNumber + "\n";
        info += "  Number of Doors: " + this.numberOfDoors + "\n";
        info += "  Belongs to " + this.owner.getInfo() + "\n";
        return info;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
