package structural.proxy.models;

public class ServicioReal implements Servicio{
    @Override
    public void ejecutar() {
        System.out.println("Se ha ejecutado el servicio real");
    }
}
