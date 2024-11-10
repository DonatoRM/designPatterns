package behaviour.visitor.model;

public class Tabla implements Element {
    private final int filas;
    private final int columnas;

    public Tabla(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
