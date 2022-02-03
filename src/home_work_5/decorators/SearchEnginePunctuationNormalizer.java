package home_work_5.decorators;

import home_work_5.api.ISearchEngine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine search;

    public SearchEnginePunctuationNormalizer(ISearchEngine search) {
        this.search = search;
    }
    @Override
    public long search(String text, String word) {
        return this.search.search(text, word);
    }

    public List<String> clean(File file) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        do {
            String line = scanner.nextLine();
            line = line.replaceAll("[$&+,:;=?@#|'<>.^*()%!\"]", "");
            line = line.replace("--", "");
            for (String s : line.split(" +")) {
                if (s != null) {
                    s = s.trim();
                    if (s.length() > 0) {
                        list.add(s);
                    }
                }
            }
        } while(scanner.hasNextLine());
        scanner.close();
        return list;
    }
}
