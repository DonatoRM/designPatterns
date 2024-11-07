package creation.abstractFactory;

import creation.abstractFactory.models.*;

public class Main {
    private final Ventana ventana;
    private final Boton boton;
    public Main(@org.jetbrains.annotations.NotNull GUIFactory factory) {
        this.ventana=factory.crearVentana();
        this.boton=factory.crearBoton();
    }
    public void interactuarConUI() {
        ventana.abrir();
        boton.click();
    }

    public static void main() {
        GUIFactory factory;

        factory=new WindowsFactory();
        Main app=new Main(factory);
        app.interactuarConUI();

        factory=new MacFactory();
        app=new Main(factory);
        app.interactuarConUI();
    }
}
