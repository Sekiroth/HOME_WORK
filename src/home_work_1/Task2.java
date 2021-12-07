package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        System.out.println(5 + b / a); // 2 / 8 = 0.25 ~ 0, 0 + 5 = 5
        System.out.println((5 + b) / a); // 7 / 8 = 0. ~ 0
        System.out.println((5 + b++) / a); // 5 + 2 = 7, 7 / 8 = 0 ; если ++b - результат 1
        System.out.println((5 + b++) / --a); // 7 / 7 = 1
        System.out.println((5 * b >> b++) / --a); // 5 * 2 = 10[1010 >> 3 = 0], ...
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a); // false, 22 * 2 = 44[101100 >> 3 = 100] = 4 / 7 = 0. = 0
        System.out.println(6 - 2 > 3 && 12 * 22 <= 119); // true && false = false
        System.out.println(true && false);
    }
}
