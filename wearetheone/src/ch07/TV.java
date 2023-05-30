package ch07;

public class TV implements Controllable {
    public void turnOn() {
        System.out.println("TV를 켠다.");
    }

    public void turnOff() {
        System.out.println("TV를 끈다.");
    }
}
