package structural.facade;

import structural.facade.models.DomoticaFacade;

public class Main {
    public static void main() {
        DomoticaFacade hogar=new DomoticaFacade();
        hogar.modoDia();
        hogar.modoNoche();
    }
}
