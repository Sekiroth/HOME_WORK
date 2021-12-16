package homeWork2.loops;
import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int x = a;
        while(a > 1){
            x = x * (a - 1);
            a--;
        }
        System.out.println(x);
    }
}
