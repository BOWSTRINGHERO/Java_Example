package CH02_03;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
        String x = in.nextLine();
        String y = in.nextLine();

        //System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
        System.out.printf(x+y);

        int remainder = 25 % 2;
        System.out.println(remainder);
    }
}

