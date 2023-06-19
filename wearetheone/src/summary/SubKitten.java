package summary;

public class SubKitten extends SuperCat {
    String age = "2살";

    void printInfo() {
        System.out.println("아기 야옹이입니다.");
    }

    void printDetail() {
        super.printInfo();
        System.out.println("품종은" + super.breed + ", 나이는" + super.age);
        printInfo();
        System.out.println("품종은" + breed + ", 나이는" + age);
    }
}
