package structural.proxy.models;

public class ProxyServicio implements Servicio{
    private Servicio servicioReal;
    @Override
    public void ejecutar() {
        if(servicioReal == null) {
            servicioReal = new ServicioReal();
        }
        System.out.println("Ejecutando tareas adicionales...");
        servicioReal.ejecutar();
    }
}
