package CH02_03;

public class ReturnDemo {
    public static void main(String[] args) {
        printscore(99);
        printscore(120);
    }

    public static void printscore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수 : " + score);
            return;
        }
        System.out.println("점수 : " + score);
    }
}
