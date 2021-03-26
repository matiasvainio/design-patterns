package composite;

public class NetworkCard implements Part {
    private final double PRICE = 30;

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public void addPart(Part part) {
        throw new RuntimeException("Cannot add part to a simple part.");
    }
}
