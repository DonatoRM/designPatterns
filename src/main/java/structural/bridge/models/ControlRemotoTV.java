package structural.bridge.models;

public class ControlRemotoTV implements ControlRemoto{
    @Override
    public void powerOn() {
        System.out.println("Ahora está la TV encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Ahora está la TV apagada");
    }
}
