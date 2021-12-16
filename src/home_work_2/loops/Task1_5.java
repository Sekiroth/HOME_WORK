package home_work_2.loops;

public class Task1_5 {
    public static void main(String[] args) {
        int plier = 1;
        int cand = 2;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.println(cand + " * " + plier + " = " + cand * plier);
                plier = plier + 1;
            }
            cand++;
            plier = 1;
            System.out.println("\n");
        }
    }
}
