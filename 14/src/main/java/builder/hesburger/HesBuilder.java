package builder.hesburger;

import builder.burgerBuilder.BurgerBuilder;
import builder.hesburger.ingredient.*;

import java.util.Arrays;

public class HesBuilder implements BurgerBuilder {
    private DoubleCheeseBurger doubleCheeseBurger;

    @Override
    public void createNewBurger() {
        doubleCheeseBurger = new DoubleCheeseBurger(
                Arrays.asList(
                        new Bun(),
                        new Patty(),
                        new Cheese(),
                        new Cheese(),
                        new Lettuce(),
                        new Mayonnaise()
                )
        );
    }

    @Override
    public Object getBurger() {
        return this.doubleCheeseBurger.getIngredients();
    }
}
