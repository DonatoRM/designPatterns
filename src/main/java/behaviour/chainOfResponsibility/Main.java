package behaviour.chainOfResponsibility;

import behaviour.chainOfResponsibility.models.Aprobador;
import behaviour.chainOfResponsibility.models.CEO;
import behaviour.chainOfResponsibility.models.Director;
import behaviour.chainOfResponsibility.models.Gerente;

public class Main {
    public static void main() {
        Aprobador gerente = new Gerente();
        Aprobador director = new Director();
        Aprobador ceo = new CEO();

        gerente.establecerSiguienteAprobador(director);
        director.establecerSiguienteAprobador(ceo);

        gerente.manejarSolicitud(500);
        gerente.manejarSolicitud(2000);
        gerente.manejarSolicitud(7000);
    }
}
