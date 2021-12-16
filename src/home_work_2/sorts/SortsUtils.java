package home_work_2;
import home_work_2.arrays.ArraysUtils;

import java.util.Arrays;

public class SortsUtils {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};                     // 4.3
        int[] b = {1,1,1,1};
        int[] c = {9,1,5,99,9,9};
        int[] d = {};
        int[] e = {6,5,4,3,2,1};

        System.out.print(Arrays.toString(e));
        selectionSort(e);
        System.out.println(" -> " + Arrays.toString(e));

        System.out.print(Arrays.toString(d));
        bubbleSort(d);
        System.out.println(" -> " + Arrays.toString(d));

        System.out.print(Arrays.toString(c));
        selectionSort(c);
        System.out.println(" -> " + Arrays.toString(c));

        System.out.print(Arrays.toString(b));
        bubbleSort(b);
        System.out.println(" -> " + Arrays.toString(b));

        System.out.print(Arrays.toString(a));
        selectionSort(a);
        System.out.println(" -> " + Arrays.toString(a));


        ArraysUtils abc = new ArraysUtils();
        System.out.println("Введи размер и потом элементы массива: ");
        int[] f = abc.arrayFromConsole();                //4.5
        System.out.print(Arrays.toString(f));
        bubbleSort(f);
        System.out.println(" -> " + Arrays.toString(f));

        int[] g = abc.arrayRandom(5, 99);               //4.4
        System.out.print(Arrays.toString(g));
        bubbleSort(g);
        System.out.println(" -> " + Arrays.toString(g));

    }
    static void bubbleSort(int[] nums){                //4.2.1
        for(int k = 0; k < nums.length; k++){
            for(int n = 0; n < nums.length; n++){
                if(nums[k] < nums[n]){
                    int x = nums[k];
                    nums[k] = nums[n];
                    nums[n] = x;
                }
            }
        }
    }

    static void selectionSort(int[] nums){             //4.2.2
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] >nums[j + 1]){
                    int t = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = t;
                }
            }
        }
    }
}
