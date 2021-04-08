package strategy;

import java.util.Iterator;
import java.util.List;

public class ConcreteStrategyB implements ListConverter {

    @Override
    public void listToString(List<String> list) {
        int i = 1;
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
            if (i % 2 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
