package structural.decorator.models;

public class Milk extends DecoratorDrink {
    public Milk(Drinkable drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return String.format("%s, Leche", drink.getDescription());
    }

    @Override
    public double getPrice() {
        return this.drink.getPrice() + 0.50;
    }
}
