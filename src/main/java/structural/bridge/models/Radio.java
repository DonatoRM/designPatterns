package structural.bridge.models;

public class Radio extends Dispositivo{
    public Radio(ControlRemoto controlRemoto) {
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
