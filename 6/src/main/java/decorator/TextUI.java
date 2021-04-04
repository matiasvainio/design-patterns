package decorator;

import java.util.Scanner;

public class TextUI {
    private final Scanner scanner;
    private Data data;

    public TextUI() {
        this.scanner = new Scanner(System.in);
        this.data = new SimpleData();
    }

    public void start() {
        System.out.println("Set data:");
        data.setData(scanner.nextLine());
        data.write();

        System.out.println("Select:");
        System.out.println("1. new string");
        System.out.println("2. encrypt");
        System.out.println("3. decrypt");
        System.out.println("4. print");
        System.out.println("5. quit");

        int sel = 0;
        while (sel != 5) {
            System.out.println("Select:");
            sel = Integer.parseInt(scanner.nextLine());

            switch(sel) {
                case 1:
                    System.out.println("Set string:");
                    data.setData(scanner.nextLine());
                    data.write();
                    break;
                case 2:
                    data = new EncryptedData(data);
                    data.write();
                    break;
                case 3:
                    data = new DecryptedData(data);
                    data.write();
                    break;
                case 4:
                    System.out.println(data.read());
                    break;
            }
        }
    }
}
