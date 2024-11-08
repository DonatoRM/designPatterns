package creation.prototype;

import creation.prototype.models.Circulo;
import creation.prototype.models.Rectangulo;

public class Main {
    public static void main() {
        Circulo circuloOriginal = new Circulo(5);
        Rectangulo rectanguloOriginal = new Rectangulo(10, 20);

        Circulo circuloClonado = (Circulo) circuloOriginal.clonar();
        Rectangulo rectanguloClonado = (Rectangulo) rectanguloOriginal.clonar();

        System.out.println("Formas originales:");
        circuloOriginal.dibujar();
        rectanguloOriginal.dibujar();

        System.out.println("Formas Clonadas");
        circuloClonado.dibujar();
        rectanguloClonado.dibujar();
    }
}
