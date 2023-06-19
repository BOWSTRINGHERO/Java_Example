package summary;

public class Child extends Parent {
    String name = "Princess Lea";

    public void details() {
        super.details();
        System.out.println(name);
    }

    public void printDetails() {
        details();
        System.out.println("부모이름 : " + super.name);
        System.out.println("자식이름 : " + name);
    }
}
