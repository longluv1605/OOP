import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addVehicle(Vehicle vehicle) {
        //----------------------------------TEST------------------------------
        if (vehicle.getOwner().equals(this)) {
            this.vehicleList.add(vehicle);
        }
    }

    public void removeVehicle(String registrationNumber) {
        try {
            for (Vehicle vehicle : this.vehicleList) {
                if (vehicle.getRegistrationNumber() == registrationNumber) {
                    this.vehicleList.remove(vehicle);
                }
            }
        } catch (Exception e) {

        }
    }

    public String getInfo() {
        return this.name + " - " + this.address;
    }

    public String getVehiclesInfo() {
        String info = this.name + " ";
        if (this.vehicleList.size() == 0) {
            info += "has no vehicle!";
        } else {
            info += "has:\n\n";
            for (Vehicle vehicle : this.vehicleList) {
                info += vehicle.getInfo();
            }
        }
        /*
         * try {
         * info += "has:\n\n";
         * for (Vehicle vehicle : this.vehicleList) {
         * info += vehicle.getInfo();
         * }
         * } catch (Exception e) {
         * info += "has no vehicle!";
         * }
         */
        return info;
    }
}
