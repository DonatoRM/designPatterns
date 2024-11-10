package behaviour.templateMethod.models;

public abstract class Order {
    public final void processTheOrder() {
        selectProduct();
        makeThePayment();
        sendTheNotification();
    }

    protected abstract void selectProduct();

    protected abstract void makeThePayment();

    protected void sendTheNotification() {
        System.out.println("Enviando notificación al cliente.");
    }
}
