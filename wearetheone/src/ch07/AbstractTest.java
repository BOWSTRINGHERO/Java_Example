package ch07;

abstract class Abstract {
    int i;

    public Abstract(int i) {
        this.i = i;
    }

    abstract void show();
}

class Concrete extends Abstract {
    int j;

    public Concrete(int i, int j) {
        super(i);
        this.j = j;
    }
    @Override
    void show() {
        System.out.println("i = " + i + ", j" + j);
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}
