package composite;

public class Processor implements Part {
    private final double PRICE = 500;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public void addPart(Part part) {
        throw new RuntimeException("Cannot add part to a simple part.");
    }
}
