package creation.abstractFactory.models;

public class MacFactory implements GUIFactory{
    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }

    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }
}
