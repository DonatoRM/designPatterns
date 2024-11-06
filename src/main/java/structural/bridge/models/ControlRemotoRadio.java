package structural.bridge.models;

public class ControlRemotoRadio implements ControlRemoto{
    @Override
    public void powerOn() {
        System.out.println("Ahora la Radio está encendida");
    }

    @Override
    public void powerOff() {
        System.out.println("Ahora la radio está apagada");
    }
}
