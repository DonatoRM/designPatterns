package creation.abstractFactory.models;

public class VentanaMac implements Ventana{
    @Override
    public void abrir() {
        System.out.println("Abriendo una ventana de macOs.");
    }
}
