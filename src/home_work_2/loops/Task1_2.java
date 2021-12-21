package home_work_2.loops;
public class Task1_2 {
    public static int convert(String num) {
        int x = 0;
        try {
            Double.parseDouble(num);
        }
        catch (Exception e) {
            System.out.println("Vveli nie chislo");
            System.exit(0);
        }
        try {
            x = Integer.parseInt(num);
        }
        catch (Exception e) {
            System.out.println("Vveli nie tseloe chislo");
            System.exit(0);
        }
        return x;
    }
    public static void main(String[] args) {
        int chislo = convert(args[0]);
        int digit;
        int sum = 1;
        String str = Integer.toString(chislo);
        while(chislo > 0) {
            digit = chislo % 10;
            sum = sum * digit;
            chislo = chislo / 10;
        }
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + "  ");
            if(i < str.length() - 1){
                System.out.print("*  ");
            }
        }
        System.out.print("=  " + sum);
    }
}
