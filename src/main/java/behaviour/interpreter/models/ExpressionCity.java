package behaviour.interpreter.models;

public class ExpressionCity implements Expression {
    private final String city;

    public ExpressionCity(String city) {
        this.city = city;
    }

    @Override
    public boolean interpret(Client client) {
        return client.city().equalsIgnoreCase(city);
    }
}
