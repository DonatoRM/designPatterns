package creation.abstractFactory.models;

public class BotonWindows implements Boton{
    @Override
    public void click() {
        System.out.println("Haciendo click en un botón de Windows.");
    }
}
