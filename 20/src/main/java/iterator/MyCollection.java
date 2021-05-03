package iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    private List<Integer> list;

    public MyCollection() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
    }

    public List<Integer> getList() {
        return list;
    }
}
