package behaviour.interpreter.models;

public class ExpressionAge implements Expression {
    private final int age;

    public ExpressionAge(int age) {
        this.age = age;
    }

    @Override
    public boolean interpret(Client client) {
        return client.age() == age;
    }
}
