package creation.builder.model;

public interface CasaBuilder {
    void construirParedes();

    void construirTecho();

    void construirPuertas();

    void construirVentanas();

    Casa getCasa();
}