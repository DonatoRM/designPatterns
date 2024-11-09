package behaviour.chainOfResponsibility.models;

public class Gerente extends Aprobador {
    @Override
    public void manejarSolicitud(int monto) {
        if (monto < 1000) {
            System.out.printf("Gerente aprueba la solicitud de compra de %d €\n", monto);
        } else if (siguienteAprobador != null) {
            this.siguienteAprobador.manejarSolicitud(monto);
        }
    }
}
