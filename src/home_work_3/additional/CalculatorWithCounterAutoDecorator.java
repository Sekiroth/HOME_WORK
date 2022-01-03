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
        return someMathAgain.squareRoot(a);
    }

    @Override
    public double addition(double a, double b) {
        return someMathAgain.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return someMathAgain.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return someMathAgain.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        return someMathAgain.division(a, b);
    }

    @Override
    public double modulus(double a) {
        return someMathAgain.modulus(a);
    }

    @Override
    public double toPower(double a, int b) {
        return someMathAgain.toPower(a, b);
    }
}
