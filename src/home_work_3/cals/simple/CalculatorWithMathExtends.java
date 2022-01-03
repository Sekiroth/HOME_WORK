package home_work_3.cals.simple;

import home_work_3.cals.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    public double toPower(double num, int power) {
        return Math.pow(num, power);
    }
    public double modulus(double num) {
        return Math.abs(num);
    }
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
