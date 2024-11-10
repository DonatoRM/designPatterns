package behaviour.visitor.model;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private final List<Element> elementos;

    public Documento() {
        elementos = new ArrayList<>();
    }

    public void agregarElemento(Element elemento) {
        elementos.add(elemento);
    }

    public void aceptarVisitor(Visitor visitor) {
        elementos.forEach(elemento -> elemento.accept(visitor));
    }
}