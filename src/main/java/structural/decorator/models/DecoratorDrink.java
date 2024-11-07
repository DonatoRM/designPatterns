package structural.decorator.models;

public class DecoratorDrink implements Drinkable{
    protected Drinkable drink;

    public DecoratorDrink(Drinkable drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return this.drink.getDescription();
    }

    @Override
    public double getPrice() {
        return this.drink.getPrice();
    }
}
