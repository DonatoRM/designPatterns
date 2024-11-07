package structural.flyweight.models;

public class CaracterConcreto implements Caracter{
    private final char simbolo;

    public CaracterConcreto(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void mostrar(int size, String color) {
        System.out.printf("Carácter: %c [Tamaño: %d, Color: %s]\n", simbolo, size, color);
    }
}
