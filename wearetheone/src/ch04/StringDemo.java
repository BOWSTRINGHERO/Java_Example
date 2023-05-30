package ch04;

public class StringDemo {
    public static void main(String[] args) {
        String version = String.format("%s %d", "JKD", 14);
        System.out.println(version);

        String fruits = String.join((", "), "apple", "banana", "cherry", "durian");
        System.out.println(fruits);

        String pi = String.valueOf(3.14);
        System.out.println(pi);
    }
}
