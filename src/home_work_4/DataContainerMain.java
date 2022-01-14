package home_work_4;

import java.util.*;

public class DataContainerMain {
    public static void main(String[] args) {
        String[] cont = new String[2];
        DataContainer<String> container = new DataContainer<>(cont);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Привет

        System.out.println("До сортировки " + container.toString());
        container.sort(Comparator.naturalOrder());
        System.out.println("После сортировки " + container.toString());

        container.delete(2);
        System.out.println(container.toString());
    }
}
