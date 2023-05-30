package CH02_03;

import java.util.Scanner;

public class OddEventTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = in.nextInt();
        System.out.println(num % 2 == 0 ? "짝수" : "홀수");

        int x = 1, y = 2;
        System.out.println(x++);
        System.out.println(++x + y--);
        System.out.println(++x / 3 + x * ++y);
    }
}
