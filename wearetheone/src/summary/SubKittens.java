package summary;

public class SubKittens extends SuperCats {
    String name;
    String age = "1살";

    public SubKittens(String n1, String n2) {
        super(n1);
        this.name = n2;
        System.out.println("아기 야옹이입니다." + "이름은" + name);
    }
}
