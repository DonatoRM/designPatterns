package behaviour.observer.models;

import java.util.ArrayList;
import java.util.List;

public class NewsSystem implements Subject {
    private final List<Observer> observers;
    private String lastNotice;

    public NewsSystem() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void newNotice(String notice) {
        this.lastNotice = notice;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(lastNotice));
    }
}
