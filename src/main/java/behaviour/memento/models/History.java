package behaviour.memento.models;

import java.util.ArrayList;
import java.util.List;

public class History {
    private final List<TextMemento> history;

    public History() {
        this.history = new ArrayList<>();
    }

    public void addMemento(TextMemento memento) {
        this.history.add(memento);
    }

    public TextMemento getMemento(int index) {
        if (index >= 0 && index < this.history.size()) {
            return this.history.get(index);
        }
        return null;
    }
}
