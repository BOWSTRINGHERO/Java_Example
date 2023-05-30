package ch017;

import java.awt.*;

public class Font1Demo {
    public static void main(String[] args) {
        GraphicsEnvironment environment =
                GraphicsEnvironment.getLocalGraphicsEnvironment();

        String[] fontNames = environment.getAvailableFontFamilyNames();

        for (String s : fontNames) {
            System.out.println(s);
        }
    }
}
