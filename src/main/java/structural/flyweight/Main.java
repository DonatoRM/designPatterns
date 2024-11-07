package structural.flyweight;

import structural.flyweight.models.Caracter;
import structural.flyweight.models.CaracterFactory;

public class Main {
    public static void main() {
        Caracter a1= CaracterFactory.getCaracter('a');
        a1.mostrar(12,"rojo");
        Caracter a2= CaracterFactory.getCaracter('a');
        a2.mostrar(14,"azul");
        Caracter b= CaracterFactory.getCaracter('b');
        b.mostrar(12,"rojo");
        Caracter c= CaracterFactory.getCaracter('c');
        c.mostrar(16,"verde");
        Caracter a3= CaracterFactory.getCaracter('a');
        a3.mostrar(10,"negro");

    }
}
