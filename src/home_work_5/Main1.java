package home_work_5;

import home_work_5.utils.LoadBook;

import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LoadBook book = null;
        try {
            book = new LoadBook();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Топ N. Сколько вывести?");
        System.out.println(book.frequency(scan.nextInt()).toString());
    }
}
