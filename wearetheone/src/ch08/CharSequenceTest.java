package ch08;

public class CharSequenceTest {
    static void show(CharSequence charSequence) {
        System.out.println(charSequence);
    }

    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
    }
}
