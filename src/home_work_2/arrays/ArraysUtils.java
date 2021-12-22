package home_work_2.arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));
        int size = Integer.parseInt(args[0]);
        int maxValueExclusion = Integer.parseInt(args[1]);
        container = arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(container));

        for(int element : container){                   // 2.2.1
            System.out.print(element + "  ");
        }
        int i = 0;
        System.out.println("\n");
        do {
            System.out.print(container[i] + "  ");
            i++;
        } while(i < container.length);
        System.out.println("\n");
        for(i = 0; i < container.length; i++) {
            System.out.print(container[i] + "  ");
        }
        i = 0;
        System.out.println("\n");
        while(i < container.length) {
            System.out.print(container[i] + "  ");
            i++;
        }

        System.out.println("\n" + "====================");

        for(int k = 0; k < container.length - 1; k = k + 2){      // 2.2.2
            System.out.print(container[k] + "  ");
        }
        System.out.println("\n");
        int k = 0;
        for(int num : container) {
            if(k % 2 == 0) {
                System.out.print(num + "  ");
            }
            k++;
        }
        System.out.println("\n");
        k = 0;
        while(k < container.length - 1) {
            System.out.print(container[k] + "  ");
            k = k + 2;
        }
        System.out.println("\n");
        k = 0;
        do {
            System.out.print(container[k] + "  ");
            k = k + 2;
        } while(k < container.length - 1);

        System.out.println("\n" + "====================");

        int h = container.length - 1;                     // 2.2.3
        while(h >= 0){
            System.out.print(container[h] + "  ");
            h--;
        }

        System.out.println("\n");
        h = container.length - 1;
        do {
            System.out.print(container[h] + "  ");
            h--;
        } while(h >= 0);
        System.out.println("\n");

        for(int c = container.length - 1; c >= 0; c--) {
            System.out.print(container[c] + "  ");
        }

        System.out.println("\n");
        int[] contra = new int[container.length];
        int m = 0;
        for(int c = container.length - 1; c >= 0; c--) {
            contra[m] = container[c];
            m++;
        }
        for(int num : contra) {
            System.out.print(num + "  ");
        }

    }
    public static int[] arrayFromConsole(){           // 2.1.1
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        return array;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){       // 2.1.2
        Random rndm = new Random();
        int[] array = new int[size];
        for(int j = 0; j < array.length; j++){
            array[j] = rndm.nextInt(maxValueExclusion);
        }
        return array;
    }
}
