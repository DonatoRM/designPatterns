package behaviour.visitor.model;

public record Imagen(String resolucion) implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
