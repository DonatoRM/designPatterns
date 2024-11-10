package behaviour.memento;

import behaviour.memento.models.History;
import behaviour.memento.models.TextEditor;

public class Main {
    public static void main() {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hola, mundo!");
        history.addMemento(editor.save());

        editor.write("Hola, mundo! Esto es un editor de texto");
        history.addMemento(editor.save());

        editor.restore(history.getMemento(0));
        System.out.printf("Después de deshacer: %s\n", editor.getText());

        editor.restore(history.getMemento(1));
        System.out.printf("Después de rehacer: %s\n", editor.getText());
    }
}
