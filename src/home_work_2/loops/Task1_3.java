package home_work_2.loops;
import java.util.Scanner;
public class Task1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(raised(in.nextDouble(), in.nextInt()));
    }
    public static double raised(double num, int power) {
        double orig = num;
        while (power > 1) {
            num = num * orig;
            power--;
        }
        return num;
    }
}
