package ch04;

public class EnumDemo {
    public static void main(String[] args) {
        Gender231 gender = Gender231.FEMALE;
        if (gender == Gender231.MALE) {
            System.out.println(Gender231.MALE + "는 병역 의무가 있다.");
        } else {
            System.out.println(Gender231.FEMALE + "는 병역 의무가 없다.");
        }

//        if (gender == Direction.SOUTH) {
//            System.out.println(Direction.SOUTH + "는 누구?");
//        }
//        gender = 5;
    }
}
enum Gender {MALE, FEMALE}
enum Direction{EAST,WEST,SOUTH, NORTH,}