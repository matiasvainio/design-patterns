package proxy;

import java.util.List;
import java.util.Scanner;

public class TUI {
    private final List<Image> imageList;
    private final Scanner scanner;

    public TUI(List<Image> list) {
        this.imageList = list;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("###### Valokuva-albumi ######");
        System.out.println("h: menee taaksepäin.");
        System.out.println("l: menee eteenpäin.");
        System.out.println("c: lopettaa.");

        int i = -1;
        Character input;
        boolean ready = false;

        while (!ready) {
            input = scanner.nextLine().charAt(0);
            if (input.equals('c')){
                ready = true;
            }

            if (input.equals('h')) {
                if (i > 0) {
                    i--;
                } else if (i < 0) {
                    i = 0;
                }
                imageList.get(i).displayImage();
            }

            if (input.equals('l')) {
                if (i < imageList.size() - 1) {
                    i++;
                }
                imageList.get(i).displayImage();
            }
        }

    }
}
