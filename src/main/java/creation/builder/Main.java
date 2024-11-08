package creation.builder;

import creation.builder.model.Casa;
import creation.builder.model.CasaBuilder;
import creation.builder.model.CasaConcretaBuilder;
import creation.builder.model.Director;

public class Main {
    public static void main() {
        CasaBuilder builder=new CasaConcretaBuilder();
        Director director=new Director(builder);

        director.construirCasa();
        Casa casa= director.getCasa();

        System.out.println(casa);
    }
}
