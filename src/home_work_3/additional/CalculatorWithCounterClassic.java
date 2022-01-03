package home_work_3.additional;

import home_work_3.cals.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long count = 0;
    public void incrementCountOperation() {
        count++;
    }
    public long getCountOperation() {
        return count;
    }
}
