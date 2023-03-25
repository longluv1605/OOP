public class Test {
    public static void main(String[] args) {
        Person a = new Person("Long", "177, Cau Dien, Bac Tu Liem, HN");
        Vehicle v1 = new Car("BMW", "i8", "30A - 888.88", a, 4);
        Vehicle v2 = new Motorbike("Yamaha", "R15", "30A - 666.66", a, true);
        // a.addVehicle(v1);
        // a.addVehicle(v2);

        System.out.println(a.getVehiclesInfo());

        // a.removeVehicle("30A - 888.88");
        // a.removeVehicle("30A - 666.66");
        Person b = new Person("Vi", "177, Cau Dien, Bac Tu Liem, HN");

        b.addVehicle(v1);
        b.addVehicle(v2);

        System.out.println(b.getVehiclesInfo());

        System.out.println("----------------------------------------------------------------");
        
        v1.transferOwnership(b);

        System.out.println(a.getVehiclesInfo());
        System.out.println(b.getVehiclesInfo());

    }
}
