package builder.mcdonalds;

import builder.burgerBuilder.BurgerBuilder;

public class McBuilder implements BurgerBuilder {
    private CheeseBurger cheeseBurger;

    @Override
    public void createNewBurger() {
        this.cheeseBurger = new CheeseBurger();
    }

    @Override
    public Object getBurger() {
        return this.cheeseBurger.getIngredients();
    }
}
