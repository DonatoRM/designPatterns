package behaviour.interpreter.models;

public class ExpressionOr implements Expression {
    private final Expression expr1;
    private final Expression expr2;

    public ExpressionOr(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(Client client) {
        return expr1.interpret(client) || expr2.interpret(client);
    }
}
