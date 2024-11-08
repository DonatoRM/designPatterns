package creation.prototype.models;

public class Rectangulo implements Forma {
    private final int height;
    private final int width;

    public Rectangulo(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this.height, this.width);
    }

    @Override
    public void dibujar() {
        System.out.printf("Dibujar un rectángulo de %d x %d\n", height, width);
    }
}
