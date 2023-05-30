package CH02_03;

public class SignIncrement {
    public static void main(String[] args) {
        int plusOne = 1;
        int minusOne = -plusOne;
        System.out.println(plusOne);
        System.out.println(minusOne);

        /*int x = 1, y = 1;
        System.out.println(x + ++x);
        System.out.println(y + y++);
        System.out.println(x + y);*/

        int x = 3;
        int y;
        y = (x == 1) ? 10 : 20;
        System.out.println(y);
        y = (x > 1) ? x++ : x + 20;
        System.out.println(x);
        System.out.println(y);

        System.out.println(5 > 3 ? "true" : "false");
    }
}
