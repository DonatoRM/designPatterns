package behaviour.state.models;

public class DeliveringProduct implements State<VendingMachine> {
    @Override
    public void handleRequest(VendingMachine context) {
        System.out.println("Entregando el producto.");
        context.setState(new WaitingForCoinState());
    }
}
