package creation.factoryMethod.models;

public class VehicleFactory {
    public Vehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "coche" -> new Car();
            case "moto" -> new Moto();
            default -> null;
        };
    }
}
