package chainOfResponsibility;

import java.util.Scanner;

public class TUI {
    private final Scanner scanner;
    private final Supervisor supervisor;

    public TUI(Supervisor s) {
        this.scanner = new Scanner(System.in);
        this.supervisor = s;
    }

    public void start() {
        double salary, raise;
        System.out.println("Ohjelma kertoo, kuka antaa sinulle ansaitsemasi palkankorotuksen..");
        System.out.println("Syötä nykyinen palkkasi:");
        salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Syötä palkankorotus desimaalilukuna pisteellä eroteltuna:");
        raise = Double.parseDouble(scanner.nextLine());

        System.out.println("Palkankorotuksen määrä prosentteina: " + raise / salary + "%");

        Request r = new Request();
        r.setSalary(salary);
        r.setAmount(raise);

        System.out.println("Palkankorotuksesi myönsi: ");
        supervisor.handle(r);
    }
}
