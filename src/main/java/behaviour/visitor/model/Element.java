package behaviour.visitor.model;

public interface Element {
    void accept(Visitor visitor);
}
