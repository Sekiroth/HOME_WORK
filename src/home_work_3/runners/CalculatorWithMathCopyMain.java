package home_work_3.runners;
import home_work_3.cals.simple.CalculatorWithMathCopy;
public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
        double res = calc.addition( 4.1, calc.addition(calc.multiplication(15, 7), calc.toPower(calc.division(28, 5), 2)));
        System.out.println(res);
    }
}
