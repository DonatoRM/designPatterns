package structural.bridge;

import structural.bridge.models.*;

import java.util.List;

public class Main {
    public static void main() {
        ControlRemoto tvRemote=new ControlRemotoTV();
        Dispositivo tv=new Televisor(tvRemote);
        ControlRemoto radioRemote=new ControlRemotoRadio();
        Dispositivo radio=new Radio(radioRemote);
        List<Dispositivo> aparatos=List.of(tv,radio);
        aparatos.forEach(Dispositivo::encender);
        aparatos.forEach(Dispositivo::apagar);
    }
}
