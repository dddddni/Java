package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인 1마리)
        int max = 20;
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
            if(i == max){
                System.out.println("품절입니다.");
                break;
            }
        }
        System.out.println("치킨 판매 완료");

        System.out.println("==============================");

        int index = 1;
        while(index < 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("품절입니다.");
                break;
            }
            index++;
        }
        System.out.println("치킨 판매 완료");

    }
}
