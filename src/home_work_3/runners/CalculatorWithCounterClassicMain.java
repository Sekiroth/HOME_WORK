package home_work_3.runners;
import home_work_3.additional.CalculatorWithCounterClassic;
public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
//        4.1 + 15 * 7 + (28 / 5) ^ 2
        double one = calc.division(28 , 5);
        calc.incrementCountOperation();
        double two = calc.toPower(one, 2);
        calc.incrementCountOperation();
        double three = calc.multiplication(15, 7);
        calc.incrementCountOperation();
        double four = calc.addition(two, three);
        calc.incrementCountOperation();
        double five = calc.addition(four, 4.1);
        calc.incrementCountOperation();
        System.out.println(five);
        System.out.println(calc.getCountOperation());
    }
}

