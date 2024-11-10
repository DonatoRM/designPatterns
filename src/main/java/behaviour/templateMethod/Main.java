package behaviour.templateMethod;

import behaviour.templateMethod.models.InStoreOrdering;
import behaviour.templateMethod.models.Order;
import behaviour.templateMethod.models.OrderOnline;

public class Main {
    public static void main() {
        Order orderOnline = new OrderOnline();
        orderOnline.processTheOrder();

        Order inStoreOrdering = new InStoreOrdering();
        inStoreOrdering.processTheOrder();
    }
}
