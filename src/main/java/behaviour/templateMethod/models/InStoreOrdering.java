package behaviour.templateMethod.models;

public class InStoreOrdering extends Order {
    @Override
    protected void selectProduct() {
        System.out.println("Seleccionando producto desde la tienda física.");
    }

    @Override
    protected void makeThePayment() {
        System.out.println("Realizando pago en efectivo.");
    }
}
