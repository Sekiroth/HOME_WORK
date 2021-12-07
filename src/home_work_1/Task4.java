package home_work_1;

public class Task4 {
    boolean day = true;
    boolean vacTime = false;
    public boolean sleepIn(boolean weekday, boolean vacation) {
        day = weekday;
        vacTime = vacation;
        if (!weekday || vacation) {
            return true;
        }
            return false;
    }
    public static void main(String[] args) {

        System.out.println();
    }
}
