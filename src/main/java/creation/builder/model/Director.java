package creation.builder.model;

public class Director {
    private final CasaBuilder builder;

    public Director(CasaBuilder builder) {
        this.builder = builder;
    }
    public void construirCasa() {
        this.builder.construirParedes();
        this.builder.construirTecho();
        this.builder.construirPuertas();
        this.builder.construirVentanas();
    }
    public Casa getCasa() {
        return builder.getCasa();
    }
}
