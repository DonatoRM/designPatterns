package structural.facade.models;

public class Termostato {
    private boolean calefactor;

    public Termostato() {
        this.calefactor = false;
    }
    public void encenderEstufa() {
        if (calefactor) {
            System.out.println("La calefacción ya estaba encendida");
        } else {
            this.calefactor =true;
            System.out.println("La calefacción está encendida");
        }
    }
    public void apagarEstufa() {
        if (calefactor) {
            this.calefactor =false;
            System.out.println("La calefacción está apagada");
        } else {
            System.out.println("La calefacción ya estaba apagada");
        }
    }
}
