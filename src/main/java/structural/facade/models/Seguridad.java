package structural.facade.models;

public class Seguridad {
    private boolean alarma;

    public Seguridad() {
        this.alarma = false;
    }
    public void encenderAlarma() {
        if (alarma) {
            System.out.println("La alarma ya estaba encendida");
        } else {
            this.alarma =true;
            System.out.println("La alarma está encendida");
        }
    }
    public void apagarAlarma() {
        if (alarma) {
            this.alarma =false;
            System.out.println("La alarma está apagada");
        } else {
            System.out.println("La alarma ya estaba apagada");
        }
    }
}
