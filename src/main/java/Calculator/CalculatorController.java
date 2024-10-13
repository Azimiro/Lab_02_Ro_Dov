package Calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index() {
        return "index"; 
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("expression") String expressionInput, Model model) {
        double result = 0;
        try {
            result = new net.objecthunter.exp4j.ExpressionBuilder(expressionInput).build().evaluate();
            model.addAttribute("result", result);
        } catch (Exception e) {
            model.addAttribute("result", "Помилка в виразі");
        }
        return "index"; 
    }
    public double calculate(String expression) {
        // Тут можна використовувати сторонню бібліотеку для обчислення виразів
        return new net.objecthunter.exp4j.ExpressionBuilder(expression).build().evaluate();
    }
}



