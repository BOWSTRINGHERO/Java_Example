package method;

public class Method03 {
    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int sum = add(a, b);
        System.out.println("sum=" + sum);
    }
}
