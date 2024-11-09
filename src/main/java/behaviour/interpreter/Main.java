package behaviour.interpreter;

import behaviour.interpreter.models.*;

import java.util.List;

public class Main {
    public static void main() {
        List<Client> clients = List.of(
                new Client("Juan", 30, "Madrid"),
                new Client("Ana", 25, "Barcelona"),
                new Client("Pedro", 30, "Madrid"),
                new Client("Marta", 22, "Valencia")
        );
        Expression expression = new ExpressionOr(
                new ExpressionName("Juan"),
                new ExpressionAnd(
                        new ExpressionAge(30),
                        new ExpressionCity("Madrid")
                )
        );
        clients.forEach(client -> {
            if (expression.interpret(client)) {
                System.out.printf("%s cumple con los criterios\n", client.name());
            }
        });
    }
}
