package ch04;

class Dice {
    int face;

    int roll() {
        return (int) (Math.random() * 6) + 1;
    }
}

public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
