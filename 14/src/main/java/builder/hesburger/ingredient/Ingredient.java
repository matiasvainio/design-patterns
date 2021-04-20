package builder.hesburger.ingredient;

public abstract class Ingredient {

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
