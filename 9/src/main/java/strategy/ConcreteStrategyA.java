package strategy;

import java.util.List;

public class ConcreteStrategyA implements ListConverter {

    @Override
    public void listToString(List<String> list) {
        String[] a = list.toArray(new String[0]);

        for (String s : a) {
            System.out.println(s);
        }
    }
}
