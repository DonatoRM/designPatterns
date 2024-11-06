package adapter.adapters;

import adapter.api.Drivable;
import adapter.model.Cart;

public class CarAdapter implements Drivable {
    private final Cart cart;
    public CarAdapter(Cart cart) {
        this.cart = cart;
    }
    @Override
    public void accelerate() {
        this.cart.moving();
    }
}
