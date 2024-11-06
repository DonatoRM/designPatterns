package structural.adapter;

import structural.adapter.adapters.CarAdapter;
import structural.adapter.api.Drivable;
import structural.adapter.model.Car;
import structural.adapter.model.Cart;

import java.util.List;

public class Main {
    public static void main() {
        List<Drivable> drives = List.of(new CarAdapter(new Cart()),new Car());
        drives.forEach(Drivable::accelerate);
    }
}
