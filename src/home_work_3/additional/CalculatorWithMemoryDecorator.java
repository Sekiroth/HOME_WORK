package home_work_3.additional;

import home_work_3.cals.api.ICalculator;
import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double lastValue = 0;
    private double recordedLastValue = 0;
    private CalculatorWithMathExtends someMath;
    public CalculatorWithMemoryDecorator(CalculatorWithMathExtends someMath) {
        this.someMath = someMath;
    }
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
    public double squareRoot(double a) {
        return someMath.squareRoot(a);
    }

    @Override
    public double addition(double a, double b) {
        return someMath.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        return someMath.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        return someMath.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        return someMath.division(a, b);
    }

    @Override
    public double modulus(double a) {
        return someMath.modulus(a);
    }

    @Override
    public double toPower(double a, int b) {
        return someMath.toPower(a, b);
    }
}
