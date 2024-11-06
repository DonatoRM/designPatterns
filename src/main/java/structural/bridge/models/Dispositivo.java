package structural.bridge.models;

public abstract class Dispositivo {
    protected ControlRemoto controlRemoto;
    protected Dispositivo(ControlRemoto controlRemoto) {
        this.controlRemoto = controlRemoto;
    }
    public abstract void encender();
    public abstract void apagar();
}
