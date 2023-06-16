package summary;

public class CallDefaultCons {
    public static void main(String[] args) {
        Developer men1 = new Developer();
        men1.team = "코딩의 호흡";
        Developer men2 = new Developer();
        men2.team = "G.G";
        Developer men3 = new Developer();
        men3.team = "나혼자-팀";
        System.out.println("Team : " + men1.team);
        System.out.println("Team : " + men2.team);
        System.out.println("Team : " + men3.team);
    }
}
