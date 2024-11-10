package behaviour.state.models;

public class VendingMachine {
    private State<VendingMachine> state;

    public VendingMachine() {
        this.state = new WaitingForCoinState();
    }

    public void setState(State<VendingMachine> state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}
