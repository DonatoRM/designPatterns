package structural.adapter.model;

import structural.adapter.api.Drivable;

public class Car implements Drivable {
    @Override
    public void accelerate() {
        System.out.println("Hago que ande más el Coche ");
    }
}
