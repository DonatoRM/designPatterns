package behaviour.command;

import behaviour.command.models.*;

public class Main {
    public static void main() {
        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();

        Command encenderLuz = new EncenderLuzCommand(luz);
        Command encenderVentilador = new EncenderVentiladorCommand(ventilador);

        ControlRemoto control = new ControlRemoto();

        control.setCommand(encenderLuz);
        control.presionarBoton();
        control.presionarBotonDeshacer();

        control.setCommand(encenderVentilador);
        control.presionarBoton();
        control.presionarBotonDeshacer();
    }
}
