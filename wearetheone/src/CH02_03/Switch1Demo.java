package CH02_03;

public class Switch1Demo {
    public static void main(String[] args) {
        /*int number = 3;

        switch (number) {
            case 3:
                System.out.print("*");
            case 2:
                System.out.print("*");
            case 1:
                System.out.print("*");
                }*/
        whoIsIt("호");
        whoIsIt("참");
        whoIsIt("고");
        whoIsIt("곰");
    }

    static void whoIsIt(String bio) {
        String kind = "";
        switch (bio) {
            case "호":
            case "사자":
                kind = "포유류";
                break;
            case "독수리":
            case "참":
                kind = "조류";
                break;
            case "고":
            case "연어":
                kind = "어류";
                break;

            default:
                System.out.print("어이쿠! ");
                kind = "...";
        }
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
