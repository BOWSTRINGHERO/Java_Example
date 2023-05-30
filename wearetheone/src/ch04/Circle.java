package ch04;

class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this(radius, "파랑");
    }

    public Circle(String color) {
        this(10.0, color);
    }

    public Circle() {
        this(10.0, "빨강");
    }
}