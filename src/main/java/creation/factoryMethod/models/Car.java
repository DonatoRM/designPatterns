package creation.factoryMethod.models;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Conduciendo un coche.");
    }
}
