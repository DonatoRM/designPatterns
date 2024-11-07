package structural.decorator.models;

public class Chocolate extends DecoratorDrink{
    public Chocolate(Drinkable drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return String.format("%s, Chocolate", drink.getDescription());
    }

    @Override
    public double getPrice() {
        return this.drink.getPrice() + 1.0;
    }
}
