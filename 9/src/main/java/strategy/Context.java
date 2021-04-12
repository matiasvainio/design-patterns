package strategy;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private ListConverter converter;
    private List<String> list;

    public Context(ListConverter converter) {
        this.converter = converter;
        this.list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
    }

    public void runAlgorithm() {
        this.converter.listToString(list);
    }
}
