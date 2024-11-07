package structural.decorator.models;

public class Coffee implements Drinkable{
    private static final double PRICE=5.00;
    @Override
    public String getDescription() {
        return "Café";
    }

    @Override
    public double getPrice() {
        return PRICE;
    }
}
