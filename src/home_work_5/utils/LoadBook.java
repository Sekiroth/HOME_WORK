package home_work_5.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoadBook {
    private Set<String> set;
    private List<String> list;
    private HashMap<String, Integer> map;
    private String[] text;
    private Pattern pattern = Pattern.compile("[А-Яа-я0-9]{1,}\\-[А-Яа-я0-9]{1,}|[А-Яа-я0-9]{1,}");

    public LoadBook(String path) throws IOException {
        this.text = load(path);
        this.list = getList();
        this.set = getSet();
    }

    public LoadBook() throws IOException{
        this.text = load("book.txt");
        this.list = getList();
        this.set = getSet();
    }

    public Set<String> getSet() {
        set = new HashSet<>();
        for (String s : text) {
            set.add(s);
        }
        return set;
    }

    public String[] load(String path) throws IOException{
        Path getPath = Path.of(path);
        String text = Files.readString(getPath);
        StringBuilder builder = new StringBuilder();
        Matcher matcher = this.pattern.matcher(text);
        while(!matcher.hitEnd()) {
            if(matcher.find()) {
                builder.append(matcher.group());
                builder.append(" ");
            }
        }
        text = builder.toString();
        return text.split(" ");
    }

    public List<String> getList() {
        list = new ArrayList<>();
        for (String s : text) {
            list.add(s);
        }
        return list;
    }

    public Map frequency(int topN) {
        int count = 0;
        map = new HashMap<>();
        for (String s : set) {
            for (String l : list) {
                if (s.equals(l)) count++;
            }
            map.put(s, count);
            count = 0;
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        Map<String, Integer> fin = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            fin.put(entry.getKey(), entry.getValue());
            if(topN == 1) return fin;
            topN--;
        }
        return null;
    }
}
