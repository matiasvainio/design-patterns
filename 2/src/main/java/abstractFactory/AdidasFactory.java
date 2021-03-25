package abstractFactory;

public class AdidasFactory implements AbstractFactory {

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Cap createCap() {
        return new AdidasCap();
    }

    @Override
    public Jeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }
}
