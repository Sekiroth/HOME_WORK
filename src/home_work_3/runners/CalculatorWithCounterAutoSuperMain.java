package home_work_3.runners;

import home_work_3.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        double res = calc.addition( 4.1, calc.addition(calc.multiplication(15, 7), calc.toPower(calc.division(28, 5), 2)));
        System.out.println(res);
        System.out.println(calc.getCountOperation());
    }
}
