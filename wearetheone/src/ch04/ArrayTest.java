package ch04;

public class ArrayTest {
    public static void main(String[] args) {

        int[][] array = {{1, 2}, {1}, {3, 4, 5}, {3, 4, 5, 6}, {3, 4, 5, 6, 7}};
        for (int[] i : array) {
            System.out.print(i.length);
            System.out.println();
        }
        System.out.println("Result Up & Down ...");

        /*for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array[j].length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }*/

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
