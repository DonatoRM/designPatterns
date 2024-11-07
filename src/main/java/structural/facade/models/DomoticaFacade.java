package structural.facade.models;

public class DomoticaFacade {
    private final Luces luces;
    private final Termostato termostato;
    private final Seguridad seguridad;

    public DomoticaFacade() {
        luces = new Luces();
        termostato = new Termostato();
        seguridad = new Seguridad();
    }
    public void modoDia() {
        this.luces.apagarLuces();
        this.termostato.apagarEstufa();
        this.seguridad.apagarAlarma();
    }
    public void modoNoche() {
        this.luces.encenderLuces();
        this.termostato.encenderEstufa();
        this.seguridad.encenderAlarma();
    }
}
