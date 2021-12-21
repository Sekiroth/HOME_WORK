package home_work_2.arrays;

import java.util.Arrays;
import static home_work_2.arrays.ArraysUtils.arrayRandom;

public class Task2_4 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int maxValueExclusion = Integer.parseInt(args[1]);
        int[] container = arrayRandom(size, maxValueExclusion);
        System.out.println(Arrays.toString(container));

        int sum = 0;                                              // 2.4.1
        for (int num : container) {
            if (num >= 0 && num % 2 == 0) {
                sum = sum + num;
            }
        }
        System.out.println("Сумма положительных четных чисел: " + sum);

        int max = 0;                                             // 2.4.2
        for (int i = 0; container.length > i; i = i + 2) {
            if (max < container[i]) {
                max = container[i];
            }
        }
        System.out.println("Максимальный из чётных индексов: " + max);

        double mean;                                           // 2.4.3
        sum = 0;
        for (int num2 : container) {
            sum = sum + num2;
        }
        mean = sum / container.length;
        System.out.print("Числа меньшие среднего: ");
        for (int num3 : container) {
            if (num3 < mean) {
                System.out.print(num3 + "   ");
            }
        }

        System.out.print("\n");
        int min = container[0];                               // 2.4.4
        int min2 = container[0];
        for (int k = 0; k < container.length; k++) {
            if (min > container[k]) {
                min = container[k];
            }
        }
        for (int j = 0; j < container.length; j++) {
            if (min2 > container[j] && container[j] != min) {
                min2 = container[j];
            }
        }
        System.out.println("Два минимальных числа: " + min + "   " + min2);

        int f = 2;                                              // 2.4.5
        int[] str = container;
        for(int e = 0; e < f; e++) {
            for (int g = f; g < str.length - 1; g++) {
                str[g] = str[g + 1];
            }
            str[str.length - e - 1] = 0;
        }
        System.out.println(Arrays.toString(str));

        sum = 0;                                              // 2.4.6
        for (int num : container) {
            sum = sum + num;
        }
        System.out.println("Сумма чисел: " + sum);
    }

}

