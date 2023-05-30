package CH02_03;// TODO: 2023-05-16 개발자 이현준

public class While2Demo {
    public static void main(String[] args) {
        int row = 2; //2단부터
        while (row < 20) {
            int column = 1;
            while (column < 20) {
                System.out.printf(row + "X" + column + "=" + row * column + " ");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}


