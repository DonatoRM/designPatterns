package creation.builder.model;

public class CasaConcretaBuilder implements CasaBuilder {
    private final Casa casa;

    public CasaConcretaBuilder() {
        this.casa = new Casa();
    }

    @Override
    public void construirParedes() {
        casa.setParedes("Paredes de ladrillo");
    }

    @Override
    public void construirTecho() {
        casa.setTecho("Techo de tejas");
    }

    @Override
    public void construirPuertas() {
        casa.setPuertas("Puertas de madera");
    }

    @Override
    public void construirVentanas() {
        casa.setVentanas("Ventanas de vidrio");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
