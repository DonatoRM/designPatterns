package behaviour.interpreter.models;

public class ExpressionName implements Expression{
    private final String name;

    public ExpressionName(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Client client) {
        return client.name().equalsIgnoreCase(name);
    }
}
