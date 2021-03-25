package abstractFactory;

public class BossFactory implements Factory {
    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public Cap createCap() {
        return new BossCap();
    }

    @Override
    public Jeans createJeans() {
        return new BossJeans();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }
}
