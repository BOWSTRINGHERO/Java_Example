package CH02_03;

public class Switch3Demo {
    public static void main(String[] args) {
        whoIsIt("호");
        whoIsIt("참");
        whoIsIt("고");
        whoIsIt("곰");
    }

    /*static void whoIsIt(String bio) {
        String kind = "...";
        switch (bio) {
            case "호", "사자" -> kind = "포유류";
            case "독수리", "참" -> kind = "조류";
            case "고", "연어" -> kind = "어류";
            default -> System.out.print("어이쿠! ");
        }*/
    static void whoIsIt(String bio) {
        String kind = "...";
        switch (bio) {
            case "호", "사자" -> kind = "포유류";
            case "독수리", "참" -> kind = "조류";
            case "고", "연어" -> kind = "어류";
            default -> {
                System.out.print("어이쿠! ");
//                yield "...";
            }
    }
        System.out.printf("%s는 %s이다. \n", bio, kind);
    }
}
