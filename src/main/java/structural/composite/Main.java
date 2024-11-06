package structural.composite;

import structural.composite.models.*;

public class Main {
    public static void main() {
        Directorio directorio = new Directorio("/");
        directorio.add(new Directorio("subdirectorio/").add(new Fichero("fichero2")));
        directorio.add(new Fichero("fichero1"));
        directorio.mostrarDatos();
    }
}
