package composite;

public class GraphicsCard implements Part {
    private final double PRICE = 1000;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public void addPart(Part part) {
        throw new RuntimeException("Cannot add part to a simple part.");
    }
}
