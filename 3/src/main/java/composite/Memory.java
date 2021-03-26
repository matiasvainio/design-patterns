package composite;

public class Memory implements Part {
    private final double PRICE = 150;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public void addPart(Part part) {
        throw new RuntimeException("Cannot add part to a simple part.");
    }
}
