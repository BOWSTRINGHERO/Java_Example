package summary;

public class CallConstructor {
    public static void main(String[] args) {

        Developer team1 = new Developer();
        Developer team2 = new Developer();
        Developer team3 = new Developer();

        team3.team = "100% getTheJobTeam";

        System.out.println("유형 : " + team1.team);
        System.out.println("유형 : " + team2.team);
        System.out.println("유형 : " + team3.team);
    }
}
