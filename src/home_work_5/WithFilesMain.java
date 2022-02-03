package home_work_5;

import home_work_5.decorators.SearchEnginePunctuationNormalizer;
import home_work_5.utils.RegExSearch;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class WithFilesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file = null;
        String path = null;
        String pathForResult;
        do {
            System.out.println("Введи путь папки:");
            try {
                boolean createResult = true;
                path = scan.nextLine();
                file = new File(path);
                for (String s : file.list()) {
                    System.out.println(s);
                    if(s.equals("result.txt")) createResult = false;
                }
                pathForResult = path + "\\result.txt";
                if(createResult) {
                    Files.createFile(Path.of(pathForResult));
                }
                break;
            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        } while (true);

        SearchEnginePunctuationNormalizer search = new SearchEnginePunctuationNormalizer(new RegExSearch());
        do {
            System.out.println("Введи имя файла:");
            System.out.println("Чтобы закончить - введи ESC");
            String bookName = scan.nextLine();
            System.out.println("Введи слово для поиска:");
            try {
                File file1 = new File((path + "\\" + bookName));
                List<String> text = search.clean(file1);
                String word = scan.nextLine();
                long count = 0;
                for (String s : text) {
                    if(s.equals(word)) count++;
                }
                System.out.println("Слово " + "\"" + word + "\"" + " встретилось " + count);
                String resultText = Files.readString(Path.of(pathForResult)) + bookName + " - " + word + " - " + count + "\n";
                Files.writeString(Path.of(pathForResult), resultText);
            } catch(Exception e) {
                e.getCause();
            }
            if(bookName.equals("ESC")) break;
        } while (true);
    }
}
