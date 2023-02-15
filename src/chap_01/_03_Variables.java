package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김서현";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작 됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험은 합격인가요? " + pass);

        double d = 3.1412345678;
        float f = 3.1412345678F;
        System.out.println("d = " + d);
        System.out.println("f = " + f);

        //int i = 100000000000;
        long l = 100000000000L;
        l = 1_000_000_000_000L;
        System.out.println("l = " + l);
    }
}
