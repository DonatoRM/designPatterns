package behaviour.iterator.models;

public class Inventory implements Collection<Product> {
    private final Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(products);
    }
}
