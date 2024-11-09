package behaviour.command.models;

public class ApagarVentiladorCommand implements Command {
    private final Ventilador ventilador;

    public ApagarVentiladorCommand(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.apagar();
    }

    @Override
    public void undo() {
        ventilador.encender();
    }
}
