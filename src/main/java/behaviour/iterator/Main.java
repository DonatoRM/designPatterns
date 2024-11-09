package behaviour.iterator;

import behaviour.iterator.models.Inventory;
import behaviour.iterator.models.Iterator;
import behaviour.iterator.models.Product;

public class Main {
    public static void main() {
        Product[] products = {
                new Product("Laptop", 999.90),
                new Product("Smartphone", 599.99),
                new Product("Tablet", 299.99),
                new Product("Headphones", 199.99)
        };
        Inventory inventory = new Inventory(products);
        Iterator<Product> iterator = inventory.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
