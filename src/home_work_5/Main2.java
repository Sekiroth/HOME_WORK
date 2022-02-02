package home_work_5;

import home_work_5.utils.EasySearch;
import home_work_5.utils.LoadBook;
import home_work_5.utils.RegExSearch;

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        LoadBook book = null;
        try {
            book = new LoadBook();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = String.valueOf(book.getList());
        RegExSearch reg = new RegExSearch();
        System.out.println(reg.search(text, "и"));
    }
}
