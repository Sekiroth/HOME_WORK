package home_work_3.runners;

import home_work_3.additional.CalculatorWithCounterAutoComposite;
import home_work_3.additional.CalculatorWithCounterAutoAggregation;
import home_work_3.cals.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc1 = new CalculatorWithCounterAutoComposite();
        double res1 = calc1.addition( 4.1, calc1.addition(calc1.multiplication(15, 7), calc1.toPower(calc1.division(28, 5), 2)));
        System.out.println(res1);
        System.out.println(calc1.getCountOperation());

        CalculatorWithCounterAutoAggregation calc2 = new CalculatorWithCounterAutoAggregation(new CalculatorWithMathCopy());
        double res2 = calc2.addition( 4.1, calc2.addition(calc2.multiplication(15, 7), calc2.toPower(calc2.division(28, 5), 2)));
        System.out.println(res2);
        System.out.println(calc2.getCountOperation());
    }
}
