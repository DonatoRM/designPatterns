package behaviour.command.models;

public interface Command {
    void execute();

    void undo();
}
