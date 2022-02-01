package home_work_3.adapter;

import home_work_3.adapter.handlers.AdditionHandler;
import home_work_3.adapter.handlers.Multiplication;
import home_work_3.adapter.handlers.api.IHandler;
import home_work_3.cals.api.ICalculator;
import home_work_3.cals.simple.CalculatorWithMathExtends;

import java.util.PriorityQueue;

public class CalculatorAdapter{
    private final ICalculator calculator;
    private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>(
            (o1, o2) -> o2.getPriority() - o1.getPriority()
            );
    public CalculatorAdapter() {
        this.calculator = new CalculatorWithMathExtends();
        queueHandler.add(new AdditionHandler(this.calculator));
        queueHandler.add(new Multiplication(this.calculator));
    }
    public double calc(String expression) {
        for (IHandler handler : queueHandler) {
            expression = handler.handle(expression);
        }
        return Double.parseDouble(expression);
    }
}
