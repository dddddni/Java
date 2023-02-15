package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형 -> 실수형
        // 실수형 -> 정수형

        // int to float, double
        int score = 93;
        System.out.println("score = " + score);
        System.out.println("score = " + (float)score);
        System.out.println("score = " + (double)score);

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println("score_f = " + (int)score_f);
        System.out.println("score_d = " + (int)score_d);

        // 정수 + 실수 연산
        score = 93 + (int)98.8;
        System.out.println("score = " + score);

        score_d = (double) 93 + 98.8;
        System.out.println("score_d = " + score_d);

        String s1 = String.valueOf(93);
        System.out.println("s1 = " + s1);
        
        int i = Integer.parseInt("12");
        System.out.println("i = " + i);
    }
}
