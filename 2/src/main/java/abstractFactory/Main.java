package abstractFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class c = null;
        AbstractFactory factory = null;
        Method[] m = null;

        System.out.println("Olen Jasper javacoodari. \nMinulla on päällä seuraavat tuotteet: ");

        try {
            c = Class.forName("abstractFactory.AdidasFactory");
            factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
            m = c.getDeclaredMethods();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        assert m != null;
        for (Method i : m) {
            System.out.println(i.invoke(factory));
        }

        System.out.println("\nNyt valmistuin, ja käytän hienompia vaatteita. Kas näin: ");
        try {
            c = Class.forName("abstractFactory.BossFactory");
            factory = (AbstractFactory) c.getDeclaredConstructor().newInstance();
            m = c.getDeclaredMethods();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        for (Method i : m) {
            System.out.println(i.invoke(factory));
        }
    }
}
