package behaviour.chainOfResponsibility.models;

public abstract class Aprobador {
    protected Aprobador siguienteAprobador;

    public void establecerSiguienteAprobador(Aprobador siguienteAprobador) {
        this.siguienteAprobador = siguienteAprobador;
    }

    public abstract void manejarSolicitud(int monto);
}
