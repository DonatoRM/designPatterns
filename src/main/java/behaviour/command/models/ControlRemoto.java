package behaviour.command.models;

public class ControlRemoto {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void presionarBoton() {
        command.execute();
    }

    public void presionarBotonDeshacer() {
        command.undo();
    }
}
