package ch08;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "학생[" + name + "]";
    }
}
public class StudentTest {
    public static void main(String[] args) {
        System.out.println(new Student("김용선"));
        System.out.println(new Student("홍인표"));
    }
}
