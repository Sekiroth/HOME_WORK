package home_work_2.loops;
import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введи число: ");
        System.out.println(convert(in.nextInt()));
    }
    public static int convert(int num){
        int sum = 1;
        int x;
        while(num > 0){
            x = num % 10;
            sum = sum * x;
            num = num / 10;
        }
        return sum;
    }
}
