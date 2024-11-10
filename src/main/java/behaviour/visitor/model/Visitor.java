package behaviour.visitor.model;

public interface Visitor {
    void visit(Texto texto);
    void visit(Imagen imagen);
    void visit(Tabla tabla);
}
