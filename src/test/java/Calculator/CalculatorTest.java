package Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testCalculateAddition() {
        Calculator calculator = new Calculator();
        double result = calculator.calculate("2 + 3"); // Вірний математичний вираз 
        assertEquals(5.0, result); // Перевіряє результат
    }

    //@Test
   // public void testCalculateSubtraction() {
      //  Calculator calculator = new Calculator();
     //   double result = calculator.calculate("5 - 2"); // Не вірний  математичний вираз
      //  assertEquals(2.0, result); // Перевіряє результат
  //  }
}
