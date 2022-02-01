package home_work_3.additional;

import home_work_3.cals.simple.CalculatorWithMathCopy;
import home_work_3.cals.simple.CalculatorWithMathExtends;
import home_work_3.cals.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAggregation {
    private final CalculatorWithMathCopy someMath;
    private final CalculatorWithOperator someMathAgain;
    private final CalculatorWithMathExtends someMathAgainAndAgain;
    private long count = 0;

    public CalculatorWithCounterAutoAggregation(CalculatorWithMathCopy someMath) {
        this.someMath = someMath;
        this.someMathAgain = null;
        this.someMathAgainAndAgain = null;
    }
    public CalculatorWithCounterAutoAggregation(CalculatorWithOperator someMathAgain) {
        this.someMathAgain = someMathAgain;
        this.someMath = null;
        this.someMathAgainAndAgain = null;
    }
    public CalculatorWithCounterAutoAggregation(CalculatorWithMathExtends someMathAgainAndAgain) {
        this.someMathAgainAndAgain = someMathAgainAndAgain;
        this.someMathAgain = null;
        this.someMath = null;
    }
    public long getCountOperation() {
        return count;
    }
    public void incrementCountOperation() {
        count++;
    }

    public double squareRoot(double a) {
        incrementCountOperation();
        if (someMath != null) return someMath.squareRoot(a);
        else if (someMathAgain != null) return someMathAgain.squareRoot(a);
        return someMathAgainAndAgain.squareRoot(a);
    }
    public double addition(double a, double b) {
        incrementCountOperation();
        return someMath.addition(a, b);
    }
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return someMath.subtraction(a, b);
    }
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return someMath.multiplication(a, b);
    }
    public double division(double a, double b) {
        incrementCountOperation();
        return someMath.division(a, b);
    }
    public double modulus(double a) {
        incrementCountOperation();
        return someMath.modulus(a);
    }
    public double toPower(double a, int b) {
        incrementCountOperation();
        return someMath.toPower(a, b);
    }
    public double squareRoot1(double a) {
        incrementCountOperation();
        return someMathAgain.squareRoot(a);
    }
    public double addition1(double a, double b) {
        incrementCountOperation();
        return someMathAgain.addition(a, b);
    }
    public double subtraction1(double a, double b) {
        incrementCountOperation();
        return someMathAgain.subtraction(a, b);
    }
    public double multiplication1(double a, double b) {
        incrementCountOperation();
        return someMathAgain.multiplication(a, b);
    }
    public double division1(double a, double b) {
        incrementCountOperation();
        return someMathAgain.division(a, b);
    }
    public double modulus1(double a) {
        incrementCountOperation();
        return someMathAgain.modulus(a);
    }
    public double toPower1(double a, int b) {
        incrementCountOperation();
        return someMathAgain.toPower(a, b);
    }
    public double squareRoot2(double a) {
        incrementCountOperation();
        return someMathAgain.squareRoot(a);
    }
    public double addition2(double a, double b) {
        incrementCountOperation();
        return someMathAgain.addition(a, b);
    }
    public double subtraction2(double a, double b) {
        incrementCountOperation();
        return someMathAgain.subtraction(a, b);
    }
    public double multiplication2(double a, double b) {
        incrementCountOperation();
        return someMathAgain.multiplication(a, b);
    }
    public double division2(double a, double b) {
        incrementCountOperation();
        return someMathAgain.division(a, b);
    }
    public double modulus2(double a) {
        incrementCountOperation();
        return someMathAgain.modulus(a);
    }
    public double toPower2(double a, int b) {
        incrementCountOperation();
        return someMathAgain.toPower(a, b);
    }
}
