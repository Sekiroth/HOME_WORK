package home_work_1;
import java.util.Scanner;
public class ToBinary {
    static void print(int[] bin) {
        for (int ii = 7; ii >= 0; ii--) {
            System.out.print(bin[ii]);
        }
    }
    public static void convert(int num){
        int[] bin = new int[8];
        for (int i = 0; i < bin.length; i++) {
            bin[i] = num % 2;
            num = num / 2;
        }
        print(bin);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number:");
        convert(in.nextInt());
    }
}
