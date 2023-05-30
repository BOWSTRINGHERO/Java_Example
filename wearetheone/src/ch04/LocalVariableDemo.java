package ch04;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;
        double b = 0;

        System.out.print(b);
        System.out.print(a + b);

        int c = 0;

        double d = 0.0;

        for (int e = 0; e < 10; e++) {
            a = 1;
            System.out.print(e);
        }

        double z = (double) a;
        int w = (int) b;

        short x = 1;
        int y = (int) x;
    }
}
