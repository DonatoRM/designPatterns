package structural.composite.models;

public class Fichero implements SistemaDeFicheros{
    private final String name;

    public Fichero(String name) {
        this.name = name;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Fichero %s\n",this.name);
    }
}
