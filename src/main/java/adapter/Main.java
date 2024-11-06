package adapter;

import adapter.adapters.CarAdapter;
import adapter.api.Drivable;
import adapter.model.Car;
import adapter.model.Cart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        List<Drivable> drives = new ArrayList<>();
        Drivable cart=new CarAdapter(new Cart());
        Drivable car=new Car();
        drives.add(cart);
        drives.add(car);
        for (Drivable d : drives) {
            d.accelerate();
        }
    }
}
