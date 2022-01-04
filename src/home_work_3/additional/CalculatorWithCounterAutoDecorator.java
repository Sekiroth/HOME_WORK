package home_work_3.additional;

import home_work_3.cals.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator someMath;
    private CalculatorWithMemoryDecorator someMathAgain;
    private long count = 0;

    public CalculatorWithCounterAutoDecorator(CalculatorWithMemoryDecorator someMathAgain) {
        this.someMathAgain = someMathAgain;
    }
    public ICalculator getCalculator() {
        return someMath;
    }
    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }
    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return someMathAgain.squareRoot(a);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return someMathAgain.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return someMathAgain.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return someMathAgain.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return someMathAgain.division(a, b);
    }

    @Override
    public double modulus(double a) {
        incrementCountOperation();
        return someMathAgain.modulus(a);
    }

    @Override
    public double toPower(double a, int b) {
        incrementCountOperation();
        return someMathAgain.toPower(a, b);
    }
}
