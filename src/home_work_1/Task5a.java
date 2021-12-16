package homeWork1;
import java.util.Scanner;
public class Task5a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи имя: ");
        String name = in.nextLine();
        if (name.equals("Вася") || name.equals("Анастасия")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}



