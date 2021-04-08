package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");

        ConcreteStrategyA csa = new ConcreteStrategyA();
        ConcreteStrategyB csb = new ConcreteStrategyB();
        ConcreteStrategyC csc = new ConcreteStrategyC();

        csa.listToString(list);
        System.out.println();

        csb.listToString(list);
        System.out.println();
        System.out.println();

        csc.listToString(list);

    }
}
