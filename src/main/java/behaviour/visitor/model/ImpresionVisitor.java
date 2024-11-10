package behaviour.visitor.model;

public class ImpresionVisitor implements Visitor{
    @Override
    public void visit(Texto texto) {
        System.out.printf("Imprimiendo texto: %s\n", texto.getContenido());
    }

    @Override
    public void visit(Imagen imagen) {
        System.out.printf("Imprimiendo imagen con resolución: %s\n", imagen.resolucion());
    }

    @Override
    public void visit(Tabla tabla) {
        System.out.printf("Imprimiendo tabla con %d filas y %d columnas.\n",tabla.getFilas(),tabla.getColumnas());
    }
}
