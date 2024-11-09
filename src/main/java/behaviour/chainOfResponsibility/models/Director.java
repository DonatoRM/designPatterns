package behaviour.chainOfResponsibility.models;

public class Director extends Aprobador {
    @Override
    public void manejarSolicitud(int monto) {
        if (monto < 5000) {
            System.out.printf("Director aprueba la solicitud de compra de %d €\n", monto);
        } else if (siguienteAprobador != null) {
            this.siguienteAprobador.manejarSolicitud(monto);
        }
    }
}
