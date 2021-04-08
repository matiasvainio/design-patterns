package strategy;

import java.util.List;

public class ConcreteStrategyC implements ListConverter {

    @Override
    public void listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        int i = 1;

        for (int j = 0; j < list.size(); j++) {
            sb.append(list.get(j));
            if (i % 3 == 0) {
                sb.append("\n");
            }
            i++;
        }

        System.out.println(sb.toString());
    }
}
