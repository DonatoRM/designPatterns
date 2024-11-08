package creation.prototype.models;

public class Circulo implements Forma {
    private final int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public Forma clonar() {
        return new Circulo(this.radio);
    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujando un círculo con radio %d\n", radio);
    }
}
