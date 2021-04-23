package prototype;

import java.util.Scanner;

public class TUI {
    private final Scanner scanner;

    public TUI() {
        scanner = new Scanner(System.in);
    }

    public void start(Clock clock) {
        System.out.println("Kopioidaan kelloja...\n");


        System.out.println("Aseta kellonaika uuteen kelloon\n");
        System.out.print("h: ");
        int hour = Integer.parseInt(scanner.nextLine());
        System.out.print("min: ");
        int minute = Integer.parseInt(scanner.nextLine());

        Clock newClock = new Clock(hour, minute);

        System.out.println("Tässä kellot: \n");
        System.out.print("Alkuperäinen: ");
        System.out.println(clock);
        System.out.print("Uusi: ");
        System.out.println(newClock);
    }
}
