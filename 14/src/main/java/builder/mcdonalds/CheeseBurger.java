package builder.mcdonalds;

public class CheeseBurger {
    private final String burger;

    public CheeseBurger() {
        this.burger = create();
    }

    private String create() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String s : getIngredientsAsList()) {
            sb.append(s);
            if (i != s.length() - 1) {
                sb.append(", ");
            }
            i++;
        }
        return sb.toString();
    }

    private String[] getIngredientsAsList() {
        return new String[]{"Cheese", "Patty", "Bun"};
    }

    public String getIngredients() {
        return this.burger;
    }
}
