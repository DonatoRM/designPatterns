package behaviour.memento.models;

public class TextEditor {
    private String text;

    public void write(String newText) {
        this.text = newText;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.state();
    }
}