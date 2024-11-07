package structural.decorator;

import structural.decorator.models.Chocolate;
import structural.decorator.models.Coffee;
import structural.decorator.models.Drinkable;
import structural.decorator.models.Milk;

public class Main {
    public static void main() {
        Drinkable myCoffee = new Coffee();
        System.out.printf("Bebida: %s - Precio: %.2g\n",myCoffee.getDescription(),myCoffee.getPrice());
        myCoffee=new Milk(myCoffee);
        System.out.printf("Bebida: %s - Precio: %.2g\n",myCoffee.getDescription(),myCoffee.getPrice());
        myCoffee=new Chocolate(myCoffee);
        System.out.printf("Bebida: %s - Precio: %.2g\n",myCoffee.getDescription(),myCoffee.getPrice());
    }
}
