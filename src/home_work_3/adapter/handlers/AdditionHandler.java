package home_work_3.adapter.handlers;

import home_work_3.adapter.handlers.api.IHandler;
import home_work_3.cals.api.ICalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionHandler implements IHandler {
    private final ICalculator calculator;
    private final Pattern pattern;
    public AdditionHandler(ICalculator calculator) {
        this.calculator = calculator;
        this.pattern = Pattern.compile("(\\d{1,}\\.\\d{1,}|\\d{1,}) *\\+ *(\\d{1,}\\.\\d{1,}|\\d{1,})");
    }
    @Override
    public String handle(String expression) {
        Matcher matcher = this.pattern.matcher(expression);
        while(matcher.find()) {
            double operand1 = Double.parseDouble(matcher.group(1));
            double operand2 = Double.parseDouble(matcher.group(2));
            String result = String.valueOf(calculator.addition(operand1, operand2));
            expression = expression.replace(matcher.group(), result);
            matcher = this.pattern.matcher(expression);
        }
        return expression;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
