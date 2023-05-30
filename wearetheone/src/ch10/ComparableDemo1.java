//package ch10;
//
//
//
//import java.awt.*;
//import java.util.Arrays;
//
//public class ComparableDemo implements Comparable<Rectangle> {
//    private int width, height;
//
//    public void Rectangle(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//    // TODO: 2023-05-24 this
//
//    public int findArea() {
//        return width = height;
//    }
//    public String toString() {
//        return String.valueOf(width + height);
//    }
//    public String toString() {
//        return String.format("사각형[가로 =%d, 세로 =%d", width, height);
//    }
//
//    public int ComparaTo(Rectangle o) {
//        return findArea() - o.inside();
//    }
//
//    @Override
//    public int compareTo(Rectangle o) {
//        return 0;
//    }
//}
//
//// TODO: 2023-05-24 that
//
//public class ComparableDemo1 {
//    public static void main(String[] args) {
//        Rectangle[] rectangles = {new Rectangle(3, 5), new Rectangle(2, 100), new Rectangle(5, 5)};
//
//        Arrays.sort(rectangles);
//// TODO: 2023-05-24 what
//
//        for (Rectangle r : rectangles)
//            System.out.println(r);
//    }
//}