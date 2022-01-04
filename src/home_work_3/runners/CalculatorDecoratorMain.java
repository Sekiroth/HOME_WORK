package home_work_3.runners;

import home_work_3.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.additional.CalculatorWithMemoryDecorator;
import home_work_3.cals.api.ICalculator;
import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithCounterAutoDecorator c = (CalculatorWithCounterAutoDecorator) calc;
        double one = calc.division(28 , 5);
        double two = calc.toPower(one, 2);
        double three = calc.multiplication(15, 7);
        double four = calc.addition(two, three);
        double five = calc.addition(four, 4.1);
        System.out.println(five);
        System.out.println(c.getCountOperation());
    }
}
