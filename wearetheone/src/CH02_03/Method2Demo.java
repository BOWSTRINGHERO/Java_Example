package CH02_03;

import java.util.Scanner;

public class Method2Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i1 = in.nextInt();
        int i2 = in.nextInt();

        System.out.println(printGauss(i1,i2));

        echo("안녕!", 3);
    }

    public static int printGauss(int i1, int i2) {
        int printGauss = 0;
        for (int i = i1; i <= i2; i++) {
            printGauss += i;
        }
        return printGauss;
    }

    public static void echo(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}
