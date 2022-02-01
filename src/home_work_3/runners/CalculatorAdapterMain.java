package home_work_3.runners;

import home_work_3.adapter.CalculatorAdapter;

public class CalculatorAdapterMain {
    public static void main(String[] args) {
        CalculatorAdapter a = new CalculatorAdapter();
        System.out.println(a.calc("5.8  * 5.9 +   2.75*7* 7"));
    }
}
