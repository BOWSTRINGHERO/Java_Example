package ch04;

public class EnumDemo1 {
    public static void main(String[] args) {
        Gender231 gender = Gender231.FEMALE;
        if (gender == Gender231.MALE) {
            System.out.println(Gender231.MALE + "은 병역의무가 있다.");
        } else if (gender == Gender231.X) {
            System.out.println(Gender231.X + "은 병역의무가 선택이다.");
        } else {
            System.out.println(Gender231.FEMALE + "은 병역의무가 없다.");
        }

        for (Gender231 g : Gender231.values()) {
            System.out.println(g.name());
        }
        System.out.println(Gender231.valueOf("MALE"));
    }
}

enum Gender231 {
    MALE("남성"), FEMALE("여성"), X("제3의성");

    private String s;

    Gender231(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}