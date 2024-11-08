package creation.builder.model;

public class Casa {
    private String paredes;
    private String techo;
    private String puertas;
    private String ventanas;

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    @Override
    public String toString() {
        return String.format("Casa { paredes='%s', techo='%s', puertas='%s', ventanas='%s' }\n",
                paredes, techo, puertas, ventanas);
    }
}
