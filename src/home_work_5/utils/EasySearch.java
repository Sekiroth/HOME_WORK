package home_work_5.utils;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        long count = 0;
        int i = 0;
        while (i >= 0) {
            if (i >= 0) {
                i++;
            }
            i = text.indexOf(word, i);
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
