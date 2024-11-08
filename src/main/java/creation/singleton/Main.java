package creation.singleton;

import creation.singleton.models.Logging;
import creation.singleton.models.Message;

public class Main {
    public static void main() {
        Message msg= Logging.log();
        Message msg2= Logging.log();
        if(msg.equals(msg2)) {
            System.out.println("Son idénticos");
        } else {
            System.out.println("Son distintos");
        }
    }
}
