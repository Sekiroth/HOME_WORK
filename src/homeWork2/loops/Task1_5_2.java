package homeWork2.loops;

public class Task1_5_2 {
    public static void main(String[] args) {
        int plier = 1;
        int cand = 2;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(cand + " * " + plier + " = " + cand * plier);
                if(cand * plier < 10) System.out.print("     ");
                else if(plier == 10) System.out.print("   ");
                else System.out.print("    ");
                cand = cand + 1;

            }
            plier++;
            cand = 2;
            System.out.println("  ");
        }
        System.out.println("====================================================");
        plier = 1;
        cand = 6;
        for(int i = 0; i < 10; i++){
            for(int j = 3; j < 7; j++){
                System.out.print(cand + " * " + plier + " = " + cand * plier);
                if(cand * plier < 10) System.out.print("     ");
                else if(plier == 10) System.out.print("   ");
                else System.out.print("    ");
                cand = cand + 1;

            }
            plier++;
            cand = 6;
            System.out.println("  ");
        }
    }
}
