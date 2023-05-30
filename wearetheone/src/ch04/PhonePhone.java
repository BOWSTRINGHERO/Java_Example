package ch04;

class Phone {
    String model;
    int value;

    void print() {
        System.out.println(value + "만 원짜리 " + model + " 스마트폰");
    }
}

public class PhonePhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.model = "갤럭시 S8";
        myPhone.value = 100;
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.model = "G6";
        yourPhone.value = 85;
        yourPhone.print();

        Phone phonePhone = new Phone();
        phonePhone.model = "a111";
        phonePhone.value = 100;
        phonePhone.print();
    }
}
