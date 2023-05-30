package CH02_03;

public class DoWhile3Demo {
    public static void main(String[] args) {
        int row = 2;
        do {
            int column = 1;
            do {
                System.out.printf(row + " X " + column + " = " + row * column + " / ");
                column++;
        } while (column < 20);
        System.out.println();
        row++;
        } while (row < 20);
    }
}
