package adapter;

import adapter.adapters.CarAdapter;
import adapter.api.Drivable;
import adapter.model.Car;
import adapter.model.Cart;
import java.util.List;

public class Main {
    public static void main() {
        List<Drivable> drives = List.of(new CarAdapter(new Cart()),new Car());
        drives.forEach(Drivable::accelerate);
    }
}
