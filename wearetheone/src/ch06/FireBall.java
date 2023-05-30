package ch06;

public class FireBall extends Circle {
    private String color;

    public FireBall(String color) {
        this.color = color;
    }

    public void findColor() {
        System.out.println(color + "공이다.");
    }

    public void findVolume() {
        System.out.println("부피는 4/3*(pi*반지름*반지름*반지름)이다.");
    }
}
