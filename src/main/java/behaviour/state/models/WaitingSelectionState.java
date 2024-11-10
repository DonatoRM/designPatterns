package behaviour.state.models;

public class WaitingSelectionState implements State<VendingMachine> {
    @Override
    public void handleRequest(VendingMachine context) {
        System.out.println("Esperando la selección del producto.");
        context.setState(new DeliveringProduct());
    }
}
