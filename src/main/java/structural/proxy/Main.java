package structural.proxy;

import structural.proxy.models.ProxyServicio;
import structural.proxy.models.Servicio;

public class Main {
    public static void main() {
        Servicio servicio=new ProxyServicio();
        servicio.ejecutar();
    }
}
