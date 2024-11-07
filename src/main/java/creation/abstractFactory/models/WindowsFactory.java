package creation.abstractFactory.models;

public class WindowsFactory implements GUIFactory{
    @Override
    public Ventana crearVentana() {
        return new VentanaWindows();
    }

    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }
}
