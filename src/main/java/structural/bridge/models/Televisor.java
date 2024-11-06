package structural.bridge.models;

public class Televisor extends Dispositivo{

    public Televisor(ControlRemoto controlRemoto) {
        super(controlRemoto);
    }

    @Override
    public void encender() {
        this.controlRemoto.powerOn();
    }

    @Override
    public void apagar() {
        this.controlRemoto.powerOff();
    }
}
