package behaviour.templateMethod.models;

public class OrderOnline extends Order {
    @Override
    protected void selectProduct() {
        System.out.println("Seleccionando producto desde la tienda en línea.");
    }

    @Override
    protected void makeThePayment() {
        System.out.println("Realizando pago con la tarjeta de crédito.");
    }
}
