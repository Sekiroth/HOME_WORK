package home_work_2.arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));
        container = arrayRandom(5, 99);
        System.out.println(Arrays.toString(container));

        for(int element : container){                   // 2.2.1
            System.out.print(element + "  ");
        }

        System.out.println("\n");

        for(int k = 0; k < container.length; k = k + 2){      // 2.2.2
            System.out.print(container[k] + "  ");
        }

        System.out.println("\n");

        int h = container.length - 1;                     // 2.2.3
        while(h >= 0){
            System.out.print(container[h] + "  ");
            h--;
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
