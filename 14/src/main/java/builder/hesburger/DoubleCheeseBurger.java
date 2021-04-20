package builder.hesburger;

import builder.hesburger.ingredient.*;

import java.util.List;

public class DoubleCheeseBurger {
    List<Ingredient> ingredients;

    public DoubleCheeseBurger(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }
}
