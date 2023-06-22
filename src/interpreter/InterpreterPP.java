package interpreter;

public class InterpreterPP {
    public static void main(String[] args) {
        Context context = new Context();

        Expression expression = new AddExpression(
            new NumberExpression(5),
            new AddExpression(
                new NumberExpression(10),
                new NumberExpression(2)
            )
        );

        var r = expression.interpret(context);
        System.out.println(r);
    }
}

