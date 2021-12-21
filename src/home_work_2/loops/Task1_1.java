package home_work_2.loops;

public class Task1_1 {

    public static int recursion(int d) {                 // 1.1.2
        if (d == 0) {
            return 1;
        }
        else {
            return d * recursion(d - 1);
        }
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        System.out.println("Результат с рекурсией: " + recursion(a));

        boolean print = true;
        int b = 1;
        for(int i = 2; i <= a; i++) {                  // 1.1.1
            b *= i;
            if(b == 0){
                System.out.println("Переполнение!");
                print = false;
                break;
            }
        }
        if(print) {
            System.out.println("C циклом: " + b);
        }

    }
}
