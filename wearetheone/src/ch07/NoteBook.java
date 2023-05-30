package ch07;

interface Portable {
    void inMyBag();
}

public class NoteBook extends Computer implements Portable{
    public void inMyBag() {
        System.out.println("노트북은 가방에 있다.");
    }

    public void turnOn() {
        System.out.println("노트북을 켠다.");
    }

    public void turnOff() {
        System.out.println("노트북을 끈다.");
    }

    public static void main(String[] args) {
        NoteBook n = new NoteBook();

        n.turnOff();
        n.turnOn();
        n.inMyBag();
    }
}
