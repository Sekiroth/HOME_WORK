package home_work_3.cals.simple;

import home_work_3.cals.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double addition(double a, double b) {
        return a + b;
    }
    public double subtraction(double a, double b) {
        return a - b;
    }
    public double multiplication(double a, double b) {
        return a * b;
    }
    public double  division(double dividend, double divisor) {
        return dividend / divisor;
    }
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
