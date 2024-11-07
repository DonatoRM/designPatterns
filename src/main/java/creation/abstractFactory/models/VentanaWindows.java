package creation.abstractFactory.models;

public class VentanaWindows implements Ventana{
    @Override
    public void abrir() {
        System.out.println("Abriendo una ventana de Windows.");
    }
}
