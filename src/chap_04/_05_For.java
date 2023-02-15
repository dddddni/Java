package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 for
        System.out.println("어서오세요, 나코입니다.");

        // 또 손님이 오면.
        System.out.println("어서오세요, 나코입니다.");

        System.out.println("--- 반복문 사용 ---");
        // 반복문 사용 For
        //for(선언 ; 조건 ; 증감){}
        for(int i = 0; i < 10; i++){
            System.out.println("어서오세요, 나코입니다." + i);
        }

        // 짝수만  출력
        for (int i = 0; i < 10; i+=2 ) {
            System.out.print(i);
        }

        System.out.println();

        // 짝수만  출력
        for (int i = 1; i < 10; i+=2 ) {
            System.out.print(i);
        }
        System.out.println();

        // 거꾸로 숫자 출력
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        int sum = 0;
        // 1~10 합
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
