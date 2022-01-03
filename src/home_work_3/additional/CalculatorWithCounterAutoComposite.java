package home_work_3.additional;

import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathExtends someMath = new CalculatorWithMathExtends();
    private long count = 0;

    public long getCountOperation() {
        return count;
    }
    public void incrementCountOperation() {
        count++;
    }
    public double modulus(double first) {
        incrementCountOperation();
        return someMath.modulus(first);
    }
    public double squareRoot(double first) {
        incrementCountOperation();
        return someMath.squareRoot(first);
    }
    public double addition(double first, double second) {
        incrementCountOperation();
        return someMath.addition(first, second);
    }
    public double multiplication(double first, double second) {
        incrementCountOperation();
        return someMath.multiplication(first, second);
    }
    public double division(double first, double second) {
        incrementCountOperation();
        return someMath.division(first, second);
    }
    public double subtraction(double first, double second) {
        incrementCountOperation();
        return someMath.subtraction(first, second);
    }
    public double toPower(double first, int second) {
        incrementCountOperation();
        return someMath.toPower(first, second);
    }
}
