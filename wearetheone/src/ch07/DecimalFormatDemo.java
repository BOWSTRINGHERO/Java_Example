package ch07;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat f1 = new DecimalFormat("#");
        DecimalFormat f2 = new DecimalFormat("0000000000.00");
        DecimalFormat f3 = new DecimalFormat("#.000");
        DecimalFormat f4 = new DecimalFormat("#,###.##");
        DecimalFormat f5 = new DecimalFormat("-#.#");
        DecimalFormat f6 = new DecimalFormat("#.##E00");
        DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
        DecimalFormat f8 = new DecimalFormat("#.00%");

        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(1234567.890));
        System.out.println(f1.format(-1234567.890));
        System.out.println(f1.format(1234567.890));
    }
}
