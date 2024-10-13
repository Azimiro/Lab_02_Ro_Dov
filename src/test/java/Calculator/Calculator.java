package Calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {

    // Метод для обчислення математичного виразу у вигляді рядка
    public double calculate(String expression) {
        Expression e = new ExpressionBuilder(expression).build();
        return e.evaluate(); // Обчислює вираз і повертає результат
    }
}

