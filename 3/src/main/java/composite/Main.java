package composite;

public class Main {

    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase();
        Motherboard motherboard = new Motherboard();

        motherboard.addPart(new Memory());
        motherboard.addPart(new GraphicsCard());
        motherboard.addPart(new Processor());
        motherboard.addPart(new NetworkCard());

        computerCase.addPart(motherboard);

        System.out.println(computerCase.getPrice());

    }
}
