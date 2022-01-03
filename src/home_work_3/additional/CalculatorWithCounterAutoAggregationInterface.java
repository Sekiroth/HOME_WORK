package home_work_3.additional;

import home_work_3.cals.api.ICalculator;

public class CalculatorWithCounterAutoAggregationInterface implements ICalculator{
    ICalculator someMath;
    private long count = 0;

    public  CalculatorWithCounterAutoAggregationInterface(ICalculator someMath) {
        this.someMath = someMath;
    }
    public long getCountOperation() {
        return count;
    }
    public void incrementCountOperation() {
        count++;
    }
    @Override
    public double squareRoot(double a) {
        incrementCountOperation();
        return someMath.squareRoot(a);
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return someMath.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return someMath.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return someMath.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return someMath.division(a, b);
    }

    @Override
    public double modulus(double a) {
        incrementCountOperation();
        return someMath.modulus(a);
    }

    @Override
    public double toPower(double a, int b) {
        incrementCountOperation();
        return someMath.toPower(a, b);
    }
}
