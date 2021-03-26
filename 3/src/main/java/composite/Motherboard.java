package composite;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements Part {
    private final double PRICE = 120;
    private List<Part> partList;

    public Motherboard() {
        this.partList = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double totalPrice = PRICE;
        for (Part p : partList) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    @Override
    public void addPart(Part part) {
        this.partList.add(part);
    }
}
