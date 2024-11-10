package behaviour.visitor.model;

public class ExportacionVisitor implements Visitor{
    @Override
    public void visit(Texto texto) {
        System.out.printf("Exportando texto: %s.\n",texto.getContenido());
    }

    @Override
    public void visit(Imagen imagen) {
        System.out.printf("Exportando imagen con resolución: %s\n",imagen.resolucion());
    }

    @Override
    public void visit(Tabla tabla) {
        System.out.printf("Exportando tabla con %d filas y %d columnas.\n",tabla.getFilas(), tabla.getColumnas());
    }
}
