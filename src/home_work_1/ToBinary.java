/* работает в пределах 8 битов
позитивные числа считает верно, негативные - нет
негативные инверсирует, но не добавляет 1 к младшему значащему разряду
пока что мозгов не хватает решить окончательно
*/
package homeWork1;
import java.util.Scanner;
public class ToBinary {
    static void printForPos(int[] bin) {
        for (int ii = 7; ii >= 0; ii--) {
            System.out.print(bin[ii]);
        }
    }
    static void printForNeg(int[] bin) {
        for (int ii = 7; ii >= 0; ii--) {
            if (bin[ii] == 0) {
                bin[ii] = bin[ii] + 1;
                System.out.print(bin[ii]);
            }
            else {
                bin[ii] = bin[ii] - 1;
                System.out.print(bin[ii]);
            }
        }
    }
    public static void convert(int num){
        int[] bin = new int[8];
        if (num >= 0) {
            for (int i = 0; i < bin.length; i++) {
                bin[i] = num % 2;
                num = num / 2;
            }
            printForPos(bin);
        }
        else {
            for (int i = 0; i < bin.length; i++) {
                bin[i] = (Math.abs(num) % 2);
                num = num / 2;
            }
            printForNeg(bin);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your number:");
        convert(in.nextInt());
    }
}

