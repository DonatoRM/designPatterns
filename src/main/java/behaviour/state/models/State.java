package behaviour.state.models;

public interface State<T> {
    void handleRequest(T context);
}
