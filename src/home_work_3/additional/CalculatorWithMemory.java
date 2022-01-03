package home_work_3.additional;

import home_work_3.cals.api.ICalculator;
import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorWithMemory extends CalculatorWithMathExtends implements ICalculator {
    private double lastValue = 0;
    private double recordedLastValue = 0;
    public void setLastValue(double recordedLastValue) {
        this.recordedLastValue = recordedLastValue;
    }
    public void recordLastValue() {
        setLastValue(lastValue);
    }
    public double getLastValue() {
        double a = recordedLastValue;
        clean();
        return a;
    }
    public void clean() {
        recordedLastValue = 0;
    }
    @Override
    public double toPower(double num, int power) {
        lastValue = super.toPower(num, power);
        return lastValue;
    }

    @Override
    public double modulus(double num) {
        lastValue = super.modulus(num);
        return lastValue;
    }

    @Override
    public double squareRoot(double num) {
        lastValue = super.squareRoot(num);
        return lastValue;
    }

    @Override
    public double addition(double a, double b) {
        lastValue = super.addition(a, b);
        return lastValue;
    }

    @Override
    public double subtraction(double a, double b) {
        lastValue = super.subtraction(a, b);
        return lastValue;
    }

    @Override
    public double multiplication(double a, double b) {
        lastValue = super.multiplication(a, b);
        return lastValue;
    }

    @Override
    public double division(double dividend, double divisor) {
        lastValue = super.division(dividend, divisor);
        return lastValue;
    }
}