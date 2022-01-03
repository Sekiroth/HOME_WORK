package home_work_3.cals.simple;

import home_work_3.cals.api.ICalculator;

public class CalculatorWithOperator implements ICalculator  {
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
        double result = 1;
        for(int i = 0; i < power; i++) {
            result *= num;
        }
        return result;
    }
    public double modulus(double num) {
        if(num < 0) {
            num = -num;
        }
        return num;
    }
    public double squareRoot(double value) {
        double num;
        double half = value / 2;
        do {
            num = half;
            half = (num + (value / num)) / 2;
        } while ((num - half) != 0);
        return half;
    }
}
