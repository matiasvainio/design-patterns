package proxy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Image> imageList = Arrays.asList(
                new ProxyImage("HiRes_10MB_Photo1"),
                new ProxyImage("HiRes_10MB_Photo2"),
                new ProxyImage("HiRes_10MB_Photo3"),
                new ProxyImage("HiRes_10MB_Photo4")
        );

        for (Image i : imageList) {
            System.out.println(i.showData());
        }

        TUI tui = new TUI(imageList);
        tui.start();
    }

}
