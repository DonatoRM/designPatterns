package behaviour.command.models;

public class EncenderVentiladorCommand implements Command {
    private final Ventilador ventilador;

    public EncenderVentiladorCommand(Ventilador ventilador) {
        this.ventilador = ventilador;
    }

    @Override
    public void execute() {
        ventilador.encender();
    }

    @Override
    public void undo() {
        ventilador.apagar();
    }
}
