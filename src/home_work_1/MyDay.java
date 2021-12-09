package home_work_1;
import java.util.Scanner;
public class MyDay {
    boolean weekday;
    boolean vacation;
    public boolean sleepIn(boolean weekday, boolean vacation) {
        this.vacation = vacation;
        this.weekday = weekday;
        if (!weekday || vacation) {
            System.out.println("How lucky you are, you are saved for this time...");
            return true;
        }
            System.out.println("Get up, shashlyk! Your work is waiting for you!");
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        MyDay friday = new MyDay();
        System.out.println("Is it your working day? (yes/no)");
        String a = in.nextLine();
        boolean c;
        if (a.equals("yes")) {
            c = true;
        }
        else {
            c = false;
        }
        System.out.println("Are you on vacation? (yes/no)");
        String b = in.nextLine();
        boolean d;
        if (b.equals("yes")) {
            d = true;
        }
        else {
            d = false;
        }
        friday.sleepIn(c, d);
    }
}
