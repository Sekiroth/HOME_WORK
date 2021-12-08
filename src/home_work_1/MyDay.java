package home_work_1;

public class MyDay {
    boolean weekday;
    boolean vacation;
    public boolean sleepIn(boolean weekday, boolean vacation) {
        this.vacation = vacation;
        this.weekday = weekday;
        if (!weekday || vacation) {
            System.out.println("You may go on sleeping!");
            return true;
        }
            System.out.println("Get up, you lazy one! Your work is waiting for you!");
            return false;
    }

    public static void main(String[] args) {
        MyDay friday = new MyDay();
        System.out.println(friday.sleepIn(true, false));
    }
}
