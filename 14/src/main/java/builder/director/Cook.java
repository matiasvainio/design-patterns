package builder.director;

import builder.burgerBuilder.BurgerBuilder;
import builder.hesburger.HesBuilder;
import builder.mcdonalds.McBuilder;

public class Cook {

    public Cook() {
        BurgerBuilder builder = new HesBuilder();
        builder.createNewBurger();
        System.out.println("Hesburger double cheese burger as a list:");
        System.out.println(builder.getBurger());

        builder = new McBuilder();
        builder.createNewBurger();
        System.out.println("\nMcDonalds cheese burger as a string:");
        System.out.println(builder.getBurger());
    }
}
