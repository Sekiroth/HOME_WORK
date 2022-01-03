package home_work_3.runners;

import home_work_3.additional.CalculatorWithMemory;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory();
        double one = calc.division(28 , 5);
        double two = calc.toPower(one, 2);
        calc.recordLastValue();
        System.out.println(calc.getLastValue());
        System.out.println(calc.getLastValue());
        double three = calc.multiplication(15, 7);
        calc.recordLastValue();
        System.out.println(calc.getLastValue());
        System.out.println(calc.getLastValue());
        double four = calc.addition(two, three);
        double five = calc.addition(four, 4.1);
        System.out.println(five);

    }
}
