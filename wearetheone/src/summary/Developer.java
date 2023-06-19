package summary;

public class Developer {
    String team;
    String grade;
    Developer() {
        System.out.println("개발자는...");
    }

    Developer(String publicTeam) {
        System.out.println("개발자는 매개변수를 가지고...");
        team = publicTeam;
    }

    void work() {
        System.out.println("개발을 하고있다.");
    }

    void idle() {
        System.out.println("지쳐서 농땡이를...");
    }

    void typing() {
        System.out.println("타자를 치고 있는 중...");
    }
}
