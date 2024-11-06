package structural.adapter.adapters;

import structural.adapter.api.Drivable;
import structural.adapter.model.Cart;

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
