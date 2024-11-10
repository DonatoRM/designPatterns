package behaviour.visitor.model;

public class Texto implements Element {
    private final String contenido;

    public Texto(String contenido) {
        this.contenido = contenido;
    }

    public Object getContenido() {
        return contenido;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
