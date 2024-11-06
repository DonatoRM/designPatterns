package structural.composite.models;

import java.util.ArrayList;
import java.util.List;

public class Directorio implements SistemaDeFicheros {
    private final String name;
    List<SistemaDeFicheros> listado;

    public Directorio(String name) {
        this.name = name;
        this.listado = new ArrayList<>();
    }

    public SistemaDeFicheros add(SistemaDeFicheros f) {
        listado.add(f);
        return this;
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Directorio: %s\n", name);
        this.listado.forEach(SistemaDeFicheros::mostrarDatos);
    }
}
