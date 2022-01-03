package home_work_3.additional;

import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;
    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }
    @Override
    public double toPower(double num, int power) {
        incrementCountOperation();
        return super.toPower(num, power);
    }

    @Override
    public double modulus(double num) {
        incrementCountOperation();
        return super.modulus(num);
    }

    @Override
    public double squareRoot(double num) {
        incrementCountOperation();
        return super.squareRoot(num);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double division(double dividend, double divisor) {
        incrementCountOperation();
        return super.division(dividend, divisor);
    }
}
