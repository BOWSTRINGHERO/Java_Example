package ch04;

public class OneToTenDemo {
    static int sumOneToTen;

    static {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += 1;
            sumOneToTen = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOneToTen);
    }
}
