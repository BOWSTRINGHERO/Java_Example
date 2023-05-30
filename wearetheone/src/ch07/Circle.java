package ch07;

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("원을 그리다.");
    }

    @Override
    public double findArea() {
        return pi * radius * radius;
    }
}

