package ch04;

class Circle1 {
    double radius;
    static int numofCircles = 0;
    int numCircles = 0;

    public Circle1(double radius) {
        this.radius = radius;
        numofCircles++;
        numCircles++;
    }
}

public class CircleDemo2 {
    public static void main(String[] args) {
        Circle1 myCircle = new Circle1(10.0);
        Circle1 yourCircle = new Circle1(5.0);

        System.out.println("원의 개수 : " + myCircle.numCircles);
        System.out.println("원의 개수 : " + yourCircle.numCircles);
    }

    void print() {
        System.out.println("인스턴스 메서드입니다.");
    }
}
