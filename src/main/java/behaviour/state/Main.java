package behaviour.state;

import behaviour.state.models.VendingMachine;

public class Main {
    public static void main() {
        VendingMachine machine = new VendingMachine();

        machine.request();

        machine.request();

        machine.request();

        machine.request();

    }
}
