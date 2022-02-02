package home_work_5.utils;

import home_work_5.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long count = 0;
        Matcher matcher = Pattern.compile("\\b" + word + "\\b").matcher(text);
        while (matcher.find()) count++;
        return count;
    }
}
