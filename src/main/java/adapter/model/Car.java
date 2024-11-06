package adapter.model;

import adapter.api.Drivable;

public class Car implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("Hago que ande más el Coche ");
    }
}
