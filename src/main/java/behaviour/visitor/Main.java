package behaviour.visitor;

import behaviour.visitor.model.*;

public class Main {
    public static void main() {
        Documento documento = new Documento();

        documento.agregarElemento(new Texto("Hola, mundo!"));
        documento.agregarElemento(new Imagen("1920x1080"));
        documento.agregarElemento(new Tabla(3, 5));

        Visitor impresionVisitor = new ImpresionVisitor();
        documento.aceptarVisitor(impresionVisitor);

        Visitor exportacionVisitor = new ExportacionVisitor();
        documento.aceptarVisitor(exportacionVisitor);
    }
}
