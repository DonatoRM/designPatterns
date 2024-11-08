package creation.factoryMethod;

import creation.factoryMethod.models.Vehicle;
import creation.factoryMethod.models.VehicleFactory;

public class Main {
    public static void main() {
        VehicleFactory factory=new VehicleFactory();
        Vehicle vehicle=factory.createVehicle("coche");
        vehicle.drive();
        vehicle= factory.createVehicle("moto");
        vehicle.drive();
    }
}
