package CH02_03;

public class SelfTest3_2 {
    public static void main(String[] args) {
        char c = 'a';
        while (c <= 'z') {
            System.out.print(c++);
        }

        for (int i = 1; i < 30; ++i) {
            System.out.print(i+"/");
        }
    }
}
