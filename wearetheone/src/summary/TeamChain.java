package summary;

public class TeamChain {
    String name;
    String yourTeam;
    int level;

    public TeamChain() {
        this("이현준");
    }
    public TeamChain(String name, int yourLevel) {
        this(name, yourLevel, "코딩의 호흡");
    }
    public TeamChain(String name) {
        this(name, 99);
    }



    public TeamChain(String name, int yourLevel, String yourTeam) {
        this.name = name;
        this.yourTeam = yourTeam;
        this.level = yourLevel;
    }
    //
    void printInfo() {
        System.out.println("개발자" + name);
        System.out.println("소속팀" + yourTeam);
        System.out.println("개발 등급" + level);
    }

    //    public TeamChain(String name, String yourTeam) {
//        this.name = name;
//        this.yourTeam = yourTeam;
//        this.level = yourLevel;
//    }
//    public TeamChain(String name, int yourLevel) {
//        this(name, yourLevel, "코딩의 호흡");
//    }
//
//    public TeamChain(String name) {
//        this(name, 99);
//    }
//
//    public TeamChain() {
//        this("이현준");
//    }

    public static void main(String[] args) {
        TeamChain object = new TeamChain();
        object.printInfo();
    }
}
