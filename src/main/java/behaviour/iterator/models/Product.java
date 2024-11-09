package behaviour.iterator.models;

public record Product(String name, double price) {
    @Override
    public String toString() {
        return String.format("Product { name=%s, price=%.2f }", name, price);
    }
}
