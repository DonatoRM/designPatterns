package behaviour.observer;

import behaviour.observer.models.NewsSystem;
import behaviour.observer.models.Subscriber;

public class Main {
    public static void main() {
        NewsSystem newsSystem = new NewsSystem();

        Subscriber subscriber1 = new Subscriber("Juan");
        Subscriber subscriber2 = new Subscriber("Ana");
        Subscriber subscriber3 = new Subscriber("Pedro");

        newsSystem.registerObserver(subscriber1);
        newsSystem.registerObserver(subscriber2);
        newsSystem.registerObserver(subscriber3);

        newsSystem.newNotice("Nueva política de privacidad");
        newsSystem.newNotice("Actualización del sistema disponible.");
    }
}
