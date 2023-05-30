package ch07;

class Rectangle extends Shape {
    int x;
    int i;

    public Rectangle(int x, int i) {
        this.x = x;
        this.i = i;
    }

    public void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return x * i;
    }
}
