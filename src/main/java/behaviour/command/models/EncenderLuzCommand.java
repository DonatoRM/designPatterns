package behaviour.command.models;

public class EncenderLuzCommand implements Command {
    private final Luz luz;

    public EncenderLuzCommand(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void execute() {
        luz.apagar();
    }

    @Override
    public void undo() {
        luz.encender();
    }
}
