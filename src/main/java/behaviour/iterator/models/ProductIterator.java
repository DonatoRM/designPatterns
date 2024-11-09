package behaviour.iterator.models;

public class ProductIterator implements Iterator<Product> {
    private final Product[] products;
    private int position;

    public ProductIterator(Product[] products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < products.length;
    }

    @Override
    public Product next() {
        return products[position++];
    }
}