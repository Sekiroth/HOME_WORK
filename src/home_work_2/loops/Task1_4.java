package home_work_2.loops;

public class Task1_4 {
    public static void main(String[] args) {
        int[] mult = {3, 188, -19, 2, 20};
        for(int i = 0; mult.length > i; i++) {
            long max1 = mult[i];
            long max2;
            while(max1 < Long.MAX_VALUE) {
                max2 = max1;
                max1 = mult[i] * Math.abs(max1);
                if(mult[i] > 0 && max1 < max2) {
                    System.out.println("С множителем " + mult[i] + ", до переполнения: " + max2 + ", после: " + max1);
                    break;
                }
                if(mult[i] < 0 && max1 > max2){
                    System.out.println("С множителем " + mult[i] + ", до переполнения: " + max2 + ", после: " + max1);
                    break;
                }
            }
        }
    }
}
