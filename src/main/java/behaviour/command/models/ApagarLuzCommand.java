package behaviour.command.models;

public class ApagarLuzCommand implements Command {
    private final Luz luz;

    public ApagarLuzCommand(Luz luz) {
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
