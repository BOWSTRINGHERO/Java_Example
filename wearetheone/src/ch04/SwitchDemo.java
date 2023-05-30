package ch04;

public class SwitchDemo {
    public static void main(String[] args) {
        Gender233 gender = Gender233.여성;

        String s = switch (gender) {
            case 남성 -> "은 병역의무가 있다.";
            case 여성 -> "은 병역의무가 없다.";
        };
        System.out.println(gender + s);
    }
}

enum Gender233 {
    남성, 여성
}