package behaviour.state.models;

public class WaitingForCoinState implements State<VendingMachine> {
    @Override
    public void handleRequest(VendingMachine context) {
        System.out.println("Esperando a que se inserte una moneda.");
        context.setState(new WaitingSelectionState());
    }
}
