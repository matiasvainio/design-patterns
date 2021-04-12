package strategy;

public class Main {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.runAlgorithm();
        System.out.println();

        context = new Context(new ConcreteStrategyB());
        context.runAlgorithm();
        System.out.println();

        context = new Context(new ConcreteStrategyC());
        context.runAlgorithm();
    }
}
