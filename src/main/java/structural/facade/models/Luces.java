package structural.facade.models;

public class Luces {
    private boolean lights;

    public Luces() {
        this.lights = false;
    }
    public void encenderLuces() {
        if (lights) {
            System.out.println("Las luces ya estaban encendidas");
        } else {
            this.lights=true;
            System.out.println("Las luces están encendidas");
        }
    }
    public void apagarLuces() {
        if (lights) {
            this.lights=false;
            System.out.println("Las luces apagadas");
        } else {
            System.out.println("Las luces ya estaban apagadas");
        }
    }
}
