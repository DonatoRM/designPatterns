package behaviour.observer.models;

public class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String notice) {
        System.out.printf("%s ha recibido la noticia: %s\n", name, notice);
    }
}
